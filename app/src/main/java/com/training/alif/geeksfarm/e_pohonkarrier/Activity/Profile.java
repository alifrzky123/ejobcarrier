package com.training.alif.geeksfarm.e_pohonkarrier.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.training.alif.geeksfarm.e_pohonkarrier.Activity.About;
import com.training.alif.geeksfarm.e_pohonkarrier.Activity.Contact;
import com.training.alif.geeksfarm.e_pohonkarrier.Activity.MainActivity;
import com.training.alif.geeksfarm.e_pohonkarrier.Activity.list_pekerjaan;
import com.training.alif.geeksfarm.e_pohonkarrier.R;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navbar);
        bottomNavigationView.setSelectedItemId(R.id.nav_profil);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_kontak:
                        startActivity(new Intent(getApplicationContext(), Contact.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_profil:
                        return true;
                    case R.id.nav_about:
                        startActivity(new Intent(getApplicationContext(), About.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_dafpeker:
                        startActivity(new Intent(getApplicationContext(), list_pekerjaan.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}
