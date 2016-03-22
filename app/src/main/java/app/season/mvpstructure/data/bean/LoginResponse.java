package app.season.mvpstructure.data.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Season on 2016/3/22.
 */
public class LoginResponse extends BaseResponse {
    @SerializedName("OnlineState")
    @Expose
    private String OnlineState;
    @SerializedName("UserInfo")
    @Expose
    private UserInfo UserInfo;
    @SerializedName("UserData")
    @Expose
    private UserData UserData;

    /**
     * @return The OnlineState
     */
    public String getOnlineState() {
        return OnlineState;
    }

    /**
     * @param OnlineState The OnlineState
     */
    public void setOnlineState(String OnlineState) {
        this.OnlineState = OnlineState;
    }

    /**
     * @return The UserInfo
     */
    public UserInfo getUserInfo() {
        return UserInfo;
    }

    /**
     * @param UserInfo The UserInfo
     */
    public void setUserInfo(UserInfo UserInfo) {
        this.UserInfo = UserInfo;
    }

    public UserData getUserData() {
        return UserData;
    }

    public void setUserData(UserData userData) {
        UserData = userData;
    }
}
