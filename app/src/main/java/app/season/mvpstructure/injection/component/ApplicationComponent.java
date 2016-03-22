package app.season.mvpstructure.injection.component;

import android.app.Application;
import android.content.Context;

import com.squareup.otto.Bus;

import javax.inject.Singleton;

import app.season.mvpstructure.BaseApplication;
import app.season.mvpstructure.data.DataManager;
import app.season.mvpstructure.data.remote.GitHubService;
import app.season.mvpstructure.data.remote.KtLoginService;
import app.season.mvpstructure.data.remote.UnauthorisedInterceptor;
import app.season.mvpstructure.injection.ApplicationContext;
import app.season.mvpstructure.injection.module.ApplicationModule;
import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(BaseApplication baseApplication);

    void inject(UnauthorisedInterceptor interceptor);

    Application application();

    DataManager dataManager();

    Bus eventBus();

    @ApplicationContext
    Context context();

    GitHubService githubService();

    KtLoginService ktLoginService();
}
