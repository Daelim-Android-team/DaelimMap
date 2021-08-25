package com.example.daelimmap.building;

import android.media.Image;

import com.example.daelimmap.LV_adapter.ListView_adapter;
import com.example.daelimmap.R;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class Dasangwan {
    List<String> One_f = Arrays.asList("기계공작실");
    List<String> Two_f = Arrays.asList("강의실 M0217", "유공압실", "열 실험실", "급배수위생 실험실", "M0202강의실", "소강의 실습실", "유체 실험실", "3D printer", "HVAC실", "M0201 강의실");
    List<String> Three_f = Arrays.asList("생체 신호처리 실습실", "생체 재료 실습실", "생체 적합성 실습실", "보건, 의료 기기 관리실", "보건, 의료 기기 사무실", "의공 전기전자 실습실", "의공 컴퓨터실", "보건, 의료 기기 과 교수님 연구실", "M301 합동 강의실", "회의실");
    List<String> Four_f = Arrays.asList("소방 실험실", "설비 CAD실 1", "설비 CAD실 2", "설비 자동 제어 적산실", "M0417 강의실", "M0415 강의실", "고명진 교수님 연구실", "문경환 교수님 연구실", "옥경재 교수님 연구실", "강윤진 교수님 연구실", "김동우 교수님 연구실", "오병길 교수님 연구실", "소방 안전 설비과 사무실");
    List<String> Five_f = Arrays.asList("교수연구실", "설비 CAD실", "설비 CED실", "M0517 강의실", "M0515 강의실", "이양창 교수님 연구실", "유진규 교수님 연구실", "김상진 교수님 연구실", "나두현 교수님 연구실", "유충현 교수님 연구실", "권준박 교수님 연구실");
    public List<List<String>> Dsflooer = Arrays.asList(One_f, Two_f, Three_f, Four_f, Five_f);

    List<Integer> One_p = Arrays.asList(R.drawable.);
    List<Integer> Two_p = Arrays.asList(R.drawable.);
    List<Integer> Three_p = Arrays.asList(R.drawable.);
    List<Integer> Four_p= Arrays.asList(R.drawable.);
    List<Integer> Five_p = Arrays.asList(R.drawable.);

    public List<List<Integer>> Dspic = Arrays.asList(One_p, Two_p, Three_p, Four_p, Five_p);
}

