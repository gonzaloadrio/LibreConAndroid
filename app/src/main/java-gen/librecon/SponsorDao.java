package librecon;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import librecon.Sponsor;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table SPONSOR.
*/
public class SponsorDao extends AbstractDao<Sponsor, Long> {

    public static final String TABLENAME = "SPONSOR";

    /**
     * Properties of entity Sponsor.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property NameEs = new Property(1, String.class, "nameEs", false, "NAME_ES");
        public final static Property NameEu = new Property(2, String.class, "nameEu", false, "NAME_EU");
        public final static Property NameEn = new Property(3, String.class, "nameEn", false, "NAME_EN");
        public final static Property PicUrl = new Property(4, String.class, "picUrl", false, "PIC_URL");
        public final static Property Url = new Property(5, String.class, "url", false, "URL");
        public final static Property OrderField = new Property(6, Integer.class, "orderField", false, "ORDER_FIELD");
    };


    public SponsorDao(DaoConfig config) {
        super(config);
    }
    
    public SponsorDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'SPONSOR' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'NAME_ES' TEXT," + // 1: nameEs
                "'NAME_EU' TEXT," + // 2: nameEu
                "'NAME_EN' TEXT," + // 3: nameEn
                "'PIC_URL' TEXT," + // 4: picUrl
                "'URL' TEXT," + // 5: url
                "'ORDER_FIELD' INTEGER);"); // 6: orderField
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'SPONSOR'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Sponsor entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String nameEs = entity.getNameEs();
        if (nameEs != null) {
            stmt.bindString(2, nameEs);
        }
 
        String nameEu = entity.getNameEu();
        if (nameEu != null) {
            stmt.bindString(3, nameEu);
        }
 
        String nameEn = entity.getNameEn();
        if (nameEn != null) {
            stmt.bindString(4, nameEn);
        }
 
        String picUrl = entity.getPicUrl();
        if (picUrl != null) {
            stmt.bindString(5, picUrl);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(6, url);
        }
 
        Integer orderField = entity.getOrderField();
        if (orderField != null) {
            stmt.bindLong(7, orderField);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Sponsor readEntity(Cursor cursor, int offset) {
        Sponsor entity = new Sponsor( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // nameEs
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // nameEu
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // nameEn
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // picUrl
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // url
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6) // orderField
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Sponsor entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNameEs(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setNameEu(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setNameEn(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPicUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setUrl(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setOrderField(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Sponsor entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Sponsor entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
