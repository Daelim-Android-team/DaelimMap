package com.example.daelimmap.floor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daelimmap.R;

import org.w3c.dom.Text;

public class dasangwanfloor extends AppCompatActivity  implements View.OnClickListener{

    int currentIndex =0;
    int [] imgs = {R.drawable.dasangwan_1f_map,
            R.drawable.dasangwan_2f_map,R.drawable.dasangwan_3f_map,R.drawable.dasangwan_4f_map,
            R.drawable.dasangwan_5f_map};


    ImageView dasangwanfloor;
    ImageButton left,right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasangwanfloor);

        dasangwanfloor = findViewById(R.id.dasangwan_floor);
        left = findViewById(R.id.left);
        right = findViewById(R.id.right);
        left.setOnClickListener(this);
        right.setOnClickListener(this);

        setImage();
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.right){
            if(currentIndex == (imgs.length-1))
                return;
            else currentIndex++;

        } else if (v.getId() == R.id.left){
            if(currentIndex==0) return;
            else currentIndex--;
        }
        setImage();
    }

    public void setImage() {
        dasangwanfloor.setImageResource(imgs[currentIndex]);
    }
}