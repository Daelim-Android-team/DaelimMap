package com.example.vendersdaelimmap.floor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vendersdaelimmap.R;

public class dasangwanfloor extends AppCompatActivity  implements View.OnClickListener{

    TextView text;
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

        text = findViewById(R.id.text);
        left = findViewById(R.id.left);
        right = findViewById(R.id.right);
        left.setOnClickListener(this);
        right.setOnClickListener(this);

        setImage();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CheckLog", "dasangwanfloor : onStart");
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.right){
            if(currentIndex == (imgs.length-1))
                return;
            else currentIndex++;
            Log.d("CheckLog", "dasangwanfloor : 오른쪽 버튼 누름");

        } else if (v.getId() == R.id.left){
            if(currentIndex==0) return;
            else currentIndex--;
            Log.d("CheckLog", "dasangwanfloor : 왼쪽 버튼 누름");
        }
        setImage();
    }

    public void setImage() {

        text.setText(String.format("%d층", currentIndex+1));
        dasangwanfloor.setImageResource(imgs[currentIndex]);
    }
}