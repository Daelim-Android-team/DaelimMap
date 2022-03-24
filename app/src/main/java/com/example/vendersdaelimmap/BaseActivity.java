package com.example.vendersdaelimmap;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.google.android.material.navigation.NavigationView;

abstract public class BaseActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    FrameLayout frameLayout;
    ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actionbar_layout);
    }


    @Override
    public void setContentView(int layoutResID) {
        drawerLayout = (DrawerLayout) getLayoutInflater().inflate(R.layout.actionbar_layout, null);
        frameLayout = (FrameLayout) drawerLayout.findViewById(R.id.content_viewer);
        getLayoutInflater().inflate(layoutResID, frameLayout, true);
        super.setContentView(drawerLayout);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        Toolbar toolbar = (Toolbar) findViewById(R.id.daelim_toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);

        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setChecked(false);
                drawerLayout.closeDrawers();

                switch (item.getItemId()){
                    case R.id.nav_map:
                        Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                        startActivity(intent);
                        finish();
                        break;
                    case R.id.nav_credit:
                        Intent intent1 = new Intent(getApplicationContext(), CreditActivity.class);
                        startActivity(intent1);
                        break;
                }
                return true;
            }
        });
    }

}