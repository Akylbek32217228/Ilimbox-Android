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
public class ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy extends ilimboxAndroid.ilimbox.models.forum.Discussion
    implements RealmObjectProxy, ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface {

    static final class DiscussionColumnInfo extends ColumnInfo {
        long idColKey;
        long discussionIdColKey;
        long nameColKey;
        long timeModifiedColKey;
        long parentColKey;
        long attachmentsColKey;
        long userFullNameColKey;
        long userPictureUrlColKey;
        long isPinnedColKey;
        long forumIdColKey;
        long subjectColKey;
        long messageColKey;

        DiscussionColumnInfo(OsSchemaInfo schemaInfo) {
            super(12);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Discussion");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.discussionIdColKey = addColumnDetails("discussionId", "discussionId", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.timeModifiedColKey = addColumnDetails("timeModified", "timeModified", objectSchemaInfo);
            this.parentColKey = addColumnDetails("parent", "parent", objectSchemaInfo);
            this.attachmentsColKey = addColumnDetails("attachments", "attachments", objectSchemaInfo);
            this.userFullNameColKey = addColumnDetails("userFullName", "userFullName", objectSchemaInfo);
            this.userPictureUrlColKey = addColumnDetails("userPictureUrl", "userPictureUrl", objectSchemaInfo);
            this.isPinnedColKey = addColumnDetails("isPinned", "isPinned", objectSchemaInfo);
            this.forumIdColKey = addColumnDetails("forumId", "forumId", objectSchemaInfo);
            this.subjectColKey = addColumnDetails("subject", "subject", objectSchemaInfo);
            this.messageColKey = addColumnDetails("message", "message", objectSchemaInfo);
        }

        DiscussionColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new DiscussionColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final DiscussionColumnInfo src = (DiscussionColumnInfo) rawSrc;
            final DiscussionColumnInfo dst = (DiscussionColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.discussionIdColKey = src.discussionIdColKey;
            dst.nameColKey = src.nameColKey;
            dst.timeModifiedColKey = src.timeModifiedColKey;
            dst.parentColKey = src.parentColKey;
            dst.attachmentsColKey = src.attachmentsColKey;
            dst.userFullNameColKey = src.userFullNameColKey;
            dst.userPictureUrlColKey = src.userPictureUrlColKey;
            dst.isPinnedColKey = src.isPinnedColKey;
            dst.forumIdColKey = src.forumIdColKey;
            dst.subjectColKey = src.subjectColKey;
            dst.messageColKey = src.messageColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private DiscussionColumnInfo columnInfo;
    private ProxyState<ilimboxAndroid.ilimbox.models.forum.Discussion> proxyState;
    private RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> attachmentsRealmList;

    ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (DiscussionColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<ilimboxAndroid.ilimbox.models.forum.Discussion>(this);
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
    public int realmGet$discussionId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.discussionIdColKey);
    }

    @Override
    public void realmSet$discussionId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.discussionIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.discussionIdColKey, value);
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

    @Override
    @SuppressWarnings("cast")
    public int realmGet$timeModified() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.timeModifiedColKey);
    }

    @Override
    public void realmSet$timeModified(int value) {
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

    @Override
    @SuppressWarnings("cast")
    public int realmGet$parent() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.parentColKey);
    }

    @Override
    public void realmSet$parent(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.parentColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.parentColKey, value);
    }

    @Override
    public RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> realmGet$attachments() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (attachmentsRealmList != null) {
            return attachmentsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.attachmentsColKey);
            attachmentsRealmList = new RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment>(ilimboxAndroid.ilimbox.models.forum.Attachment.class, osList, proxyState.getRealm$realm());
            return attachmentsRealmList;
        }
    }

    @Override
    public void realmSet$attachments(RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("attachments")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> original = value;
                value = new RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment>();
                for (ilimboxAndroid.ilimbox.models.forum.Attachment item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.attachmentsColKey);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                ilimboxAndroid.ilimbox.models.forum.Attachment linkedObject = value.get(i);
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
                ilimboxAndroid.ilimbox.models.forum.Attachment linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        }
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userFullName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userFullNameColKey);
    }

    @Override
    public void realmSet$userFullName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'userFullName' to null.");
            }
            row.getTable().setString(columnInfo.userFullNameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'userFullName' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.userFullNameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userPictureUrl() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userPictureUrlColKey);
    }

    @Override
    public void realmSet$userPictureUrl(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'userPictureUrl' to null.");
            }
            row.getTable().setString(columnInfo.userPictureUrlColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'userPictureUrl' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.userPictureUrlColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isPinned() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isPinnedColKey);
    }

    @Override
    public void realmSet$isPinned(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isPinnedColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isPinnedColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$forumId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.forumIdColKey);
    }

    @Override
    public void realmSet$forumId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.forumIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.forumIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$subject() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.subjectColKey);
    }

    @Override
    public void realmSet$subject(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'subject' to null.");
            }
            row.getTable().setString(columnInfo.subjectColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'subject' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.subjectColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$message() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.messageColKey);
    }

    @Override
    public void realmSet$message(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'message' to null.");
            }
            row.getTable().setString(columnInfo.messageColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'message' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.messageColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Discussion", 12, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("discussionId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("timeModified", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("parent", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("attachments", RealmFieldType.LIST, "Attachment");
        builder.addPersistedProperty("userFullName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("userPictureUrl", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("isPinned", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("forumId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("subject", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("message", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static DiscussionColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new DiscussionColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Discussion";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Discussion";
    }

    @SuppressWarnings("cast")
    public static ilimboxAndroid.ilimbox.models.forum.Discussion createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        ilimboxAndroid.ilimbox.models.forum.Discussion obj = null;
        if (update) {
            Table table = realm.getTable(ilimboxAndroid.ilimbox.models.forum.Discussion.class);
            DiscussionColumnInfo columnInfo = (DiscussionColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.forum.Discussion.class);
            long pkColumnKey = columnInfo.idColKey;
            long colKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                colKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.forum.Discussion.class), false, Collections.<String> emptyList());
                    obj = new io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("attachments")) {
                excludeFields.add("attachments");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy) realm.createObjectInternal(ilimboxAndroid.ilimbox.models.forum.Discussion.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy) realm.createObjectInternal(ilimboxAndroid.ilimbox.models.forum.Discussion.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface objProxy = (ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) obj;
        if (json.has("discussionId")) {
            if (json.isNull("discussionId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'discussionId' to null.");
            } else {
                objProxy.realmSet$discussionId((int) json.getInt("discussionId"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("timeModified")) {
            if (json.isNull("timeModified")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timeModified' to null.");
            } else {
                objProxy.realmSet$timeModified((int) json.getInt("timeModified"));
            }
        }
        if (json.has("parent")) {
            if (json.isNull("parent")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'parent' to null.");
            } else {
                objProxy.realmSet$parent((int) json.getInt("parent"));
            }
        }
        if (json.has("attachments")) {
            if (json.isNull("attachments")) {
                objProxy.realmSet$attachments(null);
            } else {
                objProxy.realmGet$attachments().clear();
                JSONArray array = json.getJSONArray("attachments");
                for (int i = 0; i < array.length(); i++) {
                    ilimboxAndroid.ilimbox.models.forum.Attachment item = ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$attachments().add(item);
                }
            }
        }
        if (json.has("userFullName")) {
            if (json.isNull("userFullName")) {
                objProxy.realmSet$userFullName(null);
            } else {
                objProxy.realmSet$userFullName((String) json.getString("userFullName"));
            }
        }
        if (json.has("userPictureUrl")) {
            if (json.isNull("userPictureUrl")) {
                objProxy.realmSet$userPictureUrl(null);
            } else {
                objProxy.realmSet$userPictureUrl((String) json.getString("userPictureUrl"));
            }
        }
        if (json.has("isPinned")) {
            if (json.isNull("isPinned")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isPinned' to null.");
            } else {
                objProxy.realmSet$isPinned((boolean) json.getBoolean("isPinned"));
            }
        }
        if (json.has("forumId")) {
            if (json.isNull("forumId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'forumId' to null.");
            } else {
                objProxy.realmSet$forumId((int) json.getInt("forumId"));
            }
        }
        if (json.has("subject")) {
            if (json.isNull("subject")) {
                objProxy.realmSet$subject(null);
            } else {
                objProxy.realmSet$subject((String) json.getString("subject"));
            }
        }
        if (json.has("message")) {
            if (json.isNull("message")) {
                objProxy.realmSet$message(null);
            } else {
                objProxy.realmSet$message((String) json.getString("message"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static ilimboxAndroid.ilimbox.models.forum.Discussion createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final ilimboxAndroid.ilimbox.models.forum.Discussion obj = new ilimboxAndroid.ilimbox.models.forum.Discussion();
        final ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface objProxy = (ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) obj;
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
            } else if (name.equals("discussionId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$discussionId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'discussionId' to null.");
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("timeModified")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timeModified((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timeModified' to null.");
                }
            } else if (name.equals("parent")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$parent((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'parent' to null.");
                }
            } else if (name.equals("attachments")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$attachments(null);
                } else {
                    objProxy.realmSet$attachments(new RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        ilimboxAndroid.ilimbox.models.forum.Attachment item = ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$attachments().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("userFullName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userFullName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userFullName(null);
                }
            } else if (name.equals("userPictureUrl")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userPictureUrl((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userPictureUrl(null);
                }
            } else if (name.equals("isPinned")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isPinned((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isPinned' to null.");
                }
            } else if (name.equals("forumId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$forumId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'forumId' to null.");
                }
            } else if (name.equals("subject")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$subject((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$subject(null);
                }
            } else if (name.equals("message")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$message((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$message(null);
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

    private static ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.forum.Discussion.class), false, Collections.<String>emptyList());
        io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy obj = new io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static ilimboxAndroid.ilimbox.models.forum.Discussion copyOrUpdate(Realm realm, DiscussionColumnInfo columnInfo, ilimboxAndroid.ilimbox.models.forum.Discussion object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (ilimboxAndroid.ilimbox.models.forum.Discussion) cachedRealmObject;
        }

        ilimboxAndroid.ilimbox.models.forum.Discussion realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(ilimboxAndroid.ilimbox.models.forum.Discussion.class);
            long pkColumnKey = columnInfo.idColKey;
            long colKey = table.findFirstLong(pkColumnKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$id());
            if (colKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static ilimboxAndroid.ilimbox.models.forum.Discussion copy(Realm realm, DiscussionColumnInfo columnInfo, ilimboxAndroid.ilimbox.models.forum.Discussion newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (ilimboxAndroid.ilimbox.models.forum.Discussion) cachedRealmObject;
        }

        ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface realmObjectSource = (ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) newObject;

        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.forum.Discussion.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.discussionIdColKey, realmObjectSource.realmGet$discussionId());
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());
        builder.addInteger(columnInfo.timeModifiedColKey, realmObjectSource.realmGet$timeModified());
        builder.addInteger(columnInfo.parentColKey, realmObjectSource.realmGet$parent());
        builder.addString(columnInfo.userFullNameColKey, realmObjectSource.realmGet$userFullName());
        builder.addString(columnInfo.userPictureUrlColKey, realmObjectSource.realmGet$userPictureUrl());
        builder.addBoolean(columnInfo.isPinnedColKey, realmObjectSource.realmGet$isPinned());
        builder.addInteger(columnInfo.forumIdColKey, realmObjectSource.realmGet$forumId());
        builder.addString(columnInfo.subjectColKey, realmObjectSource.realmGet$subject());
        builder.addString(columnInfo.messageColKey, realmObjectSource.realmGet$message());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> attachmentsList = realmObjectSource.realmGet$attachments();
        if (attachmentsList != null) {
            RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> attachmentsRealmList = realmObjectCopy.realmGet$attachments();
            attachmentsRealmList.clear();
            for (int i = 0; i < attachmentsList.size(); i++) {
                ilimboxAndroid.ilimbox.models.forum.Attachment attachmentsItem = attachmentsList.get(i);
                ilimboxAndroid.ilimbox.models.forum.Attachment cacheattachments = (ilimboxAndroid.ilimbox.models.forum.Attachment) cache.get(attachmentsItem);
                if (cacheattachments != null) {
                    attachmentsRealmList.add(cacheattachments);
                } else {
                    attachmentsRealmList.add(ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.copyOrUpdate(realm, (ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.AttachmentColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.forum.Attachment.class), attachmentsItem, update, cache, flags));
                }
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, ilimboxAndroid.ilimbox.models.forum.Discussion object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.forum.Discussion.class);
        long tableNativePtr = table.getNativePtr();
        DiscussionColumnInfo columnInfo = (DiscussionColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.forum.Discussion.class);
        long pkColumnKey = columnInfo.idColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$id());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, colKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.discussionIdColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$discussionId(), false);
        String realmGet$name = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, colKey, realmGet$name, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeModifiedColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$timeModified(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.parentColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$parent(), false);

        RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> attachmentsList = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$attachments();
        if (attachmentsList != null) {
            OsList attachmentsOsList = new OsList(table.getUncheckedRow(colKey), columnInfo.attachmentsColKey);
            for (ilimboxAndroid.ilimbox.models.forum.Attachment attachmentsItem : attachmentsList) {
                Long cacheItemIndexattachments = cache.get(attachmentsItem);
                if (cacheItemIndexattachments == null) {
                    cacheItemIndexattachments = ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.insert(realm, attachmentsItem, cache);
                }
                attachmentsOsList.addRow(cacheItemIndexattachments);
            }
        }
        String realmGet$userFullName = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$userFullName();
        if (realmGet$userFullName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userFullNameColKey, colKey, realmGet$userFullName, false);
        }
        String realmGet$userPictureUrl = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$userPictureUrl();
        if (realmGet$userPictureUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userPictureUrlColKey, colKey, realmGet$userPictureUrl, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isPinnedColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$isPinned(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.forumIdColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$forumId(), false);
        String realmGet$subject = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$subject();
        if (realmGet$subject != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.subjectColKey, colKey, realmGet$subject, false);
        }
        String realmGet$message = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$message();
        if (realmGet$message != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.messageColKey, colKey, realmGet$message, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.forum.Discussion.class);
        long tableNativePtr = table.getNativePtr();
        DiscussionColumnInfo columnInfo = (DiscussionColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.forum.Discussion.class);
        long pkColumnKey = columnInfo.idColKey;
        ilimboxAndroid.ilimbox.models.forum.Discussion object = null;
        while (objects.hasNext()) {
            object = (ilimboxAndroid.ilimbox.models.forum.Discussion) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$id());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, colKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.discussionIdColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$discussionId(), false);
            String realmGet$name = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, colKey, realmGet$name, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeModifiedColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$timeModified(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.parentColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$parent(), false);

            RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> attachmentsList = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$attachments();
            if (attachmentsList != null) {
                OsList attachmentsOsList = new OsList(table.getUncheckedRow(colKey), columnInfo.attachmentsColKey);
                for (ilimboxAndroid.ilimbox.models.forum.Attachment attachmentsItem : attachmentsList) {
                    Long cacheItemIndexattachments = cache.get(attachmentsItem);
                    if (cacheItemIndexattachments == null) {
                        cacheItemIndexattachments = ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.insert(realm, attachmentsItem, cache);
                    }
                    attachmentsOsList.addRow(cacheItemIndexattachments);
                }
            }
            String realmGet$userFullName = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$userFullName();
            if (realmGet$userFullName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userFullNameColKey, colKey, realmGet$userFullName, false);
            }
            String realmGet$userPictureUrl = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$userPictureUrl();
            if (realmGet$userPictureUrl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userPictureUrlColKey, colKey, realmGet$userPictureUrl, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isPinnedColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$isPinned(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.forumIdColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$forumId(), false);
            String realmGet$subject = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$subject();
            if (realmGet$subject != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.subjectColKey, colKey, realmGet$subject, false);
            }
            String realmGet$message = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$message();
            if (realmGet$message != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.messageColKey, colKey, realmGet$message, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ilimboxAndroid.ilimbox.models.forum.Discussion object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.forum.Discussion.class);
        long tableNativePtr = table.getNativePtr();
        DiscussionColumnInfo columnInfo = (DiscussionColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.forum.Discussion.class);
        long pkColumnKey = columnInfo.idColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$id());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, colKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.discussionIdColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$discussionId(), false);
        String realmGet$name = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, colKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, colKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeModifiedColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$timeModified(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.parentColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$parent(), false);

        OsList attachmentsOsList = new OsList(table.getUncheckedRow(colKey), columnInfo.attachmentsColKey);
        RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> attachmentsList = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$attachments();
        if (attachmentsList != null && attachmentsList.size() == attachmentsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = attachmentsList.size();
            for (int i = 0; i < objects; i++) {
                ilimboxAndroid.ilimbox.models.forum.Attachment attachmentsItem = attachmentsList.get(i);
                Long cacheItemIndexattachments = cache.get(attachmentsItem);
                if (cacheItemIndexattachments == null) {
                    cacheItemIndexattachments = ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.insertOrUpdate(realm, attachmentsItem, cache);
                }
                attachmentsOsList.setRow(i, cacheItemIndexattachments);
            }
        } else {
            attachmentsOsList.removeAll();
            if (attachmentsList != null) {
                for (ilimboxAndroid.ilimbox.models.forum.Attachment attachmentsItem : attachmentsList) {
                    Long cacheItemIndexattachments = cache.get(attachmentsItem);
                    if (cacheItemIndexattachments == null) {
                        cacheItemIndexattachments = ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.insertOrUpdate(realm, attachmentsItem, cache);
                    }
                    attachmentsOsList.addRow(cacheItemIndexattachments);
                }
            }
        }

        String realmGet$userFullName = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$userFullName();
        if (realmGet$userFullName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userFullNameColKey, colKey, realmGet$userFullName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userFullNameColKey, colKey, false);
        }
        String realmGet$userPictureUrl = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$userPictureUrl();
        if (realmGet$userPictureUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userPictureUrlColKey, colKey, realmGet$userPictureUrl, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userPictureUrlColKey, colKey, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isPinnedColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$isPinned(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.forumIdColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$forumId(), false);
        String realmGet$subject = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$subject();
        if (realmGet$subject != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.subjectColKey, colKey, realmGet$subject, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.subjectColKey, colKey, false);
        }
        String realmGet$message = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$message();
        if (realmGet$message != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.messageColKey, colKey, realmGet$message, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.messageColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.forum.Discussion.class);
        long tableNativePtr = table.getNativePtr();
        DiscussionColumnInfo columnInfo = (DiscussionColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.forum.Discussion.class);
        long pkColumnKey = columnInfo.idColKey;
        ilimboxAndroid.ilimbox.models.forum.Discussion object = null;
        while (objects.hasNext()) {
            object = (ilimboxAndroid.ilimbox.models.forum.Discussion) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$id());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, colKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.discussionIdColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$discussionId(), false);
            String realmGet$name = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, colKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, colKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeModifiedColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$timeModified(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.parentColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$parent(), false);

            OsList attachmentsOsList = new OsList(table.getUncheckedRow(colKey), columnInfo.attachmentsColKey);
            RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> attachmentsList = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$attachments();
            if (attachmentsList != null && attachmentsList.size() == attachmentsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = attachmentsList.size();
                for (int i = 0; i < objectCount; i++) {
                    ilimboxAndroid.ilimbox.models.forum.Attachment attachmentsItem = attachmentsList.get(i);
                    Long cacheItemIndexattachments = cache.get(attachmentsItem);
                    if (cacheItemIndexattachments == null) {
                        cacheItemIndexattachments = ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.insertOrUpdate(realm, attachmentsItem, cache);
                    }
                    attachmentsOsList.setRow(i, cacheItemIndexattachments);
                }
            } else {
                attachmentsOsList.removeAll();
                if (attachmentsList != null) {
                    for (ilimboxAndroid.ilimbox.models.forum.Attachment attachmentsItem : attachmentsList) {
                        Long cacheItemIndexattachments = cache.get(attachmentsItem);
                        if (cacheItemIndexattachments == null) {
                            cacheItemIndexattachments = ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.insertOrUpdate(realm, attachmentsItem, cache);
                        }
                        attachmentsOsList.addRow(cacheItemIndexattachments);
                    }
                }
            }

            String realmGet$userFullName = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$userFullName();
            if (realmGet$userFullName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userFullNameColKey, colKey, realmGet$userFullName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userFullNameColKey, colKey, false);
            }
            String realmGet$userPictureUrl = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$userPictureUrl();
            if (realmGet$userPictureUrl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userPictureUrlColKey, colKey, realmGet$userPictureUrl, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userPictureUrlColKey, colKey, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isPinnedColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$isPinned(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.forumIdColKey, colKey, ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$forumId(), false);
            String realmGet$subject = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$subject();
            if (realmGet$subject != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.subjectColKey, colKey, realmGet$subject, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.subjectColKey, colKey, false);
            }
            String realmGet$message = ((ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) object).realmGet$message();
            if (realmGet$message != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.messageColKey, colKey, realmGet$message, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.messageColKey, colKey, false);
            }
        }
    }

    public static ilimboxAndroid.ilimbox.models.forum.Discussion createDetachedCopy(ilimboxAndroid.ilimbox.models.forum.Discussion realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        ilimboxAndroid.ilimbox.models.forum.Discussion unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new ilimboxAndroid.ilimbox.models.forum.Discussion();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (ilimboxAndroid.ilimbox.models.forum.Discussion) cachedObject.object;
            }
            unmanagedObject = (ilimboxAndroid.ilimbox.models.forum.Discussion) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface unmanagedCopy = (ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) unmanagedObject;
        ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface realmSource = (ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$discussionId(realmSource.realmGet$discussionId());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$timeModified(realmSource.realmGet$timeModified());
        unmanagedCopy.realmSet$parent(realmSource.realmGet$parent());

        // Deep copy of attachments
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$attachments(null);
        } else {
            RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> managedattachmentsList = realmSource.realmGet$attachments();
            RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> unmanagedattachmentsList = new RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment>();
            unmanagedCopy.realmSet$attachments(unmanagedattachmentsList);
            int nextDepth = currentDepth + 1;
            int size = managedattachmentsList.size();
            for (int i = 0; i < size; i++) {
                ilimboxAndroid.ilimbox.models.forum.Attachment item = ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.createDetachedCopy(managedattachmentsList.get(i), nextDepth, maxDepth, cache);
                unmanagedattachmentsList.add(item);
            }
        }
        unmanagedCopy.realmSet$userFullName(realmSource.realmGet$userFullName());
        unmanagedCopy.realmSet$userPictureUrl(realmSource.realmGet$userPictureUrl());
        unmanagedCopy.realmSet$isPinned(realmSource.realmGet$isPinned());
        unmanagedCopy.realmSet$forumId(realmSource.realmGet$forumId());
        unmanagedCopy.realmSet$subject(realmSource.realmGet$subject());
        unmanagedCopy.realmSet$message(realmSource.realmGet$message());

        return unmanagedObject;
    }

    static ilimboxAndroid.ilimbox.models.forum.Discussion update(Realm realm, DiscussionColumnInfo columnInfo, ilimboxAndroid.ilimbox.models.forum.Discussion realmObject, ilimboxAndroid.ilimbox.models.forum.Discussion newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface realmObjectTarget = (ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) realmObject;
        ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface realmObjectSource = (ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxyInterface) newObject;
        Table table = realm.getTable(ilimboxAndroid.ilimbox.models.forum.Discussion.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.discussionIdColKey, realmObjectSource.realmGet$discussionId());
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());
        builder.addInteger(columnInfo.timeModifiedColKey, realmObjectSource.realmGet$timeModified());
        builder.addInteger(columnInfo.parentColKey, realmObjectSource.realmGet$parent());

        RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> attachmentsList = realmObjectSource.realmGet$attachments();
        if (attachmentsList != null) {
            RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment> attachmentsManagedCopy = new RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment>();
            for (int i = 0; i < attachmentsList.size(); i++) {
                ilimboxAndroid.ilimbox.models.forum.Attachment attachmentsItem = attachmentsList.get(i);
                ilimboxAndroid.ilimbox.models.forum.Attachment cacheattachments = (ilimboxAndroid.ilimbox.models.forum.Attachment) cache.get(attachmentsItem);
                if (cacheattachments != null) {
                    attachmentsManagedCopy.add(cacheattachments);
                } else {
                    attachmentsManagedCopy.add(ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.copyOrUpdate(realm, (ilimboxAndroid_ilimbox_models_forum_AttachmentRealmProxy.AttachmentColumnInfo) realm.getSchema().getColumnInfo(ilimboxAndroid.ilimbox.models.forum.Attachment.class), attachmentsItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.attachmentsColKey, attachmentsManagedCopy);
        } else {
            builder.addObjectList(columnInfo.attachmentsColKey, new RealmList<ilimboxAndroid.ilimbox.models.forum.Attachment>());
        }
        builder.addString(columnInfo.userFullNameColKey, realmObjectSource.realmGet$userFullName());
        builder.addString(columnInfo.userPictureUrlColKey, realmObjectSource.realmGet$userPictureUrl());
        builder.addBoolean(columnInfo.isPinnedColKey, realmObjectSource.realmGet$isPinned());
        builder.addInteger(columnInfo.forumIdColKey, realmObjectSource.realmGet$forumId());
        builder.addString(columnInfo.subjectColKey, realmObjectSource.realmGet$subject());
        builder.addString(columnInfo.messageColKey, realmObjectSource.realmGet$message());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Discussion = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{discussionId:");
        stringBuilder.append(realmGet$discussionId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{timeModified:");
        stringBuilder.append(realmGet$timeModified());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{parent:");
        stringBuilder.append(realmGet$parent());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{attachments:");
        stringBuilder.append("RealmList<Attachment>[").append(realmGet$attachments().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userFullName:");
        stringBuilder.append(realmGet$userFullName());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userPictureUrl:");
        stringBuilder.append(realmGet$userPictureUrl());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isPinned:");
        stringBuilder.append(realmGet$isPinned());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{forumId:");
        stringBuilder.append(realmGet$forumId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{subject:");
        stringBuilder.append(realmGet$subject());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{message:");
        stringBuilder.append(realmGet$message());
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
        ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy aDiscussion = (ilimboxAndroid_ilimbox_models_forum_DiscussionRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aDiscussion.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aDiscussion.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aDiscussion.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
