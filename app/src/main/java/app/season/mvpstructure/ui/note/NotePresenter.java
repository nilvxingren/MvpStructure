package app.season.mvpstructure.ui.note;

import android.content.Context;
import android.database.Cursor;

import com.squareup.sqlbrite.SqlBrite;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import app.season.mvpstructure.data.DataManager;
import app.season.mvpstructure.data.bean.Note;
import app.season.mvpstructure.data.local.Db;
import app.season.mvpstructure.injection.ActivityContext;
import app.season.mvpstructure.ui.base.BasePresenter;
import app.season.mvpstructure.ui.base.BaseSubscriber;

/**
 * the noteActivity's presenter
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/24.
 */
public class NotePresenter extends BasePresenter<INoteMvpView> {

    @Inject
    public NotePresenter(@ActivityContext Context context, DataManager dataManager) {
        super(context, dataManager);
    }

    public void insert(Note note) {
        dataManager.insert(note);
    }

    public void query() {
        doNormalSubscribe(dataManager.notes(), new NoteSubscriber(context));
    }

    private class NoteSubscriber extends BaseSubscriber<SqlBrite.Query> {

        public NoteSubscriber(Context context) {
            super(context);
        }

        @Override
        public void onNext(SqlBrite.Query query) {
            super.onNext(query);
            Cursor cursor = query.run();
            List<Note> list = new ArrayList<>();
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    list.add(Db.CreateTable.parseCursor(cursor));
                }
            }
            getMvpView().addData(list);
        }
    }
}
