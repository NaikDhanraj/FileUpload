package com.dssp.dhanrajnaik522.fileupload.retro;

import com.dssp.dhanrajnaik522.fileupload.pojos.JsonExample;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.mime.TypedFile;

/**
 * Created by dhanrajnaik522 on 11/22/2015.
 */
public interface RestApi {
    @GET("/ObjectWithNestedArraysAndObject.txt")
    public void getObjectWithNestedArraysAndObject(Callback<JsonExample> student);

  //  @FormUrlEncoded
    @Multipart
    @POST("/file_upload.php")
    public void postImageorVideo(
                                @Part("filename") TypedFile filename,
                                Callback<FileResponse> fb

                                );

    @FormUrlEncoded
    public void postFile(
            @Body TypedFile file , Callback<FileResponse> fb
    );
}
