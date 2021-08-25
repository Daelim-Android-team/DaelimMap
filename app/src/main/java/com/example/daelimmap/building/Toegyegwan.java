package com.example.daelimmap.building;

import com.example.daelimmap.R;

import java.util.Arrays;
import java.util.List;

public class Toegyegwan {
    List<String> One_f = Arrays.asList("ATM기", "E0101 합동강의실", "E0107 합동강의실", "E0111 합동강의실",
                                        "대림 학보사", "반도체 부품 실슬실", "컴퓨터 유지 보수", "전원 EMC 실습실", "UTM실");
    List<String> Two_f = Arrays.asList("토목 제도실", "토목 CAD실", "측량 기자재실", "기자재 보관실", "E0222 강의실", "토목 CAD실2",
                                        "이진형 교수님 연구실", "이주호 교수님 연구실", "이양규 교수님 연구실", "박준경 교수님 연구실", "김원일 교수님 연구실",
                                        "배상호 교수님 연구실", "토목 환경과 사무실", "E0217 강의실", "E0221 강의실", "E0225 강의실", "E0229 강의실");
    List<String> Three_f = Arrays.asList("자료 분석실", "실습 자료실", "세미나실", "작업 관리실", "E0318 강의실", "경영 전산 실습실", "교강사 휴게실", "커뮤니티 공간"
                                        , "산업 경영학과 사무실", "김영선 교수님 연구실", "노경호 교수님 연구실", "김승경 교수님 연구실", "이현창 교수님 연구실"
                                        , "임경원 교수님 연구실", "E0317 강의실", "경영 세미나실", "경영 비지니스실");
    List<String> Four_f = Arrays.asList("E0402 강의실", "E0410 강의실", "프레젠테이션 실습실", "비지니스 실습실", "출력실", "컴퓨터 실습실", "외래 강의실", "교양 기자재실",
                                        "직업 교육 혁신 센터장", "교양 학사", "English Lounge 3", "창의 경영실", "주태욱 교수님 연구실", "김현석 교수님 연구실", "홍용기 교수님 연구실",
                                        "이지원 교수님 연구실", "경영학과 학과 사무실");
    List<String> Five_f = Arrays.asList("컴퓨터 그래픽실 1", "컴퓨터 그래픽실 2", "출력실", "실습 자료실", "ACE 스테이션", "전공 디자인실 1", "전공 디자인실 2", "실내 디자인과 사무실",
                                        "디자인 센터", "전공 디자인실 3", "전공 디자인실 4", "기초 디자인실 1");
    List<String> Six_f = Arrays.asList("송지현 교수님 연구실", "권희경 교수님 연구실", "기초 디자인 3", "E0610 강의실", "E0614 강의실", "캐드실", "컴퓨터 디자인실 2", "모형 제작실", "이경화 교수님 연구실",
                                        "유수연 교수님 연구실", "권세훈 교수님 연구실", "조지연 교수님 연구실", "양영근 교수님 연구실", "하승범 교수님 연구실", "기초 디자인실 2", "VR 영상 실습실", "의장실", "적산 강의실");
    List<String> Seven_f = Arrays.asList("박민석 교수님 연구실","김찬주 교수님 연구실", "장명호 교수님 연구실", "박진숙 교수님 연구실", "김철환 교수님 연구실", "출력실", "기자재 보관실", "사진 촬영실", "컴퓨터 디자인실1", "Mock up실",
                                        "E0730 강의실", "권오철 교수님 연구실","황민영 교수님 연구실", "서삼열 교수님 연구실", "신인중 교수님 연구실", "조광희 교수님 연구실", "프레젠테이션실", "건축학부 학과 사무실", "건축 설계 제도실 1", "건축 설계 제도실 2", "E0729 강의실");
    public List<List<String>> Tgflooer = Arrays.asList(One_f, Two_f, Three_f, Four_f, Five_f,Six_f,Seven_f);

    List<Integer> One_p = Arrays.asList(R.drawable.toegyegwan_1f_atm, R.drawable.toegyegwan_1f_gyoyangganguisil_e0101, R.drawable.toegyegwan_1f_habdongganguisil_e0107, R.drawable.toegyegwan_1f_habdongganguisil_e0111,
                                        R.drawable.toegyegwan_1f_daelimhagbosa_e0119, R.drawable.toegyegwan_1f_bandochebupumsilseubsil_e0121, R.drawable.toegyegwan_1f_computeryujibosusil_e0123, R.drawable.toegyegwan_1f_jeonwonemcgisulgyoyugsenteo_e0125,R.drawable.toegyegwan_1f_utmsil_e0129);
    List<Integer> Two_p = Arrays.asList(R.drawable.toegyegwan_2f_tomogjedosil_e0202, R.drawable.toegyegwan_2f_tomogcadsil_e0208, R.drawable.toegyegwan_2f_cheuglyanggijajaesisil_e0214, R.drawable.toegyegwan_2f_gijajaebogwansil_e0218, R.drawable.toegyegwan_2f_ganguisil_e0222,R.drawable.toegyegwan_2f_tomogcadsil2_e0226,
                                        R.drawable.toegyegwan_2f_leejinhyunggyosuyeongusil_e0201, R.drawable.toegyegwan_2f_leejuhogyosuyeongusil_e0203,R.drawable.toegyegwan_2f_leeyanggyugyosuyeongusil_e0205,R.drawable.toegyegwan_2f_parkjunkyunggyosuyeongusil_e0207,R.drawable.toegyegwan_2f_kimwonilgyosuyeongusil_e0209,
                                        R.drawable.toegyegwan_2f_baesanghogyosuyeongusil_e0211, R.drawable.toegyegwan_2f_tomoghwangyeonggwasamusil_e0213, R.drawable.toegyegwan_2f_ganguisil_e0217, R.drawable.toegyegwan_2f_ganguisil_e0221, R.drawable.toegyegwan_2f_ganguisil_e0225, R.drawable.toegyegwan_2f_ganguisil_e0229);
    List<Integer> Three_p = Arrays.asList(R.drawable.toegyegwan_3f_jalyobunseogsil_e0302, R.drawable.toegyegwan_3f_silseubjaelyosil_e0308, R.drawable.toegyegwan_3f_seminarsil_e0310, R.drawable.toegyegwan_3f_jageobgwanlisil_e0314, R.drawable.toegyegwan_3f_ganguisil_e0318, R.drawable.toegyegwan_3f_gyeongyeongjeonsansilseubsil_e0322,
                                            R.drawable.toegyegwan_3f_gyogangsasil_e0328, R.drawable.toegyegwan_3f_communityzone_e0330, R.drawable.toegyegwan_3f_saneobgyeongyeonggwasamusil_e0301,R.drawable.toegyegwan_3f_kimyoungsungyosuyeongusil_e0305, R.drawable.toegyegwan_3f_nogyunghogyosuyeongusil_e0307,
                                             R.drawable.toegyegwan_3f_kimseunggyunggyosuyeongusil_e0311,R.drawable.toegyegwan_3f_leehyunchanggyosuyeongusil_e0313, R.drawable.toegyegwan_3f_limgyungwongyosuyeongusil_e0315,R.drawable.toegyegwan_3f_ganguisil_e0317,R.drawable.toegyegwan_3f_gyeongyeongseminasil_e0321,R.drawable.toegyegwan_3f_gyeongyeongbijeuniseusil_e0325);
    List<Integer> Four_p = Arrays.asList(R.drawable.toegyegwan_4f_gyoyangganguisil_e0402, R.drawable.toegyegwan_4f_habdongganguisil_e0410, R.drawable.toegyegwan_4f_presentationsilseubsil_e0418, R.drawable.toegyegwan_4f_businesssangdamsilseubsil_e0424, R.drawable.toegyegwan_4f_chullyeogsil_e0432, R.drawable.toegyegwan_4f_oelaegyosusil_e0407);
    List<Integer> Five_p = Arrays.asList();
    List<Integer> Six_p = Arrays.asList();
    List<Integer> Seven_p = Arrays.asList();

    public List<List<Integer>> Tgpic = Arrays.asList(One_p, Two_p, Three_p, Four_p, Five_p,Six_p, Seven_p);
}
