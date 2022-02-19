package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.Saenghwalgwanfloor;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class SaenghwalgwanActivity extends BottomSheetDialogFragment {

    Button saenghwalgwan_button1;
    Button saenghwalgwan_button2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.saenghwalgwan, container, false);

        saenghwalgwan_button1 = viewGroup.findViewById(R.id.saenghwalgwan_button1);
        saenghwalgwan_button2 = viewGroup.findViewById(R.id.saenghwalgwan_button2);

        saenghwalgwan_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Saenghwalgwanfloor.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "SaenghwalgwanActivity : 평면도보기 버튼 누름");
            }
        });

        saenghwalgwan_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),SaenghwalgwanDetailsActivity.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "SaenghwalgwanActivity : 상세보기 버튼 누름");
            }
        });
        return viewGroup;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CheckLog", "SaenghwalgwanActivity : onStart");
    }
}