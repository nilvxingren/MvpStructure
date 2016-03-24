package app.season.mvpstructure.data.local;

import android.content.ContentValues;
import android.database.Cursor;

import app.season.mvpstructure.data.bean.Note;

/**
 * Db
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/24.
 */
public class Db {
    public Db() {
    }

    public static final class NoteTable {
        public static final String TABLE_NAME = "notes";

        public static final String COLUMN_ID = "id";
        public static final String COLUMN_TEXT = "text";
        public static final String COLUMN_DATE = "date";

        public static final String CREATE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        COLUMN_TEXT + " TEXT　NOT NULL," +
                        COLUMN_DATE + " TEXT NOT NULL " +
                        " )";

        public static ContentValues createNote(Note note) {
            ContentValues values = new ContentValues();
            values.put(COLUMN_TEXT, note.text);
            values.put(COLUMN_DATE, note.date);
            return values;
        }

        public static Note parseCursor(Cursor cursor) {
            Note note = new Note();
            note.id = cursor.getInt(cursor.getColumnIndexOrThrow(COLUMN_ID));
            note.text = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_TEXT));
            note.date = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_DATE));
            return note;
        }
    }
}
