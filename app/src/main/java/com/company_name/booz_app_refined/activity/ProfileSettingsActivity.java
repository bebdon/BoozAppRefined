/*
*  ProfileSettingsActivity.java
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.company_name.booz_app_refined.R;


public class ProfileSettingsActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, ProfileSettingsActivity.class);
	}
	
	private ImageButton backBtnButton;
	private Button editProfilePictureButton;
	private LinearLayout saveButton;
	private LinearLayout logoutButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.profile_settings_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure Back btn component
		backBtnButton = this.findViewById(R.id.back_btn_button);
		backBtnButton.setOnClickListener((view) -> {
	this.onBackBtnPressed();
});
		
		// Configure edit profile picture component
		editProfilePictureButton = this.findViewById(R.id.edit_profile_picture_button);
		editProfilePictureButton.setOnClickListener((view) -> {
	this.onEditProfilePicturePressed();
});
		
		// Configure Save component
		saveButton = this.findViewById(R.id.save_button);
		saveButton.setOnClickListener((view) -> {
	this.onSavePressed();
});
		
		// Configure Logout component
		logoutButton = this.findViewById(R.id.logout_button);
		logoutButton.setOnClickListener((view) -> {
	this.onLogoutPressed();
});
	}
	
	public void onBackBtnPressed() {
	
		this.startProfileActivity();
	}
	
	public void onEditProfilePicturePressed() {
	
	}
	
	public void onSavePressed() {
	
	}
	
	public void onLogoutPressed() {
	
		this.startLandingPageActivity();
	}
	
	private void startProfileActivity() {
	
		this.startActivity(ProfileActivity.newIntent(this));
	}
	
	private void startLandingPageActivity() {
	
		this.startActivity(LandingPageActivity.newIntent(this));
	}
}
