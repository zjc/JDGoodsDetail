package com.stone.verticalslide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;
public class FragmentPagerAdapter extends FragmentStatePagerAdapter {
    private List<String> mTagTitleList;

    private List<Fragment> fragments;

    public FragmentPagerAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    public FragmentPagerAdapter(FragmentManager fm, List<String> tagTitleList, List<Fragment> fragments) {
        super(fm);
        this.mTagTitleList = tagTitleList;
        this.fragments = fragments;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTagTitleList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

}
