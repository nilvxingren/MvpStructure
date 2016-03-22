
package app.season.mvpstructure.data.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInfo {

    @SerializedName("Name")
    @Expose
    private String Name;
    @SerializedName("UserCode")
    @Expose
    private String UserCode;
    @SerializedName("Phone")
    @Expose
    private String Phone;
    @SerializedName("OtherName")
    @Expose
    private String OtherName;
    @SerializedName("Password")
    @Expose
    private String Password;
    @SerializedName("PasswordSalt")
    @Expose
    private String PasswordSalt;
    @SerializedName("Email")
    @Expose
    private String Email;
    @SerializedName("Sex")
    @Expose
    private int Sex;
    @SerializedName("Status")
    @Expose
    private int Status;
    @SerializedName("LeaderFlag")
    @Expose
    private int LeaderFlag;
    @SerializedName("FieldFlag")
    @Expose
    private int FieldFlag;
    @SerializedName("RegDate")
    @Expose
    private String RegDate;
    @SerializedName("Deleted")
    @Expose
    private boolean Deleted;
    @SerializedName("PushMssage")
    @Expose
    private boolean PushMssage;
    @SerializedName("UserTotal")
    @Expose
    private int UserTotal;
    @SerializedName("WeiXin")
    @Expose
    private String WeiXin;
    @SerializedName("OnlineState")
    @Expose
    private String OnlineState;
    @SerializedName("HeadPhoto")
    @Expose
    private String HeadPhoto;
    @SerializedName("Id")
    @Expose
    private int Id;


    /**
     * @return The Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name The Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return The UserCode
     */
    public String getUserCode() {
        return UserCode;
    }

    /**
     * @param UserCode The UserCode
     */
    public void setUserCode(String UserCode) {
        this.UserCode = UserCode;
    }

    /**
     * @return The Phone
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * @param Phone The Phone
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * @return The OtherName
     */
    public String getOtherName() {
        return OtherName;
    }

    /**
     * @param OtherName The OtherName
     */
    public void setOtherName(String OtherName) {
        this.OtherName = OtherName;
    }

    /**
     * @return The Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password The Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return The PasswordSalt
     */
    public String getPasswordSalt() {
        return PasswordSalt;
    }

    /**
     * @param PasswordSalt The PasswordSalt
     */
    public void setPasswordSalt(String PasswordSalt) {
        this.PasswordSalt = PasswordSalt;
    }

    /**
     * @return The Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email The Email
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return The Sex
     */
    public int getSex() {
        return Sex;
    }

    /**
     * @param Sex The Sex
     */
    public void setSex(int Sex) {
        this.Sex = Sex;
    }

    /**
     * @return The Status
     */
    public int getStatus() {
        return Status;
    }

    /**
     * @param Status The Status
     */
    public void setStatus(int Status) {
        this.Status = Status;
    }

    /**
     * @return The LeaderFlag
     */
    public int getLeaderFlag() {
        return LeaderFlag;
    }

    /**
     * @param LeaderFlag The LeaderFlag
     */
    public void setLeaderFlag(int LeaderFlag) {
        this.LeaderFlag = LeaderFlag;
    }

    /**
     * @return The FieldFlag
     */
    public int getFieldFlag() {
        return FieldFlag;
    }

    /**
     * @param FieldFlag The FieldFlag
     */
    public void setFieldFlag(int FieldFlag) {
        this.FieldFlag = FieldFlag;
    }

    /**
     * @return The RegDate
     */
    public String getRegDate() {
        return RegDate;
    }

    /**
     * @param RegDate The RegDate
     */
    public void setRegDate(String RegDate) {
        this.RegDate = RegDate;
    }

    /**
     * @return The Deleted
     */
    public boolean getDeleted() {
        return Deleted;
    }

    /**
     * @param Deleted The Deleted
     */
    public void setDeleted(boolean Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * @return The PushMssage
     */
    public boolean getPushMssage() {
        return PushMssage;
    }

    /**
     * @param PushMssage The PushMssage
     */
    public void setPushMssage(boolean PushMssage) {
        this.PushMssage = PushMssage;
    }

    /**
     * @return The UserTotal
     */
    public int getUserTotal() {
        return UserTotal;
    }

    /**
     * @param UserTotal The UserTotal
     */
    public void setUserTotal(int UserTotal) {
        this.UserTotal = UserTotal;
    }

    /**
     * @return The WeiXin
     */
    public String getWeiXin() {
        return WeiXin;
    }

    /**
     * @param WeiXin The WeiXin
     */
    public void setWeiXin(String WeiXin) {
        this.WeiXin = WeiXin;
    }

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
     * @return The HeadPhoto
     */
    public String getHeadPhoto() {
        return HeadPhoto;
    }

    /**
     * @param HeadPhoto The HeadPhoto
     */
    public void setHeadPhoto(String HeadPhoto) {
        this.HeadPhoto = HeadPhoto;
    }

    /**
     * @return The Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id The Id
     */
    public void setId(int Id) {
        this.Id = Id;
    }

}
