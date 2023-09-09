package com.example.tablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public MyPagerAdapter(@NonNull FragmentManager fragmentManager,int numOfTabs){
        super(fragmentManager);
        this.numOfTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new ChatFragment();
            case 1: return new StatsFragment();
            case 2: return new CallsFragment();
            default: return null;

        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if(position == 0){
            title = "Chats";
        }else if(position == 1){
            title = "Stats";
        }else if(position == 2){
            title = "Calls";
        }
        return title;
    }
}
