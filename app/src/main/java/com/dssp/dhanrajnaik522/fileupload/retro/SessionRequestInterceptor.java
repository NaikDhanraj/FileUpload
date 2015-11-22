package com.dssp.dhanrajnaik522.fileupload.retro;

import retrofit.RequestInterceptor;

/**
 * Created by dhanrajnaik522 on 11/22/2015.
 */
public class SessionRequestInterceptor implements RequestInterceptor {
    private static final String TAG = SessionRequestInterceptor.class.getSimpleName();

    @Override
    public void intercept(RequestFacade request) {
        request.addHeader("Content-Type", "application/json");//you can add header here if you need in your api
       // request.addHeader("Content-Disposition","form-data");
    }
}
