package com.example.vendersdaelimmap.floor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vendersdaelimmap.R;

public class imgoggwanfloor extends AppCompatActivity implements View.OnClickListener{
    int currentIndex =0;
    int [] imgs = {R.drawable.imgoggwan_1f_map,
            R.drawable.imgoggwan_2f_map};
    TextView text;
    ImageView imgoggwanfloor;
    ImageButton left,right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imgoggwanfloor);

        imgoggwanfloor = findViewById(R.id.imgoggwanfloor);

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
        Log.d("CheckLog", "imgoggwanfloor : onStart");
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.right){
            if(currentIndex == (imgs.length-1)) return;
            else currentIndex++;
            Log.d("CheckLog", "imgoggwanfloor : 오른쪽 버튼 누름");

        } else if (v.getId() == R.id.left){
            if(currentIndex==0) return;
            else currentIndex--;
            Log.d("CheckLog", "imgoggwanfloor : 왼쪽 버튼 누름");
        }
        setImage();

    }

    public void setImage() {
        text.setText(String.format("%d층",currentIndex+1));
        imgoggwanfloor.setImageResource(imgs[currentIndex]);
    }
}