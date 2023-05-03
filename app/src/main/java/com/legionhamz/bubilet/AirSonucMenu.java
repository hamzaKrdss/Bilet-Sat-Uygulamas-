package com.legionhamz.bubilet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class AirSonucMenu extends AppCompatActivity
{
    TextView cities1, cities2;
    CardView thy1, anadolu1, pegasus1, katar1,  onur1, katar2, anadolu2, pegasus2, thy2, onur2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air_sonuc_menu);

        cities1 = findViewById(R.id.cities1);
        cities2 = findViewById(R.id.cities2);

        Intent intent = getIntent();

        cities1.setText(intent.getStringExtra("secilenNereden"));
        cities2.setText(intent.getStringExtra("secilenNereye"));

        thy1 = findViewById(R.id.thy1);
        anadolu1 = findViewById(R.id.anadolu1);
        pegasus1 = findViewById(R.id.pegasus1);
        katar1 = findViewById(R.id.katar1);
        onur1 = findViewById(R.id.onur1);
        anadolu2 = findViewById(R.id.anadolucet);
        pegasus2 = findViewById(R.id.pegasus2);
        thy2 = findViewById(R.id.thy2);

        Intent backIntent = new Intent(AirSonucMenu.this, AnaMenu.class);

        thy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });

        anadolu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        pegasus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        katar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        onur1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        anadolu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });
        pegasus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });

        thy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backIntent.putExtra("requestCode", 2);
                startActivity(backIntent);
                finish();
            }
        });

    }

}

