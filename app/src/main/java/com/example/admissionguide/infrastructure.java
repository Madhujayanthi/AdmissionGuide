package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class infrastructure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infrastructure);

        VideoView video = findViewById(R.id.video);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.college1);
        MediaController mediacontroller = new MediaController(this);
        mediacontroller.setAnchorView (video);
        video.setMediaController(mediacontroller);
    }
}