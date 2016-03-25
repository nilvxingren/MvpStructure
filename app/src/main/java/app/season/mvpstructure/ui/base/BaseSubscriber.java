package app.season.mvpstructure.ui.base;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import com.squareup.otto.Bus;

import java.net.UnknownHostException;

import app.season.mvpstructure.BaseApplication;
import app.season.mvpstructure.data.BusEvent;
import retrofit2.adapter.rxjava.HttpException;
import rx.Subscriber;
import timber.log.Timber;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public class BaseSubscriber<T> extends Subscriber<T> {
    private Bus bus;

    public BaseSubscriber(Context context) {
        bus = BaseApplication.get(context).getApplicationComponent().eventBus();
    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        if (e instanceof HttpException) {
            Timber.e(e, "网络连接不可用，请检查网络设置");
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override
                public void run() {
                    bus.post(new BusEvent.RequestFailedEvent());
                }
            });
        } else if (e instanceof UnknownHostException) {
            Timber.e(e, "网络连接不可用，请检查网络设置");
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override
                public void run() {
                    bus.post(new BusEvent.RequestFailedEvent());
                }
            });
        }
    }

    @Override
    public void onNext(T t) {

    }
}
