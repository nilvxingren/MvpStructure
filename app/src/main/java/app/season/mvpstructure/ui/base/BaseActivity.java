package app.season.mvpstructure.ui.base;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
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
public abstract class BaseActivity extends AppCompatActivity implements IMvpView {
    protected ProgressDialog mProgressDialog;
    private ActivityComponent mActivityComponent;

    public ActivityComponent getActivityComponent() {
        if (mActivityComponent == null) {
            mActivityComponent = DaggerActivityComponent.builder()
                    .applicationComponent(BaseApplication.get(this).getApplicationComponent())
                    .activityModule(new ActivityModule(this))
                    .build();
        }
        return mActivityComponent;
    }

    public void showShortMessage(String message) {
        if (TextUtils.isEmpty(message)) {
            return;
        }
        Toast.makeText(BaseActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    public void showLongMessage(String message) {
        if (TextUtils.isEmpty(message)) {
            return;
        }
        Toast.makeText(BaseActivity.this, message, Toast.LENGTH_LONG).show();
    }

    public void showProgressDialog(String content, boolean canDismiss) {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(this);
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
