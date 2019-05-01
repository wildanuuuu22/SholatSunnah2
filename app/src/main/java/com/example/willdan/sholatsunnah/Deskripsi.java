package com.example.willdan.sholatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Deskripsi extends AppCompatActivity {
    //deklarasi webView

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        //inisialisasi

        webView = findViewById(R.id.webView);

        Intent deskripsi = getIntent();

        String link = deskripsi.getStringExtra("sunnah");

        //agar Javascript nya bisa terbaca
        webView.getSettings().setJavaScriptEnabled(true);
        //agar gambar nya automatic di masukan
        webView.getSettings().setLoadsImagesAutomatically(true);
        //untuk memasukan link nya
        webView.loadUrl(link);

    }
}
