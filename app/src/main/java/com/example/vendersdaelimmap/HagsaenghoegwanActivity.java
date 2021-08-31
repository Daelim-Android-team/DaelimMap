package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vendersdaelimmap.R;
import com.example.vendersdaelimmap.floor.hagsaenghoegwanfloor;

public class HagsaenghoegwanActivity extends AppCompatActivity {

    Button hagsaenghoegwan_button1;
    Button hagsaenghoegwan_button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hagsaenghoegwan);

        hagsaenghoegwan_button1 = findViewById(R.id.hagsaenghoegwan_button1);
        hagsaenghoegwan_button2 = findViewById(R.id.hagsaenghoegwan_button2);

        hagsaenghoegwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), hagsaenghoegwanfloor.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        hagsaenghoegwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HagsaenghoegwanDetailsActivity.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });




    }
}