package app.season.mvpstructure.ui.login;

import android.content.Context;

import javax.inject.Inject;

import app.season.mvpstructure.data.DataManager;
import app.season.mvpstructure.data.bean.LoginRequest;
import app.season.mvpstructure.data.bean.LoginResponse;
import app.season.mvpstructure.injection.ActivityContext;
import app.season.mvpstructure.ui.base.BasePresenter;
import app.season.mvpstructure.ui.base.BaseSubscriber;
import rx.Subscription;

/**
 * Login Presenter
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/22.
 */
public class LoginPresenter extends BasePresenter<ILoginMvpView> {

    private Subscription subscription;

    @Inject
    public LoginPresenter(@ActivityContext Context context, DataManager mDataManager) {
        super(context, mDataManager);
    }

    public void login(LoginRequest loginRequest) {
        getMvpView().showProgressDialog("登录中", false);
        subscription = doNormalSubscribe(dataManager.login(loginRequest), new LoginSubscriber(context));
    }

    private class LoginSubscriber extends BaseSubscriber<LoginResponse> {

        public LoginSubscriber(Context context) {
            super(context);
        }

        @Override
        public void onNext(LoginResponse loginResponse) {
            super.onNext(loginResponse);
            if (loginResponse.getFlag() == 0) {
                getMvpView().hideProgressDialog();
                getMvpView().loginSuccess();
            } else {
                getMvpView().loginFail();
            }
        }

        @Override
        public void onCompleted() {
            super.onCompleted();

        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
            getMvpView().hideProgressDialog();
        }
    }

    @Override
    public void detachView() {
        super.detachView();
        if (subscription != null) {
            subscription.unsubscribe();
        }
    }
}
