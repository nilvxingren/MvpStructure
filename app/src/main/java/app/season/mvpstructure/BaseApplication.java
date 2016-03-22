package app.season.mvpstructure;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

import javax.inject.Inject;

import app.season.mvpstructure.data.BusEvent;
import app.season.mvpstructure.injection.component.ApplicationComponent;
import app.season.mvpstructure.injection.component.DaggerApplicationComponent;
import app.season.mvpstructure.injection.module.ApplicationModule;
import timber.log.Timber;

/**
 * BaseApplication
 *
 * @author Season
 * @version 0.1
 */
public class BaseApplication extends Application {
    @Inject
    Bus bus;

    ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        mApplicationComponent.inject(this);

        bus.register(this);

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        } else {
            Timber.plant(new CrashReportingTree());
        }
    }

    public static BaseApplication get(Context context) {
        return (BaseApplication) context.getApplicationContext();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

    @Subscribe
    public void onRequestFailed(BusEvent.RequestFailedEvent event) {
        Toast.makeText(this, "网络连接失败，请检查网络设置", Toast.LENGTH_SHORT).show();
    }

    /**
     * A tree which logs important information for crash reporting.
     */
    private static class CrashReportingTree extends Timber.Tree {
        @Override
        protected void log(int priority, String tag, String message, Throwable t) {
            if (priority == Log.VERBOSE || priority == Log.DEBUG) {
                return;
            }

            FakeCrashLibrary.log(priority, tag, message);

            if (t != null) {
                if (priority == Log.ERROR) {
                    FakeCrashLibrary.logError(t);
                } else if (priority == Log.WARN) {
                    FakeCrashLibrary.logWarning(t);
                }
            }
        }
    }
}
