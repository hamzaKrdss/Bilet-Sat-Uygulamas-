package com.legionhamz.bubilet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BusSonucMenu extends AppCompatActivity
{
    TextView cities1, cities2;
    CardView findikkale1, metro1, pamukkale1, kamilKoc1, metro2, pamukkale2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_sonuc_menu);

        findikkale1 = findViewById(R.id.findikkale1);
        metro1 = findViewById(R.id.metro1);
        pamukkale1 = findViewById(R.id.pamukkale1);
        kamilKoc1 = findViewById(R.id.kamilKoc1);
        metro2 = findViewById(R.id.metro2);
        pamukkale2 = findViewById(R.id.pamukkale2);

        cities1 = findViewById(R.id.cities1);
        cities2 = findViewById(R.id.cities2);

        Intent intent = getIntent();

        cities1.setText(intent.getStringExtra("secilenNereden"));
        cities2.setText(intent.getStringExtra("secilenNereye"));

        Intent backIntent = new Intent(this, AnaMenu.class);

        findikkale1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        metro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        pamukkale1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        kamilKoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        metro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        pamukkale2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });


    }


}

