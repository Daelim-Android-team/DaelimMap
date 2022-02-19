package com.example.vendersdaelimmap;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.example.vendersdaelimmap.LV_Item.ListView_item;
import com.example.vendersdaelimmap.LV_adapter.ListView_adapter;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
//import com.example.daelimmap.Intenttt.*;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

import com.example.vendersdaelimmap.building.*;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback,GoogleMap.OnMarkerClickListener {
    MenuItem MapSearch;

    View v;
    ImageView imageView;
    private GoogleMap mMap;
    private ListView_adapter adapter;
    private ListView SLV;
    private List<String> listView_itemList; //데이터 입력 배열
    public ArrayList<String> arraylist;
    private ArrayList<ListView_item> ListView_item = new ArrayList<ListView_item>();

    Dasangwan Ds = new Dasangwan();
    Hagsaenghoegwan Hs= new Hagsaenghoegwan();
    Hanlimgwan Hl = new Hanlimgwan();
    Hongjigwan Hj = new Hongjigwan();
    Imgoggwan Ig = new Imgoggwan();
    Jadongchagwan Jd = new Jadongchagwan();
    Jeongbotongsingwan Jb = new Jeongbotongsingwan();
    Jeonsangwan Js = new Jeonsangwan();
    Saenghwalgwan Sh = new Saenghwalgwan();
    Suamgwan Sa = new Suamgwan(); //공사중
    Toegyegwan Tg = new Toegyegwan();
    UniversityHeadquarters Uh = new UniversityHeadquarters();
    Yulgoggwan Yg = new Yulgoggwan();

    ArrayList<Marker> markers = new ArrayList<>();

    LatLng Toegyegwan = new LatLng(37.403268056034186, 126.9306871521674); //퇴계관
    LatLng yulgoggwan = new LatLng(37.40350624040486, 126.93045325700982); //율곡관
    LatLng UniversityHeadquarters = new LatLng(37.40362517255369, 126.9295991200578); //대학본부
    LatLng jeongbotongsingwan = new LatLng(37.40304502369558, 126.92952239412062); //정보통신관
    LatLng jeonsangwan = new LatLng(37.40408341926637, 126.93066191636484); //전산관
    LatLng saenghwalgwan = new LatLng(37.40452120987672, 126.93075649706715); //생활관
    LatLng hongjigwan = new LatLng(37.40231736619865, 126.9298564574061); //홍지관
    LatLng hagsaenghoegwan = new LatLng(37.403712438306705, 126.93131140849653); //학생회관
    LatLng jadongchagwan = new LatLng(37.403369316189355, 126.93177744753491); //자동차관
    LatLng suamgwan = new LatLng(37.40484959771984, 126.93069305218717); //수암관
    LatLng dasangwan = new LatLng(37.40459345515532, 126.93140512848078); //다산관
    LatLng imgoggwan = new LatLng(37.40392495963885, 126.93109889545208); //임곡관
    LatLng hanlimgwan = new LatLng(37.402209544693086, 126.92890403822585); //한림관


//    ListView_adapter adapterimg = new ListView_adapter
//            (getApplicationContext(),R.layout.listview_adapter,listView_itemList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daelimmap);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar_layout);

        ListView_adapter adapter = new ListView_adapter(getApplicationContext(), R.layout.listview_adapter, listView_itemList);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CheckLog", "MapsActivity : onStart");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        adapter = new ListView_adapter(getApplicationContext(), R.layout.listview_adapter, listView_itemList);
        SLV = findViewById(R.id.SearchListView);
        SLV.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        listView_itemList = new ArrayList<>();
        TextView listView_item = findViewById(R.id.content);

        settingList();


        arraylist = new ArrayList<String>();
        arraylist.addAll(listView_itemList);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu, menu);
        MapSearch = menu.findItem(R.id.search);

        MapSearch.setOnActionExpandListener(new MenuItem.OnActionExpandListener() {
            //검색버튼 클릭시
            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                SLV.setVisibility(ListView.VISIBLE);
                return true;
            }

            //검색 취소시
            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                SLV.setVisibility(ListView.INVISIBLE);
                return true;
            }
        });

        SearchView SV = (SearchView) MapSearch.getActionView();
        SV.onActionViewExpanded();
        SV.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            //검색버튼을 눌렀을 경우
            @Override
            public boolean onQueryTextSubmit(String query) {
                //검색버튼을 눌렀을 시 해당 텍스트와 관련된 내용으로 이동

                return true;
            }

            //텍스트가 바뀔때마다 호출
            @Override
            public boolean onQueryTextChange(String newText) {
//                listView_item.setText(search(newText));
                return true;
            }
        });
        return true;


    }
    public String search(String query){
        //검색기능
        listView_itemList.clear();
        if(query.length() == 0) {
            listView_itemList.addAll(arraylist);
        }
        //문자입력시
        else{
            for(int i =0;i<arraylist.size(); i++){
                if(arraylist.get(i).toLowerCase().contains(query)){
                    adapter.addItem(arraylist.get(i));
                }
            }
        }
        adapter.notifyDataSetChanged();
        return null;
    }
    public void settingList (){
        //건물의 배열 정리
        for (int i = 0; i < Ds.Dsflooer.size(); i++){
            for(int j = 0; j <Ds.Dsflooer.get(i).size(); j++){
                adapter.addItem(Ds.Dsflooer.get(i).get(j)) ;
            }
        }
        for (int i = 0; i < Hs.Hsflooer.size(); i++){
            for(int j = 0; j <Hs.Hsflooer.get(i).size(); j++){
                adapter.addItem(Hs.Hsflooer.get(i).get(j)) ;
            }
        }
        for (int i = 0; i < Hl.Hlflooer.size(); i++){
            for(int j = 0; j <Hl.Hlflooer.get(i).size(); j++){
                adapter.addItem(Hl.Hlflooer.get(i).get(j)) ;
            }
        }
        for (int i = 0; i < Hj.Hjflooer.size(); i++){
            for(int j = 0; j <Hj.Hjflooer.get(i).size(); j++){
                adapter.addItem(Hj.Hjflooer.get(i).get(j)) ;
            }
        }
        for (int i = 0; i < Ig.Igflooer.size(); i++){
            for(int j = 0; j <Ig.Igflooer.get(i).size(); j++){
                adapter.addItem(Ig.Igflooer.get(i).get(j)) ;
            }
        }
        for (int i = 0; i < Jd.Jdflooer.size(); i++){
            for(int j = 0; j <Jd.Jdflooer.get(i).size(); j++){
                adapter.addItem(Jd.Jdflooer.get(i).get(j)) ;
            }
        }for (int i = 0; i < Jb.Jbflooer.size(); i++){
            for(int j = 0; j <Jb.Jbflooer.get(i).size(); j++){
                adapter.addItem(Jb.Jbflooer.get(i).get(j)) ;
            }
        }for (int i = 0; i < Js.Jsflooer.size(); i++){
            for(int j = 0; j <Js.Jsflooer.get(i).size(); j++){
                adapter.addItem(Js.Jsflooer.get(i).get(j)) ;
            }
        }for (int i = 0; i < Sh.Shflooer.size(); i++){
            for(int j = 0; j <Sh.Shflooer.get(i).size(); j++){
                adapter.addItem(Sh.Shflooer.get(i).get(j)) ;
            }
//        }for (int i = 0; i < Sa.Saflooer.size(); i++){
//            for(int j = 0; j <Sa.Saflooer.get(i).size(); j++){
//                adapter.addItem(Sa.Saflooer.get(i).get(j)) ;
//            }
        }for (int i = 0; i < Tg.Tgflooer.size(); i++){
            for(int j = 0; j <Tg.Tgflooer.get(i).size(); j++){
                adapter.addItem(Tg.Tgflooer.get(i).get(j)) ;
            }
        }for (int i = 0; i < Uh.Uhflooer.size(); i++){
            for(int j = 0; j <Uh.Uhflooer.get(i).size(); j++){
                adapter.addItem(Uh.Uhflooer.get(i).get(j)) ;
            }
        }for (int i = 0; i < Yg.Ygflooer.size(); i++){
            for(int j = 0; j < Yg.Ygflooer.get(i).size(); j++){
                adapter.addItem(Yg.Ygflooer.get(i).get(j)) ;
            }
        }
    }


//    public static Comparator<ListView_item> textAsc = new Comparator<ListView_item>(){
//
//            @Override
//            public int compare(ListView_item item1, ListView_item item2) {
//                    return item1.getContent().compareTo(item2.getContent());
//                return item1.getContent().compareTo(item2.getContent());
//                int ret;
//
//                if (item1.getContent().compareTo(item2.getContent()) < 0)     // item1이 작은 경우,
//                    ret = -1;
//                else if (item1.getContent().compareTo(item2.getContent()) == 0)
//                    ret = 0;
//                else                                                // item1이 큰 경우,
//                    ret = 1;
//                return ret;
//            }
//        };
//        Collections.sort(ListView_item, textAsc);
//        adapter.notifyDataSetChanged();
//    }
    @Override
    public void onMapReady(final GoogleMap googleMap) {
        mMap = googleMap;

        mMap.addMarker(new MarkerOptions().position(Toegyegwan).title("퇴계관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(yulgoggwan).title("율곡관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(UniversityHeadquarters).title("대학본부").alpha(0));
        mMap.addMarker(new MarkerOptions().position(jeongbotongsingwan).title("정보통신관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(jeonsangwan).title("전산관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(saenghwalgwan).title("생활관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(hongjigwan).title("홍지관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(hagsaenghoegwan).title("학생회관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(jadongchagwan).title("자동차관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(suamgwan).title("수암관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(dasangwan).title("다산관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(imgoggwan).title("임곡관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(hanlimgwan).title("한림관").alpha(0));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(yulgoggwan, 17));                 // 초기 위치 + 줌의 정도
        // mMap.animateCamera(CameraUpdateFactory.zoomTo(17));                         // 줌의 정도
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        // 지도 유형 설정
        mMap.setOnMarkerClickListener(this);
    }


    @Override
    public boolean onMarkerClick(final Marker marker) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        if (marker.getTitle().equals("퇴계관")) {
            ToegyegwanActivity toegyegwanActivity = new ToegyegwanActivity();
            toegyegwanActivity.show(getSupportFragmentManager(), "toegyegwan");
        } else if (marker.getTitle().equals("대학본부")) {
            UniversityheadquatersActivity universityheadquatersActivity = new UniversityheadquatersActivity();
            universityheadquatersActivity.show(getSupportFragmentManager(), "universityHeadquaters");
        }else if (marker.getTitle().equals("정보통신관")) {
            JeongbotongsingwanActivity jeongbotongsingwanActivity = new JeongbotongsingwanActivity();
            jeongbotongsingwanActivity.show(getSupportFragmentManager(), "jeongbotongsingwan");
        }else if (marker.getTitle().equals("전산관")) {
            JeonsangwanActivity jeonsangwanActivity = new JeonsangwanActivity();
            jeonsangwanActivity.show(getSupportFragmentManager(), "jeonsangwan");
        }else if (marker.getTitle().equals("생활관")) {
            SaenghwalgwanActivity saenghwalgwanActivity = new SaenghwalgwanActivity();
            saenghwalgwanActivity.show(getSupportFragmentManager(), "sanghwalgwan");
        }else if (marker.getTitle().equals("홍지관")) {
            HongjigwanActivity hongjigwanActivity = new HongjigwanActivity();
            hongjigwanActivity.show(getSupportFragmentManager(), "hongjigwan");
        }else if (marker.getTitle().equals("학생회관")) {
            HagsaenghoegwanActivity hagsaenghoegwanActivity = new HagsaenghoegwanActivity();
            hagsaenghoegwanActivity.show(getSupportFragmentManager(), "hagsaenghoegwan");
        }else if (marker.getTitle().equals("자동차관")) {
            JadongchagwanActivity jadongchagwanActivity = new JadongchagwanActivity();
            jadongchagwanActivity.show(getSupportFragmentManager(), "jadongchagwan");
        }else if (marker.getTitle().equals("수암관")) {
            SuamgwanActivity suamgwanActivity = new SuamgwanActivity();
            suamgwanActivity.show(getSupportFragmentManager(), "suamgwan");
        }else if (marker.getTitle().equals("다산관")) {
            DasangwanActivity dasangwanActivity = new DasangwanActivity();
            dasangwanActivity.show(getSupportFragmentManager(), "dasangwan");
        }else if (marker.getTitle().equals("임곡관")) {
            ImgoggwanActivity imgoggwanActivity = new ImgoggwanActivity();
            imgoggwanActivity.show(getSupportFragmentManager(), "imgoggwan");
        }else if (marker.getTitle().equals("한림관")) {
            HanlimgwanActivity hanlimgwanActivity = new HanlimgwanActivity();
            hanlimgwanActivity.show(getSupportFragmentManager(), "hanlimgwan");
        }else if (marker.getTitle().equals("율곡관")) {
            YulgoggwanActivity yulgoggwanActivity = new YulgoggwanActivity();
            yulgoggwanActivity.show(getSupportFragmentManager(), "yulgoggwan");
        }

//            bottomSheetDialog.show();

        marker.setAlpha(1);
        Log.d("CheckLog", "MainActivity-onMapReady : 마커 누름");


            return false;
        }
    }
//    @Override
//    public boolean onMarkerClick(final Marker marker) {
//
//
//        if(marker.getTitle().equals("한림관")){
//            Intent intent = new Intent(getApplicationContext(), hanlimgwan.class);
//            startActivity(intent);
//        }
//        return false;
//
//    }
//
//
//}



