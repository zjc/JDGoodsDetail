package com.stone.verticalslide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class VerticalFragment1 extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.vertical_fragment1, null);
		ViewPager mViewPager = (ViewPager)rootView.findViewById(R.id.mViewPager);
		
		List<View> views = new ArrayList<View>();
		views.add(inflater.inflate(R.layout.view_page_1, null));
		views.add(inflater.inflate(R.layout.view_page_2, null));
		views.add(inflater.inflate(R.layout.view_page_3, null));
		mViewPager.setAdapter(new ViewPagerAdapter(views));
		return rootView;
	}
}
