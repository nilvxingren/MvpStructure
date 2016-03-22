
package app.season.mvpstructure.data.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserData {

    @SerializedName("UserId")
    @Expose
    private Integer UserId;
    @SerializedName("Brothday")
    @Expose
    private String Brothday;
    @SerializedName("High")
    @Expose
    private Integer High;
    @SerializedName("Weight")
    @Expose
    private Integer Weight;
    @SerializedName("Position")
    @Expose
    private String Position;
    @SerializedName("Level")
    @Expose
    private Integer Level;
    @SerializedName("Speed")
    @Expose
    private Integer Speed;
    @SerializedName("Jump")
    @Expose
    private Integer Jump;
    @SerializedName("Power")
    @Expose
    private Integer Power;
    @SerializedName("Shoot")
    @Expose
    private Integer Shoot;
    @SerializedName("Pass")
    @Expose
    private Integer Pass;
    @SerializedName("Point")
    @Expose
    private Integer Point;
    @SerializedName("FreeKick")
    @Expose
    private Integer FreeKick;
    @SerializedName("Endurance")
    @Expose
    private Integer Physical;
    @SerializedName("TestType")
    @Expose
    private Integer TestType;
    @SerializedName("TestDate")
    @Expose
    private String TestDate;
    @SerializedName("TestUserId")
    @Expose
    private Integer TestUserId;
    @SerializedName("Deleted")
    @Expose
    private Boolean Deleted;
    @SerializedName("HabitualFoot")
    @Expose
    private Integer HabitualFoot;
    @SerializedName("Age")
    @Expose
    private Integer Age;
    @SerializedName("CityId")
    @Expose
    private Integer CityId = 0;
    @SerializedName("CommunityId")
    @Expose
    private Integer CommunityId;
    @SerializedName("Adress")
    @Expose
    private String Adress;
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
     * @return The UserId
     */
    public Integer getUserId() {
        return UserId;
    }

    /**
     * @param UserId The UserId
     */
    public void setUserId(Integer UserId) {
        this.UserId = UserId;
    }

    /**
     * @return The Brothday
     */
    public String getBrothday() {
        return Brothday;
    }

    /**
     * @param Brothday The Brothday
     */
    public void setBrothday(String Brothday) {
        this.Brothday = Brothday;
    }

    /**
     * @return The High
     */
    public Integer getHigh() {
        return High;
    }

    /**
     * @param High The High
     */
    public void setHigh(Integer High) {
        this.High = High;
    }

    /**
     * @return The Weight
     */
    public Integer getWeight() {
        return Weight;
    }

    /**
     * @param Weight The Weight
     */
    public void setWeight(Integer Weight) {
        this.Weight = Weight;
    }

    /**
     * @return The Position
     */
    public String getPosition() {
        return Position;
    }

    /**
     * @param Position The Position
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * @return The Level
     */
    public Integer getLevel() {
        return Level;
    }

    /**
     * @param Level The Level
     */
    public void setLevel(Integer Level) {
        this.Level = Level;
    }

    /**
     * @return The Speed
     */
    public Integer getSpeed() {
        return Speed;
    }

    /**
     * @param Speed The Speed
     */
    public void setSpeed(Integer Speed) {
        this.Speed = Speed;
    }

    /**
     * @return The Jump
     */
    public Integer getJump() {
        return Jump;
    }

    /**
     * @param Jump The Jump
     */
    public void setJump(Integer Jump) {
        this.Jump = Jump;
    }

    /**
     * @return The Power
     */
    public Integer getPower() {
        return Power;
    }

    /**
     * @param Power The Power
     */
    public void setPower(Integer Power) {
        this.Power = Power;
    }

    /**
     * @return The Shoot
     */
    public Integer getShoot() {
        return Shoot;
    }

    /**
     * @param Shoot The Shoot
     */
    public void setShoot(Integer Shoot) {
        this.Shoot = Shoot;
    }

    /**
     * @return The Pass
     */
    public Integer getPass() {
        return Pass;
    }

    /**
     * @param Pass The Pass
     */
    public void setPass(Integer Pass) {
        this.Pass = Pass;
    }

    /**
     * @return The Point
     */
    public Integer getPoint() {
        return Point;
    }

    /**
     * @param Point The Point
     */
    public void setPoint(Integer Point) {
        this.Point = Point;
    }

    /**
     * @return The FreeKick
     */
    public Integer getFreeKick() {
        return FreeKick;
    }

    /**
     * @param FreeKick The FreeKick
     */
    public void setFreeKick(Integer FreeKick) {
        this.FreeKick = FreeKick;
    }

    /**
     * @return The Physical
     */
    public Integer getPhysical() {
        return Physical;
    }

    /**
     * @param Endurance The Physical
     */
    public void setPhysical(Integer Endurance) {
        this.Physical = Endurance;
    }

    /**
     * @return The TestType
     */
    public Integer getTestType() {
        return TestType;
    }

    /**
     * @param TestType The TestType
     */
    public void setTestType(Integer TestType) {
        this.TestType = TestType;
    }

    /**
     * @return The TestDate
     */
    public String getTestDate() {
        return TestDate;
    }

    /**
     * @param TestDate The TestDate
     */
    public void setTestDate(String TestDate) {
        this.TestDate = TestDate;
    }

    /**
     * @return The TestUserId
     */
    public Integer getTestUserId() {
        return TestUserId;
    }

    /**
     * @param TestUserId The TestUserId
     */
    public void setTestUserId(Integer TestUserId) {
        this.TestUserId = TestUserId;
    }

    /**
     * @return The Deleted
     */
    public Boolean getDeleted() {
        return Deleted;
    }

    /**
     * @param Deleted The Deleted
     */
    public void setDeleted(Boolean Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * @return The HabitualFoot
     */
    public Integer getHabitualFoot() {
        return HabitualFoot;
    }

    /**
     * @param HabitualFoot The HabitualFoot
     */
    public void setHabitualFoot(Integer HabitualFoot) {
        this.HabitualFoot = HabitualFoot;
    }

    /**
     * @return The Age
     */
    public Integer getAge() {
        return Age;
    }

    /**
     * @param Age The Age
     */
    public void setAge(Integer Age) {
        this.Age = Age;
    }

    /**
     * @return The CityId
     */
    public Integer getCityId() {
        return CityId;
    }

    /**
     * @param CityId The CityId
     */
    public void setCityId(Integer CityId) {
        this.CityId = CityId;
    }

    /**
     * @return The CommunityId
     */
    public Integer getCommunityId() {
        return CommunityId;
    }

    /**
     * @param CommunityId The CommunityId
     */
    public void setCommunityId(Integer CommunityId) {
        this.CommunityId = CommunityId;
    }

    /**
     * @return The Adress
     */
    public String getAdress() {
        return Adress;
    }

    /**
     * @param Adress The Adress
     */
    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    /**
     * @return The Id
     */
    public Integer getId() {
        return Id;
    }

    /**
     * @param Id The Id
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

}
