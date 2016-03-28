package app.season.mvpstructure.ui.mainfragment;

import android.support.v7.widget.RecyclerView;

import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import app.season.mvpstructure.ui.base.IMvpView;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-03-25
 * Time: 13:17
 * FIXME
 */
public interface IMovieMvpView extends IMvpView {
    RecyclerView.Adapter getAdapter();
}
