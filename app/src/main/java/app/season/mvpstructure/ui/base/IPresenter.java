package app.season.mvpstructure.ui.base;

/**
 * Every presenter in the app must either implement this interface or extend BasePresenter
 * indicating the MvpView type that wants to be attached with.
 * <p/>
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public interface IPresenter<V extends IMvpView> {
    void attachView(V mvpView);

    void detachView();
}
