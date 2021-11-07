package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class department extends AppCompatActivity implements View.OnClickListener {

    public CardView card1,card2,card3,card4,card5,card6,card7,card8,card9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

         card1=findViewById(R.id.mechanical);
        card2=findViewById(R.id.MCT);
        card3=findViewById(R.id.EEE);
        card4=findViewById(R.id.biomedical);
        card5=findViewById(R.id.ECE);
        card6=findViewById(R.id.civil);
        card7=findViewById(R.id.cse);
        card8=findViewById(R.id.info);
        card9=findViewById(R.id.fashion);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);
        card8.setOnClickListener(this);
        card9.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()){
            case R.id.mechanical:
              i = new Intent(this,mechanical.class);
              startActivity(i);
              break;

            case R.id.MCT:
                i = new Intent(this,MCT.class);
                startActivity(i);
                break;

            case R.id.EEE:
                i = new Intent(this,EEE.class);
                startActivity(i);
                break;



            case R.id.biomedical:
                i = new Intent(this,biomedical.class);
                startActivity(i);
                break;

            case R.id.ECE:
                i = new Intent(this,ECE.class);
                startActivity(i);
                break;

            case R.id.civil:
                i = new Intent(this,civil.class);
                startActivity(i);
                break;

            case R.id.cse:
                i = new Intent(this,cse.class);
                startActivity(i);
                break;

            case R.id.info:
                i = new Intent(this,Info.class);
                startActivity(i);
                break;

            case R.id.fashion:
                i = new Intent(this,fashion.class);
                startActivity(i);
                break;


        }

    }
}