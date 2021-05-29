package com.myur.notedrive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    TextView signUp,forgot;
    EditText email,password;
    RelativeLayout login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login=findViewById(R.id.login);
        email=findViewById(R.id.loginemail);
        password=findViewById(R.id.loginpassword);
        signUp=findViewById(R.id.Signup);
        forgot=findViewById(R.id.forgot);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email !=null && password!= null){
                    Toast.makeText(getApplicationContext(),"Enter details",Toast.LENGTH_SHORT).show();

                }

            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),SignupActivity.class);
                startActivity(intent);
            }
        });
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ForgotActivity.class);
                startActivity(intent);
            }
        });
}}