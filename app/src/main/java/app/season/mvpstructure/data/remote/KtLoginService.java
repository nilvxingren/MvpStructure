package app.season.mvpstructure.data.remote;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import app.season.mvpstructure.BuildConfig;
import app.season.mvpstructure.data.bean.LoginResponse;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Login test service
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/22.
 */
public interface KtLoginService {
    String ENDPOINT = "http://api2.kuaiti8.com/api/";

    @FormUrlEncoded
    @POST("Entry")
    Observable<LoginResponse> login(@Query("id") Integer id, @Query("userid") String userid,
                                    @Query("onlinestate") String onlineState,
                                    @Query("method") String method,
                                    @Field("data") String field);


    /**
     * Create a new KtLoginService
     */
    class Factory {
        public static KtLoginService createService(Context context) {
            OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
            builder.readTimeout(10, TimeUnit.SECONDS);
            builder.connectTimeout(5, TimeUnit.SECONDS);

            if (BuildConfig.DEBUG) {
                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
                builder.addInterceptor(interceptor);
            }

            builder.addInterceptor(new HeaderInterceptor());
            builder.addInterceptor(new UnauthorisedInterceptor(context));

            OkHttpClient client = builder.build();

            Retrofit retrofit =
                    new Retrofit.Builder().baseUrl(KtLoginService.ENDPOINT)
                            .client(client)
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .build();

            return retrofit.create(KtLoginService.class);
        }
    }
}
