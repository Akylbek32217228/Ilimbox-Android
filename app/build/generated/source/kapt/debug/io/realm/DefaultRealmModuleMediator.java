package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(6);
        modelClasses.add(ilimboxAndroid.ilimbox.models.course.Content.class);
        modelClasses.add(ilimboxAndroid.ilimbox.models.course.Course.class);
        modelClasses.add(ilimboxAndroid.ilimbox.models.course.CourseSection.class);
        modelClasses.add(ilimboxAndroid.ilimbox.models.course.Module.class);
        modelClasses.add(ilimboxAndroid.ilimbox.models.forum.Attachment.class);
        modelClasses.add(ilimboxAndroid.ilimbox.models.forum.Discussion.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(6);
        infoMap.put(ilimboxAndroid.ilimbox.models.course.Content.class, io.realm.ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(ilimboxAndroid.ilimbox.models.course.Course.class, io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(ilimboxAndroid.ilimbox.models.course.CourseSection.class, io.realm.ilimboxAndroid_ilimbox_models_course_CourseSectionRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(ilimboxAndroid.ilimbox.models.course.Module.class, io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(ilimboxAndroid.ilimbox.models.forum.Attachment.class, io.realm.ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(ilimboxAndroid.ilimbox.models.forum.Discussion.class, io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Content.class)) {
            return io.realm.ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Course.class)) {
            return io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.CourseSection.class)) {
            return io.realm.ilimboxAndroid_ilimbox_models_course_CourseSectionRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Module.class)) {
            return io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Attachment.class)) {
            return io.realm.ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Discussion.class)) {
            return io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Content.class)) {
            return "Content";
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Course.class)) {
            return "Course";
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.CourseSection.class)) {
            return "CourseSection";
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Module.class)) {
            return "Module";
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Attachment.class)) {
            return "Attachment";
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Discussion.class)) {
            return "Discussion";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Content.class)) {
                return clazz.cast(new io.realm.ilimboxAndroid_ilimbox_models_course_ContentRealmProxy());
            }
            if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Course.class)) {
                return clazz.cast(new io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy());
            }
            if (clazz.equals(ilimboxAndroid.ilimbox.models.course.CourseSection.class)) {
                return clazz.cast(new io.realm.ilimboxAndroid_ilimbox_models_course_CourseSectionRealmProxy());
            }
            if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Module.class)) {
                return clazz.cast(new io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy());
            }
            if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Attachment.class)) {
                return clazz.cast(new io.realm.ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy());
            }
            if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Discussion.class)) {
                return clazz.cast(new io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Content.class)) {
            ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.ContentColumnInfo columnInfo = (ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.ContentColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Content.class);
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.copyOrUpdate(realm, columnInfo, (ilimboxAndroid.ilimbox.models.course.Content) obj, update, cache, flags));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Course.class)) {
            ilimboxAndroid_ilimbox_models_course_CourseRealmProxy.CourseColumnInfo columnInfo = (ilimboxAndroid_ilimbox_models_course_CourseRealmProxy.CourseColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Course.class);
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy.copyOrUpdate(realm, columnInfo, (ilimboxAndroid.ilimbox.models.course.Course) obj, update, cache, flags));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.CourseSection.class)) {
            ilimboxAndroid_ilimbox_models_course_CourseSectionRealmProxy.CourseSectionColumnInfo columnInfo = (ilimboxAndroid_ilimbox_models_course_CourseSectionRealmProxy.CourseSectionColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.CourseSection.class);
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_course_CourseSectionRealmProxy.copyOrUpdate(realm, columnInfo, (ilimboxAndroid.ilimbox.models.course.CourseSection) obj, update, cache, flags));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Module.class)) {
            ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy.ModuleColumnInfo columnInfo = (ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy.ModuleColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Module.class);
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy.copyOrUpdate(realm, columnInfo, (ilimboxAndroid.ilimbox.models.course.Module) obj, update, cache, flags));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Attachment.class)) {
            ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.AttachmentColumnInfo columnInfo = (ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.AttachmentColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.forum.Attachment.class);
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.copyOrUpdate(realm, columnInfo, (ilimboxAndroid.ilimbox.models.forum.Attachment) obj, update, cache, flags));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Discussion.class)) {
            ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy.DiscussionColumnInfo columnInfo = (ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy.DiscussionColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.forum.Discussion.class);
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy.copyOrUpdate(realm, columnInfo, (ilimboxAndroid.ilimbox.models.forum.Discussion) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Content.class)) {
            io.realm.ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.insert(realm, (ilimboxAndroid.ilimbox.models.course.Content) object, cache);
        } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Course.class)) {
            io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy.insert(realm, (ilimboxAndroid.ilimbox.models.course.Course) object, cache);
        } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.CourseSection.class)) {
            io.realm.ilimboxAndroid_ilimbox_models_course_CourseSectionRealmProxy.insert(realm, (ilimboxAndroid.ilimbox.models.course.CourseSection) object, cache);
        } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Module.class)) {
            io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy.insert(realm, (ilimboxAndroid.ilimbox.models.course.Module) object, cache);
        } else if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Attachment.class)) {
            io.realm.ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.insert(realm, (ilimboxAndroid.ilimbox.models.forum.Attachment) object, cache);
        } else if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Discussion.class)) {
            io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy.insert(realm, (ilimboxAndroid.ilimbox.models.forum.Discussion) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Content.class)) {
                io.realm.ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.insert(realm, (ilimboxAndroid.ilimbox.models.course.Content) object, cache);
            } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Course.class)) {
                io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy.insert(realm, (ilimboxAndroid.ilimbox.models.course.Course) object, cache);
            } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.CourseSection.class)) {
                io.realm.ilimboxAndroid_ilimbox_models_course_CourseSectionRealmProxy.insert(realm, (ilimboxAndroid.ilimbox.models.course.CourseSection) object, cache);
            } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Module.class)) {
                io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy.insert(realm, (ilimboxAndroid.ilimbox.models.course.Module) object, cache);
            } else if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Attachment.class)) {
                io.realm.ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.insert(realm, (ilimboxAndroid.ilimbox.models.forum.Attachment) object, cache);
            } else if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Discussion.class)) {
                io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy.insert(realm, (ilimboxAndroid.ilimbox.models.forum.Discussion) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Content.class)) {
                    io.realm.ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Course.class)) {
                    io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.CourseSection.class)) {
                    io.realm.ilimboxAndroid_ilimbox_models_course_CourseSectionRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Module.class)) {
                    io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Attachment.class)) {
                    io.realm.ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Discussion.class)) {
                    io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Content.class)) {
            io.realm.ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.insertOrUpdate(realm, (ilimboxAndroid.ilimbox.models.course.Content) obj, cache);
        } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Course.class)) {
            io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy.insertOrUpdate(realm, (ilimboxAndroid.ilimbox.models.course.Course) obj, cache);
        } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.CourseSection.class)) {
            io.realm.ilimboxAndroid_ilimbox_models_course_CourseSectionRealmProxy.insertOrUpdate(realm, (ilimboxAndroid.ilimbox.models.course.CourseSection) obj, cache);
        } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Module.class)) {
            io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy.insertOrUpdate(realm, (ilimboxAndroid.ilimbox.models.course.Module) obj, cache);
        } else if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Attachment.class)) {
            io.realm.ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.insertOrUpdate(realm, (ilimboxAndroid.ilimbox.models.forum.Attachment) obj, cache);
        } else if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Discussion.class)) {
            io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy.insertOrUpdate(realm, (ilimboxAndroid.ilimbox.models.forum.Discussion) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Content.class)) {
                io.realm.ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.insertOrUpdate(realm, (ilimboxAndroid.ilimbox.models.course.Content) object, cache);
            } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Course.class)) {
                io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy.insertOrUpdate(realm, (ilimboxAndroid.ilimbox.models.course.Course) object, cache);
            } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.CourseSection.class)) {
                io.realm.ilimboxAndroid_ilimbox_models_course_CourseSectionRealmProxy.insertOrUpdate(realm, (ilimboxAndroid.ilimbox.models.course.CourseSection) object, cache);
            } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Module.class)) {
                io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy.insertOrUpdate(realm, (ilimboxAndroid.ilimbox.models.course.Module) object, cache);
            } else if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Attachment.class)) {
                io.realm.ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.insertOrUpdate(realm, (ilimboxAndroid.ilimbox.models.forum.Attachment) object, cache);
            } else if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Discussion.class)) {
                io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy.insertOrUpdate(realm, (ilimboxAndroid.ilimbox.models.forum.Discussion) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Content.class)) {
                    io.realm.ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Course.class)) {
                    io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.CourseSection.class)) {
                    io.realm.ilimboxAndroid_ilimbox_models_course_CourseSectionRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Module.class)) {
                    io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Attachment.class)) {
                    io.realm.ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Discussion.class)) {
                    io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Content.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Course.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.CourseSection.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_course_CourseSectionRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Module.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Attachment.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Discussion.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Content.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Course.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.CourseSection.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_course_CourseSectionRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Module.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Attachment.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Discussion.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Content.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.createDetachedCopy((ilimboxAndroid.ilimbox.models.course.Content) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Course.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy.createDetachedCopy((ilimboxAndroid.ilimbox.models.course.Course) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.CourseSection.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_course_CourseSectionRealmProxy.createDetachedCopy((ilimboxAndroid.ilimbox.models.course.CourseSection) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.course.Module.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy.createDetachedCopy((ilimboxAndroid.ilimbox.models.course.Module) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Attachment.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.createDetachedCopy((ilimboxAndroid.ilimbox.models.forum.Attachment) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(ilimboxAndroid.ilimbox.models.forum.Discussion.class)) {
            return clazz.cast(io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy.createDetachedCopy((ilimboxAndroid.ilimbox.models.forum.Discussion) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
