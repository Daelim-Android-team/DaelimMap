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
    List<String> Three_f = Arrays.asList("생체 신호처리 실습실", "생체 재료 실습실", "생체 적합성 실습실", "보건, 의료 기기 관리실", "보건, 의료 기기 사무실", "의공 전기전자 실습실", "의공 컴퓨터실", "이득용 교수님 연구실", "윤용현 교수님 연구실", "M301 합동 강의실", "회의실");
    List<String> Four_f = Arrays.asList("소방 실험실", "설비 CAD실 1", "설비 CAD실 2", "M0417 강의실", "고명진 교수님 연구실", "문경환 교수님 연구실", "옥경재 교수님 연구실", "강윤진 교수님 연구실", "김동우 교수님 연구실", "오병길 교수님 연구실", "소방 안전 설비과 사무실");
    List<String> Five_f = Arrays.asList("교수연구실", "설비 CAD실", "설비 CAED실", "M0517 강의실", "M0515 강의실", "이양창 교수님 연구실", "유진규 교수님 연구실", "김상진 교수님 연구실", "나두현 교수님 연구실", "유충현 교수님 연구실", "권준박 교수님 연구실");
    public List<List<String>> Dsflooer = Arrays.asList(One_f, Two_f, Three_f, Four_f, Five_f);


    List<Integer> One_p = Arrays.asList(R.drawable.dasangwan_1f_gigyegongjagsil);
    List<Integer> Two_p = Arrays.asList(R.drawable.dasangwan_2f_ganguisil_m0217, R.drawable.dasangwan_2f_yugongabsil_m0210, R.drawable.dasangwan_2f_yeolsilheomsil_m0208, R.drawable.dasangwan_2f_geubbaesuwisaengsilheomsil_m0206,
            R.drawable.dasangwan_2f_ganguisil_m0202, R.drawable.dasangwan_2f_soganguisilseubsil_m0211, R.drawable.dasangwan_2f_yuchesilheomsil_m0209, R.drawable.dasangwan_2f_3dprinter_m0207, R.drawable.dasangwan_2f_hvavsil_m0205, R.drawable.dasangwan_2f_ganguisil_m0293_m0201);
    List<Integer> Three_p = Arrays.asList(R.drawable.dasangwan_3f_saengchesinhocheolisilseubsil_m0312, R.drawable.dasangwan_3f_saengchejaelyosilseubsil_m0308, R.drawable.dasangwan_3f_saengchejeoghabseongsilseubsil_m0306, R.drawable.dasangwan_3f_dasangwan_3f_bogeonuilyogigigwagwanlisil_m0304,
            R.drawable.dasangwan_3f_bogeonuilyogigigwasamusil_m0302, R.drawable.dasangwan_3f_uigongjeongijeonjasilseubsil_m0311, R.drawable.dasangwan_3f_uigongkeompyuteosil_m0307, R.drawable.dasangwan_3f_leedeukyonggyosuyeongusil_m0397,
            R.drawable.dasangwan_3f_yunyonghyeongyosuyeongusil_m0396, R.drawable.dasangwan_3f_ganguisil_m0301, R.drawable.dasangwan_3f_hwajangsil);
    List<Integer> Four_p = Arrays.asList(R.drawable.dasangwan_4f_sobangsilheomsil_m0414, R.drawable.dasangwan_4f_seolbicadsil1_m0410, R.drawable.dasangwan_4f_seolbicadsil2_m0406, R.drawable.dasangwan_4f_ganguisil_m0417, R.drawable.dasangwan_4f_komyungjingyosuyeongusil_m0413,
            R.drawable.dasangwan_4f_munjunghwangyosuyeongusil_m0411, R.drawable.dasangwan_4f_okkyungjaegyosuyeongusil_m0409, R.drawable.dasangwan_4f_ganguisil_m0417, R.drawable.dasangwan_4f_kimdongwoogyosuyeongusil_m0405, R.drawable.dasangwan_4f_ohbyunggilgyosuyeongusil_m0403, R.drawable.dasangwan_4f_sobanganjeonseolbigwasamusil_m0401);
    List<Integer> Five_p = Arrays.asList(R.drawable.dasangwan_5f_gyosuyeongusil_m0508, R.drawable.dasangwan_5f_dasangwan_5f_cadsil_m0510, R.drawable.dasangwan_5f_caesil_m0514, R.drawable.dasangwan_5f_ganguisil_m0517, R.drawable.dasangwan_5f_ganguisil_m0515, R.drawable.dasangwan_5f_leeyangchanggyosuyeongusil_m0513,
            R.drawable.dasangwan_5f_yoojinkyugyosuyeongusil_m0511, R.drawable.dasangwan_5f_yoochunghyungyosuyeongusil_m0505, R.drawable.dasangwan_5f_kwonjunbakgyosuyeongusil_m0503);
    public List<List<Integer>> Dspic = Arrays.asList(One_p, Two_p, Three_p, Four_p, Five_p);
}
