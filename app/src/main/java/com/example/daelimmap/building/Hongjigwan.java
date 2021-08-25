package com.example.daelimmap.building;

import com.example.daelimmap.R;

import java.util.Arrays;
import java.util.List;

public class Hongjigwan {
    List<String> B1_f = Arrays.asList("대림 아트홀 GATE 1", "대림 아트홀 GATE 2");
    List <String>  One_f = Arrays.asList("대림 아트홀 GATE 3", "대림 아트홀 GATE 4");
    List <String> Two_f = Arrays.asList("원스톱 지원실", "블루포트", "증명서 발급기", "ATM기", "항공 안전 혁신 실습실");
    List <String> Three_f = Arrays.asList("재료실", "잡 스테이션", "P0303 강의실", "공항직무서비스 실습실", "ACE 홀", "객실 실습실", "상담실", "P0312 강의실", "P0311 강의실",
            "김관식 교수님 연구실", "김재현 교수님 연구실", "김송죽 교수님 연구실", "장재호 교수님 연구실", "서정원 교수님 연구실", "호텔 관광학과 학과 사무실");
    List <String> Four_f = Arrays.asList("이인회 교수님 연구실", "임재훈 교수님 연구실", "한정혜 교수님 연구실", "배신영 교수님 연구실", "양근애 교수님 연구실",
            "강혜순 교수님 연구실", "항공 서비스 학과 학과 사무실", "항공안전실습실", "이미지 메이킹실", "영어 커뮤니케이션실", "어학 실습실 1", "어학 실습실 2",
            "어학 실습실 3", "항공식음료실습실", "여성 환복실", "남성 환복실", "잉글리쉬 라운지 4", "모형 비행객실", "상담실");
    List <String> Five_f = Arrays.asList("김수형 교수님 연구실", "신후남 교수님 연구실", "배희숙 교수님 연구실", "언어 재활과 학과 사무실", "상담실", "언어 치료 센터"
            , "잉글리쉬 라운지 5", "수업 행동 분석실", "모의 유치원 1", "자료실", "외래 교수 공용", "음성 분석실", "P0503 강의실", "P0504 강의실", "P0507 강의실",
            "P0508 강의실", "P0509 강의실");
    List <String> Six_f = Arrays.asList("허경표 교수님 연구실", "김현주 교수님 연구실", "송경애 교수님 연구실", "오연주 교수님 연구실", "유아교육과 학과 사무실", "멀티미디어 제작실",
            "P0611 강의실", "P0612 강의실", "P0609 강의실", "동작실", "모의 유치원", "유효인 교수님 연구실", "창고", "악기 연습실", "피아노실", "공예실", "재료 관리실");
    public List<List<String>> Hjflooer = Arrays.asList(B1_f,One_f, Two_f, Three_f, Four_f, Five_f,Six_f);

    List<Integer> B1_p = Arrays.asList(R.drawable.hongjigwan_0b1f_daelimartholgate1, R.drawable.hongjigwan_0b1f_daelimartholgate2);
    List<Integer> One_p = Arrays.asList(R.drawable.hongjigwan_1f_daelimartholgate3, R.drawable.hongjigwan_1f_daelimartholgate4);
    List<Integer> Two_p = Arrays.asList(R.drawable.hongjigwan_2f_onestopjiwonsil, R.drawable.hongjigwan_2f_cafeblueport, R.drawable.hongjigwan_2f_jeungmyeongseobalgeubgi, R.drawable.hongjigwan_2f_atm, R.drawable.hongjigwan_2f_hanggonganjeonhyeogsinsilseubsil);
    List<Integer> Three_p = Arrays.asList(R.drawable.hongjigwan_3f_jaelyosil_p0301, R.drawable.hongjigwan_3f_jobstation, R.drawable.hongjigwan_3f_ganguisil_p0303, R.drawable.hongjigwan_3f_gonghangjigmuseobiseusilseubsil_p0304, R.drawable.hongjigwan_3f_acehall_p0308,
                                        R.drawable.hongjigwan_3f_hotelgaegsilsilseubsil_p0309, R.drawable.hongjigwan_3f_sangdamsil, R.drawable.hongjigwan_3f_ganguisil_p0312,R.drawable.hongjigwan_3f_ganguisil_p0311,R.drawable.hongjigwan_3f_kimgwansikgyosuyeongusil_p0302,
                                         R.drawable.hongjigwan_3f_kimjaehyungyosuyeongusil_p0314, R.drawable.hongjigwan_3f_kimsongjukgyosuyeongusil_p0315, R.drawable.hongjigwan_3f_jangjaehogyosuyeongusil_p0316, R.drawable.hongjigwan_3f_seojungwongyosuyeongusil_p0317,R.drawable.hongjigwan_3f_hotelgwangwanggwasamusil_p0318);
    List<Integer> Four_p = Arrays.asList(R.drawable.hongjigwan_4f_leeinheegyosuyeongusil_p0401, R.drawable.hongjigwan_4f_limjeonghungyosuyeongusil_p0402, R.drawable.hongjigwan_4f_hanjeonghyegyosuyeongusil_p0415, R.drawable.hongjigwan_4f_baeshinyounggyosuyeongusil_p0416);
    List<Integer> Five_p = Arrays.asList();
    List<Integer> Six_p = Arrays.asList();

    public List<List<Integer>> Hjpic = Arrays.asList(B1_p, One_p, Two_p, Three_p, Four_p, Five_p,Six_p);
}
