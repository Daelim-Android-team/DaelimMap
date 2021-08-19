package com.example.daelimmap.floor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.daelimmap.R;

public class universityheadquatersfloor extends AppCompatActivity implements View.OnClickListener{

    int currentIndex =0;
    int [] imgs = {R.drawable.daehagbonbu_1f_map,
            R.drawable.daehagbonbu_2f_map,R.drawable.daehagbonbu_3f_map,R.drawable.daehagbonbu_4f_map};

    ImageView universityheadquatersfloor;
    ImageButton left,right;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universityheadquatersfloor);

        universityheadquatersfloor = findViewById(R.id.universityheadquatersfloor);

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
        universityheadquatersfloor.setImageResource(imgs[currentIndex]);
    }
}