package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class about extends AppCompatActivity {

    TextView vision_mission;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        vision_mission = findViewById(R.id.vision);
        StringBuilder v = new StringBuilder();
        String vision="V I S I O N\n" +
                "\n"+
                "To become an institute of great repute, in the fields of Science, Engineering, Technology and Management studies, by offering a full range of programmes of global standard to foster research, and to transform the students into globally competent personalities.\n" + "\n"+
                "M I S S I O N\n" + "\n"+
                "Sona College of Technology is a private engineering institution that offers engineering degree programmes at under graduate level and post graduate level, computer applications and management studies at post graduate level and doctoral programmes in the areas of engineering and science and humanities.\n" +
                "\n" +
                "The college aims to provide a full-fledged education, to produce graduates with competency to excel in the organizations they serve and to cater to the needs of the community as a whole.\n" + "\n"+
                "Our mission for next three years will be\n" +
                "\n" +
                "To offer Graduate, Post-graduate, Doctoral and other value-added programmes beneficial for the students\n" + "\n"+
                "To establish state-of-the-art facilities and resources required to achieve excellence in teaching-learning, and supplementary processes\n" +  "\n"+
                "To provide Faculty and Staff with the required qualification and competence and to provide opportunity to upgrade their knowledge and skills\n" +"\n"+
                "To motivate the students to pursue higher education, appear for competitive exams, and other value added programmes for their holistic development\n" +"\n"+
                "To provide opportunities to the students and bring out their inherent talent\n" +"\n"+
                "To establish Centres of excellence in the emerging areas of research\n" +"\n"+
                "To have regular interaction with the Industries in the area of R & D, and offer consultancy, training and testing services\n" +"\n"+
                "To offer Continuing education, and Non-formal vocational education programmes that are beneficial to the society\n" +"\n"+
                "To inculcate entrepreneurial attitude in the students and to provide a platform to start their own startups in the campus.";

        v.append(vision);
        vision_mission.setText(v.toString());

    }
}