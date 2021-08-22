package com.example.daelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.daelimmap.R;
import com.example.daelimmap.floor.dasangwanfloor;
import com.example.daelimmap.floor.hagsaenghoegwanfloor;

public class HagsaenghoegwanActivity extends AppCompatActivity {

    Button hagsaenghoegwan_button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hagsaenghoegwan);

        hagsaenghoegwan_button1 = findViewById(R.id.hagsaenghoegwan_button1);

        hagsaenghoegwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), hagsaenghoegwanfloor.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });


    }
}