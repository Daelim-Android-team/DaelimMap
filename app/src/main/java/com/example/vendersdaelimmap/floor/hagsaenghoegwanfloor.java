package com.example.vendersdaelimmap.floor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vendersdaelimmap.BaseActivity;
import com.example.vendersdaelimmap.R;

public class hagsaenghoegwanfloor extends BaseActivity implements View.OnClickListener {

    TextView text;

    int currentIndex =0;
    int [] imgs = {R.drawable.hagsaenghoegwan_1f_map,
            R.drawable.hagsaenghoegwan_2f_map,R.drawable.hagsaenghoegwan_3f_map,R.drawable.hagsaenghoegwan_4f_map,
            R.drawable.hagsaenghoegwan_5f_map};

    ImageView hagsaenghoegwanfloor;
    ImageButton left,right;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //투명하게 하기
//        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
//
//        layoutParams.flags= WindowManager.LayoutParams.FLAG_DIM_BEHIND;
//
//        layoutParams.dimAmount= 0.7f;getWindow().setAttributes(layoutParams);
        setContentView(R.layout.activity_hagsaenghoegwanfloor);
//
//        ActionBar actionBar = getSupportActionBar(); //액션바 가리기기
//       actionBar.hide();

        hagsaenghoegwanfloor = findViewById(R.id.hagsaenghoegwan_floor);
        text=findViewById(R.id.text);
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

        text.setText(String.format("%d층",currentIndex+1));
        hagsaenghoegwanfloor.setImageResource(imgs[currentIndex]);
    }
}