package app.season.mvpstructure.ui.note;

import java.util.List;

import app.season.mvpstructure.data.bean.Note;
import app.season.mvpstructure.ui.base.IMvpView;

/**
 * Created by Season on 2016/3/24.
 */
public interface INoteMvpView extends IMvpView {

    void addData(List<Note> notes);
}
