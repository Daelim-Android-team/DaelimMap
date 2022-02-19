package com.example.vendersdaelimmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.yulgoggwan_floor;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class HanlimgwanActivity extends BottomSheetDialogFragment {

    Button hanlimgwan_button1;
    Button hanlimgwan_button2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.hanlimgwan, container, false);

        hanlimgwan_button1 = viewGroup.findViewById(R.id.hanlimgwan_button1);
        hanlimgwan_button2 = viewGroup.findViewById(R.id.hanlimgwan_button2);

        /* Hanlimgwanfloor 클래스가 없어 주석처리
        hanlimgwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Hanlimgwanfloor.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        }); */

        hanlimgwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HanlimgwanDetailsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        return viewGroup;
    }
}
