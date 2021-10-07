package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class coe extends AppCompatActivity {
    TextView b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coe);

        TextView mTitleWindow = (TextView) findViewById(R.id.titleWindow);
        b = findViewById(R.id.messageWindow);
        ImageView mImageView = (ImageView) findViewById(R.id.imageWindow) ;



        StringBuilder mess = new StringBuilder();
        String Message = " The Office of the Controller of Examinations shall be responsible for assessing continuous learning process of the students by maintaining best quality and standard in examination process and ensuring confidentiality. It is the duty of the office of the Controller of Examinations to arrange, prepare, schedule, conduct, publish and maintain records of CIE and Semester End Examinations of the students of all UG, PG and Ph.D programmes.\n" +
                "\n" +
                " 1)Collection of student bio data from the students and Mapping Electives from the students for the current semester.\n" + "\n" +
                " 2) Conducting CIE test for the students of various UG/PG Programmes.\n" + "\n" +
                " 3) Preparation of exam schedule, Hall allocation and Seating arrangements for Continuous Internal Evaluation Test (CIE).\n" + "\n" +
                " 4) Collection of Question Papers from the departments, printing and disseminating for CIE test.\n" + "\n" +
                " 5) Collecting Practical examination schedule from the departments.\n" + "\n" +
                " 6) Appointment of External Examiners for practical examinations.\n" + "\n" +
                " 7) Ensuring students attendance percentage during semester.\n" + "\n" +
                " 8) Lack of attendance, debarred and withdrawal Panel of Examiners preparation from various Institution/Universities.\n" + "\n" +
                " 9) Exam schedule preparation for Semester End Examinations.\n" + "\n" +
                " 10) Appointment of Hall Invigilators, Hall Chart, Seating arrangements, Squad and Chief Superintendent etc.\n" + "\n" +
                " 11) Appointment of Evaluators, Chief Examiners and Chairman for Valuation.\n" + "\n" +
                " 12) Publication of Results.\n" + "\n" +
                " 13) Conducting Malpractice meeting, if any in the semester by Malpractice Committee.\n" + "\n" +
                " 14) Conducting of revaluation and issuing photocopy to the students.\n" + "\n" +
                " 15) Publishing revaluation results and Review process.\n" + "\n" +
                " 16) Conduction of Special Supplementary examination.\n" + "\n" +
                " 17) Printing of Statement of Grades, Consolidated Statement of Grades.\n" + "\n" +
                " 18) Issue of Duplicate Grade Sheet/ Certificate etc.,\n" + "\n" +
                " 19) Issue of Transcripts, CGPA to percentage conversion, Medium of Instruction, WES request etc.,\n" + "\n" +
                " 20) Conduction of graduation day and issuing degree certificate.\n" + "\n" +
                " 21) Assisting in student background verification.\n" +"\n" + "\n" +
                " please goto https://www.sonatech.ac.in/coe/ for more information about controller of examinations";
        mess.append(Message);

        b.setText(mess.toString());


    }
}