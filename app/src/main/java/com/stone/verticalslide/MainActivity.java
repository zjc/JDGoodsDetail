package com.stone.verticalslide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Window;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
	
	ViewPager mViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		initView();
	}

	/**
	 * 初始化View
	 */
	private void initView() {
		mViewPager = (ViewPager)findViewById(R.id.mViewPager);
		List<Fragment> fragments = new ArrayList<Fragment>();
		fragments.add(new ContainerFragment());
		fragments.add(new MainFragment2());
		fragments.add(new MainFragment3());
		mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager(),fragments));
	}

}
