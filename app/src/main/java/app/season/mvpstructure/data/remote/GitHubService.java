package app.season.mvpstructure.data.remote;

import android.content.Context;

import java.util.List;
import java.util.concurrent.TimeUnit;

import app.season.mvpstructure.BuildConfig;
import app.season.mvpstructure.data.bean.Repo;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * GitHub API service
 *
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public interface GitHubService {
    String ENDPOINT = "https://api.github.com/";


    @GET("users/{user}/repos")
    Observable<List<Repo>> listRepos(@Path("user") String user);

    /**
     * Create a new GitHubService
     */
    class Factory {
        public static GitHubService createService(Context context) {
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
                    new Retrofit.Builder().baseUrl(GitHubService.ENDPOINT)
                            .client(client)
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .build();

            return retrofit.create(GitHubService.class);
        }
    }
}
