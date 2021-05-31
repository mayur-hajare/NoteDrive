package com.myur.notedrive;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class ForgotActivity extends AppCompatActivity {

    EditText email, password;
    TextView forgotBtn;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        getSupportActionBar().hide();
        email = findViewById(R.id.forgotmail);
        // forgotBtn.findViewById(R.id.forgotBtn);

        firebaseAuth = FirebaseAuth.getInstance();

        /*forgotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = email.getText().toString().trim();
                if (mail.isEmpty()) {

                    Toast.makeText(getApplicationContext(), "Enter Your Email...", Toast.LENGTH_SHORT).show();
                } else {

                    firebaseAuth.sendPasswordResetEmail(mail).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(getApplicationContext(), "Email has been send...", Toast.LENGTH_SHORT).show();
                                finish();
                                startActivity(new Intent(ForgotActivity.this, LoginActivity.class));
                            } else {
                                Toast.makeText(getApplicationContext(), "Enter Correct Email...", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                }

            }
        });
*/
    }
}