package com.example.vendersdaelimmap.building;

import com.example.vendersdaelimmap.R;

import java.util.Arrays;
import java.util.List;

public class Imgoggwan {

    List<String> One_f = Arrays.asList("공동 훈련센터장", "공동 훈련 센터 행정실", "듀얼 공동 훈련 강의실", "회의실", "노동조합",
            "학생 통합 상담 센터", "집단 상담실", "프로그래밍 3");
    List <String> Two_f = Arrays.asList("세미나실 H0202", "장애 학생 지원센터", "국제 교류 원장", "교양 강의실 H0210", "취창업상담실", "취업코칭실", "취업팀",
            "보건실", "취업처장", "국제교류지원팀");
    public List<List<String>> Igflooer = Arrays.asList(One_f, Two_f);

    List<Integer> One_p = Arrays.asList(R.drawable.imgoggwan_1f_gongdonghunlyeonsenteojang_h0115, R.drawable.imgoggwan_1f_gongdonghunlyeonsenteohaengjeongsil_h0109,
            R.drawable.imgoggwan_1f_dyueolgongdonghunlyeonsenteoganguisil_h0107_h0105, R.drawable.imgoggwan_1f_hoeuisil_h0105, R.drawable.imgoggwan_1f_nodongjohab_h0103,
            R.drawable.imgoggwan_1f_hagsaengtonghabsangdamsenteo_h0114, R.drawable.imgoggwan_1f_jibdansangdamsil_h0112, R.drawable.imgoggwan_1f_programing3_h0102);
    List<Integer> Two_p = Arrays.asList(R.drawable.imgoggwan_2f_seminarsil_h0202, R.drawable.imgoggwan_2f_jangaehagsaengjiwonsenteo_h0206, R.drawable.imgoggwan_2f_gugjegyolyuwonjang_h0208,
            R.drawable.imgoggwan_2f_gyoyangganguisil_h0210, R.drawable.imgoggwan_2f_chwichangeobsangdamsil_h0291, R.drawable.imgoggwan_2f_chwieobkochingsil_h0203,
            R.drawable.imgoggwan_2f_chwieobtim_h0205, R.drawable.imgoggwan_2f_bogeonsil_h0293, R.drawable.imgoggwan_2f_chwieobcheojang_h0207, R.drawable.imgoggwan_2f_gugjegyolyujiwontim_h0209);
    public List<List<String>> Igpic = Arrays.asList(One_f, Two_f);
}