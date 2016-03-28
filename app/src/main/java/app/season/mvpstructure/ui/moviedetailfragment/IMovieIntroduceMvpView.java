package app.season.mvpstructure.ui.moviedetailfragment;

import com.jude.easyrecyclerview.EasyRecyclerView;

import app.season.mvpstructure.ui.mainfragment.IMovieMvpView;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-03-28
 * Time: 09:26
 * FIXME
 */
public interface IMovieIntroduceMvpView extends IMovieMvpView {
    EasyRecyclerView getRecyclerView();
}
