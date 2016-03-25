package app.season.mvpstructure.ui.login;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.inject.Inject;

import app.season.mvpstructure.R;
import app.season.mvpstructure.data.bean.LoginRequest;
import app.season.mvpstructure.ui.base.BaseActivity;
import app.season.mvpstructure.ui.main.RepoActivity;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * LoginActivity
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/22.
 */
public class LoginActivity extends BaseActivity implements ILoginMvpView {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.name)
    EditText name;
    @Bind(R.id.password)
    EditText password;
    @Bind(R.id.login)
    Button login;

    @Inject
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        getActivityComponent().inject(this);
        loginPresenter.attachView(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        loginPresenter.detachView();
    }

    @OnClick(R.id.login)
    public void onClick() {
        String nameStr = name.getText().toString().trim();
        String passStr = password.getText().toString().trim();
        if (TextUtils.isEmpty(nameStr)) {
            return;
        }
        if (TextUtils.isEmpty(passStr)) {
            return;
        }
        loginPresenter.login(new LoginRequest(nameStr, passStr));
    }

    /**
     * mvp view interface method
     */
    @Override
    public void loginSuccess() {
        Intent intent = new Intent();
        intent.setClass(LoginActivity.this, RepoActivity.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
//            startActivity(intent,
//                    ActivityOptionsCompat.makeSceneTransitionAnimation(LoginActivity.this).toBundle());
            startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                    login,
                    "share").toBundle());
        } else {
            startActivity(intent);
        }
    }

    @Override
    public void loginFail() {
        Toast.makeText(this, "登录失败", Toast.LENGTH_SHORT).show();
    }


}
