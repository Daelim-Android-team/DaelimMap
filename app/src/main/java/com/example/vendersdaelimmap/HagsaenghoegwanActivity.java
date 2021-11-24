package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.vendersdaelimmap.R;
import com.example.vendersdaelimmap.floor.hagsaenghoegwanfloor;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class HagsaenghoegwanActivity extends BottomSheetDialogFragment {

    Button hagsaenghoegwan_button1;
    Button hagsaenghoegwan_button2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.hagsaenghoegwan, container, false);

        hagsaenghoegwan_button1 = viewGroup.findViewById(R.id.hagsaenghoegwan_button1);
        hagsaenghoegwan_button2 = viewGroup.findViewById(R.id.hagsaenghoegwan_button2);

        hagsaenghoegwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), hagsaenghoegwanfloor.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        hagsaenghoegwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HagsaenghoegwanDetailsActivity.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        return viewGroup;
    }
}