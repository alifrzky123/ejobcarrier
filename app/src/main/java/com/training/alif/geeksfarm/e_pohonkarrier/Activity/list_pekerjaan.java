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
                "Kata “Astronot” berasal dari bahasa Yunani, yaitu astron dan nautis. Astron artinya bintang, sedangkan nautis artinya penjelajah. Astronot atau disebut juga dengan istilah Antariksawan. Nah, kalau dalam bahasa melayu Malaysia, Astronot disebut dengan Angkasawan. Astronot merupakan sebutan untuk orang yang sudah memenuhi pelatihan penerbangan antariksa untuk memimpin, menerbangkan, atau jadi awak pesawat antariksa.\n" +
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
                "Ayo ngaku, siapa yang punya cita-cita menjadi dokter saat kecil! Profesi ini memang jadi profesi impian banyak orang meskipun dikenal dengan pekerjaan yang berat dan pendidikan yang terbilang lama. Dokter bertugas mengobati dan mencegah timbulnya kembali penyakit. Jadi, dokter akan melakukan pemeriksaan, pengobatan dan perawatan medis pada pasien dengan pengetahuan medis dan rasa kemanusiaan. Dokter juga melayani konsultasi kesehatan, jadi bukan cuma ngurusin orang sakit aja. Nah, saat ini sudah semakin banyak dokter yang melakukan perawatan khusus di bidang-bidang spesialisasi seiring dengan kemajuan teknologi medis dan obat-obatan yang sangat pesat. Pekerjaan ini juga menuntutmu punya kemampuan komunikasi yang baik supaya bisa menjelaskan suatu diagnosa kepada pasien dan keluarganya. Dokter adalah salah satu profesi yang akan terus dibutuhkan di setiap masa.",
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
                "Fotografer adalah sebutan bagi para pekerja yang memberikan jasa fotografi untuk berbagai tujuan. Ada yang menawarkan jasa foto komersial secara langsung, yakni fotografer memotret lalu dibayar. Misalnya memotret perorangan, keluarga, acara pernikahan, ataupun produk. Ada juga  seorang fotografer yang gemar hunting foto, kemudian di jual untuk berbagai keperluan seperti iklan maupun foto di media. Tapi ada juga, fotografer yang memotret untuk tujuan pameran. Biasanya fotografer akan menyewa galeri untuk menampilkan karyanya, jadi kalau ada yang tertarik bisa membelinya.\n" +
                        "Seorang fotografer yang baik nggak cuma asal jepret tetapi juga memiliki pesan yang akan disampaikan dalam setiap karyanya. Pekerjaan ini membutuhkan sudut pandang khusus untuk menentukan bagaimana cara menampilkan objek atau subjek dan pesan apa yang ingin disampaikan melalui gambar. Selain itu, pekerjaan ini memerlukan teknik khusus masing-masing tergantung pada genre (seperti berita, iklan, dsb) atau objek yang akan difoto.\n",
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
                        "Nah, inilah beda antara guru SD dengan guru SMP/SMA. Kalau kebanyakan guru SD mengampu semua mata pelajaran selain agama dan olahraga, guru SMP/SMA hanya mengampu mata pelajaran tertentu. Jadi di SMP/SMA dikenal ada guru matematika, guru bahasa indonesia, guru biologi, guru kimia, guru fisika, guru ekonomi, guru geografi, guru sejarah, dan sebagainya.\n" +
                        "Jadi benar-benar hanya mengajarkan suatu mata pelajaran yang sesuai sama bidang keahliannya. Guru SMP/SMA juga ada yang diberi tugas tambahan untuk menjadi wali kelas, pembimbing kegiatan ekstrakurikuler, serta menjadi bagian dari kegiatan administrasi sekolah. Tugas yang dilakukan oleh guru pun berbeda tergantung pada karakteristik sekolah dan tujuan yang diterapkan sekolah.\n",
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
                "Ilustrator merupakan profesi yang bergerak dibidang art dengan kemampuan untuk menterjemahkan berbagai subjek, objek, keadaan ataupun berbagai macam hal lainnya dalam bentuk gambar.. Kemampuan menggambar tentu menjadi modal utama bagi seorang ilustrator, karena sehari-hari kamu akan mengerjakan gambar ilustrasi sesuai kebutuhan. Ilustrator bisa bekerja di berbagai bidang industri namun yang paling umum adalah di industri kreatif dan industri media.\n" +
                        "Selain jago gambar, seorang ilustrator harus bisa menerjemahkan keinginan klien dalam bentuk visual supaya pesan yang ada bisa tersampaikan. Makanya, pekerjaan ini butuh kepekaan dan kemampuan untuk mengubah gambaran abstrak dalam konsep menjadi ilustrasi yang mampu dilihat oleh mata. Biasanya, seorang ilustrator akan mulai membuat ilustrasi sesuai dengan konsep yang telah disusun sebelumnya.\n",
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
                        "Jasa yang ditawarkan konsultan pajak sangat beraneka ragam. Konsultan pajak membantu mengurus hal-hal yang berkaitan dengan kepatuhan pajak kliennya, mulai dari menghitung, membayar, juga melaporkannya. Konsultan pajak menawarkan jasa konsultansi masalah perpajakan, selain itu juga bisa melakukan perencanaan pajak untuk mengoptimalkan keuntungan klien.\n" +
                        "Konsultan pajak juga punya tanggung jawab untuk mewakili dan/atau mendampingi kliennya ketika ada pemeriksaan. Kalau ternyata ditemukan adanya kelebihan dalam pembayaran pajak, seorang konsultan pajak bisa membantu kliennya dalam pelaksanaan restitusi pajak mulai dari persiapan data, penyampaian restitusi, pemeriksaan, sampai diterimanya pengembalian atas kelebihan pajak.\n" +
                        "Jika terjadi sengketa pajak, konsultan pajak bisa memberikan pelayanan penyelesaian sengketa, seperti pengajuan keberatan pajak, banding, dan sebagainya. Dengan demikian, wajib pajak akan merasa nyaman saat menjalani pemeriksaan maupun ketika menghadapi permasalahan pajak.\n",
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
                        "Jadi, seorang koreografer akan mencari berbagai gerakan yang dinilai paling sesuai sama musik yang dimainkan. Untuk itu, seorang koreografer harus berfikir kreatif, inovatif, dan mempunyai kepekaan terhadap rasa, sehingga bisa menghasilkan karya yang menghibur.\n",
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
                "Pegawai bank bertanggung jawab atas usaha penyimpanan dan penyaluran dana milik masyarakat kepada masyarakat lain yang membutuhkan. Pegawai bank juga memberikan jasa penukaran uang seperti transfer dan wesel, serta usaha penjualan investasi keuangan seperti obligasi pemerintah dan dana investasi. Di dalam bidang usaha apapun, diperlukan pengetahuan khusus bidang keuangan. Stereotype yang sering diberikan kepada karier pegawai bank adalah mereka yang berparas cantik dan tampan, bekerja di ruangan ber-AC dan anti kepanasan! Padahal di samping itu pegawai bank punya tanggung jawab yang besar dalam mengelola dana masyarakat.",
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
