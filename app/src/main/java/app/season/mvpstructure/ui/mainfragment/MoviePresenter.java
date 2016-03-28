package app.season.mvpstructure.ui.mainfragment;

import android.content.Context;

import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import java.util.ArrayList;

import javax.inject.Inject;

import app.season.mvpstructure.data.DataManager;
import app.season.mvpstructure.data.bean.MovieIntroduceResponse;
import app.season.mvpstructure.data.bean.MovieListResponse;
import app.season.mvpstructure.injection.ActivityContext;
import app.season.mvpstructure.ui.base.BasePresenter;
import app.season.mvpstructure.ui.base.BaseSubscriber;
import app.season.mvpstructure.ui.moviedetailfragment.IMovieIntroduceMvpView;
import app.season.mvpstructure.ui.moviedetailfragment.MovieIntroduceAdapter;
import rx.Subscription;

/**
 * Business logic for dealing with movies
 * <p/>
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-03-25
 * Time: 13:16
 * FIXME
 */
public class MoviePresenter extends BasePresenter<IMovieMvpView> {
    private Subscription mInTheaterSubscription;
    private Subscription mCommingSoonSubscription;
    private Subscription mMovieIntroduceSubscription;

    @Inject
    public MoviePresenter(@ActivityContext Context context, DataManager dataManager) {
        super(context, dataManager);
    }

    @Override
    public void detachView() {
        super.detachView();
        if (mInTheaterSubscription != null) {
            mInTheaterSubscription.unsubscribe();
        }
        if (mCommingSoonSubscription != null) {
            mCommingSoonSubscription.unsubscribe();
        }
    }

    /**
     * 获取正在热映的电影
     *
     * @param city 城市名 or 城市id
     */
    public void getInTheaters(String city) {
        mInTheaterSubscription = doNormalSubscribe(mDataManager.getInTheaters(city), new MovieListSubscriber(mContext));
    }

    /**
     * 获取即将上映的电影
     *
     * @param start 0
     * @param count 20
     */
    public void getComingSoon(int start, int count) {
        mCommingSoonSubscription = doNormalSubscribe(mDataManager.getComingSoon(start, count),
                new MovieListSubscriber(mContext));
    }

    /**
     * 获取电影介绍
     *
     * @param id id
     */
    public void getMovieIntroduce(String id) {
        mMovieIntroduceSubscription = doNormalSubscribe(mDataManager.getMovieIntroduce(id),
                new MovieIntroduceSubscriber(mContext));
    }

    private class MovieListSubscriber extends BaseSubscriber<MovieListResponse> {

        public MovieListSubscriber(Context context) {
            super(context);
        }

        @Override
        public void onNext(MovieListResponse movieListResponse) {
            super.onNext(movieListResponse);
            ((RecyclerArrayAdapter) (getMvpView().getAdapter())).addAll(movieListResponse.getSubjects());
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
            ((RecyclerArrayAdapter) (getMvpView().getAdapter())).addAll(new ArrayList<MovieListResponse
                    .SubjectsEntity>());
        }
    }

    private class MovieIntroduceSubscriber extends BaseSubscriber<MovieIntroduceResponse> {

        public MovieIntroduceSubscriber(Context context) {
            super(context);
        }

        @Override
        public void onNext(MovieIntroduceResponse movieIntroduceResponse) {
            super.onNext(movieIntroduceResponse);
            if (getMvpView() instanceof IMovieIntroduceMvpView) {
                MovieIntroduceAdapter adapter = (MovieIntroduceAdapter) getMvpView().getAdapter();
                adapter.setMovieIntroduceResponse(movieIntroduceResponse);
                ((IMovieIntroduceMvpView) getMvpView()).getRecyclerView().setAdapter(adapter);
            } else {
                throw new MvpViewNotCorrect();
            }
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);

        }
    }

    public static class MvpViewNotCorrect extends RuntimeException {
        public MvpViewNotCorrect() {
            super("Please check the MvpView type");
        }
    }
}
