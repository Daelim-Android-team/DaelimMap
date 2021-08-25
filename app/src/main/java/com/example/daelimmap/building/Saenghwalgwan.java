package com.example.daelimmap.building;

import com.example.daelimmap.R;

import java.util.Arrays;
import java.util.List;

public class Saenghwalgwan {


    List<String> B1_f = Arrays.asList("소방 안전설비과 관리실", "설비시공 실습실");
    List <String>  One_f = Arrays.asList("cafe Bene", "매점", "휴게 공간", "안경점", "구내 서점", "식사 공간");
    List <String> Two_f = Arrays.asList("아이디어 박스");
    public List<List<String>> Shflooer = Arrays.asList(B1_f,One_f, Two_f);

    List<Integer> b1_p =  Arrays.asList(R.drawable.saenghwalgwan_0b1f_sobanganjeonseolbigwagwanlisil, R.drawable.saenghwalgwan_0b1f_seolbisigongsilseubsil_kb103);
    List<Integer> One_p = Arrays.asList(R.drawable.saenghwalgwan_1f_cafe, R.drawable.saenghwalgwan_1f_pyeonuijeom_k0107, R.drawable.saenghwalgwan_1f_cafelounge,
            R.drawable.saenghwalgwan_1f_angyeongjeom_k0110,R.drawable.saenghwalgwan_1f_gunaeseojeom_k0112,R.drawable.saenghwalgwan_1f_hyugegonggan);
    List<Integer> Two_p = Arrays.asList(R.drawable.saenghwalgwan_2f_ideabox);
    public List<List<Integer>> Dspic = Arrays.asList(b1_p, One_p, Two_p);
}

