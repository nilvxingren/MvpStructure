package app.season.mvpstructure.ui.main;

import java.util.List;

import javax.inject.Inject;

import app.season.mvpstructure.data.DataManager;
import app.season.mvpstructure.data.bean.Repo;
import app.season.mvpstructure.ui.base.BasePresenter;
import app.season.mvpstructure.ui.base.BaseSubscriber;

/**
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/21.
 */
public class MainPresenter extends BasePresenter<IMainMvpView> {

    @Inject
    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    public void listRepos(String userName) {
        getMvpView().showProgressDialog("init...", false);
        doNormalSubscribe(dataManager.listRepos(userName), new GetReposSubscriber());
    }

    private class GetReposSubscriber extends BaseSubscriber<List<Repo>> {
        @Override
        public void onCompleted() {
            super.onCompleted();
            getMvpView().hideProgressDialog();
        }

        @Override
        public void onNext(List<Repo> repos) {
            super.onNext(repos);
            getMvpView().onListRepos(repos);
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
            getMvpView().hideProgressDialog();
        }
    }
}
