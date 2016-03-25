package app.season.mvpstructure.ui.mainfragment;

import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import app.season.mvpstructure.ui.base.IMvpView;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-03-25
 * Time: 13:17
 * FIXME
 */
public interface IMovieMvpView extends IMvpView {
    RecyclerArrayAdapter getAdapter();
}
