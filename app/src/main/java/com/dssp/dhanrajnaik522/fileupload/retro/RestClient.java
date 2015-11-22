package com.dssp.dhanrajnaik522.fileupload.retro;

import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by dhanrajnaik522 on 11/22/2015.
 */
public class RestClient {

    private static RestApi REST_CLIENT;
    private static String ROOT = "http://www.djprachi.16mb.com/AndroidApps/FileUpload";


    static {
        setupRestClient();
    }

    public static RestApi get() {
        return REST_CLIENT;
    }

    private static void setupRestClient() {

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(ROOT)
                .setClient(new OkClient(new OkHttpClient()))
              //  .setRequestInterceptor(new SessionRequestInterceptor())
                .build();

        REST_CLIENT = restAdapter.create(RestApi.class);
    }
}
