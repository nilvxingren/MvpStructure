package app.season.mvpstructure.ui.base;


import android.app.ProgressDialog;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.widget.Toast;

import app.season.mvpstructure.BaseApplication;
import app.season.mvpstructure.injection.component.ActivityComponent;
import app.season.mvpstructure.injection.component.DaggerActivityComponent;
import app.season.mvpstructure.injection.module.ActivityModule;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public class BaseFragment extends Fragment implements IMvpView {
    protected ProgressDialog mProgressDialog;
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

    @Override
    public void showShortMessage(String message) {
        if (TextUtils.isEmpty(message)) {
            return;
        }
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void showLongMessage(String message) {
        if (TextUtils.isEmpty(message)) {
            return;
        }
        Toast.makeText(getContext(), message, Toast.LENGTH_LONG).show();
    }

    public void showProgressDialog(String content, boolean canDismiss) {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(getContext());
        }
        mProgressDialog.setCanceledOnTouchOutside(canDismiss);
        mProgressDialog.setMessage(content);
        mProgressDialog.show();
    }

    public void hideProgressDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }
}
