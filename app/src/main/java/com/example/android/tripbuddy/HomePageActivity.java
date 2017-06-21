package com.example.android.tripbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

    }

    public void openSignInPage(View view)   {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }

    public void openSignUpPage(View view)   {
        Intent i = new Intent(this, RegisterActivity.class);
        startActivity(i);
    }
}
