package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class placement extends AppCompatActivity {
    TextView m,n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placement);
        m=findViewById(R.id.placement_2);
        StringBuilder string = new StringBuilder();
        String Message =
                "At SCT, we always believe in equipping our students with the right talent and personality to face the industry requirements.\n"
                + "\n" +
                "Our focus on placement centers on creating new approaches to attract the best from the industry to our campus at Sona, Placement time is not a mere annual ritual; it is a time for showcasing the very best in our young engineers to the industrial world.\n"
                + "\n" +
                "The Placement & Training Cell functions with the primary aim of placing students in top-notch companies even before they have completed their courses.\n"
                + "\n" +
                "The Placement & Training cell goes all out to train the students to meet the high industry expectations.\n" +
                "\n" +
                 "\n" +
                "CONTACT\n" +
                "\n" +
                "Dr.B.Saravanan (Engineering)\n" +
                " 0427 - 4099979 / +91 9442601304\n" +
                "\n" +
                "Dr.D.Raja (Fashion Tech)\n" +
                " 0427 - 4099835\n" +
                "\n" +
                "Dr.D.Immanuel (MBA)\n" +
                " 0427 - 4099818\n" +
                "\n" +
                "Mr.P.Arunkumar (MCA)\n" +
                " 0427 - 4099827" + "\n" ;
        string.append(Message);

        m.setText(string.toString());

        n=findViewById(R.id.placement_3);
        StringBuilder string1 = new StringBuilder();
        String Message1 =
                "Create awareness about “career planning\" and \"career mapping\" among the students.\n" +
                "\n" +
                "Equip the student with life skills.\n" +
                "\n" +
                "Train the students on “Personality development.\n" +
                "\n" +
                "Organize Various Training Programmes to train the students in the areas of Quantitative Aptitude, Logical Reasoning and Verbal reasoning through the reputed external training organizations and in-house trainers.\n" +
                "\n" +
                "Trainthe students through Mock Interviews to perform well in the professional interviews as per the expectations of the corporate world.\n" +
                "\n" +
                "Train the students on group discussion techniques\n" +
                "\n" +
                "Conduct online tests and written aptitude tests.\n";
        string1.append(Message1);
        n.setText(string.toString());
    }
}