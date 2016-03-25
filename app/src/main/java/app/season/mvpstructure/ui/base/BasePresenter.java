package app.season.mvpstructure.ui.base;

import android.content.Context;

import javax.inject.Inject;

import app.season.mvpstructure.data.DataManager;
import app.season.mvpstructure.injection.ActivityContext;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public class BasePresenter<V extends IMvpView> implements IPresenter<V> {
    private V mMvpView;

    public final Context mContext;
    public final DataManager mDataManager;

    @Inject
    public BasePresenter(@ActivityContext Context context, DataManager dataManager) {
        this.mContext = context;
        this.mDataManager = dataManager;
    }

    @Override
    public void attachView(V mvpView) {
        this.mMvpView = mvpView;
    }

    @Override
    public void detachView() {
        this.mMvpView = null;
    }

    public boolean isViewAttached() {
        return mMvpView != null;
    }

    public V getMvpView() {
        checkViewAttached();
        return mMvpView;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) throw new MvpViewNotAttachedException();
    }

    public static class MvpViewNotAttachedException extends RuntimeException {
        public MvpViewNotAttachedException() {
            super("Please call Presenter.attachView(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }

    public <T> Subscription doNormalSubscribe(Observable<T> observable, Subscriber<T> subscriber) {
        return observable.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(subscriber);
    }
}
