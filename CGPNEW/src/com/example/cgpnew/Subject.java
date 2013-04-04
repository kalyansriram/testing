package com.example.cgpnew;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class Subject extends Fragment implements OnItemSelectedListener {

	String[] creditsArray = { "2", "3", "4", "5", "6" };
	String[] gradesArray = { "S", "A", "B", "C", "D", "E" };
	Spinner credits,grades;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		LinearLayout l = (LinearLayout) inflater.inflate(R.layout.subject,
				container);

		credits = (Spinner) l.findViewById(R.id.sCredits);
		ArrayAdapter<String> creditsadapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, creditsArray);
		credits.setAdapter(creditsadapter);
		credits.setOnItemSelectedListener(this);

		grades = (Spinner) l.findViewById(R.id.sGrade);
		ArrayAdapter<String> gradesadapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, gradesArray);
		grades.setAdapter(gradesadapter);
		grades.setOnItemSelectedListener(this);

		return l;
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}

}
