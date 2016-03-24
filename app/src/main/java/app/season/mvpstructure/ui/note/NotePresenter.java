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
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/24.
 */
public class NotePresenter extends BasePresenter<INoteMvpView> {

    @Inject
    public NotePresenter(@ActivityContext Context context, DataManager dataManager) {
        super(context, dataManager);
    }

    public void delete(int rowId, int position) {
        int rows = dataManager.deleteNote(rowId);
        if (rows >= 0) {
            getMvpView().deleteNote(position);
        }
    }

    public void insert(Note note) {
        long rowId = dataManager.insertNote(note);
        if (rowId >= 0) {
            getMvpView().addNote(note);
        }
    }

    public void query() {
        doNormalSubscribe(dataManager.queryAllNotes(), new NoteSubscriber(context));
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
