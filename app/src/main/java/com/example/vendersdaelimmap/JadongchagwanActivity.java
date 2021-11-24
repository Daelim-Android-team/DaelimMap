package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.jadongchagwanfloor;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class JadongchagwanActivity extends BottomSheetDialogFragment {

    Button jadongchagwan_button;
    Button jadongchagwan_button2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.jadongchagwan, container, false);

        jadongchagwan_button = viewGroup.findViewById(R.id.jadongchagwan_button);
        jadongchagwan_button2 = viewGroup.findViewById(R.id.jadongchagwan_button2);

        jadongchagwan_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), jadongchagwanfloor.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        jadongchagwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), JadongchagwanDetailsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        return viewGroup;
    }
}