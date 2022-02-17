package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.Saenghwalgwanfloor;

public class SaenghwalgwanActivity extends AppCompatActivity {

    Button saenghwalgwan_button1;
    Button saenghwalgwan_button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saenghwalgwan);

        saenghwalgwan_button1 = findViewById(R.id.saenghwalgwan_button1);
        saenghwalgwan_button2 = findViewById(R.id.saenghwalgwan_button2);

        saenghwalgwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Saenghwalgwanfloor.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "SaenghwalgwanActivity : 평면도보기 버튼 누름");
            }
        });

        saenghwalgwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SaenghwalgwanDetailsActivity.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "SaenghwalgwanActivity : 상세보기 버튼 누름");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CheckLog", "SaenghwalgwanActivity : onStart");
    }
}