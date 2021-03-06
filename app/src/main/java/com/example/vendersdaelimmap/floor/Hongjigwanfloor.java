package com.example.vendersdaelimmap.floor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vendersdaelimmap.R;

public class Hongjigwanfloor extends AppCompatActivity  implements View.OnClickListener{

    TextView text;
    int currentIndex =0;
    int [] imgs = {R.drawable.hongjigwan_1f_map,
            R.drawable.hongjigwan_2f_map,R.drawable.hongjigwan_3f_map,R.drawable.hongjigwan_4f_map,
            R.drawable.hongjigwan_5f_map,R.drawable.hongjigwan_6f_map};

    ImageView Hongjigwanfloor;
    ImageButton left,right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hongjigwanfloor);

        text = findViewById(R.id.text);
        Hongjigwanfloor = findViewById(R.id.hongjigwan_floor);
        left = findViewById(R.id.left);
        right = findViewById(R.id.right);

        left.setOnClickListener(this);
        right.setOnClickListener(this);

        setImage();


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CheckLog", "Hongjigwanfloor : onStart");
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.right){
            if(currentIndex == (imgs.length-1)) return;
            else currentIndex++;
            Log.d("CheckLog", "Hongjigwangwanfloor : 오른쪽 버튼 누름");

        } else if (v.getId() == R.id.left){
            if(currentIndex==0) return;
            else currentIndex--;
            Log.d("CheckLog", "Hongjigwangwanfloor : 왼쪽 버튼 누름");
        }
        setImage();
    }

    public void setImage() {

        text.setText(String.format("%d층",currentIndex+1));
        Hongjigwanfloor.setImageResource(imgs[currentIndex]);
    }
}