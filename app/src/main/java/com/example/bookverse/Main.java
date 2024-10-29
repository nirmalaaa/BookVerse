package com.example.bookverse;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Main extends AppCompatActivity {

    ArrayList<RecyclerView_List> recyclerViewList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        recyclerViewList = new ArrayList<>(); // Perbaiki nama variabel
        recyclerViewList.add(new RecyclerView_List(R.drawable.pulang_tere_liye, "Pulang"));
        recyclerViewList.add(new RecyclerView_List(R.drawable.verity, "Verity"));
        recyclerViewList.add(new RecyclerView_List(R.drawable._c1b1109_5ce9_424d_90a8_ccc7d1f3cbc2, "Alone With You in The Ether"));
        recyclerViewList.add(new RecyclerView_List(R.drawable.cea822c19ab655b8654d0d05b08bdf60, "Things We Never Got Over"));
        recyclerViewList.add(new RecyclerView_List(R.drawable._781250053992_eleanor__park_sc_us, "Eleanor & Park"));
        recyclerViewList.add(new RecyclerView_List(R.drawable.november_9, "November 9"));
        recyclerViewList.add(new RecyclerView_List(R.drawable.sweetestoblivian, "The Sweetest Oblivion"));
        recyclerViewList.add(new RecyclerView_List(R.drawable.fourthwing, "Fourth Wing"));
        recyclerViewList.add(new RecyclerView_List(R.drawable.kingofwrath, "King of Wrath"));
        recyclerViewList.add(new RecyclerView_List(R.drawable.ironflame, "Iron Flame"));
        recyclerViewList.add(new RecyclerView_List(R.drawable.cheatsheet, "The Cheat Sheet"));
        recyclerViewList.add(new RecyclerView_List(R.drawable.onesumer, "It Happened One Summer"));
        recyclerViewList.add(new RecyclerView_List(R.drawable.lautbercerita, "Laut Bercerita"));
        recyclerViewList.add(new RecyclerView_List(R.drawable.poppywar, "The Poppy War"));
        recyclerViewList.add(new RecyclerView_List(R.drawable.ujungtanduk, "Negeri di Ujung Tanduk"));
        recyclerViewList.add(new RecyclerView_List(R.drawable.namakualam, "Namaku Alam"));

        RecyclerView_Adapter recyclerViewAdapter = new RecyclerView_Adapter(recyclerViewList, this);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}