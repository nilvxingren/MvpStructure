package app.season.mvpstructure.data;

import com.google.gson.Gson;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import app.season.mvpstructure.data.bean.LoginRequest;
import app.season.mvpstructure.data.bean.LoginResponse;
import app.season.mvpstructure.data.bean.Repo;
import app.season.mvpstructure.data.remote.GitHubService;
import app.season.mvpstructure.data.remote.KtLoginService;
import rx.Observable;

/**
 * the DataManager control all data include local、remote
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/21.
 */
@Singleton
public class DataManager {
    private final GitHubService mGitHubService;
    private final KtLoginService mKtLoginService;

    @Inject
    public DataManager(GitHubService mGitHubService, KtLoginService mKtLoginService) {
        this.mGitHubService = mGitHubService;
        this.mKtLoginService = mKtLoginService;
    }

    public Observable<LoginResponse> login(LoginRequest loginRequest) {
        return mKtLoginService.login(0, "0", "", "login", new Gson().toJson(loginRequest));
    }

    public Observable<List<Repo>> listRepos(String userName) {
        return mGitHubService.listRepos(userName);
    }
}
