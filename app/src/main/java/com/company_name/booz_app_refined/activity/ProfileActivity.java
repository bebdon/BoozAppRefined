/*
*  ProfileActivity.java
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
import android.widget.ImageView;
import android.widget.TextView;
import com.company_name.booz_app_refined.R;


public class ProfileActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, ProfileActivity.class);
	}
	
	private ImageButton backBtnButton;
	private ImageButton settingsButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.profile_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure Back btn component
		backBtnButton = this.findViewById(R.id.back_btn_button);
		backBtnButton.setOnClickListener((view) -> {
	this.onBackBtnPressed();
});
		
		// Configure Settings component
		settingsButton = this.findViewById(R.id.settings_button);
		settingsButton.setOnClickListener((view) -> {
	this.onSettingsPressed();
});
	}
	
	public void onBackBtnPressed() {
	
		this.startHomeActivity();
	}
	
	public void onSettingsPressed() {
	
		this.startProfileSettingsActivity();
	}
	
	private void startHomeActivity() {
	
		this.startActivity(HomeActivity.newIntent(this));
	}
	
	private void startProfileSettingsActivity() {
	
		this.startActivity(ProfileSettingsActivity.newIntent(this));
	}
}
