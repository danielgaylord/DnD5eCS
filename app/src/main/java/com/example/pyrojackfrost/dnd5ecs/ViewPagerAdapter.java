package com.example.pyrojackfrost.dnd5ecs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence titles[];
    int numOfTabs;

    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mNumOfTabs) {

        super(fm);
        this.titles = mTitles;
        this.numOfTabs = mNumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        if(position == 0) {
            TabChar tabChar = new TabChar();
            return tabChar;
        } else {
            TabStats tabStats = new TabStats();
            return tabStats;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return titles[position];
    }

    @Override
    public int getCount() {

        return numOfTabs;
    }
}