package app.season.mvpstructure.ui.base;

/**
 * Base interface that any class that wants to act as a View in the MVP (Model View Presenter)
 * pattern must implement.
 * <p/>
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public interface IMvpView {
    void showShortMessage(String message);

    void showLongMessage(String message);

    void showProgressDialog(String content, boolean canDismiss);

    void hideProgressDialog();
}
