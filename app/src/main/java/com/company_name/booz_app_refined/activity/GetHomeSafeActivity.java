/*
*  GetHomeSafeActivity.java
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
import android.widget.LinearLayout;
import android.widget.TextView;
import com.company_name.booz_app_refined.R;


public class GetHomeSafeActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, GetHomeSafeActivity.class);
	}
	
	private LinearLayout homeSafeAreaButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.get_home_safe_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure Home safe area component
		homeSafeAreaButton = this.findViewById(R.id.home_safe_area_button);
		homeSafeAreaButton.setOnClickListener((view) -> {
	this.onHomeSafeAreaPressed();
});
	}
	
	public void onHomeSafeAreaPressed() {
	
		this.startHomeActivity();
	}
	
	private void startHomeActivity() {
	
		this.startActivity(HomeActivity.newIntent(this));
	}
}
