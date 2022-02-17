package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ToegyegwanDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toegyegwan_details);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CheckLog", "ToegyegwanDetailsActivity : onStart");
    }
}