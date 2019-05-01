package com.example.willdan.sholatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tahajut, witir, rawatib, dhuha, istikhoroh, tahiyyatulmasjid, sholatsyuruq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tahajut = findViewById(R.id.tahajut);
        witir = findViewById(R.id.witir);
        rawatib = findViewById(R.id.rawatib);
        dhuha = findViewById(R.id.dhuha);
        istikhoroh = findViewById(R.id.istikhoroh);
        tahiyyatulmasjid = findViewById(R.id.tahiyyatumasjid);
        sholatsyuruq = findViewById(R.id.sholatsyuruq);

        tahajut.setOnClickListener(this);
        witir.setOnClickListener(this);
        rawatib.setOnClickListener(this);
        dhuha.setOnClickListener(this);
        istikhoroh.setOnClickListener(this);
        tahiyyatulmasjid.setOnClickListener(this);
        sholatsyuruq.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tahajut:
                Intent tahajut = new Intent(MainActivity.this, Deskripsi.class);
                tahajut.putExtra("sunnah", "https://Wisatanabawi.com/sholat-tahajut/");
                startActivity(tahajut);
                break;

            case R.id.witir:
                Intent witir = new Intent(MainActivity.this, Deskripsi.class);
                witir.putExtra("sunnah", "https://Wisatanabawi.com/sholat-witir/");
                startActivity(witir);
                break;

            case R.id.rawatib:
                Intent rawatib = new Intent(MainActivity.this, Deskripsi.class);
                rawatib.putExtra("sunnah", "https://Wisatanabawi.com/sholat-rawatib.html/");
                startActivity(rawatib);
                break;

            case R.id.dhuha:
                Intent dhuha = new Intent(MainActivity.this, Deskripsi.class);
                dhuha.putExtra("sunnah", "https://Wisatanabawi.com/sholat-dhuha.html/");
                startActivity(dhuha);
                break;

            case R.id.istikhoroh:
                Intent istikoroh = new Intent(MainActivity.this, Deskripsi.class);
                istikoroh.putExtra("sunnah", "https://Wisatanabawi.com/sholat-istikoroh-1811138.html");
                startActivity(istikoroh);
                break;

            case R.id.tahiyyatumasjid:
                Intent tahiyyatulmasjid = new Intent(MainActivity.this, Deskripsi.class);
                tahiyyatulmasjid.putExtra("sunnah", "https://Wisatanabawi.com/sholat-tahiyyatul-masjid.html");
                startActivity(tahiyyatulmasjid);
                break;

            case R.id.sholatsyuruq:
                Intent sholatsyuruq = new Intent(MainActivity.this, Deskripsi.class);
                sholatsyuruq.putExtra("sunnah", "https://Wisatanabawi.com/sholat-syuruq-isyraq");
                startActivity(sholatsyuruq);
                break;

        }

    }
}