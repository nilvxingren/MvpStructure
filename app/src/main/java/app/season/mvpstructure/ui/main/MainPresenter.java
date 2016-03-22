package app.season.mvpstructure.ui.main;

import android.content.Context;

import java.util.List;

import javax.inject.Inject;

import app.season.mvpstructure.data.DataManager;
import app.season.mvpstructure.data.bean.Repo;
import app.season.mvpstructure.injection.ActivityContext;
import app.season.mvpstructure.ui.base.BasePresenter;
import app.season.mvpstructure.ui.base.BaseSubscriber;

/**
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/21.
 */
public class MainPresenter extends BasePresenter<IMainMvpView> {


    @Inject
    public MainPresenter(@ActivityContext Context context, DataManager dataManager) {
        super(context, dataManager);
    }

    public void listRepos(String userName) {
        getMvpView().showLoading();
        doNormalSubscribe(dataManager.listRepos(userName), new GetReposSubscriber(context));
    }

    private class GetReposSubscriber extends BaseSubscriber<List<Repo>> {
        public GetReposSubscriber(Context context) {
            super(context);
        }

        @Override
        public void onCompleted() {
            super.onCompleted();
        }

        @Override
        public void onNext(List<Repo> repos) {
            super.onNext(repos);
            getMvpView().onListRepos(repos);
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
            getMvpView().onNetworkError();
        }
    }
}
