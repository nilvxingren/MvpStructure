package app.season.mvpstructure.data.bean;

import com.google.gson.annotations.SerializedName;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public class LoginRequest {
    @SerializedName("Phone")
    private String Account;

    @SerializedName("password")
    private String Password;

    public LoginRequest(String Account, String Password) {
        this.Account = Account;
        this.Password = Password;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String Account) {
        this.Account = Account;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}
