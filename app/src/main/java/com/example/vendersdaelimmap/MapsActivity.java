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

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.vendersdaelimmap.LV_Item.ListView_item;
import com.example.vendersdaelimmap.LV_adapter.ListView_adapter;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
//import com.example.daelimmap.Intenttt.*;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

import com.example.vendersdaelimmap.building.*;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.navigation.NavigationView;


public class MapsActivity extends BaseActivity implements OnMapReadyCallback,GoogleMap.OnMarkerClickListener {
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
    LatLng saenghwalgwan = new LatLng(37.4043451099, 126.930766490); //생활관
    LatLng hongjigwan = new LatLng(37.40243236619865, 126.9297704574061); //홍지관
    LatLng hagsaenghoegwan = new LatLng(37.403712438306705, 126.93131140849653); //학생회관
    LatLng jadongchagwan = new LatLng(37.403350316189355, 126.93185744753491); //자동차관
    LatLng suamgwan = new LatLng(37.40484959771984, 126.93069305218717); //수암관
    LatLng dasangwan = new LatLng(37.40459345515532, 126.93140512848078); //다산관
    LatLng imgoggwan = new LatLng(37.40392495963885, 126.93109889545208); //임곡관
    LatLng hanlimgwan = new LatLng(37.402209544693086, 126.92890403822585); //한림관


//    ListView_adapter adapterimg = new ListView_adapter
//            (getApplicationContext(),R.layout.listview_adapter,listView_itemList);

    // private DrawerLayout drawerLayout;
    // private ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daelimmap);


        /*
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        Toolbar toolbar = (Toolbar) findViewById(R.id.daelim_toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);
        // actionBar.setDisplayHomeAsUpEnabled(true);
        // actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_navigation);


        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerToggle.syncState();
        drawerLayout.addDrawerListener(drawerToggle);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setChecked(true);
                drawerLayout.closeDrawers();

                int id = item.getItemId();
                String title = item.getTitle().toString();
                return true;
            }
        }); */
        ListView_adapter adapter = new ListView_adapter(getApplicationContext(), R.layout.listview_adapter, listView_itemList);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home: {
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    } */

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

        mMap.addMarker(new MarkerOptions().position(Toegyegwan).icon(BitmapDescriptorFactory.fromResource(R.drawable.toegyegwan_marker)));
        mMap.addMarker(new MarkerOptions().position(yulgoggwan).icon(BitmapDescriptorFactory.fromResource(R.drawable.yulgoggwan_marker)));
        mMap.addMarker(new MarkerOptions().position(UniversityHeadquarters).icon(BitmapDescriptorFactory.fromResource(R.drawable.universityheadquater_marker)));
        mMap.addMarker(new MarkerOptions().position(jeongbotongsingwan).icon(BitmapDescriptorFactory.fromResource(R.drawable.jeongbotongsingwan_marker)));
        mMap.addMarker(new MarkerOptions().position(jeonsangwan).icon(BitmapDescriptorFactory.fromResource(R.drawable.jeonsangwan_marker)));
        mMap.addMarker(new MarkerOptions().position(saenghwalgwan).icon(BitmapDescriptorFactory.fromResource(R.drawable.saenghwalgwan_marker)));
        mMap.addMarker(new MarkerOptions().position(hongjigwan).icon(BitmapDescriptorFactory.fromResource(R.drawable.hongjigwan_marker)));
        mMap.addMarker(new MarkerOptions().position(hagsaenghoegwan).icon(BitmapDescriptorFactory.fromResource(R.drawable.hagsaenghoegwan_marker)));
        mMap.addMarker(new MarkerOptions().position(jadongchagwan).icon(BitmapDescriptorFactory.fromResource(R.drawable.jadongchagwan_marker)));
        mMap.addMarker(new MarkerOptions().position(suamgwan).icon(BitmapDescriptorFactory.fromResource(R.drawable.suamgwan_marker)));
        mMap.addMarker(new MarkerOptions().position(dasangwan).icon(BitmapDescriptorFactory.fromResource(R.drawable.dasangwan_marker)));
        mMap.addMarker(new MarkerOptions().position(imgoggwan).icon(BitmapDescriptorFactory.fromResource(R.drawable.imgoggwan_marker)));
        mMap.addMarker(new MarkerOptions().position(hanlimgwan).icon(BitmapDescriptorFactory.fromResource(R.drawable.hanlimgwan_marker)));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(yulgoggwan, 17.2f)); // 초기 위치 + 줌의 정도
        // mMap.animateCamera(CameraUpdateFactory.zoomTo(17)); // 줌의 정도
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        // 지도 유형 설정
        mMap.setOnMarkerClickListener(this);
    }


    @Override
    public boolean onMarkerClick(final Marker marker) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        if (marker.getPosition().equals(Toegyegwan)) {
            ToegyegwanActivity toegyegwanActivity = new ToegyegwanActivity();
            toegyegwanActivity.show(getSupportFragmentManager(), "toegyegwan");
        } else if (marker.getPosition().equals(UniversityHeadquarters)) {
            UniversityheadquatersActivity universityheadquatersActivity = new UniversityheadquatersActivity();
            universityheadquatersActivity.show(getSupportFragmentManager(), "universityHeadquaters");
        }else if (marker.getPosition().equals(jeongbotongsingwan)) {
            JeongbotongsingwanActivity jeongbotongsingwanActivity = new JeongbotongsingwanActivity();
            jeongbotongsingwanActivity.show(getSupportFragmentManager(), "jeongbotongsingwan");
        }else if (marker.getPosition().equals(jeonsangwan)) {
            JeonsangwanActivity jeonsangwanActivity = new JeonsangwanActivity();
            jeonsangwanActivity.show(getSupportFragmentManager(), "jeonsangwan");
        }else if (marker.getPosition().equals(saenghwalgwan)) {
            SaenghwalgwanActivity saenghwalgwanActivity = new SaenghwalgwanActivity();
            saenghwalgwanActivity.show(getSupportFragmentManager(), "sanghwalgwan");
        }else if (marker.getPosition().equals(hongjigwan)) {
            HongjigwanActivity hongjigwanActivity = new HongjigwanActivity();
            hongjigwanActivity.show(getSupportFragmentManager(), "hongjigwan");
        }else if (marker.getPosition().equals(hagsaenghoegwan)) {
            HagsaenghoegwanActivity hagsaenghoegwanActivity = new HagsaenghoegwanActivity();
            hagsaenghoegwanActivity.show(getSupportFragmentManager(), "hagsaenghoegwan");
        }else if (marker.getPosition().equals(jadongchagwan)) {
            JadongchagwanActivity jadongchagwanActivity = new JadongchagwanActivity();
            jadongchagwanActivity.show(getSupportFragmentManager(), "jadongchagwan");
        }else if (marker.getPosition().equals(suamgwan)) {
            SuamgwanActivity suamgwanActivity = new SuamgwanActivity();
            suamgwanActivity.show(getSupportFragmentManager(), "suamgwan");
        }else if (marker.getPosition().equals(dasangwan)) {
            DasangwanActivity dasangwanActivity = new DasangwanActivity();
            dasangwanActivity.show(getSupportFragmentManager(), "dasangwan");
        }else if (marker.getPosition().equals(imgoggwan)) {
            ImgoggwanActivity imgoggwanActivity = new ImgoggwanActivity();
            imgoggwanActivity.show(getSupportFragmentManager(), "imgoggwan");
        }else if (marker.getPosition().equals(hanlimgwan)) {
            HanlimgwanActivity hanlimgwanActivity = new HanlimgwanActivity();
            hanlimgwanActivity.show(getSupportFragmentManager(), "hanlimgwan");
        }else if (marker.getPosition().equals(yulgoggwan)) {
            YulgoggwanActivity yulgoggwanActivity = new YulgoggwanActivity();
            yulgoggwanActivity.show(getSupportFragmentManager(), "yulgoggwan");
        }

            // bottomSheetDialog.show();
        // marker.setAlpha(1);
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



