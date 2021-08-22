package com.example.daelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.daelimmap.building.Saenghwalgwan;
import com.example.daelimmap.floor.Jeonsangwanfloor;
import com.example.daelimmap.floor.Saenghwalgwanfloor;

public class SaenghwalgwanActivity extends AppCompatActivity {

    Button saenghwalgwan_button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saenghwalgwan);

        saenghwalgwan_button1 = findViewById(R.id.saenghwalgwan_button1);

        saenghwalgwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Saenghwalgwanfloor.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }
        });
    }
}