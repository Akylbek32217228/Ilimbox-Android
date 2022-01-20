package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxy extends ilimboxAndroid.bphc.ilimbox.models.course.CourseSection
    implements RealmObjectProxy, ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface {

    static final class CourseSectionColumnInfo extends ColumnInfo {
        long idColKey;
        long sectionNumColKey;
        long summaryColKey;
        long modulesColKey;
        long courseIdColKey;
        long nameColKey;

        CourseSectionColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("CourseSection");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.sectionNumColKey = addColumnDetails("sectionNum", "sectionNum", objectSchemaInfo);
            this.summaryColKey = addColumnDetails("summary", "summary", objectSchemaInfo);
            this.modulesColKey = addColumnDetails("modules", "modules", objectSchemaInfo);
            this.courseIdColKey = addColumnDetails("courseId", "courseId", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
        }

        CourseSectionColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CourseSectionColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CourseSectionColumnInfo src = (CourseSectionColumnInfo) rawSrc;
            final CourseSectionColumnInfo dst = (CourseSectionColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.sectionNumColKey = src.sectionNumColKey;
            dst.summaryColKey = src.summaryColKey;
            dst.modulesColKey = src.modulesColKey;
            dst.courseIdColKey = src.courseIdColKey;
            dst.nameColKey = src.nameColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private CourseSectionColumnInfo columnInfo;
    private ProxyState<ilimboxAndroid.bphc.ilimbox.models.course.CourseSection> proxyState;
    private RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module> modulesRealmList;

    ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CourseSectionColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<ilimboxAndroid.bphc.ilimbox.models.course.CourseSection>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$sectionNum() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.sectionNumColKey);
    }

    @Override
    public void realmSet$sectionNum(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.sectionNumColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.sectionNumColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$summary() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.summaryColKey);
    }

    @Override
    public void realmSet$summary(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'summary' to null.");
            }
            row.getTable().setString(columnInfo.summaryColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'summary' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.summaryColKey, value);
    }

    @Override
    public RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module> realmGet$modules() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (modulesRealmList != null) {
            return modulesRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.modulesColKey);
            modulesRealmList = new RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module>(ilimboxAndroid.bphc.ilimbox.models.course.Module.class, osList, proxyState.getRealm$realm());
            return modulesRealmList;
        }
    }

    @Override
    public void realmSet$modules(RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("modules")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module> original = value;
                value = new RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module>();
                for (ilimboxAndroid.bphc.ilimbox.models.course.Module item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.modulesColKey);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                ilimboxAndroid.bphc.ilimbox.models.course.Module linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                ilimboxAndroid.bphc.ilimbox.models.course.Module linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        }
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$courseId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.courseIdColKey);
    }

    @Override
    public void realmSet$courseId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.courseIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.courseIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameColKey);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
            }
            row.getTable().setString(columnInfo.nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.nameColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("CourseSection", 6, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("sectionNum", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("summary", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("modules", RealmFieldType.LIST, "Module");
        builder.addPersistedProperty("courseId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CourseSectionColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new CourseSectionColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "CourseSection";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CourseSection";
    }

    @SuppressWarnings("cast")
    public static ilimboxAndroid.bphc.ilimbox.models.course.CourseSection createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        ilimboxAndroid.bphc.ilimbox.models.course.CourseSection obj = null;
        if (update) {
            Table table = realm.getTable(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection.class);
            CourseSectionColumnInfo columnInfo = (CourseSectionColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection.class);
            long pkColumnKey = columnInfo.idColKey;
            long colKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                colKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection.class), false, Collections.<String> emptyList());
                    obj = new io.realm.ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("modules")) {
                excludeFields.add("modules");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxy) realm.createObjectInternal(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxy) realm.createObjectInternal(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface objProxy = (ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) obj;
        if (json.has("sectionNum")) {
            if (json.isNull("sectionNum")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'sectionNum' to null.");
            } else {
                objProxy.realmSet$sectionNum((int) json.getInt("sectionNum"));
            }
        }
        if (json.has("summary")) {
            if (json.isNull("summary")) {
                objProxy.realmSet$summary(null);
            } else {
                objProxy.realmSet$summary((String) json.getString("summary"));
            }
        }
        if (json.has("modules")) {
            if (json.isNull("modules")) {
                objProxy.realmSet$modules(null);
            } else {
                objProxy.realmGet$modules().clear();
                JSONArray array = json.getJSONArray("modules");
                for (int i = 0; i < array.length(); i++) {
                    ilimboxAndroid.bphc.ilimbox.models.course.Module item = ilimboxAndroid_bphc_ilimbox_models_course_ModuleRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$modules().add(item);
                }
            }
        }
        if (json.has("courseId")) {
            if (json.isNull("courseId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'courseId' to null.");
            } else {
                objProxy.realmSet$courseId((int) json.getInt("courseId"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static ilimboxAndroid.bphc.ilimbox.models.course.CourseSection createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final ilimboxAndroid.bphc.ilimbox.models.course.CourseSection obj = new ilimboxAndroid.bphc.ilimbox.models.course.CourseSection();
        final ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface objProxy = (ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("sectionNum")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sectionNum((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'sectionNum' to null.");
                }
            } else if (name.equals("summary")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$summary((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$summary(null);
                }
            } else if (name.equals("modules")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$modules(null);
                } else {
                    objProxy.realmSet$modules(new RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        ilimboxAndroid.bphc.ilimbox.models.course.Module item = ilimboxAndroid_bphc_ilimbox_models_course_ModuleRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$modules().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("courseId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$courseId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'courseId' to null.");
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    private static ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection.class), false, Collections.<String>emptyList());
        io.realm.ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxy obj = new io.realm.ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static ilimboxAndroid.bphc.ilimbox.models.course.CourseSection copyOrUpdate(Realm realm, CourseSectionColumnInfo columnInfo, ilimboxAndroid.bphc.ilimbox.models.course.CourseSection object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (ilimboxAndroid.bphc.ilimbox.models.course.CourseSection) cachedRealmObject;
        }

        ilimboxAndroid.bphc.ilimbox.models.course.CourseSection realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection.class);
            long pkColumnKey = columnInfo.idColKey;
            long colKey = table.findFirstLong(pkColumnKey, ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$id());
            if (colKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static ilimboxAndroid.bphc.ilimbox.models.course.CourseSection copy(Realm realm, CourseSectionColumnInfo columnInfo, ilimboxAndroid.bphc.ilimbox.models.course.CourseSection newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (ilimboxAndroid.bphc.ilimbox.models.course.CourseSection) cachedRealmObject;
        }

        ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface realmObjectSource = (ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) newObject;

        Table table = realm.getTable(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.sectionNumColKey, realmObjectSource.realmGet$sectionNum());
        builder.addString(columnInfo.summaryColKey, realmObjectSource.realmGet$summary());
        builder.addInteger(columnInfo.courseIdColKey, realmObjectSource.realmGet$courseId());
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module> modulesList = realmObjectSource.realmGet$modules();
        if (modulesList != null) {
            RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module> modulesRealmList = realmObjectCopy.realmGet$modules();
            modulesRealmList.clear();
            for (int i = 0; i < modulesList.size(); i++) {
                ilimboxAndroid.bphc.ilimbox.models.course.Module modulesItem = modulesList.get(i);
                ilimboxAndroid.bphc.ilimbox.models.course.Module cachemodules = (ilimboxAndroid.bphc.ilimbox.models.course.Module) cache.get(modulesItem);
                if (cachemodules != null) {
                    modulesRealmList.add(cachemodules);
                } else {
                    modulesRealmList.add(ilimboxAndroid_bphc_ilimbox_models_course_ModuleRealmProxy.copyOrUpdate(realm, (ilimboxAndroid_bphc_ilimbox_models_course_ModuleRealmProxy.ModuleColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.bphc.ilimbox.models.course.Module.class), modulesItem, update, cache, flags));
                }
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, ilimboxAndroid.bphc.ilimbox.models.course.CourseSection object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection.class);
        long tableNativePtr = table.getNativePtr();
        CourseSectionColumnInfo columnInfo = (CourseSectionColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection.class);
        long pkColumnKey = columnInfo.idColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$id());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, colKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.sectionNumColKey, colKey, ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$sectionNum(), false);
        String realmGet$summary = ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$summary();
        if (realmGet$summary != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.summaryColKey, colKey, realmGet$summary, false);
        }

        RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module> modulesList = ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$modules();
        if (modulesList != null) {
            OsList modulesOsList = new OsList(table.getUncheckedRow(colKey), columnInfo.modulesColKey);
            for (ilimboxAndroid.bphc.ilimbox.models.course.Module modulesItem : modulesList) {
                Long cacheItemIndexmodules = cache.get(modulesItem);
                if (cacheItemIndexmodules == null) {
                    cacheItemIndexmodules = ilimboxAndroid_bphc_ilimbox_models_course_ModuleRealmProxy.insert(realm, modulesItem, cache);
                }
                modulesOsList.addRow(cacheItemIndexmodules);
            }
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.courseIdColKey, colKey, ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$courseId(), false);
        String realmGet$name = ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, colKey, realmGet$name, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection.class);
        long tableNativePtr = table.getNativePtr();
        CourseSectionColumnInfo columnInfo = (CourseSectionColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection.class);
        long pkColumnKey = columnInfo.idColKey;
        ilimboxAndroid.bphc.ilimbox.models.course.CourseSection object = null;
        while (objects.hasNext()) {
            object = (ilimboxAndroid.bphc.ilimbox.models.course.CourseSection) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$id());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, colKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.sectionNumColKey, colKey, ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$sectionNum(), false);
            String realmGet$summary = ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$summary();
            if (realmGet$summary != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.summaryColKey, colKey, realmGet$summary, false);
            }

            RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module> modulesList = ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$modules();
            if (modulesList != null) {
                OsList modulesOsList = new OsList(table.getUncheckedRow(colKey), columnInfo.modulesColKey);
                for (ilimboxAndroid.bphc.ilimbox.models.course.Module modulesItem : modulesList) {
                    Long cacheItemIndexmodules = cache.get(modulesItem);
                    if (cacheItemIndexmodules == null) {
                        cacheItemIndexmodules = ilimboxAndroid_bphc_ilimbox_models_course_ModuleRealmProxy.insert(realm, modulesItem, cache);
                    }
                    modulesOsList.addRow(cacheItemIndexmodules);
                }
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.courseIdColKey, colKey, ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$courseId(), false);
            String realmGet$name = ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, colKey, realmGet$name, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ilimboxAndroid.bphc.ilimbox.models.course.CourseSection object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection.class);
        long tableNativePtr = table.getNativePtr();
        CourseSectionColumnInfo columnInfo = (CourseSectionColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection.class);
        long pkColumnKey = columnInfo.idColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$id());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, colKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.sectionNumColKey, colKey, ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$sectionNum(), false);
        String realmGet$summary = ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$summary();
        if (realmGet$summary != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.summaryColKey, colKey, realmGet$summary, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.summaryColKey, colKey, false);
        }

        OsList modulesOsList = new OsList(table.getUncheckedRow(colKey), columnInfo.modulesColKey);
        RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module> modulesList = ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$modules();
        if (modulesList != null && modulesList.size() == modulesOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = modulesList.size();
            for (int i = 0; i < objects; i++) {
                ilimboxAndroid.bphc.ilimbox.models.course.Module modulesItem = modulesList.get(i);
                Long cacheItemIndexmodules = cache.get(modulesItem);
                if (cacheItemIndexmodules == null) {
                    cacheItemIndexmodules = ilimboxAndroid_bphc_ilimbox_models_course_ModuleRealmProxy.insertOrUpdate(realm, modulesItem, cache);
                }
                modulesOsList.setRow(i, cacheItemIndexmodules);
            }
        } else {
            modulesOsList.removeAll();
            if (modulesList != null) {
                for (ilimboxAndroid.bphc.ilimbox.models.course.Module modulesItem : modulesList) {
                    Long cacheItemIndexmodules = cache.get(modulesItem);
                    if (cacheItemIndexmodules == null) {
                        cacheItemIndexmodules = ilimboxAndroid_bphc_ilimbox_models_course_ModuleRealmProxy.insertOrUpdate(realm, modulesItem, cache);
                    }
                    modulesOsList.addRow(cacheItemIndexmodules);
                }
            }
        }

        Table.nativeSetLong(tableNativePtr, columnInfo.courseIdColKey, colKey, ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$courseId(), false);
        String realmGet$name = ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, colKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection.class);
        long tableNativePtr = table.getNativePtr();
        CourseSectionColumnInfo columnInfo = (CourseSectionColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection.class);
        long pkColumnKey = columnInfo.idColKey;
        ilimboxAndroid.bphc.ilimbox.models.course.CourseSection object = null;
        while (objects.hasNext()) {
            object = (ilimboxAndroid.bphc.ilimbox.models.course.CourseSection) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$id());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, colKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.sectionNumColKey, colKey, ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$sectionNum(), false);
            String realmGet$summary = ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$summary();
            if (realmGet$summary != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.summaryColKey, colKey, realmGet$summary, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.summaryColKey, colKey, false);
            }

            OsList modulesOsList = new OsList(table.getUncheckedRow(colKey), columnInfo.modulesColKey);
            RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module> modulesList = ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$modules();
            if (modulesList != null && modulesList.size() == modulesOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = modulesList.size();
                for (int i = 0; i < objectCount; i++) {
                    ilimboxAndroid.bphc.ilimbox.models.course.Module modulesItem = modulesList.get(i);
                    Long cacheItemIndexmodules = cache.get(modulesItem);
                    if (cacheItemIndexmodules == null) {
                        cacheItemIndexmodules = ilimboxAndroid_bphc_ilimbox_models_course_ModuleRealmProxy.insertOrUpdate(realm, modulesItem, cache);
                    }
                    modulesOsList.setRow(i, cacheItemIndexmodules);
                }
            } else {
                modulesOsList.removeAll();
                if (modulesList != null) {
                    for (ilimboxAndroid.bphc.ilimbox.models.course.Module modulesItem : modulesList) {
                        Long cacheItemIndexmodules = cache.get(modulesItem);
                        if (cacheItemIndexmodules == null) {
                            cacheItemIndexmodules = ilimboxAndroid_bphc_ilimbox_models_course_ModuleRealmProxy.insertOrUpdate(realm, modulesItem, cache);
                        }
                        modulesOsList.addRow(cacheItemIndexmodules);
                    }
                }
            }

            Table.nativeSetLong(tableNativePtr, columnInfo.courseIdColKey, colKey, ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$courseId(), false);
            String realmGet$name = ((ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, colKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, colKey, false);
            }
        }
    }

    public static ilimboxAndroid.bphc.ilimbox.models.course.CourseSection createDetachedCopy(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        ilimboxAndroid.bphc.ilimbox.models.course.CourseSection unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new ilimboxAndroid.bphc.ilimbox.models.course.CourseSection();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (ilimboxAndroid.bphc.ilimbox.models.course.CourseSection) cachedObject.object;
            }
            unmanagedObject = (ilimboxAndroid.bphc.ilimbox.models.course.CourseSection) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface unmanagedCopy = (ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) unmanagedObject;
        ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface realmSource = (ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$sectionNum(realmSource.realmGet$sectionNum());
        unmanagedCopy.realmSet$summary(realmSource.realmGet$summary());

        // Deep copy of modules
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$modules(null);
        } else {
            RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module> managedmodulesList = realmSource.realmGet$modules();
            RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module> unmanagedmodulesList = new RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module>();
            unmanagedCopy.realmSet$modules(unmanagedmodulesList);
            int nextDepth = currentDepth + 1;
            int size = managedmodulesList.size();
            for (int i = 0; i < size; i++) {
                ilimboxAndroid.bphc.ilimbox.models.course.Module item = ilimboxAndroid_bphc_ilimbox_models_course_ModuleRealmProxy.createDetachedCopy(managedmodulesList.get(i), nextDepth, maxDepth, cache);
                unmanagedmodulesList.add(item);
            }
        }
        unmanagedCopy.realmSet$courseId(realmSource.realmGet$courseId());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());

        return unmanagedObject;
    }

    static ilimboxAndroid.bphc.ilimbox.models.course.CourseSection update(Realm realm, CourseSectionColumnInfo columnInfo, ilimboxAndroid.bphc.ilimbox.models.course.CourseSection realmObject, ilimboxAndroid.bphc.ilimbox.models.course.CourseSection newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface realmObjectTarget = (ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) realmObject;
        ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface realmObjectSource = (ilimboxAndroid_bphc_ilimbox_models_course_CourseSectionRealmProxyInterface) newObject;
        Table table = realm.getTable(ilimboxAndroid.bphc.ilimbox.models.course.CourseSection.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.sectionNumColKey, realmObjectSource.realmGet$sectionNum());
        builder.addString(columnInfo.summaryColKey, realmObjectSource.realmGet$summary());

        RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module> modulesList = realmObjectSource.realmGet$modules();
        if (modulesList != null) {
            RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module> modulesManagedCopy = new RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module>();
            for (int i = 0; i < modulesList.size(); i++) {
                ilimboxAndroid.bphc.ilimbox.models.course.Module modulesItem = modulesList.get(i);
                ilimboxAndroid.bphc.ilimbox.models.course.Module cachemodules = (ilimboxAndroid.bphc.ilimbox.models.course.Module) cache.get(modulesItem);
                if (cachemodules != null) {
                    modulesManagedCopy.add(cachemodules);
                } else {
                    modulesManagedCopy.add(ilimboxAndroid_bphc_ilimbox_models_course_ModuleRealmProxy.copyOrUpdate(realm, (ilimboxAndroid_bphc_ilimbox_models_course_ModuleRealmProxy.ModuleColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.bphc.ilimbox.models.course.Module.class), modulesItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.modulesColKey, modulesManagedCopy);
        } else {
            builder.addObjectList(columnInfo.modulesColKey, new RealmList<ilimboxAndroid.bphc.ilimbox.models.course.Module>());
        }
        builder.addInteger(columnInfo.courseIdColKey, realmObjectSource.realmGet$courseId());
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("CourseSection = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sectionNum:");
        stringBuilder.append(realmGet$sectionNum());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{summary:");
        stringBuilder.append(realmGet$summary());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{modules:");
        stringBuilder.append("RealmList<Module>[").append(realmGet$modules().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{courseId:");
        stringBuilder.append(realmGet$courseId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

}
