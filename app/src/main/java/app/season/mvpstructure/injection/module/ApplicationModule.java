package app.season.mvpstructure.injection.module;

import android.app.Application;
import android.content.Context;

import com.squareup.otto.Bus;

import javax.inject.Singleton;

import app.season.mvpstructure.data.remote.DouBanService;
import app.season.mvpstructure.data.remote.KtLoginService;
import app.season.mvpstructure.injection.ApplicationContext;
import dagger.Module;
import dagger.Provides;

/**
 * Provide application-level dependencies.
 */
@Module
public class ApplicationModule {
    private static final String DB_NAME = "database";
    protected final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    Bus provideEventBus() {
        return new Bus();
    }

    @Provides
    @Singleton
    KtLoginService provideKtLoginService() {
        return KtLoginService.Factory.createService(mApplication);
    }

    @Provides
    @Singleton
    DouBanService provideDoubanService() {
        return DouBanService.Factory.createService(mApplication);
    }
}
