package com.example.admissionguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.Manifest;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.material.navigation.NavigationView;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class navigation extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigation;
    Toolbar toolbar;
    TextView mail,phn,website;


    SliderView sliderView;
    int[]images = {
            R.drawable.sona1,
            R.drawable.sona2,
            R.drawable.sona3,
            R.drawable.sona4,
            R.drawable.sona5,
            R.drawable.sona6,
            R.drawable.sona7,
            R.drawable.sona8
    };
    private ImageView map;
    private static final int REQUEST_CALL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        // starting code for navigation bar
        drawerLayout = findViewById(R.id.drawerlayout);
        navigation = findViewById(R.id.navigation);
        toolbar = findViewById(R.id.tool_bar);

        setSupportActionBar(toolbar);

        Menu menu = navigation.getMenu();

        navigation.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigation.setNavigationItemSelectedListener(this);

        navigation.setCheckedItem(R.id.home);

        // starting code for auto image slider
        sliderView = findViewById(R.id.image_slider);
        SliderAdapter sliderAdapter = new SliderAdapter(images);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();


        //starting code for map
        map= findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMap();
            }
        });

        ObjectAnimator objectAnimator = ObjectAnimator.ofPropertyValuesHolder(
                map,
                PropertyValuesHolder.ofFloat("scaleX",1.1f),
                PropertyValuesHolder.ofFloat("scaleY",1.1f)
        );
        objectAnimator.setDuration(700);
        objectAnimator.setRepeatCount(ValueAnimator.INFINITE);
        objectAnimator.setRepeatMode(ValueAnimator.REVERSE);
        objectAnimator.start();
        //mail
        mail = findViewById(R.id.emailid);
        mail.setText(Html.fromHtml("<a href=\"mailto:info@sonatech.ac.in\">Email: info@sonatech.ac.in</a>"));
        mail.setMovementMethod(LinkMovementMethod.getInstance());

        //phn
        phn = findViewById(R.id.ph);
        phn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makephonecall();
            }
        });
        //web
        website= findViewById(R.id.website);
        website.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void makephonecall() {
        String number = phn.getText().toString();

        if(ContextCompat.checkSelfPermission(com.example.admissionguide.navigation.this,
                Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(com.example.admissionguide.navigation.this,
                    new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);

        }else{

            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse("tel:" +number)));

        }


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if (requestCode == REQUEST_CALL) {
            if(grantResults.length>0 && grantResults[0]== PackageManager.PERMISSION_GRANTED){
                makephonecall();
            }
            else{
                Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    private void openMap() {
        Uri uri = Uri.parse("geo:0, 0?q=Sona College of Technology,salem" );
        Intent map = new Intent(Intent.ACTION_VIEW,uri);
        map.setPackage("com.google.android.apps.maps");
        startActivity(map);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuitem) {
        switch(menuitem.getItemId()){
            case  R.id.home:
                break;
            case R.id.about:
                Intent about = new Intent(navigation.this, about.class);
                startActivity(about);
                break;
            case R.id.department:
                Intent  department = new Intent(navigation.this, department.class);
                startActivity(department);
                break;

            case R.id.academics:
                Intent academics = new Intent(navigation.this,academics.class);
                startActivity(academics);
                break;

            case R.id.admission:
                Intent admission= new Intent(navigation.this, admission.class);
                startActivity(admission);
                break;

            case R.id.placement:
                Intent placement = new Intent(navigation.this, placement.class);
                startActivity(placement);
                break;
            case R.id.infrastructure:
                Intent  infrastructure = new Intent(navigation.this,infrastructure.class);
                startActivity(infrastructure);
                break;

            case R.id.alumni:
                Intent alumni = new Intent(navigation.this, alumni.class);
                startActivity(alumni);
                break;




            case  R.id.share:
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT,"https://drive.google.com/drive/folders/1fVveyJRjUpK779lu7EKx3uqRy__7x-wd?usp=sharing");
                startActivity(Intent.createChooser(share,"share"));
                break;



        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}