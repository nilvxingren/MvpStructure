package app.season.mvpstructure.ui.base;

import android.app.Fragment;

import app.season.mvpstructure.BaseApplication;
import app.season.mvpstructure.injection.component.ActivityComponent;
import app.season.mvpstructure.injection.component.DaggerActivityComponent;
import app.season.mvpstructure.injection.module.ActivityModule;

/**
 * BaseFragment
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/21.
 */
public class BaseFragment extends Fragment {

    private ActivityComponent mActivityComponent;


    public ActivityComponent getActivityComponent() {
        if (mActivityComponent == null) {
            mActivityComponent = DaggerActivityComponent.builder()
                    .applicationComponent(BaseApplication.get(getActivity()).getApplicationComponent())
                    .activityModule(new ActivityModule(getActivity()))
                    .build();
        }
        return mActivityComponent;
    }
}
