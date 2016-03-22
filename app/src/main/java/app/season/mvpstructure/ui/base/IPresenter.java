package app.season.mvpstructure.ui.base;

/**
 * Every presenter in the app must either implement this interface or extend BasePresenter
 * indicating the MvpView type that wants to be attached with.
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/21.
 */
public interface IPresenter<V extends IMvpView> {
    void attachView(V mvpView);

    void detachView();
}
