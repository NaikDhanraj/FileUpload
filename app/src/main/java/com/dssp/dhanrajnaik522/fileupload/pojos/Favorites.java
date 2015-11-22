package com.dssp.dhanrajnaik522.fileupload.pojos;

/**
 * Created by dhanrajnaik522 on 11/22/2015.
 */
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Favorites {

    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("sport")
    @Expose
    private String sport;
    @SerializedName("food")
    @Expose
    private String food;

    /**
     *
     * @return
     * The color
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     * The color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     * The sport
     */
    public String getSport() {
        return sport;
    }

    /**
     *
     * @param sport
     * The sport
     */
    public void setSport(String sport) {
        this.sport = sport;
    }

    /**
     *
     * @return
     * The food
     */
    public String getFood() {
        return food;
    }

    /**
     *
     * @param food
     * The food
     */
    public void setFood(String food) {
        this.food = food;
    }

}
