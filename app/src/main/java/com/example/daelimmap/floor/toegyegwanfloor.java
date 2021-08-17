package com.example.daelimmap.floor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.daelimmap.R;

public class toegyegwanfloor extends AppCompatActivity implements View.OnClickListener {

    int currentIndex =0;
    int [] imgs = {R.drawable.toegyegwan_1f_map,
            R.drawable.toegyegwan_2f_map,R.drawable.toegyegwan_3f_map,R.drawable.toegyegwan_4f_map,
            R.drawable.toegyegwan_5f_map,R.drawable.toegyegwan_6f_map};
    ImageView toegyegwanfloor;

    ImageButton left,right;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toegyegwanfloor);

        toegyegwanfloor = findViewById(R.id.toegyegwan_floor);
        left = findViewById(R.id.left);
        right = findViewById(R.id.right);

        left.setOnClickListener(this);
        right.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


    }
}