package ilimboxAndroid.ilimbox.helper;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import ilimboxAndroid.ilimbox.models.UserAccount;
import ilimboxAndroid.ilimbox.models.course.Content;
import ilimboxAndroid.ilimbox.models.course.Course;
import ilimboxAndroid.ilimbox.models.course.CourseSection;
import ilimboxAndroid.ilimbox.models.course.Module;
import ilimboxAndroid.ilimbox.models.forum.Discussion;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmResults;
import io.realm.Sort;


public class CourseDataHandler {

    @SuppressWarnings("unused")
    private final static String TAG = CourseDataHandler.class.getName();

    private Realm realm;

    public CourseDataHandler(@Nullable Realm realm) {
        this.realm = realm;
    }

    public void replaceCourses(@NotNull List<Course> courses) {
        if (realm != null) {
            for (Course c : courses) {
                // We query the db each iteration, this should be more efficient
                // than doing an O(n^2) search or multiple O(n) maps for each
                // field we want to transfer over
                Course inDb = realm.where(Course.class).equalTo("id", c.getId()).findFirst();
                if (inDb != null) {
                    c.setFavorite(inDb.isFavorite());
                }
            }
            realm.beginTransaction();
            realm.delete(Course.class);
            realm.copyToRealm(courses);
            realm.commitTransaction();
        } else {
            throw new NullPointerException("Realm instance is null");
        }
    }

    @NotNull
    public List<Course> isolateNewCourses(@NotNull List<Course> courses) {
        if (realm != null) {
            Set<Integer> courseIds = courses.stream().map(Course::getId).collect(Collectors.toSet());

            RealmResults<Course> results = realm.where(Course.class).in("id", courseIds.toArray(new Integer[0]))
                    .findAll();
            Set<Integer> inDBIds = results.stream().map(Course::getId).collect(Collectors.toSet());

            courseIds.removeAll(inDBIds); // contains ids of new courses
            return courses.stream().filter(course -> courseIds.contains(course.getId())).collect(Collectors.toList());
        } else {
            throw new NullPointerException("Realm instance is null");
        }
    }

    @NotNull
    public List<Course> getCourseList() {
        if (realm != null) {
            return realm.copyFromRealm(realm.where(Course.class).findAll());
        } else {
            throw new NullPointerException("Realm instance is null");
        }
    }

    public void replaceCourseData(int courseId, @NonNull List<CourseSection> sections) {
        realm.executeTransaction(realm -> {
            sections.forEach(section -> {
                section.setCourseId(courseId);
                section.getModules().forEach(module -> { // Worst case complexity is O(n^3).
                    module.setCourseSectionId(section.getId());                      // Let's hope it never gets that bad.
                    module.getContents().forEach(content -> content.setModuleId(module.getId()));
                });
            });
            realm.where(CourseSection.class).equalTo("courseId", courseId).findAll().deleteAllFromRealm();
            realm.copyToRealmOrUpdate(sections);
        });
    }

    @NotNull
    public List<CourseSection> isolateNewCourseData(int courseId, @NonNull List<CourseSection> sections) {
        final List<CourseSection> newData = new ArrayList<>();

        if (realm.where(CourseSection.class).equalTo("courseId", courseId).findAll().isEmpty()) {
            newData.addAll(sections); // Everything is new
        } else {
            newData.addAll(isolateNewSections(sections));
            newData.addAll(isolateNewAndModifiedModulesInSections(sections.stream()
                    .filter(section -> !newData.contains(section))
                    .collect(Collectors.toList())));
        }
        return newData;
    }

    private List<CourseSection> isolateNewSections(@NonNull List<CourseSection> sections) {
        Set<Integer> sectionsIds = sections.stream().map(CourseSection::getId).collect(Collectors.toSet());
        RealmResults<CourseSection> results = realm.where(CourseSection.class)
                .in("id", sectionsIds.toArray(new Integer[0]))
                .findAll();
        Set<Integer> inDBIds = results.stream().map(CourseSection::getId).collect(Collectors.toSet());

        sectionsIds.removeAll(inDBIds); // contains ids of new sections
        return sections.stream().filter(section -> sectionsIds.contains(section.getId())).collect(Collectors.toList());
    }


    private List<CourseSection> isolateNewAndModifiedModulesInSections(@NonNull List<CourseSection> sections) {
        List<CourseSection> retSections = new ArrayList<>();
        for (CourseSection section : sections) {
            CourseSection retSection = section.deepCopy();
            List<Module> modules = section.getModules();
            List<Module> retModules = new ArrayList<>();

            RealmResults<Module> results = realm.where(Module.class)
                    .in("id", sections.stream().flatMap(courseSection -> courseSection.getModules().stream())
                    .map(Module::getId).distinct().toArray(Integer[]::new))
                    .findAll();
            Set<Integer> inDBIds = results.stream().map(Module::getId).collect(Collectors.toSet());

            for (Module module : modules) {
                if (!inDBIds.contains(module.getId())) {
                    // Add the modules that are brand new
                    module.setUnread(true);
                    retModules.add(module);
                } else {
                    Module mod = isolateNewContentInModules(module);
                    if (mod != null) {
                        retModules.add(mod);
                    }
                }
            }
            if (!retModules.isEmpty()) {
                retSection.setModules(new RealmList<>(retModules.toArray(new Module[0])));
                retSections.add(retSection);
            }
        }
        return retSections;
    }

    @Nullable
    private Module isolateNewContentInModules(Module module) {
        Module realmModule = realm.where(Module.class).equalTo("id", module.getId()).findFirst();

        if (realmModule == null) {
            module.setUnread(true);
            return module; // Everything is new
        }

        // Always copy over flag in case user manually set unread and for it
        // to persist across multiple data requests, irrespective of whether
        // content is new or not
        module.setUnread(realmModule.isUnread());

        RealmResults<Content> results = realm.where(Content.class)
                .in("fileName", module.getContents().stream().map(Content::getFileName).toArray(String[]::new))
                .in("fileUrl", module.getContents().stream().map(Content::getFileUrl).toArray(String[]::new))
                .in("timeModified", module.getContents().stream().map(Content::getTimeModified).toArray(Long[]::new))
                .findAll();

        List<Content> newContents = module.getContents().stream().filter(content -> !results.contains(content))
                .map(Content::copy).collect(Collectors.toList());
        if (newContents.isEmpty()) {
            return null;
        }

        module.setUnread(true);
        Module retModule = module.deepCopy();
        retModule.setContents(new RealmList<>(newContents.toArray(new Content[0])));
        return retModule;
    }

    public List<Discussion> setForumDiscussions(int forumId, List<Discussion> discussions) {
        if (!UserAccount.INSTANCE.isLoggedIn()) {
            return null;
        }
        List<Discussion> newDiscussions = new ArrayList<>();

        for (Discussion discussion : discussions) {
            if (realm.where(Discussion.class).equalTo("id", discussion.getId()).findFirst() == null) {
                newDiscussions.add(discussion);
            }
        }
        realm.executeTransactionAsync(r -> {
            r.where(Discussion.class).equalTo("forumId", forumId).findAll().deleteAllFromRealm();
            r.copyToRealm(discussions);
        });
        return newDiscussions;
    }

    @Nullable
    public Module getModuleByModId(int modId) {
        RealmResults<Module> modules = realm.where(Module.class).equalTo("id", modId).findAll();

        if (modules.isEmpty()) {
            return null;
        } else {
            return modules.first();
        }
    }

    @Nullable
    public CourseSection getSectionBySectionNum(int courseId, int sectionNum) {
        RealmResults<CourseSection> sections = realm.where(CourseSection.class)
                .equalTo("courseId", courseId)
                .equalTo("sectionNum", sectionNum).findAll();

        if (sections.isEmpty()) {
            return null;
        } else {
            return sections.first();
        }
    }

    public List<Discussion> getForumDiscussions(int forumId) {
        return realm.where(Discussion.class).equalTo("forumId", forumId).findAll();
    }

    public void deleteCourse(int courseId) {
        realm.executeTransactionAsync(r -> {
            r.where(Course.class).equalTo("id", courseId).findAll().deleteAllFromRealm();
            r.where(CourseSection.class).equalTo("courseId", courseId).findAll().deleteAllFromRealm();
        });
    }

    public List<CourseSection> getCourseData(int courseId) {
        List<CourseSection> courseSections;
        courseSections = realm.copyFromRealm(realm
                .where(CourseSection.class)
                .equalTo("courseId", courseId)
                .findAll()
                .sort("sectionNum", Sort.ASCENDING));
        return courseSections;
    }

    public void markCourseAsRead(int courseId) {
        realm.executeTransaction(r -> {
            // Get the section ids
            Integer[] sections = r.where(CourseSection.class)
                    .equalTo("courseId", courseId)
                    .findAll().stream().map(CourseSection::getId).mapToInt(x -> x)
                    .boxed().toArray(Integer[]::new);
            r.where(Module.class).in("courseSectionId", sections).findAll()
                    .setBoolean("isUnread", false);

        });
    }

    public void markAllAsRead() {
        realm.executeTransaction(r -> r.where(Module.class).findAll().setBoolean("isUnread", false));
    }

    public void markModuleAsRead(Module module) {
        module.setUnread(false);
        realm.executeTransaction(r -> {
            realm.where(Module.class).equalTo("id", module.getId()).findAll()
                    .setBoolean("isUnread", false);
        });
    }

    public void markModuleAsUnread(Module module) {
        module.setUnread(true);
        realm.executeTransaction(r -> {
            realm.where(Module.class).equalTo("id", module.getId()).findAll()
                    .setBoolean("isUnread", true);
        });
    }

    public String getCourseName(int courseId) {
        Course course = realm.where(Course.class).equalTo("id", courseId).findFirst();
        if (course == null) return "";
        return course.getShortName();
    }

    public String getCourseNameForActionBarTitle(int courseId){
        Course course = realm.where(Course.class).equalTo("id", courseId).findFirst();
        if (course == null) return "";
        return course.getCourseName()[0] + " " + course.getCourseName()[2];
    }

    public void setRealmInstance(@NotNull Realm realm) {
        this.realm = realm;
    }

    public void setFavoriteStatus(int courseId, boolean isFavorite) {
        realm.beginTransaction();
        Course course = realm.where(Course.class).equalTo("id", courseId).findFirst();
        if (course != null) course.setFavorite(isFavorite);
        realm.commitTransaction();
    }

    public int getUnreadCount(int courseId) {
        return realm.where(Module.class)
                .in("courseSectionId", getCourseData(courseId).stream()
                        .map(CourseSection::getId)
                        .toArray(Integer[]::new)
                ).equalTo("isUnread", true)
                .findAll().size();
    }
}
