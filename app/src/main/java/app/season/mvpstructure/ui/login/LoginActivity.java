package app.season.mvpstructure.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.inject.Inject;

import app.season.mvpstructure.R;
import app.season.mvpstructure.data.bean.LoginRequest;
import app.season.mvpstructure.ui.base.BaseActivity;
import app.season.mvpstructure.ui.main.MainActivity;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * LoginActivity
 * <p>
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public class LoginActivity extends BaseActivity implements ILoginMvpView {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.name)
    EditText mName;
    @Bind(R.id.password)
    EditText mPassword;
    @Bind(R.id.login)
    Button mLogin;

    @Inject
    LoginPresenter mLoginPresenter;

    @OnClick(R.id.login)
    public void onClick() {
        String nameStr = mName.getText().toString().trim();
        String passStr = mPassword.getText().toString().trim();
        if (TextUtils.isEmpty(nameStr)) {
            return;
        }
        if (TextUtils.isEmpty(passStr)) {
            return;
        }
        mLoginPresenter.login(new LoginRequest(nameStr, passStr));
    }

    /**
     * mvp view interface method
     */
    @Override
    public void loginSuccess() {
        Intent intent = new Intent();
        intent.setClass(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void loginFail() {
        Toast.makeText(this, "登录失败", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);

        getActivityComponent().inject(this);
        mLoginPresenter.attachView(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLoginPresenter.detachView();
    }
}
