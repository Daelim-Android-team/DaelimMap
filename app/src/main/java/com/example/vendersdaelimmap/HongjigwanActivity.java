package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.Hongjigwanfloor;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class HongjigwanActivity extends BottomSheetDialogFragment {

    Button hongjigwan_button1;
    Button hongjigwan_button2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.hongjigwan, container, false);

        hongjigwan_button1 = viewGroup.findViewById(R.id.hongjigwan_button1);
        hongjigwan_button2 = viewGroup.findViewById(R.id.hongjigwan_button2);

        hongjigwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Hongjigwanfloor.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "HongjigwanActivity : 평면도보기 버튼 누름");
            }
        });

        hongjigwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HongjigwanDetailsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "HongjigwanActivity : 상세보기 버튼 누름");
            }
        });
        return viewGroup;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("CheckLog", "HongjigwanActivity : onStart");
    }
}