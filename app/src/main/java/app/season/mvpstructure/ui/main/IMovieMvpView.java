package app.season.mvpstructure.ui.main;

import java.util.List;

import app.season.mvpstructure.data.bean.InTheatersResponse;
import app.season.mvpstructure.ui.base.IMvpView;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-03-25
 * Time: 13:17
 * FIXME
 */
public interface IMovieMvpView extends IMvpView {
    void onGetMovie(List<InTheatersResponse.SubjectsEntity> list);
}
