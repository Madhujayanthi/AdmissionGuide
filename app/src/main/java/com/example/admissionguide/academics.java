package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class academics extends AppCompatActivity {
    TextView a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);
        TextView mTitleWindow = (TextView) findViewById(R.id.titleWindow);
        a = findViewById(R.id.message1);
        ImageView mImageView = (ImageView) findViewById(R.id.imageWindow) ;
        StringBuilder string1 = new StringBuilder();
        String message1 ="The Academic schedule for B.E/B.Tech, M.E / M.Tech, MBA and MCA programmes for every semester will be discussed in a meeting and approved by Principal atleast two weeks before the commencement of regular class hours in a semester.\n" +"\n"+
                "The schedule comprises of date of commencement of class work in a semester, Duration of Continuous Internal Examinations, Last working day for the semester, total number of working days in the semester, Duration of Practical examinations, Study period, Date of commencement of Semester End Examination, tentative reopening of next semester etc.";
        string1.append(message1);
        a.setText(message1.toString());


        b = findViewById(R.id.message2);
        StringBuilder string2 = new StringBuilder();
        String message2 ="Students should wear ID CARD inside the campus.\n" +"\n"+
                "Students should not disturb the classes by unnecessarily     \n" +"\n"+
                "making noise, standing on the corridor, lounge, etc.\n" +"\n"+
                "Students are strictly forbidden from smoking anywhere in the campus.\n" +"\n"+
                "Students are not allowed to use mobile phones anywhere in the campus.\n" +"\n"+
                "Students are allowed to organise or attend any meeting in the institution or outside only with the prior permission of  the Principal / HOD.\n" +"\n"+
                "Students may use two-wheelers of capacity less than 100 cc only.  They      should have valid driving licence and should ride within the speed limit of 10 km/hr within the campus. Students should wear safety helmets.\n" +"\n"+
                "Students should handle college property carefully without causing any damage.";
        string2.append(message2);
        b.setText(message2.toString());


    }
}