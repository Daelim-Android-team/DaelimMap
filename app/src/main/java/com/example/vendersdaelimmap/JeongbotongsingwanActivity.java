package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.jeongbotongsingwanfloor;

public class JeongbotongsingwanActivity extends AppCompatActivity {

    Button jeongbotongsingwan_button1;
    Button jeongbotongsingwan_button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeongbotongsingwan);

        jeongbotongsingwan_button1 = findViewById(R.id.jeongbotongsingwan_button1);
        jeongbotongsingwan_button2 = findViewById(R.id.jeongbotongsingwan_button2);

        jeongbotongsingwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), jeongbotongsingwanfloor.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "JeongbotongsingwanActivity : 평면도보기 버튼 누름");
            }
        });

        jeongbotongsingwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), JeongbotongsingwanDetailsActivity.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "JeongbotongsingwanActivity : 상세보기 버튼 누름");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CheckLog", "JeongbotongsingwanActivity : onStart");
    }
}