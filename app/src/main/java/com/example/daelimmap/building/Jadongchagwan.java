package com.example.daelimmap.building;

import com.example.daelimmap.R;

import java.util.Arrays;
import java.util.List;

public class Jadongchagwan {
    List<String> One_f = Arrays.asList("자동차과 설비실", "L0105 강의실");
    List <String> Two_f = Arrays.asList("샤워실");
    List <String> Three_f = Arrays.asList("정비실습실", "강의실", "기관 실습실", "전시관" );
    List <String> Four_f = Arrays.asList("이승용 교수님 연구실", "이정호 교수님 연구실", "함성훈 교수님 연구실", "국창호 교수님 연구실",
            "자동차 학부 학과 사무실", "김필수 교수님 연구실", "첨단 강의실", "전자제어 실습실", "전기 실습실", "L0413 강의실", "L0417 강의실");
    List <String> Five_f = Arrays.asList("겸임 교수님 연구실", "강호인 교수님 연구실", "이영숙 교수님 연구실", "이일권 교수님 연구실", "communityzone", "박종건 교수님 연구실",
            "전공 동아리실", "카티아 실습실", "세미나실", "L0511 강의실", "L0515 강의실");
    List <String> Six_f = Arrays.asList("의전 경호 전공 학과 사무실", "L0610 강의실", "L0602 강의실", "학적 자료실", "진단 실습실", "섀시 실습실", "L0605 강의실", "L0601 강의실");
    List <String> Seven_f = Arrays.asList("상담실", "평생 교육 지원팀", "L0702 강의실", "학습자 휴게실", "평생 교육 원장실",
                                            "교강사 휴게실", "L0709 강의실", "L0705 강의실", "L0701 강의실");
    public List<List<String>> Jdflooer = Arrays.asList(One_f, Two_f, Three_f, Four_f, Five_f, Six_f, Seven_f);

    List<Integer> One_p = Arrays.asList(R.drawable.jadongchagwan_1f_jeongbisil, R.drawable.jadongchagwan_1f_jeongbisil2, R.drawable.jadongchagwan_1f_ganguisil_l0105);
    List<Integer> Two_p = Arrays.asList();
    List<Integer> Three_p = Arrays.asList(R.drawable.jadongchagwan_3f_ganguisil_l0301,R.drawable.jadongchagwan_3f_haitekeusilseubsil_l0302,R.drawable.jadongchagwan_3f_haitekeusilseubsil_l0302);
    List<Integer> Four_p= Arrays.asList(R.drawable.jadongchagwan_4f_leeseungyonggyosuyeongusil_l0404, R.drawable.jadongchagwan_4f_leejunghogyosuyeongusil_l0406, R.drawable.jadongchagwan_4f_hamsunghungyosuyeongusil_l0408, R.drawable.jadongchagwan_4f_gukchanghogyosuyeongusil_l0410,
            R.drawable.jadongchagwan_4f_jadongchagonghaggwasamusil_l0414, R.drawable.jadongchagwan_4f_kimpilsugyosuyeongusil_l0416, R.drawable.jadongchagwan_4f_cheomdanganguisil_l0401, R.drawable.jadongchagwan_4f_jeonjajeeosilseubsil_l0405,
            R.drawable.jadongchagwan_4f_jeongisilseubsil_l0409,R.drawable.jadongchagwan_4f_ganguisil_l0413,R.drawable.jadongchagwan_4f_ganguisil_l0417);
    List<Integer> Five_p = Arrays.asList(R.drawable.jadongchagwan_5f_gyeomimgyosusil_l0502, R.drawable.jadongchagwan_5f_kanghoingyosuyeongusil_l0504, R.drawable.jadongchagwan_5f_leeyoungsukgyosuyeongusil_l0506, R.drawable.jadongchagwan_5f_leeilkwongyosuyeongusil_l0508,
            R.drawable.jadongchagwan_5f_communityzone_l0510, R.drawable.jadongchagwan_5f_parkjonggungyosuyeongusil_l0512,R.drawable.jadongchagwan_5f_jeongongdongalisil_l0501, R.drawable.jadongchagwan_5f_katiasilseubsil_l0503,R.drawable.jadongchagwan_5f_seminasil_l0507, R.drawable.jadongchagwan_5f_ganguisil_l0511, R.drawable.jadongchagwan_5f_ganguisil_l0515);
    List<Integer> Six_p= Arrays.asList(R.drawable.jadongchagwan_6f_uijeongyeonghojeongonghaggwajangsil_l0614, R.drawable.jadongchagwan_6f_ganguisil_l0610, R.drawable.jadongchagwan_6f_ganguisil_l0602, R.drawable.jadongchagwan_6f_hagjeogjalyosil_l0617, R.drawable.jadongchagwan_6f_jindansilseubsil_l0613, R.drawable.jadongchagwan_6f_syaesisilseubsil_l0609,
            R.drawable.jadongchagwan_6f_ganguisil_l0605, R.drawable.jadongchagwan_6f_ganguisil_l0601);
    List<Integer> Seven_p = Arrays.asList(R.drawable.jadongchagwan_7f_sangdamsil_l0712, R.drawable.jadongchagwan_7f_pyeongsaenggyoyugjiwontim_l0708, R.drawable.jadongchagwan_7f_ganguisil_l0702,R.drawable.jadongchagwan_7f_hagseubjahyugesil_l0717,R.drawable.jadongchagwan_7f_pyeongsaenggyoyugwonjang_l0715,
            R.drawable.jadongchagwan_7f_gyogangsahyugesil_l0713, R.drawable.jadongchagwan_7f_ganguisil_l0709, R.drawable.jadongchagwan_7f_ganguisil_l0705, R.drawable.jadongchagwan_7f_ganguisil_l0701);

    public List<List<Integer>> jdpic = Arrays.asList(One_p, Two_p, Three_p, Four_p, Five_p,Six_p, Seven_p, Seven_p);
}

