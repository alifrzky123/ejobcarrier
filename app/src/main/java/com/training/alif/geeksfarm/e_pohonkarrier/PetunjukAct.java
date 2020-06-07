package com.training.alif.geeksfarm.e_pohonkarrier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.training.alif.geeksfarm.e_pohonkarrier.Activity.MainActivity;

public class PetunjukAct extends AppCompatActivity {
    Button btnHome;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petunjuk);
        initialize();
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });


        textView.setText("Petunjuk Aplikasi : \n" +
                "\tA. Layout Home :\n" +
                "\t\ta. Button \"DAFTAR PEKERJAAN\" merupakan button untuk menuju Daftar Pekerjaan.\n" +
                "\t\tb. Button \"RENCANA KARRIER ANDA\" merupakan button untuk menuju layout Rencana Karrier.\n" +
                "\t\tc. Button \"PETUNJUK APLIKASI\" merupakan button untuk menuju layout Petunjuk Aplikasi.\n" +
                "\t\td. Button \"SUMBER-SUMBER\" merupakan button untuk menuju layout Sumber-Sumber.\n" +
                "\tB. Tombol \"X\" pada layout Sumber-Sumber, Petunjuk Aplikasi, dan Rencana Karrier, merupakan tombol untuk kembali ke layout utama (Home).\n" +
                "\tC. Layout Daftar Pekerjaan :\n" +
                "\t\ta. Tiap daftar pekerjaan yang ada bisa di klik. Dan itu akan menuju deskripsi pekerjaan yang anda klik.\n" +
                "\tD. Layout Deskripsi Pekerjaan :\n" +
                "\t\ta. Pada layout ini, untuk kembali ke layout sebelumnya dapat menggunakan tombol back pada handphone anda.\n" +
                "\tE. Layout Kontak :\n" +
                "\t\ta. Pada tiap kotak ada kontak2 yang tertera, cukup di klik saja. Dan akan menuju kontak yang dituju.");
    }
    public void initialize(){
        btnHome = findViewById(R.id.btn_backkhomess);
        textView = findViewById(R.id.tv_petunjuk);
    }
}
