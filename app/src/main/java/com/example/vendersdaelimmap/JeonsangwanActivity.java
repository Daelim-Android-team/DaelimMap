package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.Jeonsangwanfloor;

public class JeonsangwanActivity extends AppCompatActivity {

    Button jeonsangwan_button1;
    Button jeonsangwan_button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeonsangwan);

        jeonsangwan_button1 = findViewById(R.id.jeonsangwan_button1);
        jeonsangwan_button2 = findViewById(R.id.jeonsangwan_button2);

        jeonsangwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Jeonsangwanfloor.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "JeonsangwanActivity : 평면도보기 버튼 누름");
            }
        });

        jeonsangwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), JeonsangwanDetailsActivity.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "JeonsangwanActivity : 상세보기 버튼 누름");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CheckLog", "JeonsangwanActivity : onStart");
    }
}