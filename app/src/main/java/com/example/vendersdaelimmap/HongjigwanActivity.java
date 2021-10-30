package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.Hongjigwanfloor;

public class HongjigwanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hongjigwan);

        Button hongjigwan_button1;
        Button hongjigwan_button2;

        hongjigwan_button1 = findViewById(R.id.hongjigwan_button1);
        hongjigwan_button2 = findViewById(R.id.hongjigwan_button2);

        hongjigwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hongjigwanfloor.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        hongjigwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HongjigwanDetailsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });



    }
}