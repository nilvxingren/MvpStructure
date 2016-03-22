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
 * BaseActivity
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/21.
 */
public abstract class BaseActivity extends AppCompatActivity implements IMvpView {
    protected ProgressDialog progressDialog;
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
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(this);
        }
        progressDialog.setCanceledOnTouchOutside(canDismiss);
        progressDialog.setMessage(content);
        progressDialog.show();
    }

    public void hideProgressDialog() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }
}
