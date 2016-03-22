package app.season.mvpstructure.ui.base;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * BasePresenter
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/21.
 */
public class BasePresenter<V extends IMvpView> implements IPresenter<V> {
    private V mMvpView;

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
