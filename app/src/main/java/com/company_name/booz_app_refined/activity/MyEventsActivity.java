/*
*  MyEventsActivity.java
*  BoozAppRefined
*
*  Created by [Author].
*  Copyright © 2018 [Company]. All rights reserved.
*/

package com.company_name.booz_app_refined.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.company_name.booz_app_refined.R;


public class MyEventsActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, MyEventsActivity.class);
	}
	
	private ImageButton searchBtnButton;
	private ImageButton backBtnButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.my_events_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure Search btn component
		searchBtnButton = this.findViewById(R.id.search_btn_button);
		searchBtnButton.setOnClickListener((view) -> {
	this.onSearchBtnPressed();
});
		
		// Configure Back btn component
		backBtnButton = this.findViewById(R.id.back_btn_button);
		backBtnButton.setOnClickListener((view) -> {
	this.onBackBtnPressed();
});
	}
	
	public void onSearchBtnPressed() {
	
		this.startEventSearchActivity();
	}
	
	public void onBackBtnPressed() {
	
		this.startHomeActivity();
	}
	
	private void startHomeActivity() {
	
		this.startActivity(HomeActivity.newIntent(this));
	}
	
	private void startEventSearchActivity() {
	
		this.startActivity(EventSearchActivity.newIntent(this));
	}
}
