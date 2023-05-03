package com.legionhamz.bubilet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BoatSonucMenu extends AppCompatActivity
{
    CardView ido1, budo1, budo2, ido2;
    TextView cities1, cities2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boat_sonuc_menu);

        cities1 = findViewById(R.id.cities1);
        cities2 = findViewById(R.id.cities2);

        Intent intent = getIntent();

        cities1.setText(intent.getStringExtra("secilenNereden"));
        cities2.setText(intent.getStringExtra("secilenNereye"));

        ido1 = findViewById(R.id.ido1);
        budo1 = findViewById(R.id.budo1);
        budo2 = findViewById(R.id.budo2);
        ido2 = findViewById(R.id.ido2);

        Intent backIntent = new Intent(BoatSonucMenu.this, AnaMenu.class);

        ido1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        budo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        budo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        ido2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });

    }


}


