package com.example.vendersdaelimmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.Jeonsangwanfloor;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class JeonsangwanActivity extends BottomSheetDialogFragment {

    Button jeonsangwan_button1;
    Button jeonsangwan_button2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.jeonsangwan, container, false);

        jeonsangwan_button1 = viewGroup.findViewById(R.id.jeonsangwan_button1);
        jeonsangwan_button2 = viewGroup.findViewById(R.id.jeonsangwan_button2);

        jeonsangwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Jeonsangwanfloor.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        jeonsangwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), JeonsangwanDetailsActivity.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        return viewGroup;
    }
}
