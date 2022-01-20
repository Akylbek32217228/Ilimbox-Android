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
public class ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy extends ilimboxAndroid.ilimbox.models.forum.Attachment
    implements RealmObjectProxy, ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface {

    static final class AttachmentColumnInfo extends ColumnInfo {
        long fileNameColKey;
        long mimeTypeColKey;
        long fileUrlColKey;
        long fileSizeColKey;
        long timeModifiedColKey;

        AttachmentColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Attachment");
            this.fileNameColKey = addColumnDetails("fileName", "fileName", objectSchemaInfo);
            this.mimeTypeColKey = addColumnDetails("mimeType", "mimeType", objectSchemaInfo);
            this.fileUrlColKey = addColumnDetails("fileUrl", "fileUrl", objectSchemaInfo);
            this.fileSizeColKey = addColumnDetails("fileSize", "fileSize", objectSchemaInfo);
            this.timeModifiedColKey = addColumnDetails("timeModified", "timeModified", objectSchemaInfo);
        }

        AttachmentColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new AttachmentColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final AttachmentColumnInfo src = (AttachmentColumnInfo) rawSrc;
            final AttachmentColumnInfo dst = (AttachmentColumnInfo) rawDst;
            dst.fileNameColKey = src.fileNameColKey;
            dst.mimeTypeColKey = src.mimeTypeColKey;
            dst.fileUrlColKey = src.fileUrlColKey;
            dst.fileSizeColKey = src.fileSizeColKey;
            dst.timeModifiedColKey = src.timeModifiedColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private AttachmentColumnInfo columnInfo;
    private ProxyState<ilimboxAndroid.ilimbox.models.forum.Attachment> proxyState;

    ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (AttachmentColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<ilimboxAndroid.ilimbox.models.forum.Attachment>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$fileName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fileNameColKey);
    }

    @Override
    public void realmSet$fileName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'fileName' to null.");
            }
            row.getTable().setString(columnInfo.fileNameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'fileName' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.fileNameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$mimeType() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.mimeTypeColKey);
    }

    @Override
    public void realmSet$mimeType(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'mimeType' to null.");
            }
            row.getTable().setString(columnInfo.mimeTypeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'mimeType' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.mimeTypeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$fileUrl() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fileUrlColKey);
    }

    @Override
    public void realmSet$fileUrl(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'fileUrl' to null.");
            }
            row.getTable().setString(columnInfo.fileUrlColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'fileUrl' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.fileUrlColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$fileSize() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.fileSizeColKey);
    }

    @Override
    public void realmSet$fileSize(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.fileSizeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.fileSizeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$timeModified() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.timeModifiedColKey);
    }

    @Override
    public void realmSet$timeModified(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.timeModifiedColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.timeModifiedColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Attachment", 5, 0);
        builder.addPersistedProperty("fileName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("mimeType", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("fileUrl", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("fileSize", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("timeModified", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static AttachmentColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new AttachmentColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Attachment";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Attachment";
    }

    @SuppressWarnings("cast")
    public static ilimboxAndroid.ilimbox.models.forum.Attachment createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        ilimboxAndroid.ilimbox.models.forum.Attachment obj = realm.createObjectInternal(ilimboxAndroid.ilimbox.models.forum.Attachment.class, true, excludeFields);

        final ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface objProxy = (ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) obj;
        if (json.has("fileName")) {
            if (json.isNull("fileName")) {
                objProxy.realmSet$fileName(null);
            } else {
                objProxy.realmSet$fileName((String) json.getString("fileName"));
            }
        }
        if (json.has("mimeType")) {
            if (json.isNull("mimeType")) {
                objProxy.realmSet$mimeType(null);
            } else {
                objProxy.realmSet$mimeType((String) json.getString("mimeType"));
            }
        }
        if (json.has("fileUrl")) {
            if (json.isNull("fileUrl")) {
                objProxy.realmSet$fileUrl(null);
            } else {
                objProxy.realmSet$fileUrl((String) json.getString("fileUrl"));
            }
        }
        if (json.has("fileSize")) {
            if (json.isNull("fileSize")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'fileSize' to null.");
            } else {
                objProxy.realmSet$fileSize((int) json.getInt("fileSize"));
            }
        }
        if (json.has("timeModified")) {
            if (json.isNull("timeModified")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timeModified' to null.");
            } else {
                objProxy.realmSet$timeModified((long) json.getLong("timeModified"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static ilimboxAndroid.ilimbox.models.forum.Attachment createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final ilimboxAndroid.ilimbox.models.forum.Attachment obj = new ilimboxAndroid.ilimbox.models.forum.Attachment();
        final ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface objProxy = (ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("fileName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fileName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fileName(null);
                }
            } else if (name.equals("mimeType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$mimeType((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$mimeType(null);
                }
            } else if (name.equals("fileUrl")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fileUrl((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fileUrl(null);
                }
            } else if (name.equals("fileSize")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fileSize((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'fileSize' to null.");
                }
            } else if (name.equals("timeModified")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timeModified((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timeModified' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.forum.Attachment.class), false, Collections.<String>emptyList());
        io.realm.ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy obj = new io.realm.ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static ilimboxAndroid.ilimbox.models.forum.Attachment copyOrUpdate(Realm realm, AttachmentColumnInfo columnInfo, ilimboxAndroid.ilimbox.models.forum.Attachment object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (ilimboxAndroid.ilimbox.models.forum.Attachment) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static ilimboxAndroid.ilimbox.models.forum.Attachment copy(Realm realm, AttachmentColumnInfo columnInfo, ilimboxAndroid.ilimbox.models.forum.Attachment newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (ilimboxAndroid.ilimbox.models.forum.Attachment) cachedRealmObject;
        }

        ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface realmObjectSource = (ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) newObject;

        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.forum.Attachment.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.fileNameColKey, realmObjectSource.realmGet$fileName());
        builder.addString(columnInfo.mimeTypeColKey, realmObjectSource.realmGet$mimeType());
        builder.addString(columnInfo.fileUrlColKey, realmObjectSource.realmGet$fileUrl());
        builder.addInteger(columnInfo.fileSizeColKey, realmObjectSource.realmGet$fileSize());
        builder.addInteger(columnInfo.timeModifiedColKey, realmObjectSource.realmGet$timeModified());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, ilimboxAndroid.ilimbox.models.forum.Attachment object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.forum.Attachment.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentColumnInfo columnInfo = (AttachmentColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.forum.Attachment.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$fileName = ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$fileName();
        if (realmGet$fileName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fileNameColKey, colKey, realmGet$fileName, false);
        }
        String realmGet$mimeType = ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$mimeType();
        if (realmGet$mimeType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mimeTypeColKey, colKey, realmGet$mimeType, false);
        }
        String realmGet$fileUrl = ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$fileUrl();
        if (realmGet$fileUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fileUrlColKey, colKey, realmGet$fileUrl, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.fileSizeColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$fileSize(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.timeModifiedColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$timeModified(), false);
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.forum.Attachment.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentColumnInfo columnInfo = (AttachmentColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.forum.Attachment.class);
        ilimboxAndroid.ilimbox.models.forum.Attachment object = null;
        while (objects.hasNext()) {
            object = (ilimboxAndroid.ilimbox.models.forum.Attachment) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$fileName = ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$fileName();
            if (realmGet$fileName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fileNameColKey, colKey, realmGet$fileName, false);
            }
            String realmGet$mimeType = ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$mimeType();
            if (realmGet$mimeType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mimeTypeColKey, colKey, realmGet$mimeType, false);
            }
            String realmGet$fileUrl = ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$fileUrl();
            if (realmGet$fileUrl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fileUrlColKey, colKey, realmGet$fileUrl, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.fileSizeColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$fileSize(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.timeModifiedColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$timeModified(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, ilimboxAndroid.ilimbox.models.forum.Attachment object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.forum.Attachment.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentColumnInfo columnInfo = (AttachmentColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.forum.Attachment.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$fileName = ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$fileName();
        if (realmGet$fileName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fileNameColKey, colKey, realmGet$fileName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fileNameColKey, colKey, false);
        }
        String realmGet$mimeType = ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$mimeType();
        if (realmGet$mimeType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mimeTypeColKey, colKey, realmGet$mimeType, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.mimeTypeColKey, colKey, false);
        }
        String realmGet$fileUrl = ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$fileUrl();
        if (realmGet$fileUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fileUrlColKey, colKey, realmGet$fileUrl, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fileUrlColKey, colKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.fileSizeColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$fileSize(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.timeModifiedColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$timeModified(), false);
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.forum.Attachment.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentColumnInfo columnInfo = (AttachmentColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.forum.Attachment.class);
        ilimboxAndroid.ilimbox.models.forum.Attachment object = null;
        while (objects.hasNext()) {
            object = (ilimboxAndroid.ilimbox.models.forum.Attachment) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$fileName = ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$fileName();
            if (realmGet$fileName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fileNameColKey, colKey, realmGet$fileName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fileNameColKey, colKey, false);
            }
            String realmGet$mimeType = ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$mimeType();
            if (realmGet$mimeType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mimeTypeColKey, colKey, realmGet$mimeType, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.mimeTypeColKey, colKey, false);
            }
            String realmGet$fileUrl = ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$fileUrl();
            if (realmGet$fileUrl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fileUrlColKey, colKey, realmGet$fileUrl, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fileUrlColKey, colKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.fileSizeColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$fileSize(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.timeModifiedColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) object).realmGet$timeModified(), false);
        }
    }

    public static ilimboxAndroid.ilimbox.models.forum.Attachment createDetachedCopy(ilimboxAndroid.ilimbox.models.forum.Attachment realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        ilimboxAndroid.ilimbox.models.forum.Attachment unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new ilimboxAndroid.ilimbox.models.forum.Attachment();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (ilimboxAndroid.ilimbox.models.forum.Attachment) cachedObject.object;
            }
            unmanagedObject = (ilimboxAndroid.ilimbox.models.forum.Attachment) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface unmanagedCopy = (ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) unmanagedObject;
        ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface realmSource = (ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$fileName(realmSource.realmGet$fileName());
        unmanagedCopy.realmSet$mimeType(realmSource.realmGet$mimeType());
        unmanagedCopy.realmSet$fileUrl(realmSource.realmGet$fileUrl());
        unmanagedCopy.realmSet$fileSize(realmSource.realmGet$fileSize());
        unmanagedCopy.realmSet$timeModified(realmSource.realmGet$timeModified());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Attachment = proxy[");
        stringBuilder.append("{fileName:");
        stringBuilder.append(realmGet$fileName());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{mimeType:");
        stringBuilder.append(realmGet$mimeType());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fileUrl:");
        stringBuilder.append(realmGet$fileUrl());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fileSize:");
        stringBuilder.append(realmGet$fileSize());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{timeModified:");
        stringBuilder.append(realmGet$timeModified());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long colKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (colKey ^ (colKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy aAttachment = (ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aAttachment.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAttachment.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aAttachment.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
