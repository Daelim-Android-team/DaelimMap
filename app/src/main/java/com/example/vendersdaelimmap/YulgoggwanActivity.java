package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.yulgoggwan_floor;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class YulgoggwanActivity extends BottomSheetDialogFragment {

    Button yulgoggwan_button;
    Button yulgoggwan_button2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.yulgoggwan, container, false);

        yulgoggwan_button = viewGroup.findViewById(R.id.yulgoggwan_button1);
        yulgoggwan_button2 = viewGroup.findViewById(R.id.yulgoggwan_button2);

        yulgoggwan_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), yulgoggwan_floor.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "YulgoggwanActivity : 평면도보기 버튼 누름");
            }
        });

        yulgoggwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), YulgoggwanDetailsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "YulgoggwanActivity : 상세보기 버튼 누름");
            }
        });
        return viewGroup;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("CheckLog", "YulgoggwanActivity : onStart");
    }
}