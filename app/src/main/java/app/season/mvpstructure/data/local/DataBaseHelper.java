package app.season.mvpstructure.data.local;

import com.squareup.sqlbrite.BriteDatabase;
import com.squareup.sqlbrite.SqlBrite;

import javax.inject.Inject;
import javax.inject.Singleton;

import app.season.mvpstructure.data.bean.Note;
import rx.Observable;
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

    public Observable<SqlBrite.Query> notes() {
        Observable<SqlBrite.Query> notes = db.createQuery("notes", "select * from notes");
        return notes;
    }

    public void insert(Note note) {
        db.insert("notes", Db.CreateTable.createNote(note));
    }

}