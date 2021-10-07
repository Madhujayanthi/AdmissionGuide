package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class admission extends AppCompatActivity {

    TextView admission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission);

        admission= findViewById(R.id.admission_text2);
        StringBuilder admission_string = new StringBuilder();
        String someMessage ="\n"+
                "i) Selection Procedure\n" +
                "\n" +
                "The selection committee constituted by Sona College of Technology as per the guidelines of the Institution will do selection of the candidates under this scheme. The selection is purely provisional and always subject to the confirmation from the Anna University / Directorate of Technical Education, Chennai.\n" +
                "\n" +
                "ii) Selection Committee\n" +
                "\n" +
                "The following selection committee constituted by Sona College of Technology as per the guidelines of the Institution will select the candidates for admission for various programmes offered by our institution.\n" +
                "\n" +
                "Dr. S.R.R. Senthil Kumar, Principal, Chairman Admissions\n" +
                "Dr.B.Sathiyabhama, Dean - Admissions\n" +
                "Mr.Nagappan, In-Charge Admissions\n" +
                "\n" +
                "iii) Mode of selection\n" +
                "\n" +
                "BE/BTech Degree Programme - First Year\n" +
                "\n" +
                "Based on the cut off marks obtained in the higher secondary (10+2) examination.\n" +
                "Cut off mark = 200 (100 for Mathematics and 100 for Physics + Chemistry)\n" +
                "BE/BTech Degree Programme - Direct Second Year Lateral Entry\n" +
                "\n" +
                "Based on the percentage marks obtained in the Diploma (10+3/12+2) examination.\n" +
                "ME/MTech Degree Programme\n" +
                "\n" +
                "Based on the entrance (TANCET / CET / GATE) marks conducted by the Anna University & Association of Management of Coimbatore Anna University Affiliated Colleges\n" +
                "Master of Business Administration (MBA) Degree\n" +
                "\n" +
                "Based on the entrance (MAT / TANCET / CET) marks conducted by the Anna University & Association of Management of Coimbatore Anna University Affiliated Colleges\n" +
                "Master of Computer Application (MCA) Degree\n" +
                "\n" +
                "Based on the entrance (TANCET / CET) marks conducted by the Anna University & Association of Management of Coimbatore Anna University Affiliated Colleges.";

        admission_string.append(someMessage);

        admission.setText(admission_string.toString());
    }
}