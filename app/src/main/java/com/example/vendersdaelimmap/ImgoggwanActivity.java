package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.imgoggwanfloor;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class ImgoggwanActivity extends BottomSheetDialogFragment {
    Button imgoggwan_button1;
    Button imgoggwan_button2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.imgoggwan, container, false);

        imgoggwan_button1 = viewGroup.findViewById(R.id.imgoggwan_button1);
        imgoggwan_button2 = viewGroup.findViewById(R.id.imgoggwan_button2);

        imgoggwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), imgoggwanfloor.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        imgoggwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ImgoggwanDetailsActivity.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        return viewGroup;
    }
}