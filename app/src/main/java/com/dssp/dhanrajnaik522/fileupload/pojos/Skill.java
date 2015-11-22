package com.dssp.dhanrajnaik522.fileupload.pojos;

/**
 * Created by dhanrajnaik522 on 11/22/2015.
 */
import java.util.ArrayList;
import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Skill {

    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("tests")
    @Expose
    private List<Test> tests = new ArrayList<Test>();

    /**
     *
     * @return
     * The category
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @param category
     * The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     *
     * @return
     * The tests
     */
    public List<Test> getTests() {
        return tests;
    }

    /**
     *
     * @param tests
     * The tests
     */
    public void setTests(List<Test> tests) {
        this.tests = tests;
    }

}
