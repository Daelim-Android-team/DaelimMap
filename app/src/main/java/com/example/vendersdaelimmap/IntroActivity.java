package com.example.vendersdaelimmap;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(intent);
                Log.d("CheckLog", "IntroActivity: run");
                finish();
            }
        }, 1500);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}