package app.season.mvpstructure.injection.module;

import android.app.Activity;
import android.content.Context;

import app.season.mvpstructure.injection.ActivityContext;
import app.season.mvpstructure.injection.PerActivity;
import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private final Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @PerActivity
    Activity provideActivity() {
        return mActivity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }
}
