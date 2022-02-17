package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.yulgoggwan_floor;

public class YulgoggwanActivity extends AppCompatActivity {

    Button yulgoggwan_button;
    Button yulgoggwan_button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yulgoggwan);

        yulgoggwan_button = findViewById(R.id.yulgoggwan_button1);
        yulgoggwan_button2 = findViewById(R.id.yulgoggwan_button2);

        yulgoggwan_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), yulgoggwan_floor.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "YulgoggwanActivity : 평면도보기 버튼 누름");
            }
        });

        yulgoggwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), YulgoggwanDetailsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "YulgoggwanActivity : 상세보기 버튼 누름");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CheckLog", "YulgoggwanActivity : onStart");
    }
}