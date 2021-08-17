package com.example.daelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YulgoggwanActivity extends AppCompatActivity {

    Button mapsee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yulgoggwan);

        mapsee = findViewById(R.id.yulgoggwan_button2);

        mapsee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}