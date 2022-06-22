package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class loginActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Button button1,button2;
    TextInputLayout fullname,email,phoneno,q3,q4;
    FirebaseDatabase rootnode;
    DatabaseReference reference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        Spinner q1spin = findViewById(R.id.aSpinner1);
        q1spin.setOnItemSelectedListener(this);

        Spinner q2spin = findViewById(R.id.aSpinner2);
        q2spin.setOnItemSelectedListener(this);

        Spinner aSpinner = findViewById(R.id.aSpinner);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.Spinner_items,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aSpinner.setAdapter(adapter);
        aSpinner.setOnItemSelectedListener(this);


        fullname=findViewById(R.id.name);
        email=findViewById(R.id.email);
        phoneno=findViewById(R.id.phoneNo);


        q3=findViewById(R.id.q3);
        q4=findViewById(R.id.q4);

        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            private Boolean validateName(){
                String val1= fullname.getEditText().getText().toString();
                if(val1.isEmpty()){
                    fullname.setError("Field cannot be empty");
                    return false;
                }
                else{
                    fullname.setError(null);
                    return true
                            ;
                }
            }
            private Boolean validateEmail(){
                String val1= email.getEditText().getText().toString();
                String emailpattern = "[a-zA-z0-9._-]+@[a-z]+\\.+[a-z]+";
                if(val1.isEmpty()){
                    email.setError("Field cannot be empty");
                    return false;
                }else if(!val1.matches(emailpattern)){
                    email.setError("Invalid email address");
                    return false;
                }
                else{
                    email.setError(null);
                    return true;
                }
            }
            private Boolean validateMobno() {
                String val1= phoneno.getEditText().getText().toString();
                if(val1.isEmpty()){
                    phoneno.setError("Field cannot be empty");
                    return false;
                }
                else{
                    phoneno.setError(null);
                    return true;
                }
            }


            @Override
            public void onClick(View v) {
                rootnode=FirebaseDatabase.getInstance();
                reference=rootnode.getReference("users");

                if(!validateName() | !validateMobno() |!validateEmail()){
                    return;
                }
                String name =fullname.getEditText().getText().toString();
                String mail=email.getEditText().getText().toString();
                String ph =phoneno.getEditText().getText().toString();
                String qa1spin =q1spin.getSelectedItem().toString();
                String qa2spin =q2spin.getSelectedItem().toString();
                String qa3 =q3.getEditText().getText().toString();
                String qa4 =q4.getEditText().getText().toString();
                String spin= aSpinner.getSelectedItem().toString();
                UserHelperClass helperClass=new UserHelperClass(name,mail,ph,qa1spin,qa2spin,qa3,qa4,spin);



                reference.child(ph).setValue(helperClass);
                Toast.makeText(loginActivity.this, "Successfully Registered", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(loginActivity.this,navigation.class);
                startActivity(i);
                finish();


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(loginActivity.this,navigation.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selected=parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}