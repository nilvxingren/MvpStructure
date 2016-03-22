package app.season.mvpstructure.ui.login;

import javax.inject.Inject;

import app.season.mvpstructure.data.DataManager;
import app.season.mvpstructure.data.bean.LoginRequest;
import app.season.mvpstructure.data.bean.LoginResponse;
import app.season.mvpstructure.ui.base.BasePresenter;
import app.season.mvpstructure.ui.base.BaseSubscriber;

/**
 * Login Presenter
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/22.
 */
public class LoginPresenter extends BasePresenter<ILoginMvpView> {

    private final DataManager mDataManager;

    @Inject
    public LoginPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    public void login(LoginRequest loginRequest) {
        getMvpView().showProgressDialog("登录中", false);
        doNormalSubscribe(mDataManager.login(loginRequest), new LoginSubscriber());
    }

    private class LoginSubscriber extends BaseSubscriber<LoginResponse> {
        @Override
        public void onNext(LoginResponse loginResponse) {
            super.onNext(loginResponse);
            if (loginResponse.getFlag() == 0) {
                getMvpView().loginSuccess();
            } else {
                getMvpView().loginFail();
            }
        }

        @Override
        public void onCompleted() {
            super.onCompleted();
            getMvpView().hideProgressDialog();
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
            getMvpView().hideProgressDialog();
        }
    }
}
