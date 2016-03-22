package app.season.mvpstructure.data.remote;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * add custom header to all http request
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/22.
 */
public class HeaderInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
//        Headers headers = new Headers.Builder()
//                .add("key", "value")
//                .add("key", "value")
//                .build();
        Request request = chain.request()
                .newBuilder()
//                .headers(headers)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("charset", "UTF-8")
                .build();
        return chain.proceed(request);
    }
}
