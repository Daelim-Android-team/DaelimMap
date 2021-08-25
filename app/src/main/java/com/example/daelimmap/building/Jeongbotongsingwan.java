package com.example.daelimmap.building;

import com.example.daelimmap.R;

import java.util.Arrays;
import java.util.List;

<<<<<<< HEAD
public class Jeongbotongsingwan {
    List<String> One_f  = Arrays.asList ("iot 기기 실무 실습실", "동아리실", "멀티미디어 실습실 5", "멀티미디어 실습실 3", "통신 기계실",
            "박화세 교수님 연구실", "D0105 강의실", "대림 방송국");
    List <String>  Two_f  = Arrays.asList ("창고", "멀티미디어 실습실 1", "멀티미디어 실습실 2", "음향,영상 편집실", "문건창 교수님 연구실", "이진영 교수님 연구실", "송미숙 교수님 연구실",
            "방송 음향 영상학부 관리실", "김재평 교수님 연구실", "박준우 교수님 연구실", "조정실", "음향 스튜디오");
    List <String>  Three_f  = Arrays.asList ( "iot 기기 운용 실습실", "김민수 교수님 연구실", "창고", "디지털 실험실", "Embedeed system 교육센터", "iot 창의적 종합 설계실", "안창호 교수님 연구실",
            "오규태 교수님 연구실", "디지털 전자과 사무실", "유영길 교수님 연구실", "장동현 교수님 연구실", "기초 회로 연습실");
    List <String>  Four_f  = Arrays.asList ( "집적 회로 실험실", "EDA 교육센터", "작업실", "Ham 동아리", "창고", "통신 공학 실습실", "통신 응용 실험실", "박정일 교수님 연구실", "김은원 교수님 연구실",
            "전자 통신과 사무실", "김보연 교수님 연구실", "박병권 교수님 연구실", "안테나 실험실");
    public List<List<String>> Jbflooer = Arrays.asList(One_f, Two_f, Three_f, Four_f);

    List<Integer> One_p = Arrays.asList(R.drawable.jeongbotongsingwan_1f_iotgigisilmusilseubsil, R.drawable.jeongbotongsingwan_1f_dongalisil_d0108,
            R.drawable.jeongbotongsingwan_1f_meoltimidieosilseubsil5_d0116, R.drawable.jeongbotongsingwan_1f_meoltimidieosilseubsil3_d0120,
            R.drawable.jeongbotongsingwan_1f_tongsingigyesil_d0101, R.drawable.jeongbotongsingwan_1f_parkhwasegyosuyeongusil_d0103, R.drawable.jeongbotongsingwan_1f_ganguisil_d0105,
            R.drawable.jeongbotongsingwan_1f_daelimbangsonggug_d0113);
    List<Integer> Two_p = Arrays.asList(R.drawable.jeongbotongsingwan_2f_changgo_d0208, R.drawable.jeongbotongsingwan_2f_meoltimidieosilseubsil1,
            R.drawable.jeongbotongsingwan_2f_meoltimidieosilseubsil2_d0218, R.drawable.jeongbotongsingwan_2f_eumhyangyeongsangpyeonjibsil_d0216, R.drawable.jeongbotongsingwan_2f_mungunchanggyoyangganguisil_d0205,
            R.drawable.jeongbotongsingwan_2f_leejinyounggyosuyeongusil_d0207, R.drawable.jeongbotongsingwan_2f_songmisukgyosuyeongusil_d0209, R.drawable.jeongbotongsingwan_2f_bangsongeumagyeongsanghagbugwanlisil,
            R.drawable.jeongbotongsingwan_2f_kimjaepyunggyosuyeongusil_d0213, R.drawable.jeongbotongsingwan_2f_parkjunwoogyosuyeongusil_d0215, R.drawable.jeongbotongsingwan_2f_jojeongsil_d0217,
            R.drawable.jeongbotongsingwan_2f_eumhyangseutyudio_d0219);
    List<Integer> Three_p = Arrays.asList(R.drawable.jeongbotongsingwan_3f_iotgigiunyongsilseubsil_d0306, R.drawable.jeongbotongsingwan_3f_kimminsugyosuyeongusil_d0308,
            R.drawable.jeongbotongsingwan_3f_changgo_d0316, R.drawable.jeongbotongsingwan_3f_dijiteolsilheomsil_d0318, R.drawable.jeongbotongsingwan_3f_embeddedsystemgyoyugsenteo_d0322,
            R.drawable.jeongbotongsingwan_3f_iotchanguijeogjonghabseolgyesil_d0305, R.drawable.jeongbotongsingwan_3f_anchanghogyosuyeongusil_d0307,
            R.drawable.jeongbotongsingwan_3f_ohgyutaegyosuyeongusil_d0309, R.drawable.jeongbotongsingwan_3f_dijiteoljeonjagwasamusil_d0311, R.drawable.jeongbotongsingwan_3f_yooyeonggilgyosuyeongusil_d0313,
            R.drawable.jeongbotongsingwan_3f_jangdonghyungyosuyeongusil_d0315, R.drawable.jeongbotongsingwan_3f_gichohoelosilheomsil_d0317);
    List<Integer> Four_p= Arrays.asList(R.drawable.jeongbotongsingwan_4f_jigjeobhoelosilheomsil_d0402, R.drawable.jeongbotongsingwan_4f_edagyoyugsenteo_d0406,
            R.drawable.jeongbotongsingwan_4f_jageobsil_d0408, R.drawable.jeongbotongsingwan_4f_ham_d0491, R.drawable.jeongbotongsingwan_4f_changgo_d0416,
            R.drawable.jeongbotongsingwan_4f_tongsingonghagsilseubsil_d0418, R.drawable.jeongbotongsingwan_4f_tongsineungyongsilheomsil_d0405, R.drawable.jeongbotongsingwan_4f_parkjeongilgyosuyeongusil_d0407,
            R.drawable.jeongbotongsingwan_4f_kimeunwongyosuyeongusil_d0409, R.drawable.jeongbotongsingwan_4f_jeonjatongsingwasamusil_d0411, R.drawable.jeongbotongsingwan_4f_kimboyeongyosuyeongusil_d0413,
            R.drawable.jeongbotongsingwan_4f_parkbyungkwongyosuyeongusil_d0415, R.drawable.jeongbotongsingwan_4f_antenasilheomsil_d0417);
    public List<List<Integer>> Jbpic = Arrays.asList(One_p, Two_p, Three_p, Four_p);
}
=======
import com.example.daelimmap.R;

import java.util.Arrays;
import java.util.List;

    public class Jeongbotongsingwan {
        package com.example.daelimmap.building;

        List<String> One_f  = Arrays.asList ("iot 기기 실무 실습실", "동아리실", "멀티미디어 실습실 5", "멀티미디어 실습실 3", "통신 기계실",
                "박화세 교수님 연구실", "D0105 강의실", "대림 방송국");
        List <String>  Two_f  = Arrays.asList ("창고", "멀티미디어 실습실 1", "멀티미디어 실습실 2", "음향,영상 편집실", "문건창 교수님 연구실", "이진영 교수님 연구실", "송미숙 교수님 연구실",
                "방송 음향 영상학부 관리실", "김재평 교수님 연구실", "박준우 교수님 연구실", "조정실", "음향 스튜디오");
        List <String>  Three_f  = Arrays.asList ( "iot 기기 운용 실습실", "김민수 교수님 연구실", "창고", "디지털 실험실", "Embedeed system 교육센터", "iot 창의적 종합 설계실", "안창호 교수님 연구실",
                "오규태 교수님 연구실", "디지털 전자과 사무실", "유영길 교수님 연구실", "장동현 교수님 연구실", "기초 회로 연습실");
        List <String>  Four_f  = Arrays.asList ( "집적 회로 실험실", "EDA 교육센터", "작업실", "Ham 동아리", "창고", "통신 공학 실습실", "통신 응용 실험실", "박정일 교수님 연구실", "김은원 교수님 연구실",
                "전자 통신과 사무실", "김보연 교수님 연구실", "박병권 교수님 연구실", "안테나 실험실");
        public List<List<String>> Jbflooer = Arrays.asList(One_f, Two_f, Three_f, Four_f);

        List<Integer> One_p = Arrays.asList(R.drawable.jeongbotongsingwan_1f_iotgigisilmusilseubsil, R.drawable.jeongbotongsingwan_1f_dongalisil_d0108,
                R.drawable.jeongbotongsingwan_1f_meoltimidieosilseubsil5_d0116, R.drawable.jeongbotongsingwan_1f_meoltimidieosilseubsil3_d0120,
                R.drawable.jeongbotongsingwan_1f_tongsingigyesil_d0101, R.drawable.jeongbotongsingwan_1f_parkhwasegyosuyeongusil_d0103, R.drawable.jeongbotongsingwan_1f_ganguisil_d0105,
                R.drawable.jeongbotongsingwan_1f_daelimbangsonggug_d0113);
        List<Integer> Two_p = Arrays.asList(R.drawable.jeongbotongsingwan_2f_changgo_d0208, R.drawable.jeongbotongsingwan_2f_meoltimidieosilseubsil1,
                R.drawable.jeongbotongsingwan_2f_meoltimidieosilseubsil2_d0218, R.drawable.jeongbotongsingwan_2f_eumhyangyeongsangpyeonjibsil_d0216, R.drawable.jeongbotongsingwan_2f_mungunchanggyoyangganguisil_d0205,
                R.drawable.jeongbotongsingwan_2f_leejinyounggyosuyeongusil_d0207, R.drawable.jeongbotongsingwan_2f_songmisukgyosuyeongusil_d0209, R.drawable.jeongbotongsingwan_2f_bangsongeumagyeongsanghagbugwanlisil,
                R.drawable.jeongbotongsingwan_2f_kimjaepyunggyosuyeongusil_d0213, R.drawable.jeongbotongsingwan_2f_parkjunwoogyosuyeongusil_d0215, R.drawable.jeongbotongsingwan_2f_jojeongsil_d0217,
                R.drawable.jeongbotongsingwan_2f_eumhyangseutyudio_d0219);
        List<Integer> Three_p = Arrays.asList(R.drawable.jeongbotongsingwan_3f_iotgigiunyongsilseubsil_d0306, R.drawable.jeongbotongsingwan_3f_kimminsugyosuyeongusil_d0308,
                R.drawable.jeongbotongsingwan_3f_changgo_d0316, R.drawable.jeongbotongsingwan_3f_dijiteolsilheomsil_d0318, R.drawable.jeongbotongsingwan_3f_embeddedsystemgyoyugsenteo_d0322,
                R.drawable.jeongbotongsingwan_3f_iotchanguijeogjonghabseolgyesil_d0305, R.drawable.jeongbotongsingwan_3f_anchanghogyosuyeongusil_d0307,
                R.drawable.jeongbotongsingwan_3f_ohgyutaegyosuyeongusil_d0309, R.drawable.jeongbotongsingwan_3f_dijiteoljeonjagwasamusil_d0311, R.drawable.jeongbotongsingwan_3f_yooyeonggilgyosuyeongusil_d0313,
                R.drawable.jeongbotongsingwan_3f_jangdonghyungyosuyeongusil_d0315, R.drawable.jeongbotongsingwan_3f_gichohoelosilheomsil_d0317);
        List<Integer> Four_p= Arrays.asList(R.drawable.jeongbotongsingwan_4f_jigjeobhoelosilheomsil_d0402, R.drawable.jeongbotongsingwan_4f_edagyoyugsenteo_d0406,
                R.drawable.jeongbotongsingwan_4f_jageobsil_d0408, R.drawable.jeongbotongsingwan_4f_ham_d0491, R.drawable.jeongbotongsingwan_4f_changgo_d0416,
                R.drawable.jeongbotongsingwan_4f_tongsingonghagsilseubsil_d0418, R.drawable.jeongbotongsingwan_4f_tongsineungyongsilheomsil_d0405, R.drawable.jeongbotongsingwan_4f_parkjeongilgyosuyeongusil_d0407,
                R.drawable.jeongbotongsingwan_4f_kimeunwongyosuyeongusil_d0409, R.drawable.jeongbotongsingwan_4f_jeonjatongsingwasamusil_d0411, R.drawable.jeongbotongsingwan_4f_kimboyeongyosuyeongusil_d0413,
                R.drawable.jeongbotongsingwan_4f_parkbyungkwongyosuyeongusil_d0415, R.drawable.jeongbotongsingwan_4f_antenasilheomsil_d0417);

        public List<List<Integer>> Jbpic = Arrays.asList(One_p, Two_p, Three_p, Four_p);
    }
}
>>>>>>> cf77628 (생활)
