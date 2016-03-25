package app.season.mvpstructure.data.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public class LoginResponse {
    @SerializedName("Flag")
    @Expose
    private int Flag;
    @SerializedName("Hint")
    @Expose
    private String Hint;
    @SerializedName("Id")
    @Expose
    private int id;


    /**
     * @return The Flag
     */
    public int getFlag() {
        return Flag;
    }

    /**
     * @param Flag The Flag
     */
    public void setFlag(int Flag) {
        this.Flag = Flag;
    }

    /**
     * @return The Hint
     */
    public String getHint() {
        return Hint;
    }

    /**
     * @param Hint The Hint
     */
    public void setHint(String Hint) {
        this.Hint = Hint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
