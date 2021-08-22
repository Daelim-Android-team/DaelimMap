package com.example.daelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.daelimmap.floor.toegyegwanfloor;
import com.example.daelimmap.floor.universityheadquatersfloor;

public class UniversityheadquatersActivity extends AppCompatActivity {

    Button universityheadquaters_button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universityheadquaters);

        universityheadquaters_button1 = findViewById(R.id.universityheadquaters_button1);

        universityheadquaters_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), universityheadquatersfloor.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}