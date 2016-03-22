package app.season.mvpstructure.ui.base;

import java.net.UnknownHostException;

import retrofit2.adapter.rxjava.HttpException;
import rx.Subscriber;
import timber.log.Timber;

/**
 * all custom Subscriber extends this
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/22.
 */
public class BaseSubscriber<T> extends Subscriber<T> {

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        if (e instanceof HttpException) {
            Timber.e(e, "网络连接不可用，请检查网络设置");
        } else if (e instanceof UnknownHostException) {
            Timber.e(e, "网络连接不可用，请检查网络设置");
        }
    }

    @Override
    public void onNext(T t) {

    }
}
