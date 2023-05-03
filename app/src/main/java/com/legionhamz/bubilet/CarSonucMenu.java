package com.legionhamz.bubilet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CarSonucMenu extends AppCompatActivity
{
    CardView audi1, bmw1, fiat1, citroen1, dacia1, fiat2;
    TextView cities1, cities2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_sonuc_menu);

        cities1 = findViewById(R.id.cities1);
        cities2 = findViewById(R.id.cities2);

        Intent intent = getIntent();

        cities1.setText(intent.getStringExtra("secilenNereden"));
        cities2.setText(intent.getStringExtra("secilenNereye"));

        audi1 = findViewById(R.id.audi1);
        bmw1 = findViewById(R.id.bmw1);
        fiat1 = findViewById(R.id.fiat1);
        citroen1 = findViewById(R.id.citroen1);
        dacia1 = findViewById(R.id.dacia1);
        fiat2 = findViewById(R.id.fiat2);

        Intent backIntent = new Intent(CarSonucMenu.this, AnaMenu.class);

        audi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        bmw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        fiat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        citroen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        dacia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        fiat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });

    }


}


