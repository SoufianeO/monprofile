package com.example.myprofile;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    private int numTabs;
    public PageAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new tab1();
            case 1:
                return new tab2();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numTabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE ;
    }
}
