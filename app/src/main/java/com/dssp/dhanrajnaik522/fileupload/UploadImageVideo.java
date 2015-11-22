package com.dssp.dhanrajnaik522.fileupload;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.dssp.dhanrajnaik522.fileupload.retro.FileResponse;
import com.dssp.dhanrajnaik522.fileupload.retro.RestClient;

import java.io.File;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.mime.TypedFile;

/**
 * Created by dhanrajnaik522 on 11/22/2015.
 */
public class UploadImageVideo extends AppCompatActivity {

    private String TAG ="UploadImageVideo";
    private ProgressBar progressBar;
    private String filePath = null;
    private TextView txtPercentage;
    private ImageView imgPreview;
    private VideoView vidPreview;
    private Button btnUpload;
    long totalSize = 0;
    ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_cam_video);

        txtPercentage = (TextView) findViewById(R.id.txtPercentage);
        btnUpload = (Button) findViewById(R.id.btnUpload);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        imgPreview = (ImageView) findViewById(R.id.imgPreview);
        vidPreview = (VideoView) findViewById(R.id.videoPreview);

        // Receiving the data from previous activity
        Intent i = getIntent();
        // image or video path that is captured in previous activity
        filePath = i.getStringExtra("filePath");
        // boolean flag to identify the media type, image or video
        boolean isImage = i.getBooleanExtra("isImage", true);

        if (filePath != null) {
            // Displaying the image or video on the screen
            previewMedia(isImage);
        } else {
            Toast.makeText(getApplicationContext(), "Sorry, file path is missing!", Toast.LENGTH_LONG).show();
        }

        btnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Progress dialog
                pDialog = new ProgressDialog(UploadImageVideo.this);
                pDialog.setCancelable(false);
                pDialog.setMessage("Uploading ...");
                pDialog.show();
                uploadFileNow();
            }
        });

    }

    private void uploadFileNow() {
        File photo = new File(filePath );
        Log.e("mytest","filepath  "+filePath);
        Log.e("mytest","fotopath  "+photo);
        TypedFile image = new TypedFile("application/form-data", photo);

        RestClient.get().postImageorVideo(image, new Callback<FileResponse>() {
            @Override
            public void success(FileResponse fileResponse, Response response) {
                pDialog.dismiss();
                Log.e("mytest", "success reason :" + response.getReason());
                Log.e("mytest", "success filename2 :" + response.getBody());
                Log.e("mytest", "success message:" + fileResponse.getMessage());
                Log.e("mytest", "success path :" + fileResponse.getFilePath());
                Toast.makeText(UploadImageVideo.this, "success", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void failure(RetrofitError error) {
                pDialog.dismiss();
                Log.e("mytest", "error :" + error.getResponse());
                Log.e("mytest", "error2 :" + error.getMessage());
                Toast.makeText(UploadImageVideo.this, "failure", Toast.LENGTH_SHORT).show();
            }
        });

    }

    //Displaying captured image/video on the screen
    private void previewMedia(boolean isImage) {
        // Checking whether captured media is image or video
        if (isImage) {
            imgPreview.setVisibility(View.VISIBLE);
            vidPreview.setVisibility(View.GONE);
            // bimatp factory
            BitmapFactory.Options options = new BitmapFactory.Options();

            // down sizing image as it throws OutOfMemory Exception for larger
            // images
            options.inSampleSize = 8;

            final Bitmap bitmap = BitmapFactory.decodeFile(filePath, options);

            imgPreview.setImageBitmap(bitmap);
        } else {
            imgPreview.setVisibility(View.GONE);
            vidPreview.setVisibility(View.VISIBLE);
            vidPreview.setVideoPath(filePath);
            // start playing
            vidPreview.start();
        }
    }
}
