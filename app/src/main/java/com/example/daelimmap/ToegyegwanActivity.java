package com.example.daelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.daelimmap.floor.toegyegwanfloor;

public class ToegyegwanActivity extends AppCompatActivity {

    Button toegyegwan_button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toegyegwan);

        toegyegwan_button1 = findViewById(R.id.toegyegwan_button1);
        toegyegwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), toegyegwanfloor.class);
                startActivity(intent);
            }
        });
    }
}