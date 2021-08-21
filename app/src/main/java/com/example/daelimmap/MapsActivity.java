package com.example.daelimmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.daelimmap.LV_Item.hanlimgwan;
import com.example.daelimmap.LV_adapter.ListView_adapter;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
//import com.example.daelimmap.Intenttt.*;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.io.CharArrayWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.example.daelimmap.building.*;


public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback,GoogleMap.OnMarkerClickListener {
    MenuItem MapSearch;

    View v;
    ImageView imageView;
    private GoogleMap mMap;
    private ListView_adapter adapter;
    private ListView SLV;
    private List<String> listView_itemList;
    private ArrayList<String> arraylist;

    Dasangwan ds = new Dasangwan();

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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daelimmap);


        ListView_adapter adapter = new ListView_adapter();
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        adapter = new ListView_adapter();
        SLV = findViewById(R.id.SearchListView);
        SLV.setAdapter(adapter);
        adapter.notifyDataSetChanged();


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
                search(newText);
//                .setText(search(newText));
                return true;
            }
        });
        return true;
    }
    public void search(String charText){
        //검색기능
        listView_itemList.clear();
        if(charText.length() == 0){
            listView_itemList.addAll(arraylist);
        }
        //문자입력시
        else{
            for(int i =0;i<arraylist.size(); i++){
                if(arraylist.get(i).toLowerCase().contains(charText)){
                    adapter.addItem(arraylist.get(i));
                }
            }
        }
    }
    public void settingList (){
        //건물의 배열 정리
        for (int i = 0; i < ds.dsflooer.size(); i++){
            for(int j = 0; j <ds.dsflooer.get(i).size(); j++){
            adapter.addItem(ds.dsflooer.get(i).get(j)) ;
            }
        }
    }


    @Override
    public void onMapReady(final GoogleMap googleMap) {
        mMap = googleMap;


        mMap.addMarker(new MarkerOptions().position(Toegyegwan).title("퇴계관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(yulgoggwan).title("율곡관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(UniversityHeadquarters).title("대학본부").alpha(0));
        mMap.addMarker(new MarkerOptions().position(jeongbotongsingwan).title("정보통신관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(jeonsangwan).title("전산관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(saenghwalgwan).title("생활관").alpha(1));
        mMap.addMarker(new MarkerOptions().position(hongjigwan).title("홍지관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(hagsaenghoegwan).title("학생회관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(jadongchagwan).title("자동차관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(suamgwan).title("수암관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(dasangwan).title("다산관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(imgoggwan).title("임곡관").alpha(0));
        mMap.addMarker(new MarkerOptions().position(hanlimgwan).title("한림관").alpha(0));


        mMap.moveCamera(CameraUpdateFactory.newLatLng(saenghwalgwan));                 // 초기 위치
        mMap.animateCamera(CameraUpdateFactory.zoomTo(17));                         // 줌의 정도
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        // 지도 유형 설정
        mMap.setOnMarkerClickListener(this);

    }


    @Override
    public boolean onMarkerClick(final Marker marker) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        if (marker.getTitle().equals("퇴계관")) {
            Intent intent = new Intent(getApplicationContext(),ToegyegwanActivity.class);
            startActivity(intent);
//            v = getLayoutInflater().inflate(R.layout.toegyegwan, null);
//            bottomSheetDialog.setContentView(v);
        } else if (marker.getTitle().equals("대학본부")) {
            Intent intent = new Intent(getApplicationContext(),UniversityheadquatersActivity.class);
            startActivity(intent);
//            v = getLayoutInflater().inflate(R.layout.universityheadquaters, null);
//            bottomSheetDialog.setContentView(v);
        }else if (marker.getTitle().equals("정보통신관")) {
            Intent intent = new Intent(getApplicationContext(),JeongbotongsingwanActivity.class);
            startActivity(intent);
//            v = getLayoutInflater().inflate(R.layout.jeongbotongsingwan, null);
//            bottomSheetDialog.setContentView(v);
        }else if (marker.getTitle().equals("전산관")) {
            Intent intent = new Intent(getApplicationContext(),JeonsangwanActivity.class);
            startActivity(intent);
//            v = getLayoutInflater().inflate(R.layout.jeonsangwan, null);
//            bottomSheetDialog.setContentView(v);
        }else if (marker.getTitle().equals("생활관")) {
            Intent intent = new Intent(getApplicationContext(),SaenghwalgwanActivity.class);
            startActivity(intent);
//            v = getLayoutInflater().inflate(R.layout.saenghwalgwan, null);
//            bottomSheetDialog.setContentView(v);
        }else if (marker.getTitle().equals("홍지관")) {
            Intent intent = new Intent(getApplicationContext(),HongjigwanActivity.class);
            startActivity(intent);
//            v = getLayoutInflater().inflate(R.layout.hongjigwan, null);
//            bottomSheetDialog.setContentView(v);
        }else if (marker.getTitle().equals("학생회관")) {
            Intent intent = new Intent(getApplicationContext(),HagsaenghoegwanActivity.class);
            startActivity(intent);
//            v = getLayoutInflater().inflate(R.layout.hagsaenghoegwan, null);
//            bottomSheetDialog.setContentView(v);
        }else if (marker.getTitle().equals("자동차관")) {
            Intent intent = new Intent(getApplicationContext(),JadongchagwanActivity.class);
            startActivity(intent);
//            v = getLayoutInflater().inflate(R.layout.jadongchagwan, null);
//            bottomSheetDialog.setContentView(v);
        }else if (marker.getTitle().equals("수암관")) {
            Intent intent = new Intent(getApplicationContext(),SuamgwanActivity.class);
            startActivity(intent);
//            v = getLayoutInflater().inflate(R.layout.suamgwan, null);
//            bottomSheetDialog.setContentView(v);
        }else if (marker.getTitle().equals("다산관")) {
            Intent intent = new Intent(getApplicationContext(),DasangwanActivity.class);
            startActivity(intent);
//            v = getLayoutInflater().inflate(R.layout.dasangwan, null);
//            bottomSheetDialog.setContentView(v);
        }else if (marker.getTitle().equals("임곡관")) {
            Intent intent = new Intent(getApplicationContext(),ImgoggwanActivity.class);
            startActivity(intent);
//            v = getLayoutInflater().inflate(R.layout.imgoggwan, null);
//            bottomSheetDialog.setContentView(v);
        }else if (marker.getTitle().equals("한림관")) {
            Intent intent = new Intent(getApplicationContext(), com.example.daelimmap.LV_Item.hanlimgwan.class);
            startActivity(intent);
//            v = getLayoutInflater().inflate(R.layout.hanlimgwan, null);
//            bottomSheetDialog.setContentView(v);
        }else if (marker.getTitle().equals("율곡관")) {
            Intent intent = new Intent(getApplicationContext(),YulgoggwanActivity.class);
            startActivity(intent);
//            v = getLayoutInflater().inflate(R.layout.yulgoggwan, null);
//            bottomSheetDialog.setContentView(v);
        }

//            bottomSheetDialog.show();


            marker.setAlpha(1);


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



