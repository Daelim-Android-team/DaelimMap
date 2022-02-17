package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.Suamgwanfloor;

public class SuamgwanActivity extends AppCompatActivity {

    Button suamgwan_button1;
    Button suamgwan_button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suamgwan);

        suamgwan_button1 = findViewById(R.id.suamgwan_button1);
        suamgwan_button2 = findViewById(R.id.suamgwan_button2);
        suamgwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Suamgwanfloor.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "SuamgwanActivity : 평면도보기 버튼 누름");
            }
        });

        suamgwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SuamgwanDetailsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "SuamgwanActivity : 상세보기 버튼 누름");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CheckLog", "SuamgwanActivity : onStart");
    }
}