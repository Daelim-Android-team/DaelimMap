package com.example.vendersdaelimmap.building;

import com.example.vendersdaelimmap.R;

import java.util.Arrays;
import java.util.List;

public class Hagsaenghoegwan {
    List<String> B1_f = Arrays.asList("영선실", "차체 수리 실습실");
    List <String> One_f = Arrays.asList("학생식당", "매점");
    List <String> Two_f = Arrays.asList("음악 연습실", "CCC" , "RCY", "동키호테", "사진부", "암실", "다목적 회의실",
                            "민방위 창고", "기자재실", "B – Eagle", "창작곡 연구회", "T.I.P Soul", "농구부", "테니스부", "동아리 연합회");
    List <String> Three_f = Arrays.asList("예비 군대대", "축구부/ ace콕", "볼링부", "학생회장실", "총학생회실");
    List <String> Four_f = Arrays.asList("국제 교류원 전담 강사실", "국제 교류원 상담실", "도담실", "대의원회");
    List <String> Five_f = Arrays.asList("학생처장실", "학생 복지팀");
    public List<List<String>> Hsflooer = Arrays.asList(B1_f,One_f, Two_f, Three_f, Four_f, Five_f);

    List<Integer> B1_p = Arrays.asList(R.drawable.hagsaenghoegwan_0b1f_yeongseonsil, R.drawable.hagsaenghoegwan_0b1f_chachesulisilseubsil);
    List<Integer> One_p = Arrays.asList(R.drawable.hagsaenghoegwan_1f_hagsaengsigdang, R.drawable.hagsaenghoegwan_1f_maejeom);
    List<Integer> Two_p = Arrays.asList(R.drawable.hagsaenghoegwan_2f_eumagyeonseubsil, R.drawable.hagsaenghoegwan_2f_ccc,
            R.drawable.hagsaenghoegwan_2f_rcy, R.drawable.hagsaenghoegwan_2f_donkihote, R.drawable.hagsaenghoegwan_2f_sajinbu,
            R.drawable.hagsaenghoegwan_2f_amsil, R.drawable.hagsaenghoegwan_2f_damogjeoghoeuisil, R.drawable.hagsaenghoegwan_2f_minbangwichanggo,
            R.drawable.hagsaenghoegwan_2f_gijajaesil, R.drawable.hagsaenghoegwan_2f_beagle, R.drawable.hagsaenghoegwan_2f_changjaggogyeonjuhoe,
            R.drawable.hagsaenghoegwan_2f_tipsoul, R.drawable.hagsaenghoegwan_2f_nonggubu, R.drawable.hagsaenghoegwan_2f_teniseubu,
            R.drawable.hagsaenghoegwan_2f_dongaliyeonhabhoe);
    List<Integer> Three_p = Arrays.asList(R.drawable.hagsaenghoegwan_3f_yebigundaedae_g0308, R.drawable.hagsaenghoegwan_3f_chuggubu_g0307,
            R.drawable.hagsaenghoegwan_3f_bollingbu_g0305, R.drawable.hagsaenghoegwan_3f_hagsaenghoejangsil_g0301,
            R.drawable.hagsaenghoegwan_3f_chonghagsaenghoesil_g0303);
    List<Integer> Four_p= Arrays.asList(R.drawable.hagsaenghoegwan_4f_gugjegyolyuwonjeondamgangsasil_g0406, R.drawable.hagsaenghoegwan_4f_gugjegyolyuwonsangdamsil_g0407,
            R.drawable.hagsaenghoegwan_4f_dodamsil_g0405, R.drawable.hagsaenghoegwan_4f_daeuiwonhoe_g0403);
    List<Integer> Five_p = Arrays.asList(R.drawable.hagsaenghoegwan_5f_hagsaengcheojang_g0505, R.drawable.hagsaenghoegwan_5f_hagsaengbogjitim_g0501);
    public List<List<Integer>> Hspic = Arrays.asList(B1_p, One_p, Two_p, Three_p, Four_p, Five_p);
}
