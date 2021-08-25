package com.example.daelimmap.building;

import com.example.daelimmap.R;

import java.util.Arrays;
import java.util.List;

public class Jeonsangwan {

    List<String> One_f = Arrays.asList("미화원 휴게실 (남)", "키친 6", "조리 실습 준비실");
    List <String> Two_f = Arrays.asList("류중경 교수님 연구실", "서버실", "프로그래밍 2실 J0226", "프로그래밍 1실 J0225");
    List <String> Twohalf_f = Arrays.asList("교양 강의실 J0211", "교양 강의실 J0212", "교양 강의실 J0213", "교양 강의실 J0214", "기자재 보관실","프로젝트 1 J0201",
                                                "김미정 교수님 연구실", "정호일 교수님 연구실", "박민재 교수님 연구실");
    List <String> Three_f = Arrays.asList("소프트웨어 관리실", "컴퓨터소프트웨어 과 사무실", "프로젝트 3 J0326", "프로젝트 2 J0325");
    List <String> Four_f = Arrays.asList("교직원 식당", "스마트 스테이션", "프로그래밍 실습실 2 J0407", "프로그래밍 실습실 1 J0403", "전공 세미나실");
    List <String> Five_f = Arrays.asList("유현성 교수님 연구실", "최재덕 교수님 연구실", "김신택 교수님 연구실", "김지예 교수님 연구실", "박상윤 교수님 연구실", "모바일 실습실 2 J0507",
                                            "모바일 실습실 1 J0506", "디지털 미디어 실습실 J0508", "프로젝트 실습실 J0509", "모바일 인터넷과 사무실");
    public List<List<String>> Jsflooer = Arrays.asList(One_f, Two_f,Twohalf_f, Three_f, Four_f, Five_f);

    List<Integer> One_p = Arrays.asList(R.drawable.jeonsangwan_1f_mihwajaelyosil_j0102, R.drawable.jeonsangwan_1f_kitchen6, R.drawable.jeonsangwan_1f_jolisilseubjunbisil);
    List<Integer> Two_p = Arrays.asList(R.drawable.jeonsangwan_2f_ryujunggyunggyosuyeongusil_j0221, R.drawable.jeonsangwan_2f_serversil, R.drawable.jeonsangwan_2f_programingsil2_j0226,
            R.drawable.jeonsangwan_2f_programingsil1_j0225);
    List<Integer> Twohalf_p = Arrays.asList(R.drawable.jeonsangwan_2andhalff_gyoyangganguisil_j0211, R.drawable.jeonsangwan_2andhalff_gyoyangganguisil_j0212, R.drawable.jeonsangwan_2andhalff_gyoyangganguisil_j0213,
            R.drawable.jeonsangwan_2andhalff_gyoyangganguisil_j0214, R.drawable.jeonsangwan_2andhalff_gijajaebogwansil, R.drawable.jeonsangwan_2andhalff_projectsil1_j0201, R.drawable.jeonsangwan_2andhalff_kimmijumgyosuyeongusil_j0203,
            R.drawable.jeonsangwan_2andhalff_jeonghoilgyosuyeongusil_j0204, R.drawable.jeonsangwan_2andhalff_parkminjaegyosuyeongusil_j0205);
    List<Integer> Three_p = Arrays.asList(R.drawable.jeonsangwan_3f_softwaredevelopmentgwanlisil, R.drawable.jeonsangwan_3f_computersoftwaregwagwanlisil, R.drawable.jeonsangwan_3f_projectsil3_j0326,
            R.drawable.jeonsangwan_3f_projectsil2_j0235);
    List<Integer> Four_p= Arrays.asList(R.drawable.jeonsangwan_4f_dcafeteria, R.drawable.jeonsangwan_4f_smartstation, R.drawable.jeonsangwan_4f_programmingsilseubsil2_j0407,
            R.drawable.jeonsangwan_4f_programmingsilseubsil1_j0403, R.drawable.jeonsangwan_4f_jeongongseminasil_j0401);
    List<Integer> Five_p = Arrays.asList(R.drawable.jeonsangwan_5f_yoohyunsunggyosuyeongusil_j0501, R.drawable.jeonsangwan_5f_choijaedukgyosuyeongusil_j0502, R.drawable.jeonsangwan_5f_kimsintaekgyosuyeongusil_j0503,
            R.drawable.jeonsangwan_5f_kimjiyegyosuyeongusil_j0504, R.drawable.jeonsangwan_5f_parksangyoongyosuyeongusil_j0505, R.drawable.jeonsangwan_5f_mobilesilseubsil2_j0507,
            R.drawable.jeonsangwan_5f_mobliesilseubsil1_j0506, R.drawable.jeonsangwan_5f_digitalmediasilseubsil_j0508, R.drawable.jeonsangwan_5f_projectsilseubsil_j0509,
            R.drawable.jeonsangwan_5f_mobailinteonesgwagwanlisil_j0510);
    public List<List<Integer>> Jbpic = Arrays.asList(One_p, Two_p, Twohalf_p, Three_p, Four_p, Five_p);
}
