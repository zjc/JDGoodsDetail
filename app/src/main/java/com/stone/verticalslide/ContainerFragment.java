package com.stone.verticalslide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stone.verticalslide.DragLayout.ShowNextPageNotifier;

public class ContainerFragment extends Fragment {
	
	private VerticalFragment1 fragment1;
	private VerticalFragment3 fragment3;
	
	DragLayout draglayout;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_container, null);
		fragment1 = new VerticalFragment1();
		fragment3 = new VerticalFragment3();
		

		this.getChildFragmentManager().beginTransaction()
				.add(R.id.first, fragment1).add(R.id.second, fragment3)
				.commit();

		ShowNextPageNotifier nextIntf = new ShowNextPageNotifier() {
			@Override
			public void onDragNext() {
				fragment3.initView();
			}
		};
		draglayout = (DragLayout) rootView.findViewById(R.id.draglayout);
		draglayout.setNextPageListener(nextIntf);
		return rootView;
	}

}
