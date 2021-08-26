package com.example.daelimmap.building;

import com.example.daelimmap.R;

import java.util.Arrays;
import java.util.List;

public class Hanlimgwan {
    List<String> One_f = Arrays.asList("창고", "창고2", "스포츠지도과 관리실1", "스포츠지도과 관리실2", "스포츠지도과 학과장실", "에어로빅실", "체력단련장", "강의실  B0108",
            "강의실  B0105", "강의실  B0101", "운동처방실");
    List<String> Two_f = Arrays.asList("혁신지원사업단", "혁신 지원 사업단 부단장실", "신대철 교수님 연구실", "박형철 교수님 연구실", "이상욱 교수님 연구실",
            "임인섭 교수님 연구실", "안을섭 교수님 연구실", "평생 교육원 필라테스 스튜디오", "진로, 진학 실", "강의실 B0204", "운동 재활실", "운동 처방실");
    List <String> Three_f = Arrays.asList("실내체육관", "창고");
    List <String> Four_f = Arrays.asList("실내체육관 관람석", "방송국");
    public List<List<String>> Hlflooer = Arrays.asList(One_f, Two_f, Three_f, Four_f);

    List<Integer> One_p = Arrays.asList(R.drawable.hanlimgwan_1f_changgo, R.drawable.hanlimgwan_1f_changgo2_b0193, R.drawable.hanlimgwan_1f_seupocheujidogwagwanlisil1,
            R.drawable.hanlimgwan_1f_seupocheujidogwagwanlisil2, R.drawable.hanlimgwan_1f_seupocheujidogwahaggwajangsil, R.drawable.hanlimgwan_1f_eeolobigsil,
            R.drawable.hanlimgwan_1f_chelyeogdanlyeonjang, R.drawable.hanlimgwan_1f_ganguisil_b0108, R.drawable.hanlimgwan_1f_ganguisil_b0105, R.drawable.hanlimgwan_1f_ganguisil_b0101);
    List<Integer> Two_p = Arrays.asList(R.drawable.hanlimgwan_2f_hyeogsinjiwonsaeobdan_b0294, R.drawable.hanlimgwan_2f_hyeogsinjiwonsaeobdanbudanjang_b0293,
            R.drawable.hanlimgwan_2f_shindaechulgyosuyeongusil_b0201, R.drawable.hanlimgwan_2f_parkhyungsubgyosuyeongusil_b0203, R.drawable.hanlimgwan_2f_leesangwookgyosuyeongusil_b0205,
            R.drawable.hanlimgwan_2f_iminsungyosuyeongusil_b0207, R.drawable.hanlimgwan_2f_anulsubgyosuyeongusil_b0209, R.drawable.hanlimgwan_2f_pilatesstudio_b0211,
            R.drawable.hanlimgwan_2f_jinlojinhag_b0202, R.drawable.hanlimgwan_2f_ganguisil_b0204, R.drawable.hanlimgwan_2f_undongjaehwalsil_b0208,
            R.drawable.hanlimgwan_2f_undongcheobangsil_b0216);
    List<Integer> Three_p = Arrays.asList(R.drawable.hanlimgwan_3f_silnaecheyuggwan4, R.drawable.hanlimgwan_3f_silnaecheyuggwanchanggo);
    List<Integer> Four_p= Arrays.asList(R.drawable.hanlimgwan_4f_silnaecheyuggwangwanlamseog, R.drawable.hanlimgwan_4f_bangsonggug_b0401);
    public List<List<Integer>> Hlpic = Arrays.asList(One_p, Two_p, Three_p, Four_p);
}
