package com.example.android.tripbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText email,userName,password;
    Button buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        userName=(EditText)findViewById(R.id.eUserName);
        password=(EditText)findViewById(R.id.ePassword);
        email=(EditText)findViewById(R.id.eEmail);
        buttonSignUp=(Button)findViewById(R.id.ebuttonSignUp);

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                boolean userError = false;
                boolean passError = false;
                boolean emailError = false;

                // TODO Auto-generated method stub
                if(email.getText().toString().trim().length()==0){
                    emailError = true;
                    email.setError("Email is not entered");
                    email.requestFocus();
                }

                if(userName.getText().toString().trim().length()==0){
                    userError = true;
                    userName.setError("Username is not entered");
                    userName.requestFocus();
                }

                if(password.getText().toString().trim().length()==0){
                    passError = true;
                    password.setError("Password is not entered");
                    password.requestFocus();
                }

                if(password.getText().toString().length()<8) {
                    passError = true;
                    password.setError("Password should be atleast of 8 charactors");
                    password.requestFocus();
                }

/*changed VenuePageActivity intent to LoginActivity intent*/
                if(userError == false && passError == false && emailError == false)
                {
                    Toast.makeText(getApplicationContext(), "Successfully Registered", Toast.LENGTH_SHORT).show();
                    Intent it=new Intent(getApplicationContext(), MapsActivity.class);
                    startActivity(it);

                }
            }
        });
    }
}
