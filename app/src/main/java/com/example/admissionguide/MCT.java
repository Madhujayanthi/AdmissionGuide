package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MCT extends AppCompatActivity {

    TextView mct_hdadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_c_t);


        mct_hdadd=findViewById(R.id.mct_hdadd);

             StringBuilder hdadd = new StringBuilder();
        String message4 =
                "Department of Mechatronics Engineering,\n" +
                        "Sona College of Technology,\n" +
                        "Salem - 636 005.";


        hdadd.append(message4);
        mct_hdadd.setText(hdadd.toString());

    }
}