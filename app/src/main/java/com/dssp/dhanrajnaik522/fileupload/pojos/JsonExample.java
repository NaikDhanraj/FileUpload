package com.dssp.dhanrajnaik522.fileupload.pojos;

/**
 * Created by dhanrajnaik522 on 11/22/2015.
 */
// JsonExample
import java.util.ArrayList;
import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class JsonExample {

    @SerializedName("first")
    @Expose
    private String first;
    @SerializedName("last")
    @Expose
    private String last;
    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("sex")
    @Expose
    private String sex;
    @SerializedName("salary")
    @Expose
    private Integer salary;
    @SerializedName("registered")
    @Expose
    private Boolean registered;
    @SerializedName("interests")
    @Expose
    private List<String> interests = new ArrayList<String>();
    @SerializedName("favorites")
    @Expose
    private Favorites favorites;
    @SerializedName("skills")
    @Expose
    private List<Skill> skills = new ArrayList<Skill>();

    /**
     *
     * @return
     * The first
     */
    public String getFirst() {
        return first;
    }

    /**
     *
     * @param first
     * The first
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     *
     * @return
     * The last
     */
    public String getLast() {
        return last;
    }

    /**
     *
     * @param last
     * The last
     */
    public void setLast(String last) {
        this.last = last;
    }

    /**
     *
     * @return
     * The age
     */
    public Integer getAge() {
        return age;
    }

    /**
     *
     * @param age
     * The age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     *
     * @return
     * The sex
     */
    public String getSex() {
        return sex;
    }

    /**
     *
     * @param sex
     * The sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     *
     * @return
     * The salary
     */
    public Integer getSalary() {
        return salary;
    }

    /**
     *
     * @param salary
     * The salary
     */
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    /**
     *
     * @return
     * The registered
     */
    public Boolean getRegistered() {
        return registered;
    }

    /**
     *
     * @param registered
     * The registered
     */
    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }

    /**
     *
     * @return
     * The interests
     */
    public List<String> getInterests() {
        return interests;
    }

    /**
     *
     * @param interests
     * The interests
     */
    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    /**
     *
     * @return
     * The favorites
     */
    public Favorites getFavorites() {
        return favorites;
    }

    /**
     *
     * @param favorites
     * The favorites
     */
    public void setFavorites(Favorites favorites) {
        this.favorites = favorites;
    }

    /**
     *
     * @return
     * The skills
     */
    public List<Skill> getSkills() {
        return skills;
    }

    /**
     *
     * @param skills
     * The skills
     */
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

}
