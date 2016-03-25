package app.season.mvpstructure.ui.login;

import app.season.mvpstructure.ui.base.IMvpView;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public interface ILoginMvpView extends IMvpView {
    void loginSuccess();

    void loginFail();
}
