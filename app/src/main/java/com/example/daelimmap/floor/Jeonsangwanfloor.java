package com.example.daelimmap.floor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.daelimmap.R;

public class Jeonsangwanfloor extends AppCompatActivity implements View.OnClickListener {

    int currentIndex =0;
    int [] imgs = {R.drawable.jeonsangwan_1f_map,
            R.drawable.jeonsangwan_2f_map,R.drawable.jeonsangwan_3f_map,R.drawable.jeonsangwan_4f_map,
            R.drawable.jeonsangwan_5f_map};

    ImageView jeonsangwanfloor;
    ImageButton left,right;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeonsangwanfloor);

        jeonsangwanfloor = findViewById(R.id.jeonsangwanfloor);
        left = findViewById(R.id.left);
        right = findViewById(R.id.right);

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
        jeonsangwanfloor.setImageResource(imgs[currentIndex]);
    }
}