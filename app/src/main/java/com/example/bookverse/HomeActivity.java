package com.example.bookverse;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ArrayList<RecyclerViewListActivity> recyclerViewList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_notifications);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        recyclerViewList = new ArrayList<>();
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable._c1b1109_5ce9_424d_90a8_ccc7d1f3cbc2,
                "Alone With You in The Ether",
                "Alone With You in the Ether karya Olivie Blake adalah fiksi sastra yang bercerita tentang cinta dan hubungan. Buku ini mengisahkan tentang Aldo, seorang mahasiswa PhD matematika teoritis yang memiliki \"keanehan\" yang tidak terdefinisi. Keanehan tersebut dapat diartikan sebagai autisme yang tidak terdiagnosis. Aldo menjalani hidupnya dengan rutinitas, menghadiri kelas, mengajar, dan pergi ke tempat-tempat favoritnya. \n" +
                        "Buku ini juga membahas tentang perjuangan Blake melawan penyakit mental, mungkin karena dia juga secara terbuka berbagi perjuangannya melawan Bipolar. \n" +
                        "Salah satu review buku ini mengatakan bahwa buku ini bukan romansa dalam pengertian tradisional, melainkan fiksi sastra tentang cinta dan hubungan."));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.cea822c19ab655b8654d0d05b08bdf60,
                "Things We Never Got Over",
                "Sinopsis buku Things We Never Got Over atau Hal-hal yang Tidak Pernah Kita Lupakan karya Lucy Score adalah tentang Naomi yang terjebak di kota Knockemout, Virginia, setelah saudara kembarnya yang jahat mengambil mobil dan uangnya. Naomi harus merawat keponakan perempuan yang tidak dikenalnya di kota tersebut tanpa mobil, pekerjaan, rencana, dan rumah. \n" +
                        "Knox, yang tidak suka berurusan dengan wanita yang rumit atau menuntut, akhirnya membantu Naomi keluar dari kesulitannya. Namun, rencana Knox untuk meninggalkan Naomi setelah ia berhenti membuat masalah baru berubah menjadi bahaya nyata. \n" +
                        "Beberapa ulasan buku ini mengatakan bahwa kisah ini jauh lebih buruk, dengan tokoh-tokoh yang saling bertentangan dan tindakan yang tidak masuk akal."));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable._781250053992_eleanor__park_sc_us,
                "Eleanor & Park",
                "Eleanor & Park menceritakan kisah dua remaja berbeda latar belakang yang menemukan cinta pertama dalam keadaan sulit. Eleanor, gadis unik yang sering diintimidasi dan hidup dalam keluarga bermasalah, bertemu Park, seorang remaja pendiam yang mencintai komik dan musik. \n" +
                        "Meski hidupnya jauh lebih stabil, Park terhubung secara mendalam dengan Eleanor. Hubungan mereka tumbuh lewat kebersamaan di bus sekolah, membawa mereka ke dalam kisah cinta yang manis sekaligus penuh tantangan. Novel ini menyentuh tema identitas, penerimaan diri, dan menghadapi masalah hidup."));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.november_9,
                "November 9",
                "November 9 karya Colleen Hoover mengisahkan tentang Fallon, seorang gadis yang bercita-cita menjadi aktris, dan Ben, seorang penulis muda. Mereka bertemu secara kebetulan pada tanggal 9 November, ketika Fallon sedang menghadapi masa-masa sulit dalam hidupnya. Koneksi antara mereka terasa kuat, dan mereka sepakat untuk bertemu lagi pada tanggal yang sama setiap tahun, meskipun mereka tidak saling berkomunikasi di luar pertemuan tersebut.\n" +
                        "\n" +
                        "Setiap tahun, Fallon dan Ben berbagi cerita dan pengalaman hidup mereka, dan keduanya saling mendukung dalam perjalanan masing-masing. Namun, seiring berjalannya waktu, keduanya harus menghadapi rahasia dan tantangan yang dapat mengubah hubungan mereka selamanya. *November 9* adalah kisah cinta yang menggugah, mengisahkan tentang ketidakpastian, pilihan hidup, dan bagaimana orang-orang dapat memengaruhi satu sama lain dalam perjalanan menuju kebahagiaan."));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.sweetestoblivian,
                "The Sweetest Oblivion",
                "The Sweetest Oblivion karya Danielle Lori mengisahkan Elena Abelli, putri dari keluarga mafia terkenal di New York. Meskipun dikenal sopan dan patuh, Elena menyimpan rahasia dan kenangan kelam yang membebani dirinya. Ketika Nico Russo, calon suami saudara perempuannya yang misterius dan berbahaya, masuk ke dalam hidupnya, Elena mendapati dirinya tertarik pada pria yang justru tak boleh ia dekati.\n" +
                        "\n" +
                        "Nico, yang keras dan dingin, juga tidak dapat mengabaikan pesona Elena. Meski mereka berdua tahu bahwa hubungan ini terlarang, ketertarikan mereka semakin kuat, menghadapkan mereka pada pilihan sulit di tengah aturan ketat dunia mafia. Novel ini adalah kisah romansa terlarang yang penuh ketegangan, rahasia, dan tantangan di dunia mafia."));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.fourthwing,
                "Fourth Wing",
                    "Fourth Wing karya Rebecca Yarros mengisahkan perjalanan Violet Sorrengail, seorang gadis yang bercita-cita menjadi sarjana, namun dipaksa mengikuti pelatihan prajurit penunggang naga oleh ibunya, seorang komandan militer yang keras. Dalam pelatihan ini, hanya sedikit yang selamat, dan Violet harus mengandalkan kecerdasannya untuk bertahan.\n" +
                            "\n" +
                            "Di tengah latihan brutal ini, Violet terlibat dengan Xaden Riorson, penunggang naga yang mematikan sekaligus musuh yang penuh rahasia. Di dunia yang penuh sihir, naga, dan intrik politik, Violet harus memilih antara keinginan pribadinya dan takdir yang telah ditetapkan untuknya. *Fourth Wing* adalah cerita epik tentang keberanian, persahabatan, dan romansa di tengah peperangan."));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.kingofwrath,
                "King of Wrath",
                "King of Wrath karya Ana Huang mengikuti Vivian Lau, seorang pewaris yang cerdas dan anggun, yang terpaksa bertunangan dengan Dante Russo, pengusaha kaya sekaligus pria yang keras kepala. Meski pertunangan mereka tampak sempurna di luar, sebenarnya pernikahan ini hanyalah sebuah kesepakatan bisnis yang dingin.\n" +
                        "\n" +
                        "Dante, yang dominan dan berhati dingin, menganggap hubungan mereka hanyalah transaksi. Namun, semakin lama mereka terlibat, Dante mulai tertarik pada Vivian lebih dari yang ia perkirakan. Di balik kedok kepentingan bisnis, muncul perasaan nyata di antara mereka yang penuh dengan ketegangan, gairah, dan risiko. *King of Wrath* adalah kisah romansa penuh intrik tentang cinta yang tumbuh di tengah ambisi dan ego."));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.ironflame,
                "Iron Flame",
                "Iron Flame karya Rebecca Yarros adalah lanjutan dari kisah Violet Sorrengail, seorang prajurit penunggang naga yang kini menghadapi tantangan baru setelah berhasil melewati pelatihan brutal di Basgiath War College. Di buku kedua ini, Violet harus bertahan di tengah ancaman dari musuh eksternal dan pengkhianatan dalam lingkarannya sendiri.\n" +
                        "\n" +
                        "Saat dia berusaha mengendalikan kekuatan barunya, Violet kembali dipertemukan dengan Xaden Riorson, yang memiliki agenda misterius. Dalam dunia yang penuh sihir, persekongkolan, dan peperangan, Violet terus berjuang melawan musuh dari luar maupun dalam, sembari mempertaruhkan segalanya untuk mempertahankan hidup dan cinta. *Iron Flame* mengisahkan perjalanan yang penuh dengan aksi, strategi, dan emosi dalam medan perang yang tak kenal ampun."));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.cheatsheet,
                "The Cheat Sheet",
                "The Cheat Sheet karya Sarah Adams bercerita tentang Bree Camden dan Nathan Donelson, sahabat lama dengan perasaan tersembunyi. Bree diam-diam mencintai Nathan, seorang atlet NFL populer, namun tidak ingin merusak persahabatan mereka. Sementara itu, Nathan juga menyimpan perasaan yang sama, tetapi takut untuk mengungkapkannya.\n" +
                        "\n" +
                        "Kehidupan mereka berubah ketika media menangkap momen kebersamaan mereka, memicu rumor asmara. Untuk mengalihkan perhatian publik dan menyelamatkan reputasi Nathan, mereka setuju berpura-pura pacaran. Namun, semakin mereka berpura-pura, semakin sulit bagi mereka untuk membedakan peran dan perasaan yang sesungguhnya. The Cheat Sheet adalah komedi romantis ringan tentang cinta, persahabatan, dan keberanian mengungkapkan perasaan terpendam."));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.onesumer,
                "It Happened One Summer",
                "It Happened One Summer karya Tessa Bailey mengisahkan Piper Bellinger, seorang sosialita Los Angeles yang gemar berpesta. Setelah aksi liarnya menjadi berita, ayah tirinya mengirim Piper ke Westport, sebuah kota pelabuhan kecil, untuk belajar tanggung jawab. Di sana, Piper bertemu Brendan Taggart, kapten kapal nelayan yang tegas dan tidak terkesan dengan gaya hidupnya.\n" +
                        "\n" +
                        "Awalnya, Brendan dan Piper sering berselisih, tetapi perlahan mereka mulai saling memahami. Piper menemukan sisi dirinya yang lebih kuat dan mandiri, sementara Brendan melihat kehidupan dengan lebih terbuka. It Happened One Summer adalah kisah romansa segar tentang perubahan, cinta tak terduga, dan menemukan jati diri di tempat yang tak disangka."));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.lautbercerita,
                "Laut Bercerita",
                "Laut Bercerita karya Leila S. Chudori menceritakan kisah Biru Laut, seorang mahasiswa yang terlibat dalam gerakan aktivis di Indonesia pada era 1990-an. Bersama teman-temannya, Laut memperjuangkan keadilan dan kebebasan di bawah rezim yang otoriter. Namun, perjuangan mereka membawa konsekuensi berat; banyak dari mereka ditangkap, dihilangkan, atau mengalami penyiksaan.\n" +
                        "\n" +
                        "Cerita ini tidak hanya mengikuti perjalanan perjuangan dan penderitaan Laut, tetapi juga dampak kehilangan bagi keluarga dan sahabat yang ditinggalkan. *Laut Bercerita* menggambarkan keteguhan dan pengorbanan para pejuang yang menuntut perubahan, serta rasa kehilangan yang mendalam dalam sejarah kelam Indonesia. Novel ini adalah pengingat akan pentingnya kemanusiaan dan keadilan dalam menghadapi kekuasaan yang menindas."));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.poppywar,
                "The Poppy War",
                "The Poppy War karya R.F. Kuang mengikuti perjalanan Fang Runin, atau Rin, seorang gadis yatim piatu yang hidup miskin. Demi melarikan diri dari perjodohan yang tak diinginkan, Rin mengikuti ujian masuk akademi militer elite Kekaisaran Nikara dan mengejutkan semua orang dengan diterima. Namun, hidup di akademi elit itu jauh lebih keras dari yang ia bayangkan, terutama karena diskriminasi kelas dan latar belakangnya yang sederhana.\n" +
                        "\n" +
                        "Di tengah pelatihannya, Rin menemukan bahwa ia memiliki kekuatan magis kuno yang berhubungan dengan dewa perang yang berbahaya. Ketika perang besar pecah, Rin dihadapkan pada pilihan moral antara kekuatan yang mematikan dan kemanusiaannya. The Poppy War adalah novel epik yang menggabungkan sejarah, sihir, dan dilema moral, serta mengangkat tema kekuasaan, balas dendam, dan harga yang harus dibayar untuk kemenangan."));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.ujungtanduk,
                "Negeri di Ujung Tanduk",
                "Negeri di Ujung Tanduk karya Tere Liye adalah kelanjutan dari novel Negeri Para Bedebah, yang mengikuti kisah Thomas, seorang konsultan keuangan cerdas yang terlibat dalam konspirasi gelap di dunia politik dan bisnis Indonesia. Kali ini, Thomas menghadapi tantangan yang lebih berbahaya, ketika ia mencoba mengungkap korupsi dan ketidakadilan yang telah mengakar di pemerintahan.\n" +
                        "\n" +
                        "Dalam upayanya, Thomas harus berhadapan dengan tokoh-tokoh kuat yang akan melakukan apa pun untuk mempertahankan kekuasaan mereka. Novel ini penuh intrik, ketegangan, dan aksi, memperlihatkan betapa korupsi dan kekuasaan dapat merusak sebuah negara. Negeri di Ujung Tanduk adalah cerita tentang keberanian, pengorbanan, dan perjuangan melawan sistem yang bobrok demi kebenaran dan keadilan."));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.namakualam,
                "Namaku Alam",
                "Namaku Alam karya Ahmad Fuadi mengisahkan Alam, seorang anak yatim piatu yang tinggal bersama bibinya di sebuah desa kecil. Alam adalah anak yang cerdas dan bersemangat, tetapi ia harus berjuang menghadapi berbagai tantangan hidup, termasuk lingkungan yang kurang mendukung dan keterbatasan ekonomi. Namun, kecintaannya pada alam dan pengetahuannya yang luas membuatnya berusaha melihat dunia dari sudut pandang yang positif.\n" +
                        "\n" +
                        "Di tengah kesederhanaannya, Alam mulai menyadari bahwa alam di sekitarnya memberi pelajaran berharga tentang kehidupan. Melalui petualangan dan interaksinya dengan orang-orang di sekitarnya, Alam belajar tentang makna persahabatan, kerja keras, dan harapan. *Namaku Alam* adalah novel inspiratif tentang keteguhan hati dan kekuatan mimpi, mengajak pembaca untuk lebih peduli terhadap alam dan menemukan kebahagiaan dalam hal-hal sederhana."));

        RecyclerViewAdapterActivity adapter = new RecyclerViewAdapterActivity(recyclerViewList, this);
        recyclerView.setAdapter(adapter);
    }
}