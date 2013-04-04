package com.example.cgpnew;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Semester extends Fragment implements OnClickListener {

	Button Add;
	LinearLayout layout;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		if(layout==null){
		layout = (LinearLayout) inflater.inflate(
				R.layout.semester, container, false);
		}
		Add = (Button) layout.findViewById(R.id.bAdd);
		Add.setOnClickListener(this);
		return layout;
	}

	@Override
	public void onClick(View v) {

		android.app.FragmentManager fm = getChildFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		Fragment f = this;
		//LinearLayout l = (LinearLayout) f.getView();
		LinearLayout parent = (LinearLayout) layout.findViewById(R.id.llContent);
		Class<Subject> subject = Subject.class;		
		
		Fragment fragment = Fragment.instantiate(this,subject.getName());
		
		ft.add(parent.getId(), fragment);
		
		//TextView txt = new TextView(getActivity());
		//txt.setText("Hiiiii");
		
		//parent.addView(txt);
		
		
		ft.commit();

	}

}
