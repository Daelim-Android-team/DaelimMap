package com.example.daelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.daelimmap.floor.hagsaenghoegwanfloor;
import com.example.daelimmap.floor.jeongbotongsingwanfloor;

public class JeongbotongsingwanActivity extends AppCompatActivity {

    Button jeongbotongsingwan_button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeongbotongsingwan);

        jeongbotongsingwan_button1 = findViewById(R.id.jeongbotongsingwan_button1);

        jeongbotongsingwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), jeongbotongsingwanfloor.class );
                startActivity(intent);
            }
        });
    }
}