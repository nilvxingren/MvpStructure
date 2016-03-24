package app.season.mvpstructure.data.local;

import android.database.Cursor;

import com.squareup.sqlbrite.BriteDatabase;
import com.squareup.sqlbrite.SqlBrite;

import javax.inject.Inject;
import javax.inject.Singleton;

import app.season.mvpstructure.data.bean.Note;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

/**
 * manage database control
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/24.
 */
@Singleton
public class DataBaseHelper {
    private final BriteDatabase db;

    @Inject
    public DataBaseHelper(DbOpenHelper dbOpenHelper) {
        this.db = SqlBrite.create().wrapDatabaseHelper(dbOpenHelper, Schedulers.io());
    }

    public Observable<Note> queryAllNotes() {
        Observable<Note> observable = Observable.create(new Observable.OnSubscribe<Note>() {
            @Override
            public void call(Subscriber<? super Note> subscriber) {
                Cursor cursor = db.query("select * from " + Db.NoteTable.TABLE_NAME);
                while (cursor.moveToNext()) {
                    subscriber.onNext(Db.NoteTable.parseCursor(cursor));
                }
                cursor.close();
                subscriber.onCompleted();
            }
        });
        return observable;
//        Observable<SqlBrite.Query> notes = db.createQuery(Db.NoteTable.TABLE_NAME,
//                "select * from " + Db.NoteTable.TABLE_NAME);
//        return notes;
    }

    public long insertNote(Note note) {
        return db.insert(Db.NoteTable.TABLE_NAME, Db.NoteTable.createNote(note));
    }

    public int deleteNote(int rowId) {
        return db.delete(Db.NoteTable.TABLE_NAME, "id = ?", "" + rowId);
    }

}