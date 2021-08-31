package com.example.vendersdaelimmap.bottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vendersdaelimmap.R;
import com.example.vendersdaelimmap.building.*;

import java.util.ArrayList;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        String getdata;
        ArrayList<String> arraylist;
        Dasangwan Ds = new Dasangwan();
        Hagsaenghoegwan Hs= new Hagsaenghoegwan();
        Hanlimgwan Hl = new Hanlimgwan();
        Hongjigwan Hj = new Hongjigwan();
        Imgoggwan Ig = new Imgoggwan();
        Jadongchagwan Jd = new Jadongchagwan();
        Jeongbotongsingwan Jb = new Jeongbotongsingwan();
        Jeonsangwan Js = new Jeonsangwan();
        Saenghwalgwan Sh = new Saenghwalgwan();
        Suamgwan Sa = new Suamgwan(); //공사중
        Toegyegwan Tg = new Toegyegwan();
        UniversityHeadquarters Uh = new UniversityHeadquarters();
        Yulgoggwan Yg = new Yulgoggwan();

        Intent intent = getIntent();
        ImageView imv = findViewById(R.id.result_image);
        TextView tex = findViewById(R.id.floor_text);
        int i=0;
        String a;
//        for(int i = 0; i < arraylist.size(); i++){
//            if(getdata != arraylist.get(i)){
//                for (int j = 0; j < Ds.Dsflooer.size(); j++){
//                    for(int k = 0; k <Ds.Dsflooer.get(j).size(); k++){
//                        imv.setImageResource(Integer.parseInt(Ds.Dsflooer.get(j).get(k))) ;
//                    }
//                }
//        }else{
//                i++;
//            }
    }
}