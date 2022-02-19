package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.toegyegwanfloor;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class ToegyegwanActivity extends BottomSheetDialogFragment {

    Button toegyegwan_button1;
    Button toegyegwan_button2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.toegyegwan, container, false);

        toegyegwan_button1 = viewGroup.findViewById(R.id.toegyegwan_button1);
        toegyegwan_button2 = viewGroup.findViewById(R.id.toegyegwan_button2);

        toegyegwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), toegyegwanfloor.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "ToegyegwanActivity : 평면도보기 버튼 누름");
            }
        });

        toegyegwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ToegyegwanDetailsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "ToegyegwanActivity : 상세보기 버튼 누름");
            }
        });
        return viewGroup;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CheckLog", "ToegyegwanActivity : onStart");
    }
}