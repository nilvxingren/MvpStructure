package app.season.mvpstructure.ui.base;

/**
 * Base interface that any class that wants to act as a View in the MVP (Model View Presenter)
 * pattern must implement.
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/21.
 */
public interface IMvpView {
    void showShortMessage(String message);

    void showLongMessage(String message);

    void showProgressDialog(String content, boolean canDismiss);

    void hideProgressDialog();
}
