package com.example.daelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.daelimmap.R;
import com.example.daelimmap.floor.dasangwanfloor;

public class DasangwanActivity extends AppCompatActivity {

    Button dasangwan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dasangwan);

        dasangwan = findViewById(R.id.dasangwan_button1);

        dasangwan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), dasangwanfloor.class);
                startActivity(intent);
            }
        });
    }
}
