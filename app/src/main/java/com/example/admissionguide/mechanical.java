package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class mechanical extends AppCompatActivity {

    TextView mech_hdadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanical);

        mech_hdadd= findViewById(R.id.mech_hdadd);

           StringBuilder hd = new StringBuilder();
        String message4 =
                "Professor & HOD\n" +
                        "Department of Mechanical Engineering,\n" +
                        "Sona College of Technology,\n" +
                        "Salem - 636 005.";



        hd.append(message4);
        mech_hdadd.setText(hd.toString());


    }
}