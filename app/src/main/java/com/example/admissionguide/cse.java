package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class cse extends AppCompatActivity {

    TextView cse_hdadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);


        cse_hdadd= findViewById(R.id.cse_hdadd);

          StringBuilder hd = new StringBuilder();
        String message4 = "Dr.B.Sathiyabhama, M.Tech., Ph.D.,\n" +
                "Dept. of Computer Sciences and Engineering,\n" +
                "Sona College of Technology, Salem.\n" +
                "Ph: +91 - 427 - 4099744\n" +
                "Fax: +91 - 427 - 4099888\n" +
                "E-Mail : sathiyabhama@sonatech.ac.in";



        hd.append(message4);
        cse_hdadd.setText(hd.toString());

    }
}