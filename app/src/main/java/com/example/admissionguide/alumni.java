package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class alumni extends AppCompatActivity {
    TextView m,alumni_web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumni);

        VideoView video = findViewById(R.id.video1);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.alumini1);
        MediaController mediacontroller = new MediaController(this);
        mediacontroller.setAnchorView (video);
        video.setMediaController(mediacontroller);



        //alumni web
        alumni_web= findViewById(R.id.alumni_website);
        alumni_web.setMovementMethod(LinkMovementMethod.getInstance());



    }
}