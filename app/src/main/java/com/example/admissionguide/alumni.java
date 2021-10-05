package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class alumni extends AppCompatActivity {
    TextView m,alumni_web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumni);




        m =findViewById(R.id.alumni_text1);
        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "           The glory and strength of an institute lies with its alumni.\n" +
                "since they are the ambassadors to spread their institute's name far and wide to build a constructive future for their alma-mater while they build their own.\n" +
                "SONA ALUMNI ASSOCIATION was established in 2018 officially under Tamilnadu Government to establish a strong bond with the alumni and to take care of alumni affairs. It was earlier functioning as alumni cell.\n" +
                "The major objective of the SONA ALUMNI ASSOCIATION (SAA) is to enhance the coordination between Sona Group of institutions and its alumni and build a strong interactive base between the alumni and faculties, establish chapters at national and international level, to maintain the database confidentially and respond regularly to the interests of Sona Alumni.\n" +
                "Once a student earns a degree from their university, they are then officially considered alumni of that university.\n" +
                "Once a person is considered alumni of a university, they then have the option to be a part of that universities alumni association. An alumni association is an association that consists of graduates and former students of a particular university.\n" +
                "There is not just one alumni association per school or university, there are also alumni associations that are formed for different departments of a university such as academics, athletics, or recreational sports.\n" +
                "Once a former graduate or student is a part of an alumni association, there are many different activities that they can do.\n" +
                "For the most part, members of alumni associations often organize social events, publish newsletters and magazines, and raise funds for the organization in order to put on special events that benefit their school";

        stringBuilder.append(someMessage);

        m.setText(stringBuilder.toString());
        //alumni web
        alumni_web= findViewById(R.id.alumni_website);
        alumni_web.setMovementMethod(LinkMovementMethod.getInstance());



    }
}