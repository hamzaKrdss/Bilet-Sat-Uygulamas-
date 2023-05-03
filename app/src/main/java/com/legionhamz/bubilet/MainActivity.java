package com.legionhamz.bubilet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button getStartedBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getStartedBtn = findViewById(R.id.getStarted);
    }
    public void Started(View view)
    {
        Intent intent = new Intent(MainActivity.this, AnaMenu.class);
        intent.putExtra("requestCode", 1);
        startActivity(intent);
        finish();

    }

}
