package app.season.mvpstructure.ui.note;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import app.season.mvpstructure.data.DataManager;
import app.season.mvpstructure.data.bean.Note;
import app.season.mvpstructure.injection.ActivityContext;
import app.season.mvpstructure.ui.base.BasePresenter;
import app.season.mvpstructure.ui.base.BaseSubscriber;

/**
 * the noteActivity's presenter
 *
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public class NotePresenter extends BasePresenter<INoteMvpView> {

    @Inject
    public NotePresenter(@ActivityContext Context context, DataManager dataManager) {
        super(context, dataManager);
    }

    public void delete(int rowId, int position) {
        int rows = mDataManager.deleteNote(rowId);
        if (rows >= 0) {
            getMvpView().deleteNote(position);
        }
    }

    public void insert(Note note) {
        long rowId = mDataManager.insertNote(note);
        if (rowId >= 0) {
            getMvpView().addNote(note);
        }
    }

    public void query() {
        doNormalSubscribe(mDataManager.queryAllNotes(), new NoteSubscriber(mContext));
    }

    private class NoteSubscriber extends BaseSubscriber<Note> {

        private List<Note> notes = new ArrayList<>();

        public NoteSubscriber(Context context) {
            super(context);
        }

        @Override
        public void onNext(Note note) {
            super.onNext(note);
            notes.add(note);
        }

        @Override
        public void onCompleted() {
            super.onCompleted();
            getMvpView().addData(notes);
        }
    }
}
