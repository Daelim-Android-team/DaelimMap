package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.dasangwanfloor;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class DasangwanActivity extends BottomSheetDialogFragment {

    Button dasangwan;
    Button dasangwan_button2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.dasangwan, container, false);

        dasangwan = viewGroup.findViewById(R.id.dasangwan_button1);
        dasangwan_button2 = viewGroup.findViewById(R.id.dasangwan_button2);

        dasangwan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),dasangwanfloor.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "DasangwanActivity : 평면도보기 버튼 누름");
            }
        });

        dasangwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),DasangwanDetailsActivity.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "DasangwanActivity : 상세보기 버튼 누름");

            }
        });

        return viewGroup;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("CheckLog", "DasangwanActivity : onStart");
    }

}
