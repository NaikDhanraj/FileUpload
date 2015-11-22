package com.dssp.dhanrajnaik522.fileupload;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.dssp.dhanrajnaik522.fileupload.pojos.JsonExample;
import com.dssp.dhanrajnaik522.fileupload.retro.RestClient;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class FirstActivity extends AppCompatActivity  {

    RestClient restClient;

    Button camerabtn,imgvideobtn,retrobtn;
    Context context = FirstActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        camerabtn = (Button) findViewById(R.id.btn1);
        imgvideobtn = (Button) findViewById(R.id.btn2);
        retrobtn = (Button) findViewById(R.id.btn3);

        camerabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,ImageUpload.class);
                startActivity(i);
                Toast.makeText(FirstActivity.this, "gallery", Toast.LENGTH_SHORT).show();
            }
        });

        imgvideobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,CaptureImageVideo.class);
                startActivity(i);
                Toast.makeText(FirstActivity.this, "video or picture camera", Toast.LENGTH_SHORT).show();
            }
        });

        retrobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myretrofn();
            }
        });
    }

    private void myretrofn() {

        RestClient.get().getObjectWithNestedArraysAndObject(new Callback<JsonExample>() {
            @Override
            public void success(JsonExample student, Response response) {
                String result = "";
                result = "First name: " + student.getFirst() + 'n' +
                        "Last name: " + student.getLast() + 'n' +
                        "Age: " + student.getAge() + 'n' +
                        "Sex: " + student.getSex() + 'n' +
                        "Registered: " + student.getRegistered() + 'n';
                Log.e("mytest", "result :" + result);
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("mytest", "error :" + error.getResponse());
            }
        });
    }


}
