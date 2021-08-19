package com.example.daelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.daelimmap.building.Jeonsangwan;
import com.example.daelimmap.floor.Jeonsangwanfloor;
import com.example.daelimmap.floor.hagsaenghoegwanfloor;

public class JeonsangwanActivity extends AppCompatActivity {

    Button jeonsangwan_button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeonsangwan);

        jeonsangwan_button1 = findViewById(R.id.jeonsangwan_button1);

        jeonsangwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Jeonsangwanfloor.class );
                startActivity(intent);
            }
        });
    }
}