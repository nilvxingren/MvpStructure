package app.season.mvpstructure.data;

import com.google.gson.Gson;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import app.season.mvpstructure.data.bean.InTheatersResponse;
import app.season.mvpstructure.data.bean.LoginRequest;
import app.season.mvpstructure.data.bean.LoginResponse;
import app.season.mvpstructure.data.bean.Note;
import app.season.mvpstructure.data.bean.Repo;
import app.season.mvpstructure.data.local.DataBaseHelper;
import app.season.mvpstructure.data.local.PreferencesHelper;
import app.season.mvpstructure.data.remote.DouBanService;
import app.season.mvpstructure.data.remote.GitHubService;
import app.season.mvpstructure.data.remote.KtLoginService;
import rx.Observable;

/**
 * the DataManager control all data include local、remote
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
@Singleton
public class DataManager {
    private final GitHubService mGitHubService;
    private final KtLoginService mKtLoginService;
    private final PreferencesHelper mPreferencesHelper;
    private final DataBaseHelper mDataBaseHelper;
    private final DouBanService mDouBanService;

    @Inject
    public DataManager(GitHubService mGitHubService,
                       KtLoginService mKtLoginService,
                       PreferencesHelper preferencesHelper,
                       DataBaseHelper dataBaseHelper, DouBanService douBanService) {
        this.mGitHubService = mGitHubService;
        this.mKtLoginService = mKtLoginService;
        this.mPreferencesHelper = preferencesHelper;
        this.mDataBaseHelper = dataBaseHelper;
        mDouBanService = douBanService;
    }

    public Observable<LoginResponse> login(LoginRequest loginRequest) {
        return mKtLoginService.login(0, "0", "", "login", new Gson().toJson(loginRequest));
    }

    public Observable<List<Repo>> listRepos(String userName) {
        return mGitHubService.listRepos(userName);
    }

    public Observable<Note> queryAllNotes() {
        return mDataBaseHelper.queryAllNotes();
    }

    public long insertNote(Note note) {
        return mDataBaseHelper.insertNote(note);
    }

    public int deleteNote(int rowId) {
        return mDataBaseHelper.deleteNote(rowId);
    }

    /*****DouBan*****/
    public Observable<InTheatersResponse> getInTheaters(String city) {
        return mDouBanService.getInTheaters(city);
    }

}
