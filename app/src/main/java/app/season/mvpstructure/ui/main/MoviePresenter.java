package app.season.mvpstructure.ui.main;

import android.content.Context;

import java.util.ArrayList;

import javax.inject.Inject;

import app.season.mvpstructure.data.DataManager;
import app.season.mvpstructure.data.bean.InTheatersResponse;
import app.season.mvpstructure.injection.ActivityContext;
import app.season.mvpstructure.ui.base.BasePresenter;
import app.season.mvpstructure.ui.base.BaseSubscriber;
import rx.Subscription;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-03-25
 * Time: 13:16
 * FIXME
 */
public class MoviePresenter extends BasePresenter<IMovieMvpView> {
    private Subscription mSubscription;

    @Inject
    public MoviePresenter(@ActivityContext Context context, DataManager dataManager) {
        super(context, dataManager);
    }

    @Override
    public void detachView() {
        super.detachView();
        if (mSubscription != null) {
            mSubscription.unsubscribe();
        }
    }

    public void getInTheaters(String city) {
        mSubscription = doNormalSubscribe(mDataManager.getInTheaters(city), new MovieSubscriber(mContext));
    }

    private class MovieSubscriber extends BaseSubscriber<InTheatersResponse> {

        public MovieSubscriber(Context context) {
            super(context);
        }

        @Override
        public void onNext(InTheatersResponse inTheatersResponse) {
            super.onNext(inTheatersResponse);
            getMvpView().onGetMovie(inTheatersResponse.getSubjects());
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
            getMvpView().onGetMovie(new ArrayList<InTheatersResponse.SubjectsEntity>());
        }
    }


}
