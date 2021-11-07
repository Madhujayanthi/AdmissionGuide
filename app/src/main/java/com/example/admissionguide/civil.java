package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class civil extends AppCompatActivity {

    TextView civil_hdadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);


        civil_hdadd= findViewById(R.id.civil_hdadd);

          StringBuilder hd = new StringBuilder();
        String message4 ="Professor, HOD / Dean – R & D\n" +
                "Department of Civil Engg.\n" +
                "Sona College of Technology,\n" +
                "Salem - 636 005.\n" +
                "Ph: +91 - 427 - 4099766\n" +
                "Fax: +91 - 427 - 4099888\n" +
                "E-Mail: civil@sonatech.ac.in";



        hd.append(message4);
        civil_hdadd.setText(hd.toString());
    }
}