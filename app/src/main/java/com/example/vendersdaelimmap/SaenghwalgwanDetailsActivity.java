package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SaenghwalgwanDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saenghwalgwan_details);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CheckLog", "SaenghwalgwanDetailsActivity : onStart");
    }
}