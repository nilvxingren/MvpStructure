package app.season.mvpstructure.ui.note;

import java.util.List;

import app.season.mvpstructure.data.bean.Note;
import app.season.mvpstructure.ui.base.IMvpView;

/**
 * NoteActivity MvpView
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public interface INoteMvpView extends IMvpView {

    void addNote(Note note);

    void deleteNote(int position);

    void addData(List<Note> notes);
}
