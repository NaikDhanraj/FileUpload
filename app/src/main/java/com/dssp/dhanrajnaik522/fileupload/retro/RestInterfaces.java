package com.dssp.dhanrajnaik522.fileupload.retro;

import com.dssp.dhanrajnaik522.fileupload.pojos.JsonExample;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by dhanrajnaik522 on 11/22/2015.
 */
public interface RestInterfaces {

//    @GET("/Array.txt")
//    public void getArray(Callback<List<String>> items);
//
//    @GET("/ArrayWithObjects.txt")
//    public void getArrayWithObjects(Callback<List<JsonExample>> callback);
//
//    @GET("/Object.txt")
//    public void getObject(Callback<JsonExample> student);
//
//    @GET("/ObjectWithNestedArray.txt")
//    public void getObjectWithNestedArray(Callback<JsonExample> student);
//
//    @GET("/ObjectWithNestedObject.txt")
//    public void getObjectWithNestedObject(Callback<JsonExample> student);

    @GET("/ObjectWithNestedArraysAndObject.json")
    public void getObjectWithNestedArraysAndObject(Callback<JsonExample> student);
}
