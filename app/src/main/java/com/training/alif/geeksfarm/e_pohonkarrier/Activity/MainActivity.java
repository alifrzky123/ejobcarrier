package com.training.alif.geeksfarm.e_pohonkarrier.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.training.alif.geeksfarm.e_pohonkarrier.R;

public class MainActivity extends AppCompatActivity {
    private Button btnPet, btnInfor, btnSumber, btnPlan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Initialize();
        bottomNavBar();

        btnPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CarrierPlanAct.class);
                startActivity(intent);
            }
        });
        btnInfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), list_pekerjaan.class));
                finish();
            }
        });

    }

    private void Initialize(){
        btnInfor = findViewById(R.id.btn_informasi_pek);
        btnPet = findViewById(R.id.btn_ptnjk_app);
        btnPlan = findViewById(R.id.btn_plan_carrier);
        btnSumber = findViewById(R.id.btn_sumber);
    }

    public void bottomNavBar(){
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navbar);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_kontak:
                        startActivity(new Intent(getApplicationContext(), Contact.class));
                        overridePendingTransition(0,0);
                        finish();
                        return true;
                    case R.id.nav_profil:
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                        overridePendingTransition(0,0);
                        finish();
                        return true;
                    case R.id.nav_about:
                        startActivity(new Intent(getApplicationContext(), About.class));
                        overridePendingTransition(0,0);
                        finish();
                        return true;
                    case R.id.nav_dafpeker:
                        startActivity(new Intent(getApplicationContext(), list_pekerjaan.class));
                        overridePendingTransition(0,0);
                        finish();
                        return true;
                    case R.id.nav_home:
                        return true;
                }
                return false;
            }
        });
    }
}
