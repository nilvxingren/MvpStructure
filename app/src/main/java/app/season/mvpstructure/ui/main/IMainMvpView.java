package app.season.mvpstructure.ui.main;

import java.util.List;

import app.season.mvpstructure.data.bean.Repo;
import app.season.mvpstructure.ui.base.IMvpView;

/**
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/21.
 */
public interface IMainMvpView extends IMvpView {
    void onListRepos(List<Repo> list);
}
