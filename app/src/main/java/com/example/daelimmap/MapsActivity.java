package com.example.daelimmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.daelimmap.Intenttt.*;

import java.util.ArrayList;
import java.util.List;


public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback,GoogleMap.OnMarkerClickListener,GoogleMap.OnMapClickListener{

    View v;
    ImageView imageView;
    private GoogleMap mMap;

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
        MarkerOptions markerOptions = new MarkerOptions();  // 마커 생성


        mMap.addMarker(markerOptions.position(Toegyegwan).title("퇴계관").alpha(0));
        mMap.addMarker(markerOptions.position(yulgoggwan).title("율곡관").alpha(0));
        mMap.addMarker(markerOptions.position(UniversityHeadquarters).title("대학본부").alpha(0));
        mMap.addMarker(markerOptions.position(jeongbotongsingwan).title("정보통신관").alpha(0));
        mMap.addMarker(markerOptions.position(jeonsangwan).title("전산관").alpha(0));
        mMap.addMarker(markerOptions.position(saenghwalgwan).title("생활관").alpha(0));
        mMap.addMarker(markerOptions.position(hongjigwan).title("홍지관").alpha(0));
        mMap.addMarker(markerOptions.position(hagsaenghoegwan).title("학생회관").alpha(0));
        mMap.addMarker(markerOptions.position(jadongchagwan).title("자동차관").alpha(0));
        mMap.addMarker(markerOptions.position(suamgwan).title("수암관").alpha(0));
        mMap.addMarker(markerOptions.position(dasangwan).title("다산관").alpha(0));
        mMap.addMarker(markerOptions.position(imgoggwan).title("임곡관").alpha(0));
        mMap.addMarker(markerOptions.position(hanlimgwan).title("한림관").alpha(0));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(yulgoggwan));                 // 초기 위치
        mMap.animateCamera(CameraUpdateFactory.zoomTo(17));                         // 줌의 정도
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        // 지도 유형 설정
        mMap.setOnMarkerClickListener(this);
        mMap.setOnMapClickListener(this);
    }

    @Override
    public boolean onMarkerClick(final Marker marker) {
        marker.setAlpha(1);

        if(marker.getTitle().equals("한림관")){
            Intent intent = new Intent(getApplicationContext(), hanlimgwan.class);
            startActivity(intent);
        }
        return false;

    }

    @Override
    public void onMapClick( LatLng latLng) {
        ArrayList<LatLng> list = new ArrayList<LatLng>();

        list.add(Toegyegwan);
        list.add(yulgoggwan);
        list.add(UniversityHeadquarters);
        list.add(jeongbotongsingwan);
        list.add(jeonsangwan);
        list.add(saenghwalgwan);
        list.add(hongjigwan );
        list.add(hagsaenghoegwan);
        list.add(jadongchagwan);
        list.add(suamgwan);
        list.add(dasangwan);
        list.add(imgoggwan);
        list.add(hanlimgwan);




    }
}





