package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class academics extends AppCompatActivity {
    TextView a,b,c,d,e,f,g,h;

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


        c = findViewById(R.id.message3);
        StringBuilder string3 = new StringBuilder();
        String message3 ="Faculty members shall take attendance at the beginning of each period\n" +"\n"+
                "A student who is not in the class room when the attendance is taken shall be  marked absent.\n" +"\n"+
                "Student attendance will be computed at the end of every month and indicated in the progress report and also put up on the notice board.\n" +"\n"+
                "A minimum of 80% attendance is required to appear for the semester end examinations. Students who do not have the minimum attendance will not be allowed to appear for the semester end examinations.";
        string3.append(message3);
        c.setText(message3.toString());


        d = findViewById(R.id.message4);
        StringBuilder string4 = new StringBuilder();
        String message4 ="Students should attend the classes regularly.\n" +"\n"+
                "However, leave of absence  for valid reasons only will have to be obtained from the Class Counsellor in advance. In case of sickness, a medical certificate should accompany the leave application that is submitted upon return from illness.\n" +"\n"+
                "Attendance shall be calculated on the basis of periods i.e. in terms of the lecture or lab periods attended.\n" + "\n"+
                "Attendance for the examinations and CIE tests is compulsory. Absence from the tests will affect the sessional marks awarded as internal assessment by the staff members concerned.";
        string4.append(message4);
        d.setText(message4.toString());


        e = findViewById(R.id.message5);
        StringBuilder string5 = new StringBuilder();
        String message5 ="All Sundays, First and Third Saturdays and holidays notified by the college";
        string5.append(message5);
        e.setText(message5.toString());


        f = findViewById(R.id.message6);
        StringBuilder string6 = new StringBuilder();
        String message6 ="UNIVERSITY GRANTS COMMISSION (UGC) REGULATIONS ON CURBING THE MENACE OF RAGGING IN HIGHER EDUCATIONAL INSTITUTIONS 2009\n" +
                "(under Section 26(1)(g) of theUniversity Grants Commission Act, 1956)";
        string6.append(message6);
        f.setText(message6.toString());

        g = findViewById(R.id.message7);
        StringBuilder string7 = new StringBuilder();
        String message7 ="Any conduct by any student or students whether by words spoken or written or by an act which has the effect of teasing, treating or handling with rudeness a fresher or other student.\n" +"\n"+
                "Indulging in rowdy or indiscipline activities by any student or students which causes or is likely to cause annoyance, hardship, physical or psychological harm or to raise fear or apprehension thereof in any fresher or any other student.\n" +"\n"+
                "Asking any student to do any act which such student will not in the ordinary course do and which has the effect of causing or generating a sense of shame, or torment or embarrassment so as to adversely affect the physique or psyche of such fresher or any other student.";
        string7.append(message7);
        g.setText(message7.toString());

        h = findViewById(R.id.message8);
        StringBuilder string8 = new StringBuilder();
        String message8 ="Suspension from attending classes and academic privileges\n" +"\n"+
                "Withholding / withdrawing scholarship/fellowship and other benefit\n" +"\n"+
                "Debarring from appearing in any test / examination or other evaluation process.\n" +"\n"+
                "Withholding results.\n" +"\n"+
                "Debarring from representing the institution in any regional, national or international meet, tournament, youth festival, etc.\n" +"\n"+
                "Suspension / expulsion from the hostel.\n" +"\n"+
                "Cancellation of admission.\n" +"\n"+
                "Suspension from the institution for period ranging from one to four semesters.\n" +"\n"+
                "Expulsion from the institution and consequent debarring from admission to any other institution for a specified period.";
        string8.append(message8);
        h.setText(message8.toString());


    }
}