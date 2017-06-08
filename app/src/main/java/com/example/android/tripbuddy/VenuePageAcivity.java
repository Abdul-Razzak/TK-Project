package com.example.android.tripbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class VenuePageAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue_page_acivity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        if(id==R.id.eProfile) {
            Intent intentProfile = new Intent(VenuePageAcivity.this,MyProfileActivity.class);
            startActivity(intentProfile);
            return true;
        }

        if(id==R.id.eLogout) {
            Intent intentLogOut = new Intent(VenuePageAcivity.this,LoginActivity.class);
            startActivity(intentLogOut);
            return true;
        }
        return true;
    }
}
