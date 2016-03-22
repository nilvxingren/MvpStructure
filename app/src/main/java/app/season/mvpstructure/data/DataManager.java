package app.season.mvpstructure.data;

import com.google.gson.Gson;

import javax.inject.Inject;
import javax.inject.Singleton;

import app.season.mvpstructure.data.bean.LoginRequest;
import app.season.mvpstructure.data.bean.LoginResponse;
import app.season.mvpstructure.data.remote.GitHubService;
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

    @Inject
    public DataManager(GitHubService mGitHubService) {
        this.mGitHubService = mGitHubService;
    }

    public Observable<LoginResponse> login(LoginRequest loginRequest) {
        return mGitHubService.login(0, "0", "", "login", new Gson().toJson(loginRequest));
    }
}
