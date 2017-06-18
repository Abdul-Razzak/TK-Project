package com.example.android.tripbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText userName,password;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName=(EditText)findViewById(R.id.eUserName);
        password=(EditText)findViewById(R.id.ePassword);
        buttonLogin=(Button)findViewById(R.id.ebuttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                boolean userError = false;
                boolean passError = false;
                // TODO Auto-generated method stub
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


                if(userError == false && passError == false)
                {
                    Intent it=new Intent(getApplicationContext(), MapsActivity.class);
                    startActivity(it);
                }
            }
        });
    }
}
