package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ImgoggwanDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imgoggwan_details);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CheckLog", "ImgoggwanDetailsActivity : onStart");
    }
}