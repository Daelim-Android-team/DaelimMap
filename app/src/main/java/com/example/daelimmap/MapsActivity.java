package com.example.daelimmap;

import android.os.Bundle;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daelimmap);

        SearchView SV = findViewById(R.id.mapSearch); //서치뷰 네임은 SV

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        SV.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                return false;
            }
        });
    }


    @Override
    public void onMapReady(final GoogleMap googleMap) {
        mMap = googleMap;


        LatLng DaelimUniversity = new LatLng(37.40370288437412, 126.93037198444469); //대림대학교
        LatLng Toegyegwan = new LatLng(37.403268056034186, 126.9306871521674); //퇴계관
        LatLng yulgoggwan = new LatLng(37.40350624040486, 126.93045325700982); //율곡관
        LatLng UniversityHeadquarters = new LatLng(37.40362517255369, 126.9295991200578); //대학본부
        LatLng jeongbotongsingwan = new LatLng(37.40304502369558, 126.92952239412062); //정보통신관
        LatLng jeonsangwan = new LatLng(37.40408341926637, 126.93066191636484); //전산관
        LatLng saenghwalgwan = new LatLng(37.40441525134493, 126.93077558442165); //생활관
        LatLng hongjigwan = new LatLng(37.40231736619865, 126.9298564574061); //홍지관
        LatLng hagsaenghoegwan = new LatLng(37.403712438306705, 126.93131140849653); //학생회관
        LatLng jadongchagwan = new LatLng(37.403369316189355, 126.93177744753491); //자동차관
        LatLng suamgwan = new LatLng(37.40484959771984, 126.93069305218717); //수암관
        LatLng dasangwan = new LatLng(37.40459345515532, 126.93140512848078); //다산관
        LatLng imgoggwan = new LatLng(37.40392495963885, 126.93109889545208); //임곡관
        LatLng hanlimgwan = new LatLng(37.402209544693086, 126.92890403822585); //한림관



        LatLng [] wido = {DaelimUniversity,Toegyegwan,yulgoggwan,UniversityHeadquarters,
                jeongbotongsingwan,jeonsangwan,saenghwalgwan, hongjigwan, hagsaenghoegwan,jadongchagwan,suamgwan,dasangwan, imgoggwan,hanlimgwan};// 각 건물의 위도와 경도






        for(int idx =0; idx<wido.length;idx++) {
            MarkerOptions markerOptions = new MarkerOptions();         // 마커 생성
            markerOptions.position(wido[idx] );
            markerOptions.title("건물");                         // 마커 제목
            mMap.addMarker(markerOptions);
        }



//        markerOptions.snippet("한국의 수도");         // 마커 설명


        mMap.moveCamera(CameraUpdateFactory.newLatLng(DaelimUniversity ));                 // 초기 위치
        mMap.animateCamera(CameraUpdateFactory.zoomTo(17));                         // 줌의 정도
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);                           // 지도 유형 설정

    }



}