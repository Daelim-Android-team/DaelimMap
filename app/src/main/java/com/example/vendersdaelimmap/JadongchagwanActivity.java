package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.jadongchagwanfloor;

public class JadongchagwanActivity extends AppCompatActivity {

    Button jadongchagwan_button;
    Button jadongchagwan_button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jadongchagwan);

        jadongchagwan_button = findViewById(R.id.jadongchagwan_button);
        jadongchagwan_button2 =findViewById(R.id.jadongchagwan_button2);

        jadongchagwan_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), jadongchagwanfloor.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "JadongchagwanActivity : 평면도보기 버튼 누름");
            }
        });

        jadongchagwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), JadongchagwanDetailsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "JadongchagwanActivity : 상세보기 버튼 누름");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CheckLog", "JadongchagwanActivity : onStart");
    }
}