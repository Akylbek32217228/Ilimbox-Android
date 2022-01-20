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
public class ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy extends ilimboxAndroid.ilimbox.models.course.Module
    implements RealmObjectProxy, ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface {

    static final class ModuleColumnInfo extends ColumnInfo {
        long idColKey;
        long instanceColKey;
        long urlColKey;
        long modIconColKey;
        long modNameColKey;
        long descriptionColKey;
        long contentsColKey;
        long courseSectionIdColKey;
        long isUnreadColKey;
        long nameColKey;

        ModuleColumnInfo(OsSchemaInfo schemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Module");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.instanceColKey = addColumnDetails("instance", "instance", objectSchemaInfo);
            this.urlColKey = addColumnDetails("url", "url", objectSchemaInfo);
            this.modIconColKey = addColumnDetails("modIcon", "modIcon", objectSchemaInfo);
            this.modNameColKey = addColumnDetails("modName", "modName", objectSchemaInfo);
            this.descriptionColKey = addColumnDetails("description", "description", objectSchemaInfo);
            this.contentsColKey = addColumnDetails("contents", "contents", objectSchemaInfo);
            this.courseSectionIdColKey = addColumnDetails("courseSectionId", "courseSectionId", objectSchemaInfo);
            this.isUnreadColKey = addColumnDetails("isUnread", "isUnread", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
        }

        ModuleColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ModuleColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ModuleColumnInfo src = (ModuleColumnInfo) rawSrc;
            final ModuleColumnInfo dst = (ModuleColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.instanceColKey = src.instanceColKey;
            dst.urlColKey = src.urlColKey;
            dst.modIconColKey = src.modIconColKey;
            dst.modNameColKey = src.modNameColKey;
            dst.descriptionColKey = src.descriptionColKey;
            dst.contentsColKey = src.contentsColKey;
            dst.courseSectionIdColKey = src.courseSectionIdColKey;
            dst.isUnreadColKey = src.isUnreadColKey;
            dst.nameColKey = src.nameColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ModuleColumnInfo columnInfo;
    private ProxyState<ilimboxAndroid.ilimbox.models.course.Module> proxyState;
    private RealmList<ilimboxAndroid.ilimbox.models.course.Content> contentsRealmList;

    ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ModuleColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<ilimboxAndroid.ilimbox.models.course.Module>(this);
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
    public int realmGet$instance() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.instanceColKey);
    }

    @Override
    public void realmSet$instance(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.instanceColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.instanceColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$url() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.urlColKey);
    }

    @Override
    public void realmSet$url(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'url' to null.");
            }
            row.getTable().setString(columnInfo.urlColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'url' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.urlColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$modIcon() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.modIconColKey);
    }

    @Override
    public void realmSet$modIcon(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'modIcon' to null.");
            }
            row.getTable().setString(columnInfo.modIconColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'modIcon' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.modIconColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$modName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.modNameColKey);
    }

    @Override
    public void realmSet$modName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'modName' to null.");
            }
            row.getTable().setString(columnInfo.modNameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'modName' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.modNameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$description() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.descriptionColKey);
    }

    @Override
    public void realmSet$description(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'description' to null.");
            }
            row.getTable().setString(columnInfo.descriptionColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'description' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.descriptionColKey, value);
    }

    @Override
    public RealmList<ilimboxAndroid.ilimbox.models.course.Content> realmGet$contents() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (contentsRealmList != null) {
            return contentsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.contentsColKey);
            contentsRealmList = new RealmList<ilimboxAndroid.ilimbox.models.course.Content>(ilimboxAndroid.ilimbox.models.course.Content.class, osList, proxyState.getRealm$realm());
            return contentsRealmList;
        }
    }

    @Override
    public void realmSet$contents(RealmList<ilimboxAndroid.ilimbox.models.course.Content> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("contents")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<ilimboxAndroid.ilimbox.models.course.Content> original = value;
                value = new RealmList<ilimboxAndroid.ilimbox.models.course.Content>();
                for (ilimboxAndroid.ilimbox.models.course.Content item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.contentsColKey);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                ilimboxAndroid.ilimbox.models.course.Content linkedObject = value.get(i);
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
                ilimboxAndroid.ilimbox.models.course.Content linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        }
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$courseSectionId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.courseSectionIdColKey);
    }

    @Override
    public void realmSet$courseSectionId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.courseSectionIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.courseSectionIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isUnread() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isUnreadColKey);
    }

    @Override
    public void realmSet$isUnread(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isUnreadColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isUnreadColKey, value);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Module", 10, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("instance", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("url", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("modIcon", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("modName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("description", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("contents", RealmFieldType.LIST, "Content");
        builder.addPersistedProperty("courseSectionId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("isUnread", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ModuleColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ModuleColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Module";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Module";
    }

    @SuppressWarnings("cast")
    public static ilimboxAndroid.ilimbox.models.course.Module createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        ilimboxAndroid.ilimbox.models.course.Module obj = null;
        if (update) {
            Table table = realm.getTable(ilimboxAndroid.ilimbox.models.course.Module.class);
            ModuleColumnInfo columnInfo = (ModuleColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Module.class);
            long pkColumnKey = columnInfo.idColKey;
            long colKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                colKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Module.class), false, Collections.<String> emptyList());
                    obj = new io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("contents")) {
                excludeFields.add("contents");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy) realm.createObjectInternal(ilimboxAndroid.ilimbox.models.course.Module.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy) realm.createObjectInternal(ilimboxAndroid.ilimbox.models.course.Module.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface objProxy = (ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) obj;
        if (json.has("instance")) {
            if (json.isNull("instance")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'instance' to null.");
            } else {
                objProxy.realmSet$instance((int) json.getInt("instance"));
            }
        }
        if (json.has("url")) {
            if (json.isNull("url")) {
                objProxy.realmSet$url(null);
            } else {
                objProxy.realmSet$url((String) json.getString("url"));
            }
        }
        if (json.has("modIcon")) {
            if (json.isNull("modIcon")) {
                objProxy.realmSet$modIcon(null);
            } else {
                objProxy.realmSet$modIcon((String) json.getString("modIcon"));
            }
        }
        if (json.has("modName")) {
            if (json.isNull("modName")) {
                objProxy.realmSet$modName(null);
            } else {
                objProxy.realmSet$modName((String) json.getString("modName"));
            }
        }
        if (json.has("description")) {
            if (json.isNull("description")) {
                objProxy.realmSet$description(null);
            } else {
                objProxy.realmSet$description((String) json.getString("description"));
            }
        }
        if (json.has("contents")) {
            if (json.isNull("contents")) {
                objProxy.realmSet$contents(null);
            } else {
                objProxy.realmGet$contents().clear();
                JSONArray array = json.getJSONArray("contents");
                for (int i = 0; i < array.length(); i++) {
                    ilimboxAndroid.ilimbox.models.course.Content item = ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$contents().add(item);
                }
            }
        }
        if (json.has("courseSectionId")) {
            if (json.isNull("courseSectionId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'courseSectionId' to null.");
            } else {
                objProxy.realmSet$courseSectionId((int) json.getInt("courseSectionId"));
            }
        }
        if (json.has("isUnread")) {
            if (json.isNull("isUnread")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isUnread' to null.");
            } else {
                objProxy.realmSet$isUnread((boolean) json.getBoolean("isUnread"));
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
    public static ilimboxAndroid.ilimbox.models.course.Module createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final ilimboxAndroid.ilimbox.models.course.Module obj = new ilimboxAndroid.ilimbox.models.course.Module();
        final ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface objProxy = (ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) obj;
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
            } else if (name.equals("instance")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$instance((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'instance' to null.");
                }
            } else if (name.equals("url")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$url((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$url(null);
                }
            } else if (name.equals("modIcon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$modIcon((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$modIcon(null);
                }
            } else if (name.equals("modName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$modName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$modName(null);
                }
            } else if (name.equals("description")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$description((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$description(null);
                }
            } else if (name.equals("contents")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$contents(null);
                } else {
                    objProxy.realmSet$contents(new RealmList<ilimboxAndroid.ilimbox.models.course.Content>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        ilimboxAndroid.ilimbox.models.course.Content item = ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$contents().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("courseSectionId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$courseSectionId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'courseSectionId' to null.");
                }
            } else if (name.equals("isUnread")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isUnread((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isUnread' to null.");
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

    private static ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Module.class), false, Collections.<String>emptyList());
        io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy obj = new io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static ilimboxAndroid.ilimbox.models.course.Module copyOrUpdate(Realm realm, ModuleColumnInfo columnInfo, ilimboxAndroid.ilimbox.models.course.Module object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (ilimboxAndroid.ilimbox.models.course.Module) cachedRealmObject;
        }

        ilimboxAndroid.ilimbox.models.course.Module realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(ilimboxAndroid.ilimbox.models.course.Module.class);
            long pkColumnKey = columnInfo.idColKey;
            long colKey = table.findFirstLong(pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$id());
            if (colKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static ilimboxAndroid.ilimbox.models.course.Module copy(Realm realm, ModuleColumnInfo columnInfo, ilimboxAndroid.ilimbox.models.course.Module newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (ilimboxAndroid.ilimbox.models.course.Module) cachedRealmObject;
        }

        ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface realmObjectSource = (ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) newObject;

        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.course.Module.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.instanceColKey, realmObjectSource.realmGet$instance());
        builder.addString(columnInfo.urlColKey, realmObjectSource.realmGet$url());
        builder.addString(columnInfo.modIconColKey, realmObjectSource.realmGet$modIcon());
        builder.addString(columnInfo.modNameColKey, realmObjectSource.realmGet$modName());
        builder.addString(columnInfo.descriptionColKey, realmObjectSource.realmGet$description());
        builder.addInteger(columnInfo.courseSectionIdColKey, realmObjectSource.realmGet$courseSectionId());
        builder.addBoolean(columnInfo.isUnreadColKey, realmObjectSource.realmGet$isUnread());
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.ilimboxAndroid_ilimbox_models_course_ModuleRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<ilimboxAndroid.ilimbox.models.course.Content> contentsList = realmObjectSource.realmGet$contents();
        if (contentsList != null) {
            RealmList<ilimboxAndroid.ilimbox.models.course.Content> contentsRealmList = realmObjectCopy.realmGet$contents();
            contentsRealmList.clear();
            for (int i = 0; i < contentsList.size(); i++) {
                ilimboxAndroid.ilimbox.models.course.Content contentsItem = contentsList.get(i);
                ilimboxAndroid.ilimbox.models.course.Content cachecontents = (ilimboxAndroid.ilimbox.models.course.Content) cache.get(contentsItem);
                if (cachecontents != null) {
                    contentsRealmList.add(cachecontents);
                } else {
                    contentsRealmList.add(ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.copyOrUpdate(realm, (ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.ContentColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Content.class), contentsItem, update, cache, flags));
                }
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, ilimboxAndroid.ilimbox.models.course.Module object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.course.Module.class);
        long tableNativePtr = table.getNativePtr();
        ModuleColumnInfo columnInfo = (ModuleColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Module.class);
        long pkColumnKey = columnInfo.idColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$id());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, colKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.instanceColKey, colKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$instance(), false);
        String realmGet$url = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlColKey, colKey, realmGet$url, false);
        }
        String realmGet$modIcon = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$modIcon();
        if (realmGet$modIcon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.modIconColKey, colKey, realmGet$modIcon, false);
        }
        String realmGet$modName = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$modName();
        if (realmGet$modName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.modNameColKey, colKey, realmGet$modName, false);
        }
        String realmGet$description = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionColKey, colKey, realmGet$description, false);
        }

        RealmList<ilimboxAndroid.ilimbox.models.course.Content> contentsList = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$contents();
        if (contentsList != null) {
            OsList contentsOsList = new OsList(table.getUncheckedRow(colKey), columnInfo.contentsColKey);
            for (ilimboxAndroid.ilimbox.models.course.Content contentsItem : contentsList) {
                Long cacheItemIndexcontents = cache.get(contentsItem);
                if (cacheItemIndexcontents == null) {
                    cacheItemIndexcontents = ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.insert(realm, contentsItem, cache);
                }
                contentsOsList.addRow(cacheItemIndexcontents);
            }
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.courseSectionIdColKey, colKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$courseSectionId(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isUnreadColKey, colKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$isUnread(), false);
        String realmGet$name = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, colKey, realmGet$name, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.course.Module.class);
        long tableNativePtr = table.getNativePtr();
        ModuleColumnInfo columnInfo = (ModuleColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Module.class);
        long pkColumnKey = columnInfo.idColKey;
        ilimboxAndroid.ilimbox.models.course.Module object = null;
        while (objects.hasNext()) {
            object = (ilimboxAndroid.ilimbox.models.course.Module) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$id());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, colKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.instanceColKey, colKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$instance(), false);
            String realmGet$url = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$url();
            if (realmGet$url != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlColKey, colKey, realmGet$url, false);
            }
            String realmGet$modIcon = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$modIcon();
            if (realmGet$modIcon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.modIconColKey, colKey, realmGet$modIcon, false);
            }
            String realmGet$modName = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$modName();
            if (realmGet$modName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.modNameColKey, colKey, realmGet$modName, false);
            }
            String realmGet$description = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$description();
            if (realmGet$description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descriptionColKey, colKey, realmGet$description, false);
            }

            RealmList<ilimboxAndroid.ilimbox.models.course.Content> contentsList = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$contents();
            if (contentsList != null) {
                OsList contentsOsList = new OsList(table.getUncheckedRow(colKey), columnInfo.contentsColKey);
                for (ilimboxAndroid.ilimbox.models.course.Content contentsItem : contentsList) {
                    Long cacheItemIndexcontents = cache.get(contentsItem);
                    if (cacheItemIndexcontents == null) {
                        cacheItemIndexcontents = ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.insert(realm, contentsItem, cache);
                    }
                    contentsOsList.addRow(cacheItemIndexcontents);
                }
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.courseSectionIdColKey, colKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$courseSectionId(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isUnreadColKey, colKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$isUnread(), false);
            String realmGet$name = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, colKey, realmGet$name, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ilimboxAndroid.ilimbox.models.course.Module object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.course.Module.class);
        long tableNativePtr = table.getNativePtr();
        ModuleColumnInfo columnInfo = (ModuleColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Module.class);
        long pkColumnKey = columnInfo.idColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$id());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, colKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.instanceColKey, colKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$instance(), false);
        String realmGet$url = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlColKey, colKey, realmGet$url, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.urlColKey, colKey, false);
        }
        String realmGet$modIcon = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$modIcon();
        if (realmGet$modIcon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.modIconColKey, colKey, realmGet$modIcon, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.modIconColKey, colKey, false);
        }
        String realmGet$modName = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$modName();
        if (realmGet$modName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.modNameColKey, colKey, realmGet$modName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.modNameColKey, colKey, false);
        }
        String realmGet$description = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionColKey, colKey, realmGet$description, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descriptionColKey, colKey, false);
        }

        OsList contentsOsList = new OsList(table.getUncheckedRow(colKey), columnInfo.contentsColKey);
        RealmList<ilimboxAndroid.ilimbox.models.course.Content> contentsList = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$contents();
        if (contentsList != null && contentsList.size() == contentsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = contentsList.size();
            for (int i = 0; i < objects; i++) {
                ilimboxAndroid.ilimbox.models.course.Content contentsItem = contentsList.get(i);
                Long cacheItemIndexcontents = cache.get(contentsItem);
                if (cacheItemIndexcontents == null) {
                    cacheItemIndexcontents = ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.insertOrUpdate(realm, contentsItem, cache);
                }
                contentsOsList.setRow(i, cacheItemIndexcontents);
            }
        } else {
            contentsOsList.removeAll();
            if (contentsList != null) {
                for (ilimboxAndroid.ilimbox.models.course.Content contentsItem : contentsList) {
                    Long cacheItemIndexcontents = cache.get(contentsItem);
                    if (cacheItemIndexcontents == null) {
                        cacheItemIndexcontents = ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.insertOrUpdate(realm, contentsItem, cache);
                    }
                    contentsOsList.addRow(cacheItemIndexcontents);
                }
            }
        }

        Table.nativeSetLong(tableNativePtr, columnInfo.courseSectionIdColKey, colKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$courseSectionId(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isUnreadColKey, colKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$isUnread(), false);
        String realmGet$name = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, colKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.course.Module.class);
        long tableNativePtr = table.getNativePtr();
        ModuleColumnInfo columnInfo = (ModuleColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Module.class);
        long pkColumnKey = columnInfo.idColKey;
        ilimboxAndroid.ilimbox.models.course.Module object = null;
        while (objects.hasNext()) {
            object = (ilimboxAndroid.ilimbox.models.course.Module) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$id());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, colKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.instanceColKey, colKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$instance(), false);
            String realmGet$url = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$url();
            if (realmGet$url != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlColKey, colKey, realmGet$url, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.urlColKey, colKey, false);
            }
            String realmGet$modIcon = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$modIcon();
            if (realmGet$modIcon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.modIconColKey, colKey, realmGet$modIcon, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.modIconColKey, colKey, false);
            }
            String realmGet$modName = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$modName();
            if (realmGet$modName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.modNameColKey, colKey, realmGet$modName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.modNameColKey, colKey, false);
            }
            String realmGet$description = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$description();
            if (realmGet$description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descriptionColKey, colKey, realmGet$description, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.descriptionColKey, colKey, false);
            }

            OsList contentsOsList = new OsList(table.getUncheckedRow(colKey), columnInfo.contentsColKey);
            RealmList<ilimboxAndroid.ilimbox.models.course.Content> contentsList = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$contents();
            if (contentsList != null && contentsList.size() == contentsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = contentsList.size();
                for (int i = 0; i < objectCount; i++) {
                    ilimboxAndroid.ilimbox.models.course.Content contentsItem = contentsList.get(i);
                    Long cacheItemIndexcontents = cache.get(contentsItem);
                    if (cacheItemIndexcontents == null) {
                        cacheItemIndexcontents = ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.insertOrUpdate(realm, contentsItem, cache);
                    }
                    contentsOsList.setRow(i, cacheItemIndexcontents);
                }
            } else {
                contentsOsList.removeAll();
                if (contentsList != null) {
                    for (ilimboxAndroid.ilimbox.models.course.Content contentsItem : contentsList) {
                        Long cacheItemIndexcontents = cache.get(contentsItem);
                        if (cacheItemIndexcontents == null) {
                            cacheItemIndexcontents = ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.insertOrUpdate(realm, contentsItem, cache);
                        }
                        contentsOsList.addRow(cacheItemIndexcontents);
                    }
                }
            }

            Table.nativeSetLong(tableNativePtr, columnInfo.courseSectionIdColKey, colKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$courseSectionId(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isUnreadColKey, colKey, ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$isUnread(), false);
            String realmGet$name = ((ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, colKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, colKey, false);
            }
        }
    }

    public static ilimboxAndroid.ilimbox.models.course.Module createDetachedCopy(ilimboxAndroid.ilimbox.models.course.Module realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        ilimboxAndroid.ilimbox.models.course.Module unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new ilimboxAndroid.ilimbox.models.course.Module();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (ilimboxAndroid.ilimbox.models.course.Module) cachedObject.object;
            }
            unmanagedObject = (ilimboxAndroid.ilimbox.models.course.Module) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface unmanagedCopy = (ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) unmanagedObject;
        ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface realmSource = (ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$instance(realmSource.realmGet$instance());
        unmanagedCopy.realmSet$url(realmSource.realmGet$url());
        unmanagedCopy.realmSet$modIcon(realmSource.realmGet$modIcon());
        unmanagedCopy.realmSet$modName(realmSource.realmGet$modName());
        unmanagedCopy.realmSet$description(realmSource.realmGet$description());

        // Deep copy of contents
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$contents(null);
        } else {
            RealmList<ilimboxAndroid.ilimbox.models.course.Content> managedcontentsList = realmSource.realmGet$contents();
            RealmList<ilimboxAndroid.ilimbox.models.course.Content> unmanagedcontentsList = new RealmList<ilimboxAndroid.ilimbox.models.course.Content>();
            unmanagedCopy.realmSet$contents(unmanagedcontentsList);
            int nextDepth = currentDepth + 1;
            int size = managedcontentsList.size();
            for (int i = 0; i < size; i++) {
                ilimboxAndroid.ilimbox.models.course.Content item = ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.createDetachedCopy(managedcontentsList.get(i), nextDepth, maxDepth, cache);
                unmanagedcontentsList.add(item);
            }
        }
        unmanagedCopy.realmSet$courseSectionId(realmSource.realmGet$courseSectionId());
        unmanagedCopy.realmSet$isUnread(realmSource.realmGet$isUnread());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());

        return unmanagedObject;
    }

    static ilimboxAndroid.ilimbox.models.course.Module update(Realm realm, ModuleColumnInfo columnInfo, ilimboxAndroid.ilimbox.models.course.Module realmObject, ilimboxAndroid.ilimbox.models.course.Module newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface realmObjectTarget = (ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) realmObject;
        ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface realmObjectSource = (ilimboxAndroid_ilimbox_models_course_ModuleRealmProxyInterface) newObject;
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.course.Module.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.instanceColKey, realmObjectSource.realmGet$instance());
        builder.addString(columnInfo.urlColKey, realmObjectSource.realmGet$url());
        builder.addString(columnInfo.modIconColKey, realmObjectSource.realmGet$modIcon());
        builder.addString(columnInfo.modNameColKey, realmObjectSource.realmGet$modName());
        builder.addString(columnInfo.descriptionColKey, realmObjectSource.realmGet$description());

        RealmList<ilimboxAndroid.ilimbox.models.course.Content> contentsList = realmObjectSource.realmGet$contents();
        if (contentsList != null) {
            RealmList<ilimboxAndroid.ilimbox.models.course.Content> contentsManagedCopy = new RealmList<ilimboxAndroid.ilimbox.models.course.Content>();
            for (int i = 0; i < contentsList.size(); i++) {
                ilimboxAndroid.ilimbox.models.course.Content contentsItem = contentsList.get(i);
                ilimboxAndroid.ilimbox.models.course.Content cachecontents = (ilimboxAndroid.ilimbox.models.course.Content) cache.get(contentsItem);
                if (cachecontents != null) {
                    contentsManagedCopy.add(cachecontents);
                } else {
                    contentsManagedCopy.add(ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.copyOrUpdate(realm, (ilimboxAndroid_ilimbox_models_course_ContentRealmProxy.ContentColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.course.Content.class), contentsItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.contentsColKey, contentsManagedCopy);
        } else {
            builder.addObjectList(columnInfo.contentsColKey, new RealmList<ilimboxAndroid.ilimbox.models.course.Content>());
        }
        builder.addInteger(columnInfo.courseSectionIdColKey, realmObjectSource.realmGet$courseSectionId());
        builder.addBoolean(columnInfo.isUnreadColKey, realmObjectSource.realmGet$isUnread());
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
        StringBuilder stringBuilder = new StringBuilder("Module = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{instance:");
        stringBuilder.append(realmGet$instance());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{url:");
        stringBuilder.append(realmGet$url());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{modIcon:");
        stringBuilder.append(realmGet$modIcon());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{modName:");
        stringBuilder.append(realmGet$modName());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{description:");
        stringBuilder.append(realmGet$description());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{contents:");
        stringBuilder.append("RealmList<Content>[").append(realmGet$contents().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{courseSectionId:");
        stringBuilder.append(realmGet$courseSectionId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isUnread:");
        stringBuilder.append(realmGet$isUnread());
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
