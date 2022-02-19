package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.jeongbotongsingwanfloor;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class JeongbotongsingwanActivity extends BottomSheetDialogFragment {

    Button jeongbotongsingwan_button1;
    Button jeongbotongsingwan_button2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.jeongbotongsingwan, container, false);

        jeongbotongsingwan_button1 = viewGroup.findViewById(R.id.jeongbotongsingwan_button1);
        jeongbotongsingwan_button2 = viewGroup.findViewById(R.id.jeongbotongsingwan_button2);

        jeongbotongsingwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), jeongbotongsingwanfloor.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "JeongbotongsingwanActivity : 평면도보기 버튼 누름");
            }
        });

        jeongbotongsingwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), JeongbotongsingwanDetailsActivity.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "JeongbotongsingwanActivity : 상세보기 버튼 누름");
            }
        });
        return viewGroup;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("CheckLog", "JeongbotongsingwanActivity : onStart");
    }
}