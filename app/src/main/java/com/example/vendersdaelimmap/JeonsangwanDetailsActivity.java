package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class JeonsangwanDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeonsangwan_details);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CheckLog", "JeonsangwanDetailsActivity : onStart");
    }
}