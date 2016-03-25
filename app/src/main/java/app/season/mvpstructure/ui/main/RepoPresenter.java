package app.season.mvpstructure.ui.main;

import android.content.Context;

import java.util.List;

import javax.inject.Inject;

import app.season.mvpstructure.data.DataManager;
import app.season.mvpstructure.data.bean.Repo;
import app.season.mvpstructure.injection.ActivityContext;
import app.season.mvpstructure.ui.base.BasePresenter;
import app.season.mvpstructure.ui.base.BaseSubscriber;
import rx.Subscription;
/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public class RepoPresenter extends BasePresenter<IRepoMvpView> {

    private Subscription subscription;

    @Inject
    public RepoPresenter(@ActivityContext Context context, DataManager dataManager) {
        super(context, dataManager);
    }

    public void listRepos(String userName) {
        getMvpView().showLoading();
        subscription = doNormalSubscribe(mDataManager.listRepos(userName), new GetReposSubscriber(mContext));
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

    @Override
    public void detachView() {
        super.detachView();
        if (subscription != null) {
            subscription.unsubscribe();
        }
    }
}
