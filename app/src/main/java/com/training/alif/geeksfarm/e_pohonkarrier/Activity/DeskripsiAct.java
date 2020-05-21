package com.training.alif.geeksfarm.e_pohonkarrier.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.training.alif.geeksfarm.e_pohonkarrier.Entity.ListPekerjaan;
import com.training.alif.geeksfarm.e_pohonkarrier.R;

public class DeskripsiAct extends AppCompatActivity {
    public static final String EXTRA_DATA = "EXTRA_DATA";
    ImageView iv_deskPekerjaan,
            iv_deskPekerjaandibawahtvDesk,
            iv_deskPekerjaandibawahtvWajibTahu,
            iv_deskPekerjaandibawahPengetahuan,
            iv_DeskPekerjaandibawahJenjang,
            iv_DeskPekerjaandibawahJurusan;

    TextView tvPekerjaanNama,
            tvDeskGaji,
            tvDeskPendidikan,
            tvDeskSertifikat,
            tvDeskripsi,
            tvSumberDesk,
            tvwajibTahu,
            tvwajibTahu2,
            tvwajibTahu3,
            tvwajibTahu4,
            tvwajibTahu5,
            tvwajibTahu6,
            tvwajibTahu7,
            tvwajibTahu8,
            tvwajibTahu9,
            tvwajibTahu10,
            tvSumberDesk2,
            tvDeskPeran,
            tvSumberDesk3,
            tvDeskPengetahuan,
            tvSumberDesk4,
            tvDeskJenjang,
            tvSumberDesk5,
            tvDeskJurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);
        Initialize();
        onBind();

    }

    public void onBind(){
        ListPekerjaan listPekerjaan = getIntent().getParcelableExtra(EXTRA_DATA);
        if(listPekerjaan != null){
            String wajibtahu = listPekerjaan.getWajibtahu();
            String wajibtahu2 = listPekerjaan.getWajibtahu2();
            String wajibtahu3 = listPekerjaan.getWajibtahu3();
            String wajibtahu4 = listPekerjaan.getWajibtahu4();
            String wajibtahu5 = listPekerjaan.getWajibtahu5();
            String wajibtahu6 = listPekerjaan.getWajibtahu6();
            String wajibtahu7 = listPekerjaan.getWajibtahu7();
            String wajibtahu8 = listPekerjaan.getWajibtahu8();
            String wajibtahu9 = listPekerjaan.getWajibtahu9();
            String wajibtahu10 = listPekerjaan.getWajibtahuX();
            iv_deskPekerjaan.setImageResource(listPekerjaan.getImageDescCard());
            iv_DeskPekerjaandibawahJurusan.setImageResource(listPekerjaan.getImgJurusan());
            iv_deskPekerjaandibawahPengetahuan.setImageResource(listPekerjaan.getImagePengetahuan());
            iv_deskPekerjaandibawahtvWajibTahu.setImageResource(listPekerjaan.getImageWajibTahu());
            iv_DeskPekerjaandibawahJenjang.setImageResource(listPekerjaan.getImageJenjangKarrier());
            iv_deskPekerjaandibawahtvDesk.setImageResource(listPekerjaan.getImagePeran());

            tvDeskJurusan.setText(listPekerjaan.getJurusan());
            tvDeskPengetahuan.setText(listPekerjaan.getPengetahuandanekeahlian());
            tvDeskripsi.setText(listPekerjaan.getDeskripsi());
            tvDeskJenjang.setText(listPekerjaan.getJenjang());
            tvDeskPendidikan.setText(listPekerjaan.getPendidikan());
            tvDeskGaji.setText(listPekerjaan.getGaji());
            tvDeskSertifikat.setText(listPekerjaan.getSertifikat());
            tvDeskPeran.setText(listPekerjaan.getPerandanTgg());
            tvPekerjaanNama.setText(listPekerjaan.getJobNames());
            tvSumberDesk.setText(listPekerjaan.getSumberimgjurusan());
            tvSumberDesk2.setText(listPekerjaan.getSumberwjbtahu());
            tvSumberDesk3.setText(listPekerjaan.getSumberimgperan());
            tvSumberDesk4.setText(listPekerjaan.getSumberPengetahuan());
            tvSumberDesk5.setText(listPekerjaan.getSumberJenjang());


            if (wajibtahu != "") {
                tvwajibTahu.setText(wajibtahu);
                tvwajibTahu.setVisibility(View.VISIBLE);

            }if (wajibtahu2 != "") {
                tvwajibTahu2.setText(wajibtahu2);
                tvwajibTahu2.setVisibility(View.VISIBLE);

            }if (wajibtahu3 != "") {
                tvwajibTahu3.setText(wajibtahu3);
                tvwajibTahu3.setVisibility(View.VISIBLE);

            }if (wajibtahu4 != "") {
                tvwajibTahu4.setText(wajibtahu4);
                tvwajibTahu4.setVisibility(View.VISIBLE);

            }if (wajibtahu5 != "") {
                tvwajibTahu5.setText(wajibtahu5);
                tvwajibTahu5.setVisibility(View.VISIBLE);

            }if (wajibtahu6 != "") {
                tvwajibTahu6.setText(wajibtahu6);
                tvwajibTahu6.setVisibility(View.VISIBLE);

            }if (wajibtahu7 != "") {
                tvwajibTahu7.setText(wajibtahu7);
                tvwajibTahu7.setVisibility(View.VISIBLE);

            }if (wajibtahu8 != "") {
                tvwajibTahu8.setText(wajibtahu8);
                tvwajibTahu8.setVisibility(View.VISIBLE);

            }if (wajibtahu9 != "") {
                tvwajibTahu9.setText(wajibtahu9);
                tvwajibTahu9.setVisibility(View.VISIBLE);

            }if (wajibtahu10 != "") {
                tvwajibTahu10.setText(wajibtahu10);
                tvwajibTahu10.setVisibility(View.VISIBLE);

            }
            if (wajibtahu == "") {
                tvwajibTahu.setVisibility(View.INVISIBLE);
            }
            if (wajibtahu2 == "") {
                tvwajibTahu2.setVisibility(View.GONE);

            }if (wajibtahu3.equals("")) {
                tvwajibTahu3.setVisibility(View.GONE);

            }if (wajibtahu4.equals("")) {
                tvwajibTahu4.setVisibility(View.GONE);

            }if (wajibtahu5.equals("") ) {
                tvwajibTahu5.setVisibility(View.GONE);

            }if (wajibtahu6.equals("") ) {
                tvwajibTahu6.setVisibility(View.GONE);

            }if (wajibtahu7.equals("") ) {
                tvwajibTahu7.setVisibility(View.GONE);

            }if (wajibtahu8.equals("") ) {
                tvwajibTahu8.setVisibility(View.GONE);

            }if (wajibtahu9.equals("") ) {
                tvwajibTahu9.setVisibility(View.GONE);

            }if (wajibtahu10.equals("") ) {
                tvwajibTahu10.setVisibility(View.GONE);

            }

//            if (wajibtahu == "" || wajibtahu2 == "" || wajibtahu3 == ""||wajibtahu4 == "" ||wajibtahu5 == "" || wajibtahu6 == ""|| wajibtahu7 == ""|| wajibtahu8 == ""|| wajibtahu9 == ""|| wajibtahu10 == ""){
//                tvwajibTahu.setVisibility(View.INVISIBLE);
//
//                tvwajibTahu2.setVisibility(View.GONE);
//
//                tvwajibTahu3.setVisibility(View.GONE);
//
//                tvwajibTahu4.setVisibility(View.GONE);
//
//                tvwajibTahu5.setVisibility(View.GONE);
//
//                tvwajibTahu6.setVisibility(View.GONE);
//
//                tvwajibTahu7.setVisibility(View.GONE);
//
//                tvwajibTahu8.setVisibility(View.GONE);
//
//                tvwajibTahu9.setVisibility(View.GONE);
//
//                tvwajibTahu10.setVisibility(View.GONE);
//
//            }
//              if
//                  (wajibtahu != "" || wajibtahu2 != ""|| wajibtahu3 != ""|| wajibtahu4 != ""|| wajibtahu5 != ""|| wajibtahu6 != ""|| wajibtahu7 != ""|| wajibtahu8 != ""||wajibtahu9 != "" || wajibtahu10 != "")
//        {
//                tvwajibTahu.setText(wajibtahu);
//
//                tvwajibTahu2.setText(wajibtahu2);
//
//                tvwajibTahu3.setText(wajibtahu3);
//
//                tvwajibTahu4.setText(wajibtahu4);
//
//                tvwajibTahu5.setText(wajibtahu5);
//
//                tvwajibTahu6.setText(wajibtahu6);
//
//                tvwajibTahu7.setText(wajibtahu7);
//
//                tvwajibTahu8.setText(wajibtahu8);
//
//                tvwajibTahu9.setText(wajibtahu9);
//
//                tvwajibTahu10.setText(wajibtahu10);
//
//            }
//
        }
    }

    public void Initialize(){
        iv_deskPekerjaan = findViewById(R.id.iv_desk_pekerjaan);
        iv_deskPekerjaandibawahtvDesk = findViewById(R.id.iv_desk_pekerjaan_dibawah_desk);
        iv_deskPekerjaandibawahtvWajibTahu = findViewById(R.id.iv_desk_pekerjaan_dibawah_wajibtahu);
        iv_deskPekerjaandibawahPengetahuan = findViewById(R.id.iv_desk_pekerjaan_dibawah_pengetahuan);
        iv_DeskPekerjaandibawahJenjang = findViewById(R.id.iv_desk_pekerjaan_dibawah_jenjang);
        iv_DeskPekerjaandibawahJurusan = findViewById(R.id.iv_desk_pekerjaan_dibawah_jurusanterkait);

        tvPekerjaanNama = findViewById(R.id.desk_perkejaan_nama);
        tvDeskGaji = findViewById(R.id.txt_gaji);
        tvDeskPendidikan = findViewById(R.id.txt_pendidikan);
        tvDeskSertifikat = findViewById(R.id.txt_sertifikat);
        tvDeskripsi = findViewById(R.id.txt_deskripsi);
        tvSumberDesk = findViewById(R.id.deskripsi_sumber_tv);
        tvSumberDesk2 = findViewById(R.id.deskripsi_sumber_tv2);
        tvSumberDesk3 = findViewById(R.id.deskripsi_sumber_tv3);
        tvSumberDesk4 = findViewById(R.id.deskripsi_sumber_tv4);
        tvSumberDesk5 = findViewById(R.id.deskripsi_sumber_tv5);
        tvwajibTahu = findViewById(R.id.txt_deskripsi_wajibtahu1);
        tvwajibTahu2 = findViewById(R.id.txt_deskripsi_wajibtahu2);
        tvwajibTahu3 = findViewById(R.id.txt_deskripsi_wajibtahu3);
        tvwajibTahu4 = findViewById(R.id.txt_deskripsi_wajibtahu4);
        tvwajibTahu5 = findViewById(R.id.txt_deskripsi_wajibtahu5);
        tvwajibTahu6 = findViewById(R.id.txt_deskripsi_wajibtahu6);
        tvwajibTahu7 = findViewById(R.id.txt_deskripsi_wajibtahu7);
        tvwajibTahu8 = findViewById(R.id.txt_deskripsi_wajibtahu8);
        tvwajibTahu9 = findViewById(R.id.txt_deskripsi_wajibtahu9);
        tvwajibTahu10 = findViewById(R.id.txt_deskripsi_wajibtahu10);
        tvDeskPendidikan = findViewById(R.id.txt_pendidikan);
        tvDeskPeran = findViewById(R.id.txt_deskripsi_peran);
        tvDeskJenjang = findViewById(R.id.txt_deskripsi_jenjang);
        tvDeskPengetahuan = findViewById(R.id.txt_deskripsi_pengetahuan);
        tvDeskJurusan = findViewById(R.id.txt_deskripsi_jurusanterkait);

    }
}
