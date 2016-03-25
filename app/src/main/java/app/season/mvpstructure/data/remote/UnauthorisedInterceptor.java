package app.season.mvpstructure.data.remote;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import com.squareup.otto.Bus;

import java.io.IOException;

import javax.inject.Inject;

import app.season.mvpstructure.BaseApplication;
import app.season.mvpstructure.data.BusEvent;
import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public class UnauthorisedInterceptor implements Interceptor {
    @Inject
    Bus bus;

    public UnauthorisedInterceptor(Context context) {
        BaseApplication.get(context).getApplicationComponent().inject(this);
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Response response = chain.proceed(chain.request());
        if (response.code() == 401) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override
                public void run() {
                    bus.post(new BusEvent.AuthenticationError());
                }
            });
        }
        return response;
    }
}
