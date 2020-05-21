package com.training.alif.geeksfarm.e_pohonkarrier.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.training.alif.geeksfarm.e_pohonkarrier.R;

public class SumberAct extends AppCompatActivity {
    Button btnHomes;
    TextView tvSumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumber);
        btnHomes = findViewById(R.id.btn_backhomess);
        tvSumber = findViewById(R.id.tv_sumber);
        btnHomes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SumberAct.this, MainActivity.class);
                startActivity(i);
            }
        });
        tvSumber.setText(" Realistik\\n\n" +
                "1. Peneliti dan Teknisi Kimia - https://campus.quipper.com/careers/peneliti-dan-teknisi-kimia\\n\n" +
                "2. Pilot - https://campus.quipper.com/careers/pilot\\n\n" +
                "3. Perancang dan Teknik Mesin - https://campus.quipper.com/careers/perancang-dan-teknisi-mesin\\n\\n\n" +
                "\n" +
                "Intelektual\\n\n" +
                "1. Guru SMP/SMA - https://campus.quipper.com/careers/guru-sekolah-menengah\\n\n" +
                "2. Dokter - https://campus.quipper.com/careers/dokter\\n\n" +
                "3. Teknisi Peralatan Medis - https://campus.quipper.com/careers/teknisi-alat-kesehatan\\n\n" +
                "4. Psikiater -\\n\\n\n" +
                "\n" +
                "Artistik\\n\n" +
                "1. Ilustrator / Pelaku Seni - https://campus.quipper.com/careers/ilustrator\\n\n" +
                "2. Fotografer - https://campus.quipper.com/careers/fotografer\\n\n" +
                "3. Koreografer - https://campus.quipper.com/careers/koreografer\\n\n" +
                "4. Sutradara - https://campus.quipper.com/careers/sutradara\\n\\n\n" +
                "\n" +
                "Sosial\\n\n" +
                "1. Polisi - https://campus.quipper.com/careers/polisi\\n\n" +
                "2. Perawat/Asisten Medis - https://campus.quipper.com/careers/perawat\\n\n" +
                "3. Pramugari/Pramugara - https://campus.quipper.com/careers/pramugari-pramugara\\n\\n\n" +
                "\n" +
                "Konvensional\\n\n" +
                "1. Pegawai Bank - https://campus.quipper.com/careers/pegawai-bank\\n\n" +
                "2. Pengacara - https://campus.quipper.com/careers/pengacara\\n\n" +
                "3. Astronot - https://campus.quipper.com/careers/astronot\\n\n" +
                "4. Konsultan Pajak - https://campus.quipper.com/careers/konsultan-pajak\\n\\n\n" +
                "\n" +
                "TERIMAKASIH YANG UNTUK TEMAN YANG MEMBANTU MEMVALIDASI BERDASARKAN BIDANGNYA:\\n\n" +
                "Auliaul Muta'al Amd.Tem\\n\n" +
                "krisnawati Dewi Suherly Putri, S.H\\n\n" +
                "Indah Jihana A.Md.Kep\\n\n" +
                "apt. Andrianto, S.Farm\\n\n" +
                "Linda Sri Mulyani, S.E\\n");
    }
}
