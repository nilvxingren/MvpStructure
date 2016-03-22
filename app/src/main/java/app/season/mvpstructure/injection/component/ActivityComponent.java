package app.season.mvpstructure.injection.component;

import android.app.Activity;

import app.season.mvpstructure.injection.PerActivity;
import app.season.mvpstructure.injection.module.ActivityModule;
import app.season.mvpstructure.ui.login.LoginActivity;
import app.season.mvpstructure.ui.main.MainActivity;
import dagger.Component;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(LoginActivity loginActivity);

    void inject(MainActivity mainActivity);

    Activity activity();
}
