package com.example.vendersdaelimmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.vendersdaelimmap.floor.universityheadquatersfloor;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class UniversityheadquatersActivity extends BottomSheetDialogFragment {

    Button universityheadquaters_button1;
    Button universityheadquaters_button2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.universityheadquaters, container, false);

        universityheadquaters_button1 = viewGroup.findViewById(R.id.universityheadquaters_button1);
        universityheadquaters_button2 = viewGroup.findViewById(R.id.universityheadquaters_button2);

        universityheadquaters_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), universityheadquatersfloor.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "UniversityheadqurtersActivity : 평면도보기 버튼 누름");
            }
        });

        universityheadquaters_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),UniversityheadquatersDetailsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Log.d("CheckLog", "UniversityheadqurtersActivity : 상세보기 버튼 누름");
            }
        });
        return viewGroup;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("CheckLog", "UniversityheadquatersActivity : onStart");
    }
}