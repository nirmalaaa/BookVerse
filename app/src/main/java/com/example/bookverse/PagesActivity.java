package com.example.bookverse;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pages);

        // Ambil data dari intent
        Intent intent = getIntent();
        int pageId = intent.getIntExtra("id", 0);
        String title = intent.getStringExtra("title");
        int imageResource = intent.getIntExtra("image", 0);
        String synopsis = intent.getStringExtra("synopsis");

        // Set components
        TextView textPageId = findViewById(R.id.textPageId);
        TextView titleTextView = findViewById(R.id.textPageId3);
        TextView synopsisTextView = findViewById(R.id.textPageId2);
        ImageView bookImage = findViewById(R.id.imageView4);

        // Set values
        textPageId.setText("PAGE : " + pageId);
        titleTextView.setText(title);
        synopsisTextView.setText(synopsis);
        bookImage.setImageResource(imageResource);
    }
}