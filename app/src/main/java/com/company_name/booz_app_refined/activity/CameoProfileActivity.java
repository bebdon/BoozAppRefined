/*
*  ClubProfileActivity.java
*  BoozAppRefined
*
*  Created by [Author].
*  Copyright © 2018 [Company]. All rights reserved.
*/

package com.company_name.booz_app_refined.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.company_name.booz_app_refined.R;


public class CameoProfileActivity extends AppCompatActivity {

	public static Intent newIntent(Context context) {

		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, CameoProfileActivity.class);
	}
	
	private ImageButton backBtnButton;
	private ImageButton leaveAreviewButton;

	
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.cameo_profile_activity);

		this.init();


	}

	private void init() {

		// Configure Back btn component
		backBtnButton = this.findViewById(R.id.back_btn_button);
		backBtnButton.setOnClickListener((view) -> {
	this.onBackBtnPressed();
});
		
		// Configure Leave a review component
		leaveAreviewButton = this.findViewById(R.id.leave_areview_button);
		leaveAreviewButton.setOnClickListener((view) -> {
	this.onLeaveAReviewPressed();
});
	}
	
	public void onBackBtnPressed() {
	
		this.startHomeActivity();
	}
	
	public void onLeaveAReviewPressed() {
	
		this.startLeaveAReviewActivity();
	}
	
	private void startHomeActivity() {
	
		this.startActivity(HomeActivity.newIntent(this));
	}
	
	private void startLeaveAReviewActivity() {
	
		this.startActivity(LeaveAReviewActivity.newIntent(this));
	}


}
