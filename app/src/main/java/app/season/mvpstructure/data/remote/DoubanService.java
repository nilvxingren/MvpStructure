package app.season.mvpstructure.data.remote;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import app.season.mvpstructure.BuildConfig;
import app.season.mvpstructure.data.bean.InTheatersResponse;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Season on 2016/3/25.
 */
public interface DoubanService {

    String ENDPOINT = "https://api.douban.com/v2/";

    @GET("movie/in_theaters")
    Observable<InTheatersResponse> getInTheaters(@Query("city") String city);

    /**
     * Create a new GitHubService
     */
    class Factory {
        public static DoubanService createService(Context context) {
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

            /**
             * if datetime should format,use this
             *  GsonConverterFactory.create(gson)
             */
//            Gson gson = new GsonBuilder()
//                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
//                    .create();

            Retrofit retrofit =
                    new Retrofit.Builder().baseUrl(DoubanService.ENDPOINT)
                            .client(client)
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .build();

            return retrofit.create(DoubanService.class);
        }
    }
}
