package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class EEE extends AppCompatActivity {

    TextView eee_hdadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_e_e);


        eee_hdadd = findViewById(R.id.eee_hdadd);

        StringBuilder hdadd= new StringBuilder();

          String message4=
                "Dr.S.Padma, M.E., Ph.D.\n" +
                        "Department of Electrical & Electronics Engg.\n" +
                        "Sona College of Technology,\n" +
                        "Salem - 636 005.";


        hdadd.append(message4);
        eee_hdadd.setText(hdadd.toString());



    }
}