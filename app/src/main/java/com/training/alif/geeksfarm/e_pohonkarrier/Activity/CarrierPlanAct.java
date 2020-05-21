package com.training.alif.geeksfarm.e_pohonkarrier.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.training.alif.geeksfarm.e_pohonkarrier.R;

public class CarrierPlanAct extends AppCompatActivity {
    Button btnSilang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrier_plan);
        btnSilang = findViewById(R.id.btn_backhome);
        btnSilang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CarrierPlanAct.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
