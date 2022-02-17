package com.example.vendersdaelimmap.floor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vendersdaelimmap.R;

public class jadongchagwanfloor extends AppCompatActivity implements View.OnClickListener{

    TextView text;
    int currentIndex =0;
    int [] imgs = {R.drawable.jadongchagwan_1f_map,
            R.drawable.jadongchagwan_2f_map,R.drawable.jadongchagwan_3f_map,R.drawable.jadongchagwan_4f_map,
            R.drawable.jadongchagwan_5f_map,R.drawable.jadongchagwan_6f_map,R.drawable.jadongchagwan_7f_map};

    ImageView jadongchagwanfloor;
    ImageButton left,right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadongchagwanfloor);

        jadongchagwanfloor = findViewById(R.id.jadongchagwan_floor);
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
        Log.d("CheckLog", "jadongchagwanfloor : onStart");
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.right){
            if(currentIndex == (imgs.length-1)) return;
            else currentIndex++;
            Log.d("CheckLog", "jadongchagwanfloor : 오른쪽 버튼 누름");

        } else if (v.getId() == R.id.left){
            if(currentIndex==0) return;
            else currentIndex--;
            Log.d("CheckLog", "jadongchagwanfloor : 왼쪽 버튼 누름");
        }
        setImage();
    }

    public void setImage() {
        text.setText(String.format("%d층",currentIndex+1));
        jadongchagwanfloor.setImageResource(imgs[currentIndex]);
    }
}