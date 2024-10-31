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
                "Sinopsis"));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.sweetestoblivian, "The Sweetest Oblivion", "Sinopsis"));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.fourthwing, "Fourth Wing", "Sinopsis"));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.kingofwrath, "King of Wrath", "Sinopsis"));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.ironflame, "Iron Flame", "Sinopsis"));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.cheatsheet, "The Cheat Sheet", "Sinopsis"));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.onesumer, "It Happened One Summer", "Sinopsis"));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.lautbercerita, "Laut Bercerita", "Sinopsis"));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.poppywar, "The Poppy War", "Sinopsis"));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.ujungtanduk, "Negeri di Ujung Tanduk", "Sinopsis"));
        recyclerViewList.add(new RecyclerViewListActivity(R.drawable.namakualam, "Namaku Alam", "Sinopsis"));

        RecyclerViewAdapterActivity adapter = new RecyclerViewAdapterActivity(recyclerViewList, this);
        recyclerView.setAdapter(adapter);
    }
}