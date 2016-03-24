package app.season.mvpstructure.data.local;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import javax.inject.Inject;

import app.season.mvpstructure.injection.ApplicationContext;

/**
 * SQLiteOpenHelper
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/24.
 */
public class DbOpenHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "database.db";
    public static final int DATABASE_VERSION = 1;

    @Inject
    public DbOpenHelper(@ApplicationContext Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.beginTransaction();
        try {
            db.execSQL(Db.NoteTable.CREATE);
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
