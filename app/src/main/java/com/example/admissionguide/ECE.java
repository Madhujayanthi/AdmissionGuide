package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ECE extends AppCompatActivity {

    TextView ece_hdadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_c_e);


        ece_hdadd= findViewById(R.id.ece_hdadd);

            StringBuilder hd = new StringBuilder();
        String message4 ="Professor & HOD,\n" +
                "Department of Electronics and Communication Engg.\n" +
                "Sona College of Technology,\n" +
                "Salem - 636 005.\n" +
                " 91 - 427 - 4099777\n" +
                " +91 - 427 - 4099888\n" +
                " ece@sonatech.ac.in, sabeenian@sonatech.ac.in";


        hd.append(message4);
        ece_hdadd.setText(hd.toString());
    }
}