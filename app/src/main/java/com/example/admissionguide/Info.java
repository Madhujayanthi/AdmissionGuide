package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    TextView it_hdadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        it_hdadd= findViewById(R.id.it_hdadd);

          StringBuilder hd = new StringBuilder();
        String message4 = "Dr.J.Akilandeswari M.E., Ph.D.\n" +
                "Department of Information Technology,\n" +
                "Sona College of Technology,\n" +
                "Salem - 636 005.\n" +
                "Ph: +91 - 427 - 4099755.\n" +
                "Fax: +91 - 427 - 4099888.\n" +
                "E-Mail:akilandeswari@sonatech.ac.in";



        hd.append(message4);
        it_hdadd.setText(hd.toString());

    }
}