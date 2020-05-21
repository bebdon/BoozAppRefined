/*
*  EventSearchActivity.java
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
import android.widget.EditText;
import android.widget.ImageButton;
import com.company_name.booz_app_refined.R;


public class EventSearchActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, EventSearchActivity.class);
	}
	
	private ImageButton backBtnButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.event_search_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure Back btn component
		backBtnButton = this.findViewById(R.id.back_btn_button);
		backBtnButton.setOnClickListener((view) -> {
	this.onBackBtnPressed();
});
	}
	
	public void onBackBtnPressed() {
	
		this.startMyEventsActivity();
	}
	
	private void startMyEventsActivity() {
	
		this.startActivity(MyEventsActivity.newIntent(this));
	}
}
