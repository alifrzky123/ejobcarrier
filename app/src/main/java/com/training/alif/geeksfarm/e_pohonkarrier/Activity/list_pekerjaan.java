package com.training.alif.geeksfarm.e_pohonkarrier.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.training.alif.geeksfarm.e_pohonkarrier.Adapter.RVAdapter;
import com.training.alif.geeksfarm.e_pohonkarrier.Entity.ListPekerjaan;
import com.training.alif.geeksfarm.e_pohonkarrier.R;

import java.util.ArrayList;

public class list_pekerjaan extends AppCompatActivity {
    RecyclerView recyclerView;
    RVAdapter rvAdapter;
    private ArrayList<ListPekerjaan> listPekerjaans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pekerjaan);

        addData();
        recyclerView = findViewById(R.id.rv_listpekerjaan);
        rvAdapter = new RVAdapter(listPekerjaans);
        LinearLayoutManager layoutManager = new LinearLayoutManager(list_pekerjaan.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(rvAdapter);
        bottomNavBar();

    }

    public void addData(){
        listPekerjaans = new ArrayList<>();
        listPekerjaans.add(new ListPekerjaan(R.drawable.gambar_depan_astronot,
                "Astronot",
                "Kata “Astronot” berasal dari bahasa Yunani, yaitu astron dan nautis.(Read more)..",
                R.drawable.astronot_deskripsi,
                "Rp.70.000.000 – Rp.100.000.000",
                "S1 Sederajat",
                "",
                "Kata “Astronot” berasal dari bahasa Yunani, yaitu astron dan nautis. Astron artinya bintang, sedangkan nautis artinya penjelajah. Astronot atau disebut juga dengan istilah Antariksawan.\n Nah, kalau dalam bahasa melayu Malaysia, Astronot disebut dengan Angkasawan. Astronot merupakan sebutan untuk orang yang\n sudah memenuhi pelatihan penerbangan antariksa untuk memimpin, menerbangkan, atau jadi awak pesawat antariksa.\n" +
                        "Para astronot pergi ke luar angkasa untuk menjalankan misi tertentu. Misalnya Sally Ride dengan misi STS-7 di tahun 1983, Edwin Aldrin dengan misi Apollo 8 di tahun 1969, dan sebagainya. Astronot akan menetap di stasiun luar angkasa internasional (International Space Station) dan mengambil bagian dalam kegiatan eksperimen dan penelitian.\n" +
                        "Syarat yang harus dipenuhi untuk menjadi astronot adalah memiliki daya tahan tubuh dan kesehatan serta mampu berbahasa Inggris. National Aeronautics and Space Administration (NASA) merupakan institusi terbesar yang menaungi pekerjaan ini. Di Jepang, Badan Eksplorasi Luar Angkasa Jepang (JAXA) melakukan rekrutmen astronot. Seseorang bisa menjadi astronot setelah melewati banyak seleksi dan latihan yang ketat.\n",
                R.drawable.astronot_deskripsi2,
                "httpscdn.britannica.com",
                "Dilansir dari Bobo.grid.id ternyata astronot punya sebutan yang berbeda. \n Misalnya, penjelajah antariksa dari Rusia dikenal dengan sebutan Cosmonaut atau Kosmonot. \nNah kalau di Tiongkok disebut Taikonaut. Beda lagi dengan istilah Spationaut yang merujuk pada penjelajah antariksa asal Prancis.",
                "Meski punya ribuan karyawan, ternyata di tahun 2019 hanya ada 38 astronot yang berstatus aktif. \nMerujuk data nasa.gov, para Astronot ini adalah mereka yang telah lolos rangkaian tes dan dinyatakan siap untuk terbang",
                "Selain menjadi Astronot, untuk bisa merasakan sensasi luar angkasa kamu bisa mengikuti wisata luar angkasa \ndan menjadi space tourist, menurut suara.com setidaknya diperlukan \nbiaya paling murah Rp3,5 miliar untuk merasakan sensasi luar angkasa selama beberapa saat.",
                "Pada 28 April 2001, Dennis Tito menjadi turis luar angkasa pertama \nyang membiayai perjalanannya sendiri. Dilansir dari bbc.co.uk, miliuner asal Amerika Serikat ini \nsetidaknya merogoh kocek US$20.000.000 untuk perjalanannya selama 8 hari",
                "Tahukah Kamu, ternyata putri orang nomor satu di Amerika Serikat, \nIvana Trump, memimpikan untuk bekerja sebagai astronot dan pergi ke ruang angkasa seperti diberitakan dalam Kompas.",
                "Persaingan untuk jadi astronot sangat ketat. Melansir Kompas, tercatat ada 18.300 orang yang melamar \nuntuk bergabung di program pelatihan astronot NASA tahun 2016. \nUntuk bisa dipertimbangkan jadi kandidat astronot NASA, selain persyaratan kewarganegaraan \ndan gelar sarjana di bidang tertentu, kamu perlu punya pengalaman profesional tambahan, \nyaitu setidaknya berpengalaman menerbangkan pesawat jet dengan 1.000 jam terbang.",
                "Setelah jadi kandidat astronot, Kamu tidak serta merta bisa langsung pergi ke luar angkasa.\n Kamu harus mengikuti serangkaian pelatihan dan ujian. Tantangan yang harus dihadapi antara lain \ntes kelangsungan hidup, menyelam, serta renang dengan berpakaian luar angkasa",
                "Pulang dari misi luar angkasa, tubuhmu harus melakukan penyesuaian dalam waktu yang hampir sama dengan penerbangan \nagar kembali normal. Meski begitu, beberapa organ akan merespon lebih cepat. \nKamu akan dapat volume darah dan kontrol tekanan kembali dalam hitungan \nhari sampai seminggu atau lebih. Organ yang paling lama kembali normal adalah otot \ndan tulang karena paling lama menanggapi situasi tanpa bobot.",
                "",
                "",
                R.drawable.astronot_deskripsi3,
                "httpscdn.vox-cdn.com",
                "a.\tMengatur satelit untuk kebutuhan teknologi dan komunikasi seluruh negara di dunia.\n" +
                        "b.\tMelakukan kegiatan yang berkaitan dengan eksplorasi ruang angkasa.\n" +
                        "c.\tMengamati dan mendokumentasi lingkungan tempat tujuan di luar angkasa.\n" +
                        "d.\tMengambil beberapa sampel atau benda penting dari sana, untuk dibawa kembali ke bumi kemudian dipelajari.\n" +
                        "e.\tMembuat laporan mengenai semua kejadian yang terjadi di ruang angkasa.\n",
                R.drawable.astronot_deskripsi4,
                "httpsi.dailymail.co.uk",
                "a.\tKemampuan observasi\n" +
                        "b.\tKemampuan bertahan\n" +
                        "c.\tKemampuan melakukan analisis\n" +
                        "d.\tKemampuan berpikir kritis\n" +
                        "e.\tKemampuan problem solving\n" +
                        "f.\tKemampuan kerja tim\n" +
                        "g.\tPemahaman bahasa asing\n" +
                        "h.\tKeahlian menerbangkan pesawat\n",
                R.drawable.astronot_deskripsi5,
                "httpsimage.cnbcfm.com",
                "Dalam perjalanan karier seorang astronot, setelah melahap habis materi pelatihan umum dan khusus serta menuntaskan berbagai ujian, \nselanjutnya akan ditugaskan dalam suatu misi. Kamu akan merasakan pengalaman dalam \nperjalanan luar angkasa yang sesungguhnya, dan bisa menyebut diri sebagai astronot. \nJenjang karier seorang astronot dimulai pada tingkatan GS-12 sampai tertinggi GS-15. \nTingkatan tersebut juga akan mempengaruhi besarnya pendapatan seorang astronot.",
                R.drawable.astronot_deskripsi6,
                "httpswww.thoughtco.com",
                "Jika kamu ingin berkarier pada profesi ini, \nmaka ilmu yang harus kamu kuasai adalah: Matematika, Ilmu Komputer, \nFisika, Ilmu Teknik, dan Biologi."));

        listPekerjaans.add(new ListPekerjaan(R.drawable.gambar_dpn_dokter,
                "Dokter",
                "Dokter bertugas mengobati dan mencegah timbulnya kembali penyakit. (Read More..)",
                R.drawable.dokter_deskripsi,
                "Rp.3.000.000 – Rp.10.000.000",
                "S1 Sederajat",
                "Sertifikasi Kompetensi Dokter",
                "Ayo ngaku, siapa yang punya cita-cita menjadi dokter saat kecil! \nProfesi ini memang jadi profesi impian banyak orang meskipun dikenal dengan pekerjaan yang berat dan pendidikan yang terbilang lama.\n Dokter bertugas mengobati dan mencegah timbulnya kembali penyakit. Jadi, dokter akan melakukan pemeriksaan, pengobatan dan perawatan medis \npada pasien dengan pengetahuan medis dan rasa kemanusiaan. Dokter \njuga melayani konsultasi kesehatan, jadi bukan cuma ngurusin orang sakit aja. \nNah, saat ini sudah semakin banyak dokter yang melakukan perawatan khusus di bidang-bidang spesialisasi seiring dengan kemajuan teknologi medis dan obat-obatan yang sangat pesat. \nPekerjaan ini juga menuntutmu punya kemampuan komunikasi yang baik supaya bisa menjelaskan suatu diagnosa kepada pasien dan keluarganya. \nDokter adalah salah satu profesi yang akan terus dibutuhkan di setiap masa.",
                R.drawable.dokter_deskripsi2,
                "httpscdn-image.hipwee.com",
                "Sering ada salah penulisan antara gelar dokter (medis) dan gelar doktoral (S3). Gelar dokter diberikan untuk seseorang yang telah menempuh pendidikan kedokteran dan serangkaian syarat lainnya. Gelar dokter ditulis dengan huruf kecil ‘dr.’ sedangkan gelar doktoral diawali dengan huruf kapital ‘Dr.’.",
                "Untuk jadi seorang Dokter, tentunya harus melawati fase pre-klinik dan fase klinik.",
                "Fase praklinik merupakan masa perkuliahan di kampus selama 3,5 - 4 tahun hingga mendapatkan gelar sarjana kedokteran.",
                "Fase klinik pada pendidikan dokter dikenal dengan masa koas atau dokter muda. Pada masa ini Kamu akan belajar dan praktek langsung di rumah sakit/ pusat layanan kesahatan yang ditunjuk. Masa koas bervariasi antara 90 minggu hingga 2 tahun.",
                "Setelah menjalani masa koas, seorang calon dokter harus lulus Ujian Kompetensi Dokter Indonesia (UKDI) untuk resmi menyandang gelar Dokter.",
                "Ingin membuka praktik mandiri? Kamu harus ikut program internship pada fasilitas layanan kesehatan yang ditunjuk selama 1 tahun sebagai syarat untuk mendapat Surat Tanda Register (STR) dan Surat Ijin Praktik (SIP).",
                "Saat ini di Indonesia setidaknya ada 30 jenis spesialisasi kedokteran.",
                "Dokter juga bisa meniti karier di jalur tenaga kesehatan militer lewat rekrutmen perwira prajurit karier.. Kalau berkarier sebagai dokter militer, kamu akan bertugas sebagaimana dokter pada umumnya. Bedanya, kamu akan bekerja di lingkungan khusus dan mengabdi saat damai maupun perang.",
                "Ketika berkarier sebagai dokter militer, pengalaman seperti memindahkan korban bencana alam dari helikopter, juga menangani dan melakukan operasi di atas kapal bisa jadi kamu dapatkan. Soal jenjang karier, dokter militer juga punya, tapi sesuai sama periode penugasannya.",
                "Dilansir dari Antara, rasio dokter umum di Indonesia saat ini mencapai 47 dokter untuk 100.000 penduduk. Jumlah ini berada di atas standar yaitu 42 dokter untuk 100.000 penduduk. Meski banyak dokter sayangnya persebarannya masih belum merata dan banyak yang timpang. Waduh!",
                R.drawable.dokter_deskripsi3,
                "httpsdaftarkursusbahasaarab.files.wordpress.com",
                "a.\tMengedukasi masyarakat akan pentingnya memelihara kesehatan yang baik dan menjalani pola hidup sehat.\n" +
                        "b.\tMelakukan tindakan pencegahan penyakit dan melayani konsultasi kesehatan.\n" +
                        "c.\tMelakukan pemeriksaan fisik untuk mendiagnosis penyakit pasien dan memberikan pengobatan yang sesuai.\n" +
                        "d.\tMelakukan pemeriksaan penunjang berdasarkan gejala yang dialami pasien.\n" +
                        "e.\tMelakukan rehabilitasi medis pada pasien supaya tidak terjadi komplikasi penyakit.\n" +
                        "f.\tMemberikan terapi (obat) sesuai dengan diagnosa penyakit yang diderita pasien.\n" +
                        "g.\tMengoordinasikan seluruh kegiatan manajemen mutu di pusat layanan kesehatan.\n" +
                        "h.\tMembentuk manajemen dalam pelaksanaan tugas pokok dan fungsi pusat layanan kesehatan.\n",
                R.drawable.dokter_deskripsi4,
                "httpslh3.googleusercontent.com",
                "a.\tKemampuan melakukan observasi\n" +
                        "b.\tKemampuan berpikir kritis\n" +
                        "c.\tKemampuan berpikir sistematis\n" +
                        "d.\tKemampuan melakukan analisis\n" +
                        "e.\tKemampuan problem solving\n" +
                        "f.\tKeterampilan komunikasi\n" +
                        "g.\tDetil, Teliti Dan Tekun\n",
                R.drawable.dokter_deskripsi5,
                "httpspreviews.123rf.com",
                "Siapa bilang dokter hanya sebatas praktik? Seorang dokter bisa berkecimpung dalam bidang manajerial rumah sakit atau perusahaan lain terkait bidang medis. Dokter juga bisa meniti karier di dunia militer maupun kepolisian dan mendapatkan kenaikan pangkat sesuai dengan institusinya. Tak jarang seorang dokter juga merupakan dosen bahkan guru besar. Nah, meski bisa memiliki jenjang karier yang berbeda-beda tergantung tempatnya bekerja, dokter juga memiliki jenjang profesi yang berlau secara umum sesuai dengan keahliannya.\n" +
                        "a.\tDokter Umum. Dokter yang boleh melakukan praktik medis tanpa harus memiliki spesialisasi yang spesifik. Dokter umum akan mengidentifikasi masalah kesehatan dan gelaja umum yang dialami pasien.\n" +
                        "b.\tDokter umum dikenal sebagai dokter layanan pertama, karena tugasnya memberi perawatan medis awal berdasarkan hasil diagnosisnya, bila diperlukan dokter umum akan memberi rujukan pasien ke dokter spesialis.\n" +
                        "c.\tDokter Spesialis. Dokter yang mengkhususkan diri pada bidang kedokteran tertentu, Misalnya, spesialis bedah, jantung, penyakit dalam, kandungan, anak, dan sebagainya\n" +
                        "d.\tUntuk jadi dokter spesialis, kamu harus menempuh Program Pendidikan Dokter Spesialis (PPDS) dulu. Beberapa kampus mensyaratkan calon Residen (mahasiswa PPDS) harus punya pengalaman satu atau dua tahun mengabdi di wilayah terpencil.\n" +
                        "e.\tDokter Subspesialis. Dikenal juga dengan istilah konsultan atau konsulen, yaitu dokter yang mendalami bidang ilmu kedokteran tertentu yang sangat spesifik misalnya Konsulen untuk masalah tumbuh kembang pada kedokteran anak.\n" +
                        "f.\tDokter subspesialis biasanya bekerja di layanan kesehatan tersier juga sekunder. Misalnya di rumah sakit rujukan tipe A yang ada di kota-kota besar.\n",
                R.drawable.dokter_deskrpsi6,
                "httpswww.renewstem.com",
                "Jika kamu ingin berkarier pada profesi ini, maka ilmu yang harus kamu kuasai adalah: Pendidikan Dokter"));

        listPekerjaans.add(new ListPekerjaan(R.drawable.gambar_depan_fotografer,
                "Fotografer",
                "Fotografer adalah sebutan bagi para pekerja yang memberikan jasa fotografi untuk berbagai tujuan. (Read more..)",
                R.drawable.fg_deskripsi,
                "Rp.4.000.000 – Rp.5.500.000",
                "D3 Sederajat",
                "Sertifikasi Kompetensi Fotografer",
                "Fotografer adalah sebutan bagi para pekerja yang memberikan jasa fotografi untuk berbagai tujuan. \nAda yang menawarkan jasa foto komersial secara langsung, yakni fotografer memotret lalu dibayar. \nMisalnya memotret perorangan, keluarga, acara pernikahan, ataupun produk. Ada juga  seorang fotografer yang gemar hunting foto, kemudian di jual untuk berbagai keperluan seperti iklan maupun foto di media.\nTapi ada juga, fotografer yang memotret untuk tujuan pameran. Biasanya fotografer akan menyewa galeri untuk menampilkan karyanya, jadi kalau ada yang tertarik bisa membelinya.\n" +
                        "Seorang fotografer yang baik nggak cuma asal jepret tetapi juga memiliki pesan yang akan disampaikan dalam setiap karyanya. Pekerjaan ini membutuhkan sudut pandang khusus untuk menentukan bagaimana cara menampilkan objek atau subjek dan pesan apa yang ingin disampaikan melalui gambar. \nSelain itu, pekerjaan ini memerlukan teknik khusus masing-masing tergantung pada genre (seperti berita, iklan, dsb) atau objek yang akan difoto.\n",
                R.drawable.fg_deskripsi2,
                "httpscdn.medcom.id",
                "Bagi yang suka dengan fotografi, bisa sekali untuk menjadi fotografer yang menjalani hobi sekaligus pebisnis! Kamu bisa menggunakan sosial media milikmu sebagai media promosi dan pameran karya-karya foto yang pernah kamu buat.",
                "Mengutip Kompas, kini paradigma fotografi sebagai “barang mahal” sudah bergeser, seiring dengan berkembangnya dunia digital. Yang penting, kamu harus tahu siapa target pasarmu. Menekuni hobi fotografi tidak melulu harus pakai kamera canggih nan mahal. Kamu bisa mengabadikan momen dengan ponselmu.",
                "Melansir Tempo, dengan menggunakan kamera ponsel, kamu bisa langsung jepret dan probabilitas kehilangan suatu momen sangat kecil. Keuntungan lainnya, kamu bisa segera mengedit fotomu dan mengunggahnya ke sosial media.",
                "Menurut Oscar Matuloh, seperti dikutip dari Liputan6.com, untuk jadi seorang fotografer yang handal juga kredibel diperlukan disiplin dan konsistensi dalam menjaga eksistensi di dunia fotografi.",
                "Menurut Oscar Matuloh, seperti dikutip dari Liputan6.com, untuk jadi seorang fotografer yang handal juga kredibel diperlukan disiplin dan konsistensi dalam menjaga eksistensi di dunia fotografi.",
                "Para fotografer streetstyle biasanya akan memamerkan karya mereka di situs pribadi maupun situs penjualan gambar. Jadi media bisa langsung membeli karya mereka.",
                "Ingin mulai berbisnis dari karya foto yang sudah ada? Kamu bisa mulai memperkenalkan diri melalui situs berbagi gambar hingga menjual karyamu pada situs tersebut.",
                "",
                "",
                "",
                R.drawable.fg_deskripsi3,
                "httpsimages.jdmagicbox.com",
                "a.\tMengambil gambar untuk barang yang dicetak atau barang pameran.\n" +
                        "b.\tMengabadikan peristiwa.\n" +
                        "c.\tMengirimkan pesan kepada masyarakat melalui gambar atau objek yang di foto.\n" +
                        "d.\tMeningkatkan kepedulian dan menuturkan kisah yang tidak muncul ke permukaan.\n" +
                        "e.\tMempromosikan kawasan wisata lewat foto untuk menarik minat wisatawan.\n" +
                        "f.\tMeningkatkan pemahaman masyarakat atas suatu persoalan.\n" +
                        "g.\tMemberi konsultasi dan saran kepada klien mengenai teknis dalam pemotretan.\n",
                R.drawable.fg_deskripsi4,
                "httpsinfotografi.com",
                "a.\tPengetahuan eksposur\n" +
                        "b.\tPengetahuan mode pemotretan\n" +
                        "c.\tPengetahuan genre fotografi\n" +
                        "d.\tPengetahuan teknik pengambilan gambar\n" +
                        "e.\tPengetahuan sudut pengambilan gambar\n" +
                        "f.\tKeterampilan menyusun komposisi\n" +
                        "g.\tPengetahuan seputar lensa dan alat yang digunakan\n",
                R.drawable.fg_deskripsi5,
                "httpswww.creativelive.comblog",
                "Seorang fotografer bisa bekerja secara independen, bisa juga masuk ke industri media dan jurnalistik. Fotografer bisa memilih bidang fotografi yang ditekuni, seperti fotografi fashion, makanan, interior, perjalanan, atau pernikahan.",
                R.drawable.fg_deskripsi6,
                "httpswww.diykamera.comwp-content",
                "Jika kamu ingin berkarier pada profesi ini, maka ilmu yang harus kamu kuasai adalah: Fotografi, Film dan Televisi, Ilmu Komunikasi, dan Desain."));

        listPekerjaans.add(new ListPekerjaan(R.drawable.gambar_depan_guru,
                "Guru",
                "Guru SMP/SMA merupakan orang tua kedua bagi siswa-siswi di sekolah menengah. (Read more...)",
                R.drawable.guru_deskripsi,
                "Rp.2.500.000 – Rp.4.500.000",
                "S1 Sederajat",
                "Sertifikasi Kompetensi Guru",
                "Guru SMP/SMA merupakan orang tua kedua bagi siswa-siswi di sekolah menengah. Seorang guru di jenjang pendidikan menengah bertanggung jawab untuk mengajarkan mata pelajaran yang sesuai dengan keilmuannya.\n" +
                        "Nah, inilah beda antara guru SD dengan guru SMP/SMA. Kalau kebanyakan guru SD mengampu semua mata pelajaran selain agama dan olahraga, guru SMP/SMA hanya mengampu mata pelajaran tertentu. \nJadi di SMP/SMA dikenal ada guru matematika, guru bahasa indonesia, guru biologi, guru kimia, guru fisika, guru ekonomi, guru geografi, guru sejarah, dan sebagainya.\n" +
                        "Jadi benar-benar hanya mengajarkan suatu mata pelajaran yang sesuai sama bidang keahliannya. \nGuru SMP/SMA juga ada yang diberi tugas tambahan untuk menjadi wali kelas, pembimbing kegiatan ekstrakurikuler, serta menjadi bagian dari kegiatan administrasi sekolah. \nTugas yang dilakukan oleh guru pun berbeda tergantung pada karakteristik sekolah dan tujuan yang diterapkan sekolah.\n",
                R.drawable.guru_deskripsi2,
                "httpsassets-a1.kompasiana.com",
                "Pernah dengar istilah guru profesional? Mengutip Kompas, guru profesional adalah guru yang punya kompetensi dan keahlian sebagai pendidik, mampu membangun kesejawatan, serta bisa merawat jiwa sosial.",
                "Apa benar karakter guru bisa menentukan prestasi murid? Faktanya ada  pengaruh kepribadian dan cara mengajar guru terhadap daya tangkap siswa seperti diberitakan dalam Kompas.",
                "Melansir Kompas, keberadaan guru honorer di daerah terluar, terdepan, dan tertinggal ternyata memainkan peran yang cukup sentral dalam upaya meningkatkan kualitas pendidikan.",
                "","","","","","","",
                R.drawable.guru_deskripsi3,
                "httpscdn2.tstatic.net",
                "a.\tMengajarkan dan mendidik para peserta didik.\n" +
                        "b.\tMemandu siswa dalam memecahkan permasalahan dalam materi pembelajaran.\n" +
                        "c.\tMembuat kurikulum pembelajaran sesuai dengan perkembangan sistem pendidikan.\n" +
                        "d.\tMenyusun rencana pembelajaran dan silabus mata pelajaran yang diampu.\n" +
                        "e.\tMengevaluasi pembelajaran peserta didik melalui tes tertulis ataupun praktik.\n",
                R.drawable.guru_deskripsi4,
                "httpsfajar.co.idwp-content",
                "a.\tKeterampilan komunikasi\n" +
                        "b.\tKemampuan persuasive-inspiratif\n" +
                        "c.\tKemampuan berpikir kreatif\n" +
                        "d.\tKemampuan observasi\n" +
                        "e.\tKemampuan melakukan analisis\n" +
                        "f.\tKemampuan manajerial\n" +
                        "g.\tPemahaman perkembangan peserta didik\n",
                R.drawable.guru_deskripsi5,
                "httpsimg.okeinfo.netcontent",
                "Potensi karier seorang guru SMP/SMA sangat dipengaruhi oleh jumlah angka kreditnya. Berkarier sebagai guru SMP/SMA tentu sangat mungkin kamu mendapat tugas tambahan sebagai wali kelas, bendahara sekolah, wakil kepala sekolah, bahkan kepala sekolah. Jadi sangat mungkin untuk kamu tidak sekadar berperan sebagai guru yang mengampu mata pelajaran tertentu. Nah kalau kamu ingin menjadi guru, selain lewat penerimaan CPNS, bisa juga mulai meniti kariermu sebagai guru honorer, guru kontrak, atau sejenisnya.",
                R.drawable.guru_deskripsi6,
                "httpstempatasik.comwp-content",
                "Jika kamu ingin berkarier pada profesi ini, maka ilmu yang harus kamu kuasai adalah: Ilmu Pendidikan dan, Keguruan, Pendidikan Matematika, Pendidikan Bahasa dan Sastra Indonesia, Pendidikan Bahasa Inggris, dan Pendidikan Olahraga, dan bidang keilmuan lain yang diajarkan di bangku sekolah."));

        listPekerjaans.add(new ListPekerjaan(R.drawable.gambar_depan_illustrator,
                "Illustrator",
                "Ilustrator merupakan profesi yang bergerak dibidang art dengan kemampuan untuk menterjemahkan berbagai subjek, (Read more..)",
                R.drawable.illust_deskripsi,
                "Rp.4.000.000 – Rp.8.000.000",
                "D3 Sederajat",
                "D3 Sederajat",
                "Ilustrator merupakan profesi yang bergerak dibidang art dengan kemampuan untuk menterjemahkan berbagai subjek, objek, keadaan ataupun berbagai macam hal lainnya dalam bentuk gambar. \nKemampuan menggambar tentu menjadi modal utama bagi seorang ilustrator, karena sehari-hari kamu akan mengerjakan gambar ilustrasi sesuai kebutuhan. \nIlustrator bisa bekerja di berbagai bidang industri namun yang paling umum adalah di industri kreatif dan industri media.\n" +
                        "Selain jago gambar, seorang ilustrator harus bisa menerjemahkan keinginan klien dalam bentuk visual supaya pesan yang ada bisa tersampaikan. \nMakanya, pekerjaan ini butuh kepekaan dan kemampuan untuk mengubah gambaran abstrak dalam konsep menjadi ilustrasi yang mampu dilihat oleh mata. \nBiasanya, seorang ilustrator akan mulai membuat ilustrasi sesuai dengan konsep yang telah disusun sebelumnya.\n",
                R.drawable.illust_deskripsi2,
                "httpscdn.idntimes.com",
                "Pamor profesi ilustrator makin hari makin menanjak. Apalagi di era digital, ilustrator punya posisi penting di industri kreatif.",
                "Mengutip Kompas, para ilustrator bisa dengan mudah memanfaatkan internet untuk memamerkan karya ilustrasinya. Jadi selain berpatisipasi dalam pameran, kamu juga bisa menciptakan galerinya sendiri di dunia maya.",
                "Bekerja sebagai ilustrator juga patuh terhadap deadline. Misalnya saja ilustrator untuk Google Doodle, mereka harus berhadapan sama deadline yang sempit.",
                "Melansir Liputan6.com, dalam waktu sebulan ada banyak banget momentum yang harus divisualisasikan lewat doodle. Kebayangkan, ternyata pekerjaan sebagai ilustrator bukan cuma harus kreatif dan berpikir out of the box, tapi juga harus disiplin waktu.",
                "e.\tSeorang ilustrator harus punya kemampuan negosiasi terutama saat melakukan penawaran dengan klien. Melansir Tribunnews.com, ilustrator harus bisa menerapkan harga yang layak, pantas dan pastinya nggak merugikan.",
                "","","","","",
                R.drawable.illust_deskripsi3,
                "httpscdn.idntimes.com",
                "a.\tMelakukan komunikasi dan berkonsultasi dengan klien untuk menyesuaikan keinginan klien tersebut.\n" +
                        "b.\tMenerjemahkan pesan, ide, maupun cerita dalam bentuk visual yang menarik.\n" +
                        "c.\tMendesain sebuah karya ilustrasi yang akan ditampilkan di buku pustaka, iklan, website, majalah, koran, komik, kemasan produk, atau lainnya.\n" +
                        "d.\tMenampilkan karya-karya ilustrasi di media sosial sebagai sebuah alat promosi.\n" +
                        "e.\tMelakukan koordinasi dengan tim produksi untuk memastikan kualitas karya ilustrasi yang akan ditampilkan.\n",
                R.drawable.illust_deskripsi4,
                "httpscdn02.indozone.id",
                "a.\tKemampuan berpikir kreatif\n" +
                        "b.\tKemampuan berpikir kritis\n" +
                        "c.\tKemampuan visualisasi\n" +
                        "d.\tKemampuan menggambar\n" +
                        "e.\tKemampuan menggunakan software\n" +
                        "f.\tPemahaman nirmana\n",
                R.drawable.illust_deskripsi5,
                "httpsfastwork.idblog",
                "Perjalanan awal meniti karier sebagai seorang ilustrator dengan membuat portofolio ilustrasi yang sudah kamu buat. Kamu bisa meniti karier dengan bergabung di perusahaan periklanan maupun media massa pada bagian grafis, creative atau bahkan marketing. Ilustrator yang ditempatkan pada divisi grafis biasanya terbagi menjadi artist, designer dan engineer. Dengan peningkatan kemampuan, pengalaman dan prestasi kerja nantinya bisa berpeluang untuk naik jabatan hingga menjadi art director. \n" +
                        "Jika suatu saat kamu mau membuka jasa ilustrasi sendiri pun tidak masalah! Dengan kemampuan dan relasi yang dibangun, bukan tidak mungkin kamu atau tim yang kamu pimpin akan menangani berbagai proyek besar seperti penerbitan buku cerita, buku pelajaran, iklan, dan sebagainya.\n",
                R.drawable.illust_deskripsi6,
                "httpsidseducation.com",
                "Jika kamu ingin berkarier pada bidang profesi ini, maka ilmu yang harus kamu kuasai adalah Seni Rupa dan Desain."));

        listPekerjaans.add(new ListPekerjaan(R.drawable.gambar_depan_konsultanpajak,
                "Konsultan Pajak",
                "Konsultan pajak merupakan sebutan bagi orang yang menawarkan jasa konsultasi (Read more..)",
                R.drawable.konsultan_deskripsi,
                "Rp.4.000.000 – Rp.6.000.000",
                "S1 Sederajat",
                "Sertifikasi Konsultan Pajak (Sertifikasi A, B, C)",
                "Konsultan pajak merupakan sebutan bagi orang yang menawarkan jasa konsultasi bidang perpajakan untuk membantu wajib pajak perorangan maupun wajib pajak badan dalam melaksanakan hak dan memenuhi kewajiban perpajakannya.\n" +
                        "Jasa yang ditawarkan konsultan pajak sangat beraneka ragam. Konsultan pajak membantu mengurus hal-hal yang berkaitan dengan kepatuhan pajak kliennya, mulai dari menghitung, membayar, juga melaporkannya. \nKonsultan pajak menawarkan jasa konsultansi masalah perpajakan, selain itu juga bisa melakukan perencanaan pajak untuk mengoptimalkan keuntungan klien.\n" +
                        "Konsultan pajak juga punya tanggung jawab untuk mewakili dan/atau mendampingi kliennya ketika ada pemeriksaan. Kalau ternyata ditemukan adanya kelebihan dalam pembayaran pajak, seorang konsultan pajak bisa membantu kliennya dalam \npelaksanaan restitusi pajak mulai dari persiapan data, penyampaian restitusi, pemeriksaan, sampai diterimanya pengembalian atas kelebihan pajak.\n" +
                        "Jika terjadi sengketa pajak, konsultan pajak bisa memberikan pelayanan penyelesaian sengketa, seperti pengajuan keberatan pajak, banding, dan sebagainya. \nDengan demikian, wajib pajak akan merasa nyaman saat menjalani pemeriksaan maupun ketika menghadapi permasalahan pajak.\n",
                R.drawable.konsultan_deskripsi2,
                "httpscarmeladaviscpatx.com",
                "Ternyata, untuk jadi Konsultan Pajak tidak harus lulusan Perpajakan atau Akuntansi, ya. Mengutip Kompas, siapa saja bisa jadi Konsultan Pajak, asalkan lulus Ujian Sertifikasi Konsultan Pajak (USKP).",
                "Dikutip dari Majalah Pajak, konsultan pajak adalah pemberi informasi yang lengkap, ia berperan sebagai adviser.",
                "Konsultan pajak yang sudah lulus kualifikasi dan punya izin praktik harus selalu meningkatkan kemampuannya. Karena, selain memahami semua ketentuan perpajakan, konsultan pajak dituntut untuk menyampaikan peraturan perpajakan ke masyarakat secara jelas supaya terhindar dari sanksi pajak",
                "Dengan pengetahuan perpajakan yang mumpuni kamu memiliki kemampuan untuk melihat celah dan menggunakannya untuk tujuan yang nggak baik. Dibutuhkan integritas yang kuat supaya nggak ikut tercebur dalam kasus pajak, seperti penyelundupan ataupun korupsi pajak.",
                "Jasa konsultan pajak kini banyak digunakan oleh wajib pajak orang pribadi maupun badan karena dirasa lebih efisien, bisa meminimalisir terjadinya kesalahan atau risiko lain di bidang perpajakan.",
                "","","","","",
                R.drawable.konsultan_deskripsi3,
                "httpscdn1-production-images-kly.akamaized.net",
                "a.\tMelakukan perhitungan pajak, pembayaran pajak sampai pada pelaporan pajak kliennya.\n" +
                        "b.\tMelayani konsultasi perpajakan, melakukan perencanaan pajak, dan mengoptimalkan keuntungan bagi klien.\n" +
                        "c.\tMelakukan evaluasi data terkait dengan munculnya beban pajak yang dirasa tidak menguntungkan klien.\n" +
                        "d.\tMembantu klien dalam restitusi pajak.\n" +
                        "e.\tMewakili dan/atau mendampingi klien saat ada pemeriksaan pajak.\n" +
                        "f.\tMembantu menyusun pedoman perpajakan bagi klien.\n",
                R.drawable.konsultan_deskripsi4,
                "httpscdn1-production-images-kly.akamaized.net",
                "a.\tKemampuan melakukan analisis\n" +
                        "b.\tKemampuan manajerial\n" +
                        "c.\tKemampuan berpikir strategis\n" +
                        "d.\tKemampuan komunikasi\n" +
                        "e.\tKemampuan problem solving\n" +
                        "f.\tPengetahuan perpajakan\n" +
                        "g.\tDetail, teliti, tekun\n",
                R.drawable.konsultan_deskripsi5,
                "httpsindopajak.id",
                "Kamu bisa mulai karier sebagai konsultan pajak setelah lulus minimal sertifikasi pajak A dan B. Jika ingin menimba ilmu dan pengalaman terlebih dahulu sebelum mendirikan Kantor Konsultan Pajak (KKP) milik sendiri, Kamu bisa bergabung dengan KKP yang sudah terlebih dahulu berdiri sebagai junior tax consultant. Jenjang karier di KKP secara umum adalah:\n" +
                        "a.\tJunior Tax Consultant\n" +
                        "b.\tSenior Tax Consultant\n" +
                        "c.\tTax Supervisor\n" +
                        "d.\tTax Director\n",
                R.drawable.konsultan_deskripsi6,
                "httpslh3.googleusercontent.com",
                "Jika kamu ingin berkarier pada profesi ini, maka ilmu yang harus kamu kuasai adalah: Perpajakan, Akuntansi, Ilmu Hukum, dan Ilmu Administrasi Fiskal."));

        listPekerjaans.add(new ListPekerjaan(R.drawable.gambar_depan_koreografer,
                "Koreografer",
                "Koreografer dikenal dengan istilah pengarah tari. (Read more..)",
                R.drawable.koreo_deskripsi,
                "Rp.4.000.000 – Rp.10.000.000",
                "D3 Sederajat",
                "",
                "Koreografer dikenal dengan istilah pengarah tari. Koreografer merupakan sebutan untuk orang yang merancang koreografi atau merancang komposisi tari supaya jadi pola gerakan yang terstruktur.\n" +
                        "Selain di bidang tari, koreografer juga punya peranan penting untuk menciptakan koreografi dalam bidang lain yang berkaitan erat sama gerak tubuh seperti olahraga gimnastik, ski, gerakan untuk pemandu sorak, marching band, opera, sampai aksi tarung di panggung.\n" +
                        "Jadi, seorang koreografer akan mencari berbagai gerakan yang dinilai paling sesuai sama musik yang dimainkan. \nUntuk itu, seorang koreografer harus berfikir kreatif, inovatif, dan mempunyai kepekaan terhadap rasa, sehingga bisa menghasilkan karya yang menghibur.\n",
                R.drawable.koreo_deskripsi2,
                "httpsblue.kumparan.com",
                "Jasa seorang koreografer kini banyak dibutuhkan. Menyadur Liputan6, karier sebagai koreografer bisa mendapatkan gaji yang cukup besar. Nah kapan lagi kan menjadikan hobi sebagai karier gemilang di masa depan?",
                "Tahukah kamu, untuk jadi koreografer tidak cuma harus pintar menari? Menurut koreografer Eko Supriyanto, dikutip dari Tempo, seorang koreografer perlu tahu akar budaya dan tradisi Indonesia supaya gerakan dan tarian yang diciptakan punya makna juga filosofi.",
                "c.\tSyarat lain yang tidak kalah penting untuk jadi koreografer adalah pandai mengolah rasa. Melansir Tempo, kemampuan mengolah rasa diperlukan bukan sekadar supaya sensitif dengan tubuhnya melainkan perlu sensitif terhadap perasaan juga wawasan.",
                "","","","","","","",
                R.drawable.koreo_deskripsi3,
                "httpsbuset-online.com",
                "a.\tMenghasilkan karya yang dapat menghibur para penonton\n" +
                        "b.\tMengembangkan ide dalam membuat konsep gerakan-gerakan dalam tarian.\n" +
                        "c.\tMelakukan setting gerakan dan membuat alur gerakan dalam sebuah pertunjukan, baik itu tarian ataupun gerak panggung lainnya.\n" +
                        "d.\tMengatur urutan penampilan, tarian, ritme dalam sebuah pertunjukan.\n" +
                        "e.\tMemastikan bahwa penari memahami dan melakukan gerakan dengan baik.\n",
                R.drawable.koreo_deskripsi4,
                "httpslh3.googleusercontent.com",
                "a.\tKemampuan berpikir kreatif\n" +
                        "b.\tKemampuan berinovasi\n" +
                        "c.\tKemampuan melakukan analisis\n" +
                        "d.\tKemampuan menciptakan tarian\n" +
                        "e.\tKemampuan mengelola pertunjukan seni\n" +
                        "f.\tKemampuan mengola rasa\n" +
                        "g.\tKeterampilan komunikasi\n",
                R.drawable.koreo_deskripsi5,
                "httpslh3.googleusercontent.com",
                "Biasanya seorang koreografer berangkat dari karier sebagai penari. Nah, seiring dengan pengalamannya di bidang olah tubuh, penari yang juga punya passion untuk berkarya dan berbagi pengalamannya dengan orang lain akan nyemplung sebagai koreografer. Sebagai seorang koreografer, mungkin awalnya akan menangani pertunjukan skala kecil tapi bukan tidak mungkin nantinya kamu akan mengerjakan proyek di event-event besar.",
                R.drawable.koreo_deskripsi6,
                "httpsres.klook.com",
                "Jika kamu ingin berkarier pada profesi ini, maka ilmu yang harus kamu kuasai adalah: Seni tari"));

        listPekerjaans.add(new ListPekerjaan(R.drawable.gambar_depan_pegawai_bank,
                "Pegawai Bank",
                "Pegawai bank bertanggung jawab atas usaha penyimpanan dan penyaluran dana milik (Read more..)",
                R.drawable.pbank_deskripsi,
                "Rp.4.500.000 – Rp.5.000.000",
                "D3 Sederajat",
                "Financial Risk Manager ((FRM), Chartered Financial Analyst (CFA)",
                "Pegawai bank bertanggung jawab atas usaha penyimpanan dan penyaluran dana milik masyarakat kepada masyarakat lain yang membutuhkan. \nPegawai bank juga memberikan jasa penukaran uang seperti transfer dan wesel, serta usaha penjualan investasi keuangan seperti obligasi pemerintah dan dana investasi. \nDi dalam bidang usaha apapun, diperlukan pengetahuan khusus bidang keuangan. Stereotype yang sering diberikan kepada karier pegawai bank adalah mereka yang berparas cantik dan tampan, \nbekerja di ruangan ber-AC dan anti kepanasan! Padahal di samping itu pegawai bank punya tanggung jawab yang besar dalam mengelola dana masyarakat.",
                R.drawable.pbank_deskripsi2,
                "httpscdn2.tstatic.net",
                "Melansir Kompas, siapapun bisa bekerja di bank, sekalipun tidak memiliki latar pendidikan perbankan. Apalagi di Indonesia ada beberapa jenis perbankan. Kalau di bank sentral, kamu akan banyak mengkaji kebijakan moneter untuk mencapai kestabilan harga-harga. Di bank retail, kamu akan banyak berhubungan langsung dengan pelanggan. Ada juga bank syariah yang sedang berkembang di Indonesia dengan prinsip syariah, serta ada investment bank.",
                "Kerja di bank memang mendatangkan banyak keuntungan.. Mengutip Kompas, selain penghasilan yang relatif tinggi, kamu bisa membangun jaringan bisnis. Karena selama bekerja, kamu bisa ketemu sama semua kalangan, mulai dari pebisnis kecil sampai konglomerat.",
                "Meski diganjar dengan penghasilan yang menjanjikan, ternyata risiko dan tingkat stres pekerja bank juga cukup tinggi.. Dikutip dari Kompas, turn over atau perputaran karyawan perbankan bisa sampai 15%-20% per tahun. Jadi, besarnya tanggung jawab risiko dan kode etik yang dipikul seorang pegawai bank bisa memicu tingginya tingkatan stres.",
                "Era distrupsi teknologi telah membuat perbankan mengurangi jumlah pegawainya. Melansir Tempo, perkembangan teknologi digital akan mengubah komposisi pegawai bank. Bahkan, sekitar 50% posisi kerja pegawai bank yang saat ini ada diprediksi akan hilang dalam waktu 10 tahun.",
                "Di era digital seperti sekarang ini, tidak dipungkiri kalau keberadaan tenaga manusia sedikit banyak mulai tergantikan oleh tenaga mesin. Hal ini tidak berarti kalau semua pegawai bank juga akan tergantikan dengan mesin, seperti dikutip dari Kompas. Nah, yang tidak bisa digantikan dengan mesin adalah posisi-posisi yang sifatnya relationship basis.",
                "","","","","",
                R.drawable.pbank_deskripsi3,
                "httpseljohnnews.com",
                "a.\tBertanggung jawab atas usaha penyimpanan uang masyarakat, usaha pemberian pinjaman dengan bunga, usaha penukaran mata uang seperti transfer dan wesel, serta usaha penjualan investasi keuangan seperti obligasi pemerintah dan dana investasi.\n" +
                        "b.\tMelakukan pemasaran dengan mencari nasabah.\n" +
                        "c.\tMenganalisis penerima pinjaman.\n" +
                        "d.\tMelakukan analisa kelayakan pemberian kredit, dan pemantauan terhadap kelancaran pembayaran debitur.\n",
                R.drawable.pbank_deskripsi4,
                "httpsimage.freepik.com",
                "a.\tKeterampilan komunikasi\n" +
                        "b.\tKemampuan melakukan analisis\n" +
                        "c.\tKemampuan melakukan observasi\n" +
                        "d.\tKemampuan berpikir sistematis\n" +
                        "e.\tPenguasaan bahasa asing\n",
                R.drawable.pbank_deskripsi5,
                "httpsinboundhype.comwp-content",
                "Selain bank sentral seperti Bank Indonesia, karier di dunia perbankan umumnya hampir sama baik di bank konvensional maupun bank syariah. Jalur masuk ke perbankan itu beraneka ragam ya, Tapi, yang paling banyak diincar oleh para fresh graduate adalah rekrutmen Officer Development Program (ODP). Jalur ini mencari pegawai bertalenta yang diproyeksikan untuk menduduki kursi pimpinan di masa yang akan datang. Setelah kamu diterima melalui jalur ODP, biasanya kamu akan mengikuti pendidikan selama kurang lebih 6 bulan, ada juga on job training. Nah, nantinya kalau lulus ODP, kursi pertama yang kamu duduki adalah jabatan Relationship Manager di kantor cabang. Tapi tidak menutup kemungkinan kamu akan meniti karier di kantor pusat, misalnya dengan menjadi staf yang ditempatkan di divisi tertentu. Jenjang karier yang akan kamu temukan di dunia perbankan (terutama di kantor cabang) adalah:\n" +
                        "a.\tFrontliner merupakan petugas setara staf yang berhadapan langsung dengan nasabah, seperti teller dan customer service.\n" +
                        "b.\tUntuk staf yang bekerja “dibelakang layar” dikenal dengan Back Office Staff, tugasnya seperti menghitung hutang-piutang, mengecek ketersediaan barang hingga urusan logistik dan HRD.\n" +
                        "c.\tPosisi lain pada tingkatan staf adalah Marketing Staff, tugasnya adalah memasarkan produk-produk keuangan bank tempatnya bekerja mulai dari pinjaman, deposito berjangka dan produk lain.\n" +
                        "d.\tSupervisor. Bertugas mengawasi pekerjaan staf, umumnya sudah tidak memiliki tugas sebagai frontliner.\n" +
                        "e.\tManager. Memimpin tiap-tiap divisi seperti marketing, relation dan lainnya dalam suatu cabang.\n" +
                        "f.\tKepala Cabang. Pertugas memimpin seluruh alur kegiatan yang terjadi di kantor cabangnya.\n",
                R.drawable.pbank_deskripsi6,
                "httpsliputankarir.com",
                "Jika kamu ingin berkarier pada profesi ini, maka ilmu yang harus kamu kuasai adalah: Perbankan, Manajemen, Manajemen, Ilmu Ekonomi, Ilmu Administrasi, Ilmu Hukum, Matematika, Statistika, dan Ilmu Komputer."));

        listPekerjaans.add(new ListPekerjaan(R.drawable.gambar_depan_peneliti_kimia,
                "Peneliti dan Teknisi Kimia",
                "Peneliti dan teknisi kimia biasanya bekerja di perusahaan swasta seperti pabrik kimia. (Read more..)",
                R.drawable.peneliti_deskripsi,
                "Rp.3.500.000 – Rp.8.000.000",
                "D3 Sederajat",
                "",
                "Peneliti dan teknisi kimia biasanya bekerja di perusahaan swasta seperti pabrik kimia. Tugas dari pekerjaan ini adalah mengembangkan produk kimia baru sesuai dengan core business perusahaan. \nMisalnya produk plastik, serat kimia, karet sintetis, atau lainnya.\n" +
                        "Selain di perusahaan-perusahaan yang ada di industri kimia dasar, peneliti dan teknisi kimia juga bisa bergabung di perusahaan farmasi, pertambangan dan perminyakan, juga lainnya. \nSeorang peneliti kimia juga bisa bekerja di lembaga penelitian negara atau institusi pendidikan.\n" +
                        "Biasanya peneliti yang bekerja di instansi tersebut sering berhadapan dengan penelitian-penelitian dasar seperti penemuan reagen pada produk kimia atau penelitian bahan kimia lainnya untuk memecahkan suatu permasalahan. \nSeorang peneliti dan teknisi kimia harus harus punya keterampilan teknis serta menguasai kaidah dan metode ilmiah.\n",
                R.drawable.peneliti_deskripsi2,
                "https.live.staticflickr.com",
                "Tabel periodik yang ada pada pelajaran kimia saat ini adalah pengembangan dari tabel periodik yang diperkenalkan oleh Dmitri Mendeleev pada 1869. Awalnya tabel tersebut cuma memiliki 63 unsur, perlu 75 tahun untuk membuat tabel periodik dengan susunan yang paling tepat.",
                "Tidak akan menemukan unsur kimia dengan huruf J dan Q baik pada lambang maupun nama lengkap unsur di tabel periodik yang diperkenalkan oleh Dmitri Mendeleev. Dilansir dari idntimes.com, kamu bisa menemukan huruf X terdapat dalam nama Xenon (nomor 54), huruf Y sebagai lambang itrium (39) dan Z pada zink (30) serta zirkonium (40).",
                "Ternyata nggak semua unsur kimia dalam tabel periodik ada di alam, beberapa tercipta karena campur tangan manusia. Seperti pada tahun 2016 yang lalu ada empat unsur kimia baru yang diumumkan oleh International Union of Pure and Applied Chemistry (IUPAC) yaitu Unsur 113: nihonium (Nh), Unsur 115: moscovium (Mc), Unsur 117: tennessine (Ts), Unsur 118: oganesson (Og).",
                "Penasaran bagaimana cara ilmuwan memberi nama pada unsur kimia? Dilansir dari situs National Geographic Indonesia, nama-nama unsur terutama untuk unsur kimia yang baru ditemukan harus memberi penghormatan pada tempat, wilayah geografi atau ilmuwan.",
                "Industri kimia menawarkan gaji yang tergolong tinggi. Dilansir dari Liputan6, perusahaan-perusahaan di bidang kimia menawarkan gaji Rp5.400.000 sampai Rp10.100.000 juta per bulan.",
                "Di Indonesia, ada lima industri yang menjadi fokus dalam mengimplementasikan industri 4.0, seperti diberitakan dalam Detik.com. Tiga di antaranya adalah industri kimia, tekstil, serta makanan dan minuman.",
                "Parodi penghargaan nobel untuk penelitian yang awalnya membuat kita tertawa tapi akhirnya berhasil membuat kita berpikir kritis. Menyadur Liputan6, perusahaan mobil Volkswagen ternyata pernah meraih Ig Nobel di bidang kimia. Penghargaan itu didapat karena keberhasilannya menemukan cara mencurangi tes emisi.",
                "","","",
                R.drawable.peneliti_deskripsi3,
                "httpsas2.ftcdn.net",
                "a.\tMengembangkan produk kimia baru seperti plastik, serat kimia, karet sintetis, atau lainnya sesuai core business perusahaan.\n" +
                        "b.\tMelakukan penelitian dasar seperti penemuan reagen pada produk kimia atau penelitian bahan kimia lainnya.\n" +
                        "c.\tMelakukan pelatihan untuk mengembangkan kemampuan dalam melakukan penelitian kimia.\n" +
                        "d.\tMenyebarluaskan hasil penelitian di bidang kimia sebagai upaya dalam memecahkan suatu permasalahan.\n",
                R.drawable.peneliti_deskripsi4,
                "httpslh6.googleusercontent.comproxy",
                "a.\tKemampuan meneliti\n" +
                        "b.\tKemampuan melakukan analisis\n" +
                        "c.\tKemampuan berpikir kritis\n" +
                        "d.\tKemampuan kerja tim\n" +
                        "e.\tPemahaman ilmu kimia\n" +
                        "f.\tPemahaman keteknikan\n" +
                        "g.\tPenguasaan bahasa asing\n",
                R.drawable.peneliti_deskripsi5,
                "httpspreviews.123rf.comimages",
                "Seseorang yang bekerja sebagai peneliti dan teknisi kimia bisa bekerja di berbagai bidang seperti baik di perusahaan maupun di pemerintahan bahkan menjadi pengajar. Nah, kalau peneliti dan teknisi kimia yang bekerja di perusahaan punya potensi untuk mengembangkan kariernya ke depan sesuai dengan posisi yang tersedia di perusahaan, misalnya:\n" +
                        "a.\tJunior Engineer\n" +
                        "b.\tEngineer\n" +
                        "c.\tSenior Engineer\n" +
                        "d.\tSupervisor\n" +
                        "e.\tJunior Manager\n" +
                        "f.\tManager\n" +
                        "g.\tSenior Manager\n" +
                        "h.\tDeputy General Manager\n" +
                        "i.\tGeneral Manager\n" +
                        "j.\tSenior General Manager\n" +
                        "k.\tDeputy Director\n" +
                        "l.\tDirector\n" +
                        "m.\tVice President\n" +
                        "n.\tPresident Director\n",
                R.drawable.peneliti_deskripsi6,
                "httpspreviews.123rf.comimages",
                "Jika kamu ingin berkarier pada profesi ini, ilmu yang perlu kamu pelajari adalah: Teknik Kimia, Kimia."));

        listPekerjaans.add(new ListPekerjaan(R.drawable.gambar_depan_pengacara,
                "Pengacara",
                "Pengacara biasa disebut Advokat, merupakan profesi yang menawarkan jasa hukum di (Read more..)",
                R.drawable.pengacara_deskripsi,
                "Rp.4.000.000 – Rp.6.000.000",
                "S1 Sederajat",
                "Sertifikat Pendidikan Khusus Profesi Advokat (PKPA)",
                "Pengacara biasa disebut Advokat, merupakan profesi yang menawarkan jasa hukum di dalam maupun di luar pengadilan. \nJasa hukum yang diberikan bisa berupa konsultasi hukum, bantuan hukum, menjalankan kuasa, mewakili, mendampingi, membela, maupun tindak hukum lainnya untuk kepentingan klien. \nYang menjadi klien bisa orang, badan hukum, atau lembaga lainnya. Nah, setelah pengacara menerima kuasa dari klien maka timbullah kewenangan pada dirinya untuk menjalankan profesinya sebagai penegak hukum. Dalam sistem penegakan hukum, pengacara yang punya kedudukan setara dengan hakim, jaksa, dan polisi. \nMeski begitu, peran dan fungsinya berbeda ya.\n" +
                        "Seorang pengacara juga melakukan berbagai tugas yang berkaitan dengan urusan hukum dan penanganannya. Pengacara bisa memberikan jasa konsultasi, negosiasi maupun dalam pembuatan kontrak-kontrak dagang, pembuatan dokumen hukum lainnya seperti surat perjanjian dan surat wasiat, \npenyelesaian perselisihan dengan musyawarah, dan sebagainya.\n" +
                        "Nah, dalam praktiknya, pengacara harus mengkhususkan diri pada bidang tertentu. Tak heran ada firma hukum/kantor advokat yang fokus ke pekerjaan litigasi (jasa hukum di dalam pengadilan),\n tapi ada juga yang mengerjakan pekerjaan korporasi atau non-litigasi (jasa hukum di luar pengadilan).\n",
                R.drawable.pengacara_deskripsi2,
                "httpscdn0-production-images-kly.akamaized.net",
                "Untuk jadi seorang pengacara, Kamu harus mengambil Pendidikan Khusus Profesi Advokat (PKPA) setelah mengantongi ijazah Sarjana Hukum. Eits tunggu dulu, tidak serta merta langsung jadi pengacara. Kamu harus lulus ujian yang diselenggarakan organisasi advokat, kemudian magang selama 2 tahun di kantor advokat. Untuk diangkat sebagai pengacara kamu harus berusia minimal 25 tahun.",
                "Berbeda dengan notaris dan PPAT yang punya wilayah kerja terbatas, seorang pengacara bisa bekerja di seluruh wilayah Indonesia. Luas banget kan?",
                "Gaji seorang pengacara didapat dari honor yang diberikan kliennya. Nah, besarnya honor ini tergantung dengan kesepakatan antara pengacara dan klien. Jadi, semakin baik reputasimu, bisa jadi akan semakin besar honor yang akan Kamu terima.",
                "d.\tSeorang pengacara memiliki kewajiban memberikan bantuan hukum secara cuma-cuma pada masyarakat yang tidak mampu sebagaimana diatur dalam PP Nomor 83 Tahun 2008.",
                "","","","","","",
                R.drawable.pengacara_deskripsi3,
                "httpscdn2.tstatic.nettribunnews",
                "a.\tMemberikan konsultasi hukum pada klien.\n" +
                        "b.\tMembela perkara yang jadi tanggung jawabnya sesuai dengan kuasa yang telah diberikan klien.\n" +
                        "c.\tMewakili dan/atau mendampingi klien dalam sidang pengadilan.\n" +
                        "d.\tMenegakkan keadilan.\n" +
                        "e.\tMenyusun kontrak-kontrak dalam perjanjian.\n" +
                        "f.\tMemberikan pelayanan jasa hukum secara gratis kepada masyarakat yang tidak mampu.\n" +
                        "g.\tMelakukan legal audit.\n",
                R.drawable.pengacara_deskripsi4,
                "httpslh3.googleusercontent.com",
                "a.\tKemampuan komunikasi\n" +
                        "b.\tKemampuan negosiasi\n" +
                        "c.\tKemampuan melakukan analisis\n" +
                        "d.\tKemampuan kerja tim\n" +
                        "e.\tPenguasaan ilmu hukum\n" +
                        "f.\tPenguasaan bahasa asing\n",
                R.drawable.pengacara_deskripsi5,
                "httpsnewsat.com.auwp-content",
                "Pengacara umumnya tergabung dalam sebuah firma hukum. Dalam meniti karier, seorang pengacara akan mulai sebagai intern selama 2 tahun, kemudian meningkat seiring dengan pengalaman dan jam terbangnya bisa menduduki posisi sebagai equity partner. Di sebuah firma hukum, penjenjangan karier dimulai dari law clerk (paralegal) sampai equity partner. Akan tetapi, firma hukum dengan jumlah pengacara kurang dari 15 orang biasanya punya penjenjangan karier yang lebih sederhana.\n" +
                        "a.\tLaw Clerk (Paralegal)\n" +
                        "b.\tFreelance Attorney\n" +
                        "c.\tContract Attorney (Intern)\n" +
                        "d.\tNon-lawyer Partner\n" +
                        "e.\tSenior Attorney\n" +
                        "f.\tAssociate Attorney\n" +
                        "g.\tSenior Partner\n" +
                        "h.\tOf Counsel (Advisor)\n" +
                        "i.\tNon-equity Partner (Contract Partner)\n" +
                        "j.\tEquity Partner\n",
                R.drawable.pengacara_deskripsi6,
                "httpsstatik.tempo.co",
                "Jika kamu ingin berkarier pada profesi ini, maka ilmu yang harus kamu kuasai adalah: Ilmu Hukum."));

        listPekerjaans.add(new ListPekerjaan(R.drawable.gambar_depan_teknisi_mesin,
                "Perancang dan Teknisi Mesin",
                "Perancang dan teknisi mesin bertugas merancang desain dan mengembangkan (Read more..)",
                R.drawable.tekmesin_deskripsi,
                "Rp.4.000.000 – Rp.8.000.000",
                "D3 Sederajat",
                "",
                "Perancang dan teknisi mesin bertugas merancang desain dan mengembangkan peralatan elektronik, peralatan komunikasi, otomotif, atau lainnya sesuai dengan bidang keahliannya. \nSelain pada bagian desain, profesi ini juga punya andil dalam pemeliharaan suatu sistem mekanik. Pekerjaan ini membutuhkan pengetahuan dan keterampilan yang berkaitan dengan teknik menggambar desain dan proses produksi secara keseluruhan seperti struktur suku cadang dan material yang digunakan. \nBahkan setelah proses produksi selesai, pekerjaan ini membutuhkan simulasi untuk dilakukan pengembangan, seperti perbaikan sesuai kebutuhan dan pengenalan teknologi baru. \nNah, yang lagi tren belakangan ini, para perancang dan teknisi mesin berlomba-lomba menciptakan alat dari sumber energi terbarukan. \nJadi nilai plus deh untuk masuk ke bursa kerja perancang dan teknisi mesin kalau menguasai soal konversi energi mesin!",
                R.drawable.tekmesin_deskripsi2,
                "httpslh3.googleusercontent.com",
                "Ternyata Sojin pernah mempelajari teknik mesin!  Idol Korea dari girl band Girl’s Day ini belajar di Yeungnam University. Wah nggak terbayang ya kalau sekarang dia jadi teknisi.",
                "Melansir Liputan6, teknisi mesin bersama dengan profesi lain di bidang keteknikan termasuk yang bersaing ketat di bursa tenaga kerja ASEAN",
                "Perancang dan teknisi mesin punya peran penting di industri otomotif. Liputan6 menuliskan bahwa kehadiran perancang dan teknisi mesin dengan keterampilan yang mumpuni mampu menghadirkan berbagai kendaraan berteknologi canggih. Lihat saja, motor jaman sekarang kan tidak hanya itu-itu saja.",
                "d.\tSelama ini mungkin perempuan identik dengan kerja kantoran. Eits, jangan salah, mengutip Detik.com, salah satu produsen motor di Italia menempatkan pekerja perempuan di divisi perakitan mesin. Ya, sekitar 14% dari total pekerja di lini produksi diisi oleh perempuan. Hebat kan?",
                "","","","","","",
                R.drawable.tekmesin_deskripsi3,
                "httpslh3.googleusercontent.comproxy",
                "a.\tMerancang dan mengembangkan peralatan elektronik rumah tangga, peralatan komunikasi, dan peralatan kantor\n" +
                        "b.\tMempresentasikan jenis teknologi baru dalam peralatan mesin di rumah tangga, kantor, hingga pabrik kepada konsumen\n" +
                        "c.\tMengembangkan desain yang diikuti dengan tren teknologi mesin saat ini\n" +
                        "d.\tMelakukan penelitian-penelitian terhadap desain dan juga teknologi mesin untuk mengembangkan ide-ide dalam merancang sebuah teknologi mesin baru\n",
                R.drawable.tekmesin_deskripsi4,
                "httpslh3.googleusercontent.comproxy",
                "a.\tPemahaman teknik produksi mesin\n" +
                        "b.\tKemampuan menggambar\n" +
                        "c.\tKemampuan berpikir kritis\n" +
                        "d.\tKemampuan melakukan analisis\n" +
                        "e.\tKemampuan meneliti\n" +
                        "f.\tPenguasaan bahasa asing\n",
                R.drawable.tekmesin_deskripsi5,
                "httpspcr.ac.idassetsmediapcr_media",
                "Seorang perancang dan teknisi mesin sangat dibutuhkan baik di di industri otomotif, elektronik, manufaktur, kedirgantaraan, dan lainnya. Potensi pertumbuhan karier seorang perancang dan teknisi mesin ke depan cukup potensial, dengan memperhatikan prestasi kerja. Kamu bisa mulai merintis karier lewat jalur management trainee. Biasanya posisi yang tersedia di berbagai perusahaan antara lain:\n" +
                        "a.\tJunior Engineer\n" +
                        "b.\tEngineer\n" +
                        "c.\tSenior engineer\n" +
                        "d.\tSupervisor\n" +
                        "e.\tJunior manager\n" +
                        "f.\tManager\n",
                R.drawable.tekmesin_deskripsi5,
                "httpss3-ap-southeast-1.amazonaws.com",
                "Jika kamu ingin berkarier pada profesi ini, maka ilmu yang harus kamu kuasai adalah: Teknik Mesin."));

        listPekerjaans.add(new ListPekerjaan(R.drawable.gambar_depan_perawat,
                "Perawat",
                "Perawat adalah seseorang yang bertugas memberikan asuhan pada individu, keluarga, juga (Read more..)",
                R.drawable.perawat_desk,
                "Rp.3.500.000 – Rp.5.000.000",
                "D3 Sederajat",
                "Sertifikasi Kompetensi Perawat, Sertifikasi Profesi Perawat",
                "Perawat adalah seseorang yang bertugas memberikan asuhan pada individu, keluarga, juga kelompok dalam keadaan sakit maupun sehat. Secara umum, ada 2 jenis perawat, yaitu Perawat vokasi, minimal lulusan D3 Keperawatan, dan Perawat Profesi, minimal lulusan S1KeperawatanProfesi ini terdiri dari Ners dan Ners Spesialis. \nSeorang perawat setidaknya berperan sebagai care provider, manager and community leader, educator, advocate, juga researcher.. \n" +
                        "Dalam menjalankan profesinya, perawat akan bekerja sama dengan dokter umum, dokter spesialis, bidan, juga tenaga kesehatan lainnya. Di rumah sakit dan klinik, \nperawat mengikuti petunjuk dokter untuk mengurus dan membantu pasien dalam pemeriksaan kesehatan dan perawatan medis. Perawat memahami gejala pasien dengan tepat dan berupaya untuk mengatasinya. \n",
                R.drawable.perawat_desk2,
                "httpscdns.klimg.com",
                "Dahulu perawat dikenal dengan sebutan zuster/suster untuk perawat perempuan dan bruder untuk perawat laki-laki. Namun saat ini panggilan tersebut sudah nggak digunakan lagi dan diganti dengan sebutan perawat atau Ners, jadi jangan sampai salah panggil ya!",
                "Panggilan Mantri yang merujuk pada perawat senior (umumnya laki-laki) yang bertugas di puskesmas yang ada di desa. Dilansir dari okezone, ternyata mantri adalah sebuah tingkatan dalam sistem pemerintahan jaman dahulu dan tidak hanya ada dalam dunia medis, melainkan dalam berbagai bidang.",
                "Pendidikan perawat atau juru rawat pertama di indonesia dibuka tahun 1906. Pendidikan ini diselenggarakan oleh Rumah Sakit Persatuan Gereja Indonesia (RS PGI) Cikini.",
                "Florence Nightingale dikenal sebagai ibu keperawatan dunia, perempuan yang lahir 12 Mei 1820 ini menetapkan standarisasi dalam dunia keperawatan pada masa Perang Krimea (1853-1856). Saking besar jasanya dalam dunia medis, ia juga dikenal sebagai pelopor ilmu keperawatan modern. Hari lahir Florence Nightingale kemudian diabadikan menjadi hari perawat sedunia (International Nurses Day).",
                "Pendidikan perawat termasuk pendidikan yang tersedia dari segala jenjang mulai dari D3, D4, S1, S2 hingga S3. Tahun 2019 ada dua universitas yang menyelenggarakan pendidikan doktoral (S3) untuk jurusan Keperawatan yaitu Universitas Indonesia dan Universitas Airlangga. Pendidikan perawat juga pernah diselenggarakan setingkat SMA namun ditutup pada tahun 1999 oleh Kemenkes.",
                "Tahu tidak? Kalau aktris Julie Walters yang berperan jadi ibunya Ron Weasley di film Harry Potter adalah seorang mantan perawat di Inggris!",
                "Sama seperti dokter, perawat juga ada pendidikan spesialis. Setidaknya ada 5 jenis pendidikan spesialis keperawatan antara lain; keperawatan anak, keperawatan jiwa, keperawatan komunitas, keperawatan maternitas dan keperawatan medikal bedah.",
                "Selain pendidikan spesialis ada juga sertifikasi untuk perawat sehingga memiliki keahlian tertentu atau yang disebut perawat keahlian khusus. Merujuk pada situs Persatuan Perawat Nasional Indonesia (PPNI) terdapat 24 himpunan dan ikatan perawat dengan keahlian khusus yang tergabung dalam organisasi tersebut.",
                "Sama seperti dokter dan bidan, perawat juga boleh membuka praktek mandir. Merujuk pada UU Keperawatan No. 38 tahun 2014 yang boleh membuka praktik mandiri adalah perawat dengan pendidikan minimal lulusan D3 keperawatan dan tentunya harus memiliki Surat Tanda Registrasi (STR) dan Surat Izin Praktik Perawat (SIPP).",
                "Perawat Indonesia juga bisa go international! Buktinya, Persatuan Perawat Nasional Indonesia (PPNI) mencatat kalau sampai April 2017 ada 652 perawat yang bekerja di luar negeri.",
                R.drawable.perawat_desk3,
                "httpsimage-cdn.medkomtek.com",
                "a.\tMemberikan asuhan keperawatan kepada individu, keluarga, kelompok dan masyarakat dalam upaya peningkatan kesehatan, pencegahan penyakit, penyembuhan penyakit, dan pemulihan kesehatan.\n" +
                        "b.\tMenetapkan jenis intervensi keperawatan sesuai tingkat ketergantungan klien.\n" +
                        "c.\tMengumpulkan data kuantitatif untuk pembuatan laporan kasus klien.\n" +
                        "d.\tMenyusun laporan pelaksanaan tugas dan program bidang keperawatan.\n" +
                        "e.\tMenyiapkan perumusan kebijakan teknis, pembinaan, pengkoordinasian penyelenggaraan tugas, pelaksanaan keperawatan.\n" +
                        "f.\tMenginventarisasi permasalahan berhubungan dengan pelaksanaan tugas dan program kerja bidang keperawatan.\n" +
                        "g.\tMelakukan proses edukasi kesehatan pada klien mengenai kebutuhan dasar.\n" +
                        "h.\tMengevaluasi ketercapaian edukasi kesehatan dan rencana tindak lanjut.\n",
                R.drawable.perawat_desk4,
                "httpslive.mrf.iostatics",
                "a.\tKemampuan berkomunikasi\n" +
                        "b.\tKemampuan bekerja sama dalam tim\n" +
                        "c.\tKemampuan problem solving\n" +
                        "d.\tKemampuan berpikir kritis\n" +
                        "e.\tKeterampilan interpersonal\n" +
                        "f.\tBerorientasi pada pelayanan untuk melayani\n" +
                        "g.\tPenguasaan bahasa asing\n" +
                        "h.\tTeliti, detail, tekun\n",
                R.drawable.perawat_desk5,
                "httpsnpuh82iut7x3aosxba3ol14m-wpengine.netdna-ssl.com",
                "Sama seperti dokter dan bidan, perawat juga boleh membuka praktek mandiri dengan Merujuk pada UU Keperawatan No. 38 tahun 2014 yang boleh membuka praktik mandiri adalah perawat dengan pendidikan minimal lulusan D3 keperawatan dan tentunya harus memiliki Surat Tanda Registrasi (STR) dan Surat Izin Praktik Perawat (SIPP).\n" +
                        "Umumnya jenjang karier perawat dapat berbeda-beda tergantung dengan instansi tempatnya bekerja bahkan nggak menutup kemungkinan untuk terlibat dalam tingkatan manajerial. Menurut pengalaman lapangan, masa kerja perawat dapat dikategorikan menjadi perawat junior dan senior. Jika sesuai dengan fungsinya, secara umum jenjang karier perawat terbagi menjadi 4 bagian besar dengan masing-masing memiliki 5 level di dalamnya.\n" +
                        "a.\tPerawat Klinis (PK). Perawat yang memberikan asuhan keperawatan langsung kepada klien sebagai individu, keluarga, kelompok, dan masyarakat.\n" +
                        "b.\tPerawat Manajer (PM). Perawat yang mengelola pelayanan keperawatan di sarana kesehatan, baik sebagai pengelola tingkat bawah (frontline manager), tingkat menengah (middle management), maupun tingkat atas (top manager). Untuk jadi Perawat Manajer level I harus punya kompetensi Perawat Klinis level II.\n" +
                        "c.\tPerawat Pendidik (PP). Perawat yang memberikan pendidikan kepada peserta didik di institusi pendidikan keperawatan. Untuk jadi Perawat Pendidik level I harus punya kompetensi Perawat Klinis level III.\n" +
                        "d.\tPerawat Peneliti/Riset (PR). Perawat yang bekerja di bidang penelitian keperawatan/kesehatan. Untuk jadi Perawat Peneliti/Riset level I harus punya kompetensi Perawat Klinis level IV.\n",
                R.drawable.perawat_desk6,
                "httpswebcomicms.net",
                "Jika kamu ingin berkarier pada profesi ini, maka ilmu yang harus kamu kuasai adalah: Ilmu Keperawatan."));

        listPekerjaans.add(new ListPekerjaan(R.drawable.gambar_depan_pilot,
                "Pilot",
                "Pilot bertugas mengoperasikan pesawat dengan aman. Seorang pilot bisa bekerja (Read more..)",
                R.drawable.pilot_desk,
                "Rp.30.000.000 – Rp.50.000.000",
                "SMA/K Sederajat",
                "Private Pilot License (PPL), Commercial Pilot License (CPL), Airline Transport Pilot License (ATPL), Multi-Engine Rating (MER), Instrument Rating (IR).",
                "Pilot bertugas mengoperasikan pesawat dengan aman. Seorang pilot bisa bekerja untuk pesawat komersial, helikopter untuk penyaluran barang dan informasi, maupun pesawat mesin kecil.\n Tapi, tahukah kalau ternyata, seorang pilot punya tanggung jawab yang besar sebagai kru pesawat. \nDalam hal keamanan dan keselamatan penerbangan, pilot adalah sosok yang paling penting dan bertanggung jawab penuh.\n" +
                        "Selama dalam penerbangan, pilot berwenang melakukan berbagai tindakan untuk mencegah terjadinya gangguan keamanan dan keselamatan penerbangan. Misalnya, apabila ada penumpang yang membahayakan penerbangan, pilot punya wewenang untuk memutuskan apakah pesawat putar balik atau melakukan pendaratan darurat di bandara terdekat guna menurunkan dan/atau menyerahkan penumpang ke otoritas bandara agar ditindak tegas.\n" +
                        "Syarat menjadi seorang pilot adalah kesehatan tubuh, tentunya juga didukung dengan kemampuan spesialis dan kemampuan berbahasa asing. Pemeriksaan fisik bahkan dilakukan secara rutin setelah mulai pekerjaan sebagai pilot. \nJika tidak memenuhi kriteria dalam fisik maka seseorang tidak dapat melanjutkan pekerjaan sebagai pilot.\n",
                R.drawable.pilot_desk2,
                "Beberapa hal yang harus kamu ketahui tentang pilot",
                "Dikutip dari Kompas, rata-rata pendapatan pilot di Indonesia mencapai Rp40.000.000,00 sampai Rp50.000.000,00 per bulan. Kalau untuk pilot junior yang baru mengantongi commercial pilot license, pendapatannya sekitar Rp30.000.000,00 per bulan. Nah, nantinya, seiring dengan bertambahnya jam terbang juga pengalaman, pendapatan pilot akan meningkat.",
                "Seorang kapten senior di maskapai bintang lima, bisa menerima take home pay Rp100.000.000,00 sampai Rp150.000.000,00 per bulan. Menariknya lagi, selain gaji, fasilitas yang didapat pilot beragam. Sebagai seorang karyawan maskapai penerbangan, pilot berhak atas jaminan kesehatan, jaminan kecelakaan, sampai layanan antar jemput dari dan ke bandara.",
                "Dilansir dari Republika, seorang pilot dapat konsesi berupa tiket untuk dirinya dan keluarga ataupun potongan harga di bawah harga normal untuk semua rute penerbangan yang dilayani maskapai tempatnya bekerja.",
                "Meski diganjar dengan pendapatan dan fasilitas yang sangat menggiurkan, nyatanya profesi pilot rentan terhadap tingkat stress yang tinggi. Menurut Alif, seorang flight instructor, dikutip dari Kompas, tingkat stress tinggi pilot terdapat pada saat proses landing.",
                "Ketika landing, dibutuhkan konsentrasi tinggi, karena pilot harus menjaga kecepatan laju pesawat, menyesuaikan titik luncur, membaca cuaca, sampai memperhatikan kecukupan bahan bakar.",
                "Lulus sekolah pilot, tidak serta merta langsung bisa bekerja di perusahaan transportasi dan mengoperasikan burung besi. Faktanya, banyak lulusan pilot di Indonesia yang belum terserap di industri penerbangan. Menurut Menteri Perhubungan Budi Karya Sumadi dikutip dari Kompas, pilot-pilot yang masih menganggur wajib meningkatkan kompetensi diri.",
                "Pilot nggak hanya bisa berkarier menerebangkan pesawat transportasi komersil. Seorang pilot juga dibutuhkan untuk penerbangan sewaan (air charter), pilot helikopter, pilot di penerbangan hutan (bush operation), juga pilot perkebunan.",
                "8.\tPerempuan menjadi pilot? Kenapa tidak? Banyak kok pilot perempuan di dunia ini. Bahkan United Airlines mempekerjakan 7,4 persen pilot perempuan.",
                "","",
                R.drawable.pilot_desk3,
                "https://images.unsplash.com/photo",
                "a.\tMemastikan semua pemeriksaaan teknis telah dilakukan sebelum dan sesudah penerbangan.\n" +
                        "b.\tMenjamin keamanan dan keselamatan penumpang selama masa penerbangan.\n" +
                        "c.\tMenerbangkan pesawat secara profesional bersama co-pilot dengan memperhatikan cuaca dan teknik.\n" +
                        "d.\tMemastikan penumpang merasa nyaman selama penerbangan.\n" +
                        "e.\tMelaporkan masalah yang terjadi dalam penerbangan dan perubahan rencana penerbangan ke otoritas bandara.\n" +
                        "f.\tMencatat komunikasi dari petugas air traffic control dan menerapkan rencana penerbangan apabila diperlukan.\n" +
                        "g.\tMemiliki inisiatif yang tinggi dalam memecahkan sebuah permasalahan dalam penerbangan serta mencari solusi terbaik tanpa mengakibatkan terjadinya situasi berbahaya.\n" +
                        "h.\tBersikap tenang dalam menghadapi situasi di dalam setiap keadaan dan tetap mengusahakan penerbangan berjalan dengan selamat.\n",
                R.drawable.pilot_desk5,
                "https://c4.wallpaperﬂare.com/wallpaper",
                "a.\tSense of accuracy\n" +
                        "b.\tPenguasaan bahasa asing\n" +
                        "c.\tPengetahuan hukum udara (airlaw)\n" +
                        "d.\tPengetahuan keselamatan penerbangan\n" +
                        "e.\tKemampuan berpikir logis\n" +
                        "f.\tKemampuan berpikir rasional\n" +
                        "g.\tKemampuan problem solving\n",
                R.drawable.pilot_desk6,
                "https://wallpapercave.com/wp/wp5914729.jpg",
                "Seorang pilot tidak tiba-tiba langsung menerbangkan pesawat Airbus A330 atau Boeing 737, tapi secara bertahap mulai dari pesawat yang berukuran kecil. Di awal kariernya, seorang pilot baru tentu harus didampingi oleh Kapten saat menerbangkan pesawat. Jenjang karier seorang pilot juga mempengaruhi besaran gaji yang diterima.\n" +
                        "a.\tSecond Officer (SO). Karier pertama di dunia penerbangan bagi seorang lulusan sekolah pilot. Second Officer diizinkan untuk menerbangkan pesawat kecil dengan pendampingan seorang kapten. Untuk naik ke jenjang selanjutnya, selain harus menambah jam terbang, SO juga harus mengambil lisensi dan sertifikasi tertentu.\n" +
                        "b.\tFirst Officer (FO) atau Co-pilot. FO adalah pilot yang memiliki lisensi ATPL dan MER, tapi untuk menerbangkan pesawat tetap dengan pendampingan seorang kapten. Tugas First Officer adalah membantu kapten pilot dalam hal navigasi. Selain itu, FO juga bertanggung jawab menggantikan kapten pada saat berhalangan.\n" +
                        "c.\tCaptain atau Komandan Penerbangan. Jenjang tertinggi seorang pilot dalam kariernya di penerbangan. Kapten pilot bertugas untuk mengawasi FO ketika menerbangkan pesawat. Kapten juga bertanggung jawab terhadap segala sesuatu yang terjadi selama penerbangan.\n",
                R.drawable.pilot_desk,
                "https://1.bp.blogspot.com/-RN53Kq8joqY/WdX",
                "Jika kamu ingin menjadi seorang pilot, beberapa pendidikan yang sesuai adalah: Penerbangan, Teknik Penerbangan, Keselamatan Penerbangan, dan Manajemen Penerbangan."));

        listPekerjaans.add(new ListPekerjaan(R.drawable.gambar_depan_polisi,
                "Polisi",
                "Seperti anggota Avengers, seorang polisi mengemban tugas utama yaitu bertindak (Read more..)",
                R.drawable.silop_desk,
                "Rp.2.000.000 – Rp.6.000.000",
                "SMA/K Sederajat",
                "",
                "Seperti anggota Avengers, seorang polisi mengemban tugas utama yaitu bertindak tegas dalam menghadapi kejahatan dan pelanggaran demi menjaga keamanan dan ketertiban masyarakat di muka bumi. \nSebagai aparat penegak hukum, polisi memiliki peranan penting di setiap negara berdaulat. Di Indonesia, profesi ini berada dalam sebuah lembaga keren bernama Kepolisian Negara Republik Indonesia (POLRI). \nTugas lainnya yang pasti bikin kamu makin bangga adalah melakukan tindakan pencegahan kriminal, melakukan penyelidikan terhadap pelanggaran hukum, memberikan perlindungan, mengawal orang-orang penting, dan sebagainya. Nggak cuma itu,, terdapat pula beberapa jenis tugas polisi yang lebih khusus seperti menjadi penyidik, mengidentifikasi sidik jari, mengatur lalu lintas, mengemudikan kapal laut, hingga bertanggung jawab mengatur anjing pelacak.",
                R.drawable.silop_desk2,
                "httpsasset.kompas.com",
                "Untuk menjadi seorang polisi, kamu harus belajar di sekolah khusus yakni Akademi Kepolisian. Akademi Kepolisian (AKPOL) merupakan sebuah sekolah kedinasan yang berada di bawah naungan Kementerian Pertahanan Nasional RI. Kamu harus menimba ilmu selama sekitar 4 tahun sebelum terjun ke lapangan dengan pangkat Inspektur Polisi Dua (Ipda). Tidak ada biaya yang perlu kamu keluarkan saat menimba ilmu di sini.",
                "Selain lewat pendidikan tinggi di Akademi Kepolisian kamu juga bisa bergabung dengan Polri lewat Sekolah Inspektur Polisi Sumber Sarjana (SIPSS) yang ditujukan untuk lulusan D4, S1 dan S2 pada bidang tertentu seperti psikologi, kedokteran, bahasa, teknik dan beberapa bidang lainnya.",
                "Untuk kamu yang ingin langsung bergabung dengan kepolisian langsung setelah lulus SMA nanti, kamu bisa mendaftar lewat rekrutmen Bintara atau Tamtama. Masing-masing seleksi mencetak seorang polisi dengan pangkat dan tugas tertentu.",
                "Terdapat beberapa syarat yang harus dilalui dan diketahui, selain syarat-syarat administrasi dan pendidikan minimum. Seorang calon anggota polisi tentu harus bebas dari narkoba dan tidak memiliki bekas tato atau tindik.",
                "Terdapat batas tinggi minimal yang diberlakukan yaitu 165 cm untuk pria, dan 160 cm untuk wanita (terdapat perbedaan syarat tinggi untuk setiap bidang kepolisian). Kamu juga harus mengikuti beberapa tes yakni tes akademik, pemeriksaan kesehatan, psikologi, antropometri, dan kesamaptaan jasmani.",
                "Polisi identik dengan kata Bhayangkara, sebenarnya apa sih Bhayangkara? Dikutip dari polri.go.id, pada zaman Kerajaan Majapahit Patih Gajah Mada membentuk pasukan pengamanan yang disebut dengan Bhayangkara yang bertugas melindungi raja dan kerajaan.",
                "Di awal masa kemerdekaan, kepolisian berada dalam lingkungan Kementerian Dalam Negeri dengan nama Djawatan Kepolisian Negara. Bertanggung jawab secara administrasi pada Kementerian Dalam Negeri dan secara operasional pada Jaksa Agung.",
                "Mulai tanggal 1 Juli 1946 dengan Penetapan Pemerintah tahun 1946 No. 11/S.D. Djawatan Kepolisian Negara yang bertanggung jawab langsung kepada Perdana Menteri. Tanggal 1 Juli inilah yang setiap tahun diperingati sebagai Hari Bhayangkara hingga saat ini.",
                "Polisi Wanita pertama kali hadir di Bukittinggi, Sumatera Barat. Dikutip dari tempo.co, pada 1 September 1948 ada 6 perempuan berdarah minang yang mulai mengikuti mulai mengikuti Pendidikan Inspektur Polisi di Sekolah Polisi Negara Bukittinggi. Dari sana, kemudian dicanangkan 1 September sebagai hari lahir polisi wanita.",
                "Bingung antara Polsek dan Polres? Kepolisian Negara Republik Indonesia Sektor (Polsek) bertugas di wilayah kecamatan. Kepolisian Negara Republik Indonesia Resort (Polres) ada di tingkat kabupaten/kota. Di tingkat provinsi ada Kepolisian Negara Republik Indonesia Daerah (Polda) dan Markas Besar Kepolisian Negara Republik Indonesia (Mabes Polri) untuk tingkat pusat.",
                R.drawable.silop_desk3,
                "httpsawsimages.detik.net.id",
                "Berikut adalah peran dan tanggung jawab anggota kepolisian menurut UU No.2 Tahun 2002, BAB III tentang “Tugas dan Wewenang Kepolisian Negara Republik Indonesia yang telah dirangkum:\n" +
                        "a.\tMemelihara keamanan dan ketertiban masyarakat\n" +
                        "b.\tMenegakkan hukum\n" +
                        "c.\tMemberikan perlindungan, pengayoman, dan pelayanan kepada masyarakat\n" +
                        "d.\tMelaksanakan pengaturan, penjagaan, pengawalan, dan patroli terhadap kegiatan masyarakat dan pemerintah sesuai kebutuhan\n" +
                        "e.\tMenyelenggarakan segala kegiatan dalam menjamin keamanan, ketertiban, dan kelancaran lalu lintas di jalan\n",
                R.drawable.silop_desk4,
                "httpscdn.krjogja.com",
                "a.\tKemampuan menembak\n" +
                        "b.\tKemampuan bela diri\n" +
                        "c.\tKemampuan psikologi\n" +
                        "d.\tKemampuan intelijen\n" +
                        "e.\tPengetahuan tentang hukum dan pemerintah\n" +
                        "f.\tPengetahuan tentang keselamatan dan keamanan\n" +
                        "g.\tPenguasaan bahasa asing\n",
                R.drawable.silop_desk5,
                "httpscdn2.tstatic.net",
                "a.\tMasing-masing anggota kepolisian memiliki pangkat tersendiri, yang sangat tergantung dengan jenjang karier serta jenjang pendidikan yang telah ditempuh. Setiap pangkat memiliki besaran penghasilan tersendiri.\n" +
                        "b.\tTamtama. Merupakan pangkat polisi paling rendah, yang umumnya disandang oleh lulusan sekolah kepolisian atau mereka yang baru masuk di jajaran kepolisian. Beberapa jabatan yang tergolong sebagai Tamtama adalah Bhayangkara Dua (Bharada), Bhayangkara Satu (Bharatu), Ajudan Brigadir Polisi Satu (Briptu), dll.\n" +
                        "c.\tBintara. Sama seperti Tamtama, pangkat Bintara juga terbagi dalam beberapa bagian seperti Sersan Mayor Polisi, Sersan Satu Polisi, Brigadir Polisi Dua (Bripda), Brigadir Polisi Satu (Briptu), dll.\n" +
                        "d.\tBintara Tinggi. Golongan yang termasuk dalam pangkat ini antara lain Ajun Inspektur Polisi Dua (Aipda), dan Ajun Inspektur Polisi Satu (Aiptu).\n" +
                        "e.\tPerwira Pertama. Golongan perwira pertama adalah Inspektur Polisi Dua (Ipda), Inspektur Polisi Satu (Iptu), dan Ajun Komisaris Polisi (AKP).\n" +
                        "f.\tPerwira Menengah. Beberapa golongan yang termasuk dalam pangkat ini adalah Komisaris Polisi (Kompol), Ajun Komisaris Besar Polisi (AKBP), dan Komisaris Besar Polisi (Kombes Pol).\n" +
                        "g.\tPerwira Tinggi. Golongan yang termasuk dalam pangkat Perwira Tinggi adalah Brigadir Jenderal Polisi (Brigjen Pol), dan Inspektur Jenderal Polisi (Irjen Pol).\n",
                R.drawable.silop_desk6,
                "httpslh3.googleusercontent.com",
                "Jika kamu ingin berkarier pada profesi ini, ilmu yang perlu kamu pelajari adalah: Pendidikan Kepolisian, Ilmu Hukum, Ilmu Psikologi, Ilmu Komunikasi."));

        listPekerjaans.add(new ListPekerjaan(R.drawable.gambar_depan_pramugari,
                "Pramugara/i",
                "Banyak orang yang menganggap profesi pramugari atau pramugara erat kaitannya (Read more..)",
                R.drawable.pramu_desk,
                "Rp.15.000.000 – Rp.20.000.000",
                "SMA/K Sederajat",
                "Fight Attendant Certificate, Sertifikasi Pertolongan Pertama",
                "Banyak orang yang menganggap profesi pramugari atau pramugara erat kaitannya dengan orang yang bekerja di dalam pesawat, padahal profesi ini sebenarnya ditujukan untuk semua moda transportasi. \nSelain pesawat, kamu juga akan bertemu dengan profesi ini di layanan Kereta Api dan Bus.\n Saat ini mulai banyak maskapai yang mengganti sebutan pramugari dan pramugara dengan awak kabin (cabin crew) atau flight attendant.\n" +
                        "Tugas utama seorang awak kabin adalah menjaga keselamatan dan melayani penumpang ketika ada kendala terutama di dalam kabin pesawat. \nHal ini dilakukan supaya penumpang bisa menikmati perjalanan dengan nyaman. Pada saat keadaan darurat, pramugari/pramugara harus mengambil keputusan dengan kepala dingin untuk menjamin keamanan dan keselamatan penumpang. \nMengingat profesi ini bukanlah pekerjaan yang mudah, maka setiap calon pramugari/pramugara harus menjalani pelatihan intensif terlebih dahulu di training center milik maskapai penerbangan. \nDi samping pelayanan dengan penuh perhatian dan kepedulian, pekerjaan ini memerlukan kemampuan penanganan yang tepat dan pengambilan keputusan secara logis dan rasional.\n",
                R.drawable.pramu_desk2,
                "httpscdn.futuready.com",
                "Selain di pesawat, kamu akan menemukan profesi pramugari dan pramugara di moda transportasi lainnya seperti kereta api, kapal laut dan bus. Di layanan kereta api, profesi pramugari dan pramugara dikenal dengan sebutan Prami dan Prama",
                "Profesi pramugari/pramugara ternyata menyimpan tanggung jawab yang besar sampai bertaruh nyawa. Dikutip dari Kompas, dalam tugasnya, pramugari/pramugara harus memprioritaskan keselamatan penumpang dibanding keselamatan yang lain, termasuk dirinya sendiri.",
                "Untuk bisa terbang, seorang pramugari/pramugara harus mengantongi lisensi atau ijin mengudara dari Dinas Perhubungan dan Transportasi Udara. Dilansir dari Kompas, pramugari/pramugara harus melewati tahapan training simulasi di training center, training terbang dengan pendampingan pramugari/pramugara senior, serta serangkaian tes materi, psikologi, juga kesehatan.",
                "Pramugari/pramugara adalah pekerjaan on call, sewaktu-waktu ditugaskan harus bersedia, bahkan dalam waktu dua jam atau kurang harus bersiap ke bandara untuk berangkat terbang.",
                "Mengutip Kompas, di beberapa maskapai ada yang namanya jaga “ready reserve,” yaitu dua hari dalam sebulan, pramugari/pramugara harus siap di ruang awak bandara dan pakai seragam lengkap untuk jaga-jaga kalau dibutuhkan untuk terbang.",
                "Beberapa maskapai ada yang menerapkan sistem penggajian berdasarkan “jam terbang.” Jadi, pramugari/pramugara digaji setelah pintu kabin ditutup.",
                "Menariknya, seperti disebutkan dalam Kompas, bekerja sebagai pramugari/pramugara bisa dapat “non-revenue flights.” Ya, penerbangan gratis! Bahkan, kalau beruntung bisa dapat kursi kelas satu di penerbangan internasional.",
                "Jika beruntung kamu bisa menikmati kota singgah sambil liburan kecil-kecilan. Karena biasanya, dalam penerbangan regional, ada jeda waktu 10-18 jam. Nikmat bukan?",
                "","",
                R.drawable.pramu_desk3,
                "httpscdn2.tstatic.net",
                "a.\tMengecek ketersediaan peralatan keselamatan penerbangan untuk penumpang dan kru.\n" +
                        "b.\tMemastikan pesawat siap untuk dimasuki penumpang.\n" +
                        "c.\tMembantu menunjukkan tempat duduk penumpang.\n" +
                        "d.\tMelayani penumpang di dalam kabin pesawat terbang.\n" +
                        "e.\tMembantu penumpang yang mengalami kesulitan meletakkan barang bawaan di bagasi kabin.\n" +
                        "f.\tMemberikan informasi-informasi penting mengenai fasilitas dan kegunaannya kepada penumpang.\n" +
                        "g.\tMendemonstrasikan tata cara menggunakan alat keselamatan penerbangan.\n" +
                        "h.\tMengambil keputusan untuk melakukan tindakan yang tepat seperti berusaha sebaik mungkin memikirkan cara untuk menjamin keamanan penumpang.\n" +
                        "i.\tMembantu dan mendampingi penumpang anak kecil, lanjut usia, juga penumpang dengan penanganan khusus.\n" +
                        "j.\tMemberi pertolongan pertama pada penumpang yang sakit dalam perjalanan pesawat.\n",
                R.drawable.pramu_desk4,
                "httpscdn2.tstatic.net",
                "a.\tKemampuan komunikasi\n" +
                        "b.\tKemampuan berpikir logis\n" +
                        "c.\tKemampuan problem solving\n" +
                        "d.\tKeterampilan dalam pelayanan\n" +
                        "e.\tPenguasaan bahasa asing\n" +
                        "f.\tKesiapsiagaan\n",
                R.drawable.pramu_desk5,
                "httpscdn2.tstatic.net",
                "Pramugari/pramugara juga punya jenjang karier. Untuk naik ke jenjang di atasnya, seorang pramugari/pramugara harus memenuhi kualifikasi yang dipersyaratkan dan lulus training. Di beberapa maskapai penerbangan, jenjang karier seorang pramugari/pramugara ditunjukkan dengan warna seragamnya.\n" +
                        "a.\tPramugari/Pramugara Junior. Dalam penerbangan bertugas sebagai pelaksana.\n" +
                        "b.\tPramugari/Pramugara Senior. Dalam penerbangan bertugas sebagai pelaksana.\n" +
                        "c.\tMaitre D’Cabin. Dalam penerbangan bertugas sebagai koordinator di masing-masing kelas, seperti first class, business class, juga economy class.\n" +
                        "d.\tFlight Manager Service. Tingkatan tertinggi dari jenjang karier seorang pramugari/pramugara. Untuk mencapai posisi ini, pramugari/pramugara yang mendapatkan kesempatan bidding akan menjalani serangkaian tes untuk menjalani training.\n",
                R.drawable.pramu_desk6,
                "httpsmerahputih.com",
                "Jika kamu ingin berkarier pada profesi ini, maka ilmu yang harus kamu kuasai adalah seluruh bidang keilmuan."));

        listPekerjaans.add(new ListPekerjaan(R.drawable.gambar_depan_sutradara,
                "Sutradara",
                "Sutradara menjadi penanggung jawab pada aspek artistik maupun teknis dalam (Read more..)",
                R.drawable.sutra_desk,
                "Rp.10.000.000 – Rp.30.000.000",
                "S1 Sederajat",
                "",
                "Sutradara menjadi penanggung jawab pada aspek artistik maupun teknis dalam pembuatan film. Selain bergerak dalam set produksi film, sama halnya dalam produksi pementasan drama. \nSutradara harus kreatif dan punya pemahaman yang komprehensif di bidang sinematografi supaya bisa menghasilkan visualisasi film yang sesuai dengan naskah skenario. \nPada saat proses produksi, sutradara akan mengarahkan akting para aktor dan aktris, juga kru film mulai dari posisi pengambilan gambar, pencahayaan, suara, dan sebagainya. \nDalam hal ini sutradara harus memastikan jika timnya benar-benar bekerja secara profesional. Ketika produksi telah selesai, sutradara bersama editor akan melakukan proses editing gambar maupun suara. \nNah, kalau kamu ingin jadi sutradara, bisa memulai karier lewat proyek independen, misalnya sebagai sutradara film indie atau film sekolah.",
                R.drawable.sutra_desk2,
                "httpscdn.idntimes.com",
                "Beberapa aktor dan aktris juga ada yang kemudian berada dibalik layar pembuatan film menjadi produser ataupun sutradara. Di antaranya Sujiwo Tejo menggarap Bahwa Cinta itu Ada, Indra Birowo dalam film pendek Restroom, Ernest Prakasa mengerjakan Ngenest dan banyak lainnya",
                "Ada juga novelis yang mencoba peruntungan di industri perfilman, seperti Rachmania Arunita. Mengutip Kompas, penulis novel Eiffel… I’m in Love ini memulai debutnya sebagai sutradara dalam film Lost in Love.",
                "Tahukah Kamu, ternyata kiper tim nasional sepak bola Islandia, Hanners Halldorsson merupakan seorang sutradara. Melansir Kompas, sejak SMA Halldorsson sudah malang melintang jadi sutradara dan fokus menggarap video iklan juga video klip.",
                "","","","","","","",
                R.drawable.sutra_desk3,
                "httpscdn.popbela.com",
                "a.\tMenyeleksi beberapa naskah skenario yang menjadi acuan.\n" +
                        "b.\tMemilih dan menentukan pemeran yang sesuai untuk mewujudkan penafsirannya tersebut.\n" +
                        "c.\tMemvisualisasikan naskah tersebut dalam bentuk adegan dan scene.\n" +
                        "d.\tMemvisualisasikan lakon yang sifatnya gembira menjadi sebuah banyolan atau humor.\n" +
                        "e.\tMenentukan dan menciptakan suasana tertentu secara khusus.\n",
                R.drawable.sutra_desk4,
                "httpscdn2.tstatic.net",
                "a.\tKemampuan manajerial\n" +
                        "b.\tKemampuan berpikir logis\n" +
                        "c.\tKemampuan berpikir kreatif\n" +
                        "d.\tKemampuan kerja tim\n" +
                        "e.\tKemampuan berkomunikasi\n" +
                        "f.\tPengetahuan sinematografi\n",
                R.drawable.sutra_desk5,
                "httpsd15hng3vemx011.cloudfront.net",
                "Untuk jadi sutradara di industri perfilman maupun di panggung pertunjukan drama dan teater, Kamu bisa mulai meniti karier dengan jadi asisten sutradara atau jadi sutradara pada beberapa proyek seperti film indie. Tapi ada juga  sutradara yang memulai kariernya dari seorang penulis naskah skenario (script writer), casting director, dan sebagainya. Seiring dengan banyaknya pengalaman yang kamu miliki, cakupan film yang kamu kerjakan akan semakin luas. Apalagi kalau karyamu diakui dunia, ada kemungkinan kamu akan diterima di industri film luar negeri.",
                R.drawable.sutra_desk6,
                "httpsmedia.tabloidbintang.com",
                "Jika kamu ingin berkarier pada profesi ini, maka ilmu yang harus kamu kuasai adalah: Televisi dan Film, Ilmu Komunikasi"));

        listPekerjaans.add(new ListPekerjaan(R.drawable.gambar_depan_teknisi_alatmedis,
                "Teknisi Peralatan Medis",
                "Teknisi peralatan medik merupakan suatu profesi tenaga kesehatan yg bertanggung (Read more..)",
                R.drawable.alatmed_desk,
                "Rp.4.000.000 – Rp.7.000.000",
                "D3 Sederajat",
                "",
                "Teknisi peralatan medik merupakan suatu profesi tenaga kesehatan yg bertanggung jawab penuh terhadap alat kesehatan yg berada di seluruh fasilitas layanan kesehatan. \nSeorang teknisi peralatan medis juga bertanggung jawab dalam mengoperasikan beberapa peralatan media dibawah kontrol dokter.\n" +
                        "Menjadi tenaga elektro medis tidak sembarangan karena sama halnya dengan dokter, kita juga harus memiliki surat izin praktek dan surat tanda registrasi (STR) yg harus di perpanjang setiap 5 tahun. \n" +
                        "Teknisi alat kesehatan biasanya bekerja di tempat pelayanan kesehatan seperti puskesmas, rumah sakit dan sebagainya. Dalam melaksanakan tugasnya, teknisi alat kesehatan harus memiliki surat izin praktek dan Surat Tanda Registrasi (STR) yang harus diperpanjang setiap 5 tahun. \nSeorang teknisi alat kesehatan juga dibagi menjadi beberapa kategori tanggung jawab. Yaitu teknisi aplikasi, teknisi pemeliharaan, teknisi perbaikan, teknisi kalibrasi layak pakai serta teknisi instalasi dan perancangan.\n",
                R.drawable.alatmed_desk2,
                "httpscdn1-production-images-kly.akamaized.ne",
                "","","","","","","","","","",
                R.drawable.alatmed_desk3,
                "httpscdn1-production-images-kly.akamaized.net",
                "a.\tMengoperasikan alat pendukung kehidupan seperti ventilator, peralatan dialisis, cardiopulmonary bypass (CPB), dan sebagainya.\n" +
                        "b.\tMelakukan pemeriksaan dan pemeliharaan alat-alat kedokteran termasuk memperbaiki dan pengkalibrasian.\n" +
                        "c.\tMengatur dan mengendalikan sistem kelistrikan rumah sakit tetap terkontrol baik agar terpeliharanya peralatan rumah sakit.\n" +
                        "d.\tMelaksanakan uji laik pakai alat kedokteran/kesehatan.\n" +
                        "e.\tMelaksanakan perakitan instalasi alat kedokteran/ kesehatan yang digunakan.\n" +
                        "f.\tMemberikan pelatihan terhadap user/pengguna\n" +
                        "g.\tMengurus data administrasi alat kesehatan\n" +
                        "h.\tMengatur regulasi tentang peredaran alat kesehatan\n",
                R.drawable.alatmed_desk4,
                "httpscdn2.tstatic.net",
                "Pengetahuan dan keahlian yang harus dimiliki oleh seorang pekerja teknisi peralatan medis diantaranya ialah:\n" +
                        "a.\tPengetahuan ilmu teknologi medis\n" +
                        "b.\tPengetahuan ilmu kedokteran dasar\n" +
                        "c.\tPengetahuan ilmu keperawatan\n" +
                        "d.\tPengetahuan manajemen rumah sakit\n" +
                        "e.\tKemampuan analisis dan memecahkan masalah\n" +
                        "f.\tKemampuan melakukan maintenance dan pengkalibrasian alat medis\n" +
                        "g.\tPenguasaan bahasa asing\n",
                R.drawable.alatmed_desk5,
                "httpscdn-image.bisnis.com",
                "Sebagai teknisi alat kesehatan memiliki jenjang karier jika bekerja di lembaga pelayanan kesehatan seperti rumah sakit. Setiap jenjang karier memiliki besaran penghasilan yang berbeda-beda.\n" +
                        "a.\tJunior Teknisi. Junior teknisi adalah jabatan awal sebagai teknisi alat kesehatan. Biasanya junior teknisi bertanggung jawab pada satu jenis pekerjaan atau satu jenis alat saja. Misalnya hanya sebagai penanggung jawab teknisi pemeliharaan.\n" +
                        "b.\tSenior Teknisi. Seorang senior teknisi sudah bertanggung jawab kepada beberapa tugas ataupun peralatan medis di rumah sakit. Mulai dari operasional maupun pemeliharaan. Jabatan yang biasa diberikan adalah Manajer Teknisi.\n" +
                        "c.\tKepala Teknisi. Kepala teknisi menerima pelaporan kerja dan berkoordinasi dengan dokter langsung sebagai pengawas.\n",
                R.drawable.alatmed_desk6,
                "httpslh3.googleusercontent.com",
                "Jika kamu ingin berkarier pada profesi ini, ilmu yang perlu kamu pelajari adalah: Ilmu Teknologi Medis, Teknik Elektromedik, Fisika Medis.\n" +
                        "a.\tUntuk univesitas negeri hanya terdapat di 2 tempat, yaitu:\n" +
                        "1)\tPoltekkes kemenkes jakarta 2\n" +
                        "2)\tPoltekkes kemenkes Surabaya\n" +
                        "b.\tUntuk swasta ada beberapa universitas seperti:\n" +
                        "1)\tUMY\n" +
                        "2)\tUniversitas MH Tamrin\n" +
                        "3)\tStikes Widyahusada\n" +
                        "4)\tdll\n"));

    }


    public void bottomNavBar(){
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navbarlist);
        bottomNavigationView.setSelectedItemId(R.id.nav_dafpeker);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_kontak:
                        startActivity(new Intent(getApplicationContext(), Contact.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_profil:
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_about:
                        startActivity(new Intent(getApplicationContext(), About.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_dafpeker:
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
