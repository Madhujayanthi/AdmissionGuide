package com.example.admissionguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class navigation extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigation;
    MenuItem menuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        drawerLayout = findViewById(R.id.drawerlayout);
        navigation = findViewById(R.id.navigation);

        navigation.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigation.setNavigationItemSelectedListener(this);

        navigation.setCheckedItem(R.id.home);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch(menuItem.getItemId()){
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
            case R.id.accomodations:
                Intent accomodations = new Intent(navigation.this, accomodations.class);
                startActivity(accomodations);
                break;
            case R.id.academics:
                Intent academics = new Intent(navigation.this,academics.class);
                startActivity(academics);
                break;

            case R.id.admission:
                Intent admission= new Intent(navigation.this, admission.class);
                startActivity(admission);
                break;
            case R.id.coe:
                Intent coe = new Intent(navigation.this, coe.class);
                startActivity(coe);
                break;
            case R.id.placement:
                Intent placement = new Intent(navigation.this, placement.class);
                startActivity(placement);
                break;
            case R.id.library:
                Intent library = new Intent(navigation.this, library.class);
                startActivity(library);
                break;
            case R.id.sports:
                Intent sports= new Intent(navigation.this, sports.class);
                startActivity(sports);
                break;
            case R.id.research:
                Intent research = new Intent(navigation.this, research.class);
                startActivity(research);
                break;
            case R.id.facilities:
                Intent facilities = new Intent(navigation.this, facilities.class);
                startActivity(facilities);
                break;
            case R.id.contact:
                Intent contact = new Intent(navigation.this, contact.class);
                startActivity(contact);
                break;
            case R.id.login:
                Intent login = new Intent(navigation.this, login.class);
                startActivity(login);
                break;

        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}