package com.example.daelimmap.floor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daelimmap.R;

public class Suamgwanfloor extends AppCompatActivity implements View.OnClickListener{
    TextView text;
    ImageView Suamgwanfloor;
    ImageButton left,right;
    int currentIndex =0;
    int [] imgs = {R.drawable.suamgwan_1f_map,
            R.drawable.saenghwalgwan_2f_map,R.drawable.suamgwan_3f_map,
            R.drawable.suamgwan_4f_map,R.drawable.suamgwan_5f_map};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suamgwanfloor);

        Suamgwanfloor = findViewById(R.id.suamgwan_floor);
        left = findViewById(R.id.left);
        right = findViewById(R.id.right);

        text = findViewById(R.id.text);
        left.setOnClickListener(this);
        right.setOnClickListener(this);

        setImage();
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.right){
            if(currentIndex == (imgs.length-1)) return;
            else currentIndex++;

        } else if (v.getId() == R.id.left){
            if(currentIndex==0) return;
            else currentIndex--;
        }
        setImage();

    }

    public void setImage() {
        text.setText(String.format("%d층",currentIndex+1));
        Suamgwanfloor.setImageResource(imgs[currentIndex]);
    }
}