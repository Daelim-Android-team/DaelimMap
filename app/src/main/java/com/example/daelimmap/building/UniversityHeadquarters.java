package com.example.daelimmap.building;
import com.example.daelimmap.R;

import java.util.Arrays;
import java.util.List;

public class UniversityHeadquarters {
      List <String>  One_f  = Arrays.asList ("입학실", "당직실", "교육행정팀");
      List <String>  Two_f  = Arrays.asList ("사무 운영팀", "사무 처장실", "총장실", "부속실", "기획처장실", "정착기획팀");
      List <String>  Three_f  = Arrays.asList ( "신학 협력 처장실", "신학 협력 부단장실", "특성화 협력단", "신혁협력단 (inno – café)", "대회의실", "소회의실", "창의 융합 우수 작품관");
      List <String>  Four_f  = Arrays.asList ( "혁신 지원 사업단", "혁신 지원 부단장", "마이스터대 사업대", "LINC+ 사업단", "LINC+ 사업단장", "지식 정보 원장실", "지식 정보원");
      public List<List<String>> Uhflooer = Arrays.asList(One_f, Two_f, Three_f, Four_f);


      List<Integer> One_p = Arrays.asList(R.drawable.daehagbonbu_1f_ibhagtim_a0102, R.drawable.daehagbonbu_1f_dangjigsil_a0104, R.drawable.daehagbonbu_1f_gyoyughaengjeongtim_a0109);
      List<Integer> Two_p = Arrays.asList(R.drawable.daehagbonbu_2f_samuunyeongtim_a0210, R.drawable.daehagbonbu_2f_samucheojang_a0208, R.drawable.daehagbonbu_2f_chongjangsil_a0207,
                                          R.drawable.daehagbonbu_2f_busogsil_a0206, R.drawable.daehagbonbu_2f_gihoegcheojang_a0205, R.drawable.daehagbonbu_2f_jeongchaeggihoegtim_a0203);
      List<Integer> Three_p = Arrays.asList(R.drawable.daehagbonbu_3f_sanhaghyeoblyeogcheojang_a0313, R.drawable.daehagbonbu_3f_sanhaghyeoblyeogbudanjang_a0312,R.drawable.daehagbonbu_3f_sanhaghyeoblyeogdan_a0309,
                                                R.drawable.daehagbonbu_3f_sinhaghyeoblyeogdan,R.drawable.daehagbonbu_3f_daehoeuisil_a0302, R.drawable.daehagbonbu_3f_sohoeuisil, R.drawable.daehagbonbu_3f_changuiyunghabusujagpumgwan );
      List<Integer> Four_p = Arrays.asList(R.drawable.daehagbonbu_4f_hyeogsinjiwonsaeobdan_a0412, R.drawable.daehagbonbu_4f_hyeogsinjiwonsaeobbudanjang_a0411, R.drawable.daehagbonbu_4f_maiseuteodaesaeobdan_a0410, R.drawable.daehagbonbu_4f_linc_a0408,
                                          R.drawable.daehagbonbu_4f_lincsaeobdanjangbudanjang_a0407, R.drawable.daehagbonbu_4f_jisigjeongbowonjang_a0405, R.drawable.daehagbonbu_4f_jisigjeongbowonjeongbojeonlyagunyeongtim);
      public  List<List<Integer>> Uhpic = Arrays.asList(One_p, Two_p, Three_p, Four_p);
}
