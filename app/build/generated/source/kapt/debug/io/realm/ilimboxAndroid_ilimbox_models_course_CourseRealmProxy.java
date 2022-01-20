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
public class ilimboxAndroid_ilimbox_models_course_CourseRealmProxy extends ilimboxAndroid.ilimbox.models.course.Course
    implements RealmObjectProxy, ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface {

    static final class CourseColumnInfo extends ColumnInfo {
        long idColKey;
        long isFavoriteColKey;
        long shortNameColKey;
        long fullNameColKey;

        CourseColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Course");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.isFavoriteColKey = addColumnDetails("isFavorite", "isFavorite", objectSchemaInfo);
            this.shortNameColKey = addColumnDetails("shortName", "shortName", objectSchemaInfo);
            this.fullNameColKey = addColumnDetails("fullName", "fullName", objectSchemaInfo);
        }

        CourseColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CourseColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CourseColumnInfo src = (CourseColumnInfo) rawSrc;
            final CourseColumnInfo dst = (CourseColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.isFavoriteColKey = src.isFavoriteColKey;
            dst.shortNameColKey = src.shortNameColKey;
            dst.fullNameColKey = src.fullNameColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private CourseColumnInfo columnInfo;
    private ProxyState<ilimboxAndroid.ilimbox.models.course.Course> proxyState;

    ilimboxAndroid_ilimbox_models_course_CourseRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CourseColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<ilimboxAndroid.ilimbox.models.course.Course>(this);
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
    public boolean realmGet$isFavorite() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isFavoriteColKey);
    }

    @Override
    public void realmSet$isFavorite(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isFavoriteColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isFavoriteColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$shortName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.shortNameColKey);
    }

    @Override
    public void realmSet$shortName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'shortName' to null.");
            }
            row.getTable().setString(columnInfo.shortNameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'shortName' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.shortNameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$fullName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fullNameColKey);
    }

    @Override
    public void realmSet$fullName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'fullName' to null.");
            }
            row.getTable().setString(columnInfo.fullNameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'fullName' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.fullNameColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Course", 4, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("isFavorite", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("shortName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("fullName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CourseColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new CourseColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Course";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Course";
    }

    @SuppressWarnings("cast")
    public static ilimboxAndroid.ilimbox.models.course.Course createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        ilimboxAndroid.ilimbox.models.course.Course obj = null;
        if (update) {
            Table table = realm.getTable(ilimboxAndroid.ilimbox.models.course.Course.class);
            CourseColumnInfo columnInfo = (CourseColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Course.class);
            long pkColumnKey = columnInfo.idColKey;
            long colKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                colKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Course.class), false, Collections.<String> emptyList());
                    obj = new io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy) realm.createObjectInternal(ilimboxAndroid.ilimbox.models.course.Course.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy) realm.createObjectInternal(ilimboxAndroid.ilimbox.models.course.Course.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface objProxy = (ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) obj;
        if (json.has("isFavorite")) {
            if (json.isNull("isFavorite")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isFavorite' to null.");
            } else {
                objProxy.realmSet$isFavorite((boolean) json.getBoolean("isFavorite"));
            }
        }
        if (json.has("shortName")) {
            if (json.isNull("shortName")) {
                objProxy.realmSet$shortName(null);
            } else {
                objProxy.realmSet$shortName((String) json.getString("shortName"));
            }
        }
        if (json.has("fullName")) {
            if (json.isNull("fullName")) {
                objProxy.realmSet$fullName(null);
            } else {
                objProxy.realmSet$fullName((String) json.getString("fullName"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static ilimboxAndroid.ilimbox.models.course.Course createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final ilimboxAndroid.ilimbox.models.course.Course obj = new ilimboxAndroid.ilimbox.models.course.Course();
        final ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface objProxy = (ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) obj;
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
            } else if (name.equals("isFavorite")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isFavorite((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isFavorite' to null.");
                }
            } else if (name.equals("shortName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$shortName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$shortName(null);
                }
            } else if (name.equals("fullName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fullName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fullName(null);
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

    private static ilimboxAndroid_ilimbox_models_course_CourseRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Course.class), false, Collections.<String>emptyList());
        io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy obj = new io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static ilimboxAndroid.ilimbox.models.course.Course copyOrUpdate(Realm realm, CourseColumnInfo columnInfo, ilimboxAndroid.ilimbox.models.course.Course object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (ilimboxAndroid.ilimbox.models.course.Course) cachedRealmObject;
        }

        ilimboxAndroid.ilimbox.models.course.Course realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(ilimboxAndroid.ilimbox.models.course.Course.class);
            long pkColumnKey = columnInfo.idColKey;
            long colKey = table.findFirstLong(pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$id());
            if (colKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static ilimboxAndroid.ilimbox.models.course.Course copy(Realm realm, CourseColumnInfo columnInfo, ilimboxAndroid.ilimbox.models.course.Course newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (ilimboxAndroid.ilimbox.models.course.Course) cachedRealmObject;
        }

        ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface realmObjectSource = (ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) newObject;

        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.course.Course.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addBoolean(columnInfo.isFavoriteColKey, realmObjectSource.realmGet$isFavorite());
        builder.addString(columnInfo.shortNameColKey, realmObjectSource.realmGet$shortName());
        builder.addString(columnInfo.fullNameColKey, realmObjectSource.realmGet$fullName());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.ilimboxAndroid_ilimbox_models_course_CourseRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, ilimboxAndroid.ilimbox.models.course.Course object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.course.Course.class);
        long tableNativePtr = table.getNativePtr();
        CourseColumnInfo columnInfo = (CourseColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Course.class);
        long pkColumnKey = columnInfo.idColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$id());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, colKey);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isFavoriteColKey, colKey, ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$isFavorite(), false);
        String realmGet$shortName = ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$shortName();
        if (realmGet$shortName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.shortNameColKey, colKey, realmGet$shortName, false);
        }
        String realmGet$fullName = ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$fullName();
        if (realmGet$fullName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fullNameColKey, colKey, realmGet$fullName, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.course.Course.class);
        long tableNativePtr = table.getNativePtr();
        CourseColumnInfo columnInfo = (CourseColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Course.class);
        long pkColumnKey = columnInfo.idColKey;
        ilimboxAndroid.ilimbox.models.course.Course object = null;
        while (objects.hasNext()) {
            object = (ilimboxAndroid.ilimbox.models.course.Course) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$id());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, colKey);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isFavoriteColKey, colKey, ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$isFavorite(), false);
            String realmGet$shortName = ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$shortName();
            if (realmGet$shortName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.shortNameColKey, colKey, realmGet$shortName, false);
            }
            String realmGet$fullName = ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$fullName();
            if (realmGet$fullName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fullNameColKey, colKey, realmGet$fullName, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ilimboxAndroid.ilimbox.models.course.Course object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.course.Course.class);
        long tableNativePtr = table.getNativePtr();
        CourseColumnInfo columnInfo = (CourseColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Course.class);
        long pkColumnKey = columnInfo.idColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$id());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, colKey);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isFavoriteColKey, colKey, ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$isFavorite(), false);
        String realmGet$shortName = ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$shortName();
        if (realmGet$shortName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.shortNameColKey, colKey, realmGet$shortName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.shortNameColKey, colKey, false);
        }
        String realmGet$fullName = ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$fullName();
        if (realmGet$fullName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fullNameColKey, colKey, realmGet$fullName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fullNameColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.course.Course.class);
        long tableNativePtr = table.getNativePtr();
        CourseColumnInfo columnInfo = (CourseColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Course.class);
        long pkColumnKey = columnInfo.idColKey;
        ilimboxAndroid.ilimbox.models.course.Course object = null;
        while (objects.hasNext()) {
            object = (ilimboxAndroid.ilimbox.models.course.Course) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$id());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, colKey);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isFavoriteColKey, colKey, ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$isFavorite(), false);
            String realmGet$shortName = ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$shortName();
            if (realmGet$shortName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.shortNameColKey, colKey, realmGet$shortName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.shortNameColKey, colKey, false);
            }
            String realmGet$fullName = ((ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) object).realmGet$fullName();
            if (realmGet$fullName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fullNameColKey, colKey, realmGet$fullName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fullNameColKey, colKey, false);
            }
        }
    }

    public static ilimboxAndroid.ilimbox.models.course.Course createDetachedCopy(ilimboxAndroid.ilimbox.models.course.Course realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        ilimboxAndroid.ilimbox.models.course.Course unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new ilimboxAndroid.ilimbox.models.course.Course();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (ilimboxAndroid.ilimbox.models.course.Course) cachedObject.object;
            }
            unmanagedObject = (ilimboxAndroid.ilimbox.models.course.Course) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface unmanagedCopy = (ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) unmanagedObject;
        ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface realmSource = (ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$isFavorite(realmSource.realmGet$isFavorite());
        unmanagedCopy.realmSet$shortName(realmSource.realmGet$shortName());
        unmanagedCopy.realmSet$fullName(realmSource.realmGet$fullName());

        return unmanagedObject;
    }

    static ilimboxAndroid.ilimbox.models.course.Course update(Realm realm, CourseColumnInfo columnInfo, ilimboxAndroid.ilimbox.models.course.Course realmObject, ilimboxAndroid.ilimbox.models.course.Course newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface realmObjectTarget = (ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) realmObject;
        ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface realmObjectSource = (ilimboxAndroid_ilimbox_models_course_CourseRealmProxyInterface) newObject;
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.course.Course.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addBoolean(columnInfo.isFavoriteColKey, realmObjectSource.realmGet$isFavorite());
        builder.addString(columnInfo.shortNameColKey, realmObjectSource.realmGet$shortName());
        builder.addString(columnInfo.fullNameColKey, realmObjectSource.realmGet$fullName());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Course = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isFavorite:");
        stringBuilder.append(realmGet$isFavorite());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{shortName:");
        stringBuilder.append(realmGet$shortName());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fullName:");
        stringBuilder.append(realmGet$fullName());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

}
