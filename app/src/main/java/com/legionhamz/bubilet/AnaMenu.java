package com.legionhamz.bubilet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class AnaMenu extends AppCompatActivity
{
    LinearLayout airImage, busImage, carImage, boatImage;
    Spinner turkeyCities1 , turkeyCities2;
    String secilenNereden = "", secilenNereye = "";
    Button sonucPage;
    int secilenVasita = 0;
    // uçak = 1
    // otobüs = 2
    // araç = 3
    // gemi = 4

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_menu);

        Intent getIntent = getIntent();
        int requestCode = getIntent().getIntExtra("requestCode",0);

        if(requestCode == 2)
        {
            Toast.makeText(this, "Biletiniz kesilmiştir , 2 saat önceden gelmeniz tavsiye edilir.", Toast.LENGTH_LONG).show();
        }
        turkeyCities1 = findViewById(R.id.planets_spinner1);
        turkeyCities2 = findViewById(R.id.planets_spinner2);

        sonucPage = findViewById(R.id.sonuc_page);

        airImage = findViewById(R.id.airImage);
        busImage = findViewById(R.id.busImage);
        carImage = findViewById(R.id.carImage);
        boatImage = findViewById(R.id.boatImage);

        turkeyCities1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                secilenNereden = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        turkeyCities2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                secilenNereye = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        airImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secilenVasita = 1;
            }
        });

        busImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secilenVasita = 2;
            }
        });

        carImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secilenVasita = 3;
            }
        });

        boatImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secilenVasita = 4;
            }
        });

    }

    public void getSonucPage(View view)
    {
        if(secilenNereden.isEmpty() || secilenNereye.isEmpty() || secilenVasita == 0 || secilenNereden == secilenNereye)
        {
            Toast.makeText(this, "Bir şeyler yanlış gitti", Toast.LENGTH_SHORT).show();
        }
        else
        {
            if(secilenVasita == 1)
            {
                Intent intent = new Intent(AnaMenu.this, AirSonucMenu.class);
                intent.putExtra("secilenNereden", secilenNereden);
                intent.putExtra("secilenNereye", secilenNereye);
                intent.putExtra("secilenasita", String.valueOf(secilenVasita));
                startActivity(intent);

            }
            else if (secilenVasita == 2)
            {
                Intent intent = new Intent(AnaMenu.this, BusSonucMenu.class);
                intent.putExtra("secilenNereden", secilenNereden);
                intent.putExtra("secilenNereye", secilenNereye);
                intent.putExtra("secilenasita", String.valueOf(secilenVasita));
                startActivity(intent);
            }
            else if (secilenVasita == 3)
            {
                Intent intent = new Intent(AnaMenu.this, CarSonucMenu.class);
                intent.putExtra("secilenNereden", secilenNereden);
                intent.putExtra("secilenNereye", secilenNereye);
                intent.putExtra("secilenasita", String.valueOf(secilenVasita));
                startActivity(intent);
            }
            else {
                //4.seçenek
                Intent intent = new Intent(AnaMenu.this, BoatSonucMenu.class);
                intent.putExtra("secilenNereden", secilenNereden);
                intent.putExtra("secilenNereye", secilenNereye);
                intent.putExtra("secilenasita", String.valueOf(secilenVasita));
                startActivity(intent);
            }
        }

    }


}

