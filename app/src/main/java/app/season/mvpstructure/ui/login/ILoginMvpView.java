package app.season.mvpstructure.ui.login;

import app.season.mvpstructure.ui.base.IMvpView;

/**
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/22.
 */
public interface ILoginMvpView extends IMvpView {
    void loginSuccess();

    void loginFail();
}
