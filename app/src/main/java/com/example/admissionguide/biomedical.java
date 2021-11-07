package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class biomedical extends AppCompatActivity {

    TextView bio_hdadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biomedical);


        bio_hdadd= findViewById(R.id.bio_hdadd);

         StringBuilder hd = new StringBuilder();
        String message4 =
                "Professor & HOD,\n" +
                "Department of Bio Medical Engg.\n" +
                "Sona College of Technology,\n" +
                "Salem - 636 005.\n" +
                " 91 - 427 - 4099777\n" +
                " +91 - 427 - 4099888";



        hd.append(message4);
        bio_hdadd.setText(hd.toString());
    }
}