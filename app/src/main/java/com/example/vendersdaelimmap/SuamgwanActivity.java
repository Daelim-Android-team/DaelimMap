package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.Suamgwanfloor;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class SuamgwanActivity extends BottomSheetDialogFragment {

    Button suamgwan_button1;
    Button suamgwan_button2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.suamgwan, container, false);

        suamgwan_button1 = viewGroup.findViewById(R.id.suamgwan_button1);
        suamgwan_button2 = viewGroup.findViewById(R.id.suamgwan_button2);
        suamgwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Suamgwanfloor.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        suamgwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SuamgwanDetailsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        return viewGroup;
    }
}