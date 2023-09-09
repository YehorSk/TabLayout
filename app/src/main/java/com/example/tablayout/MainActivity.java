package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    TabItem tabChats;
    TabItem tabStats;
    TabItem tabCalls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(myPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
    private void setUI(){
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabChats = (TabItem) findViewById(R.id.tabChats);
        tabStats = (TabItem) findViewById(R.id.tabStats);
        tabCalls = (TabItem) findViewById(R.id.tabCalls);
    }
}