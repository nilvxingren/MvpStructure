package app.season.mvpstructure.ui.main;

import java.util.List;

import app.season.mvpstructure.data.bean.Repo;
import app.season.mvpstructure.ui.base.IMvpView;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public interface IRepoMvpView extends IMvpView {
    void onListRepos(List<Repo> list);

    void onNetworkError();

    void showLoading();
}
