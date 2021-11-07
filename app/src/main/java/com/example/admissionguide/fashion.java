package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class fashion extends AppCompatActivity {
    TextView fashion_hdadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion);


        fashion_hdadd= findViewById(R.id.fashion_hdadd);

           StringBuilder hd = new StringBuilder();
        String message4 = "Dr. D. Raja, Ph.D\n" +
                "Department of Fashion Technology,\n" +
                "Sona College of Technology, Salem - 636 005,\n" +
                "Tamilnadu, India\n" +
                "Ph: +91 - 427 - 4099999 / 4099835\n" +
                "Fax: +91 - 427 - 4099888\n" +
                "E-Mail : sonaft@sonatech.ac.in";



        hd.append(message4);
        fashion_hdadd.setText(hd.toString());
    }
}