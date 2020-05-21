/*
*  LeaveAReviewActivity.java
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
import android.widget.Button;
import android.widget.ImageButton;

import com.company_name.booz_app_refined.R;


public class LeaveAReviewActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, LeaveAReviewActivity.class);
	}
	
	private ImageButton backBtnButton;
	private ImageButton am1Button;
	private ImageButton am2Button;
	private ImageButton am3Button;
	private ImageButton am1CopyButton;
	private ImageButton am2CopyButton;
	private ImageButton am3CopyButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.leave_areview_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure Back btn component
		backBtnButton = this.findViewById(R.id.back_btn_button);
		backBtnButton.setOnClickListener((view) -> {
	this.onBackBtnPressed();
});
		// Configure AM1 component
		am1Button = this.findViewById(R.id.am1_constraint_layout);
		am1Button.setOnClickListener((view) -> {
			this.onAM1Pressed();
		});

		// Configure AM2 component
		am2Button = this.findViewById(R.id.am2_constraint_layout);
		am2Button.setOnClickListener((view) -> {
			this.onAM2Pressed();
		});

		// Configure AM3 component
		am3Button = this.findViewById(R.id.am3_constraint_layout);
		am3Button.setOnClickListener((view) -> {
			this.onAM3Pressed();
		});

		// Configure AM1 Copy component
		am1CopyButton = this.findViewById(R.id.am1_constraint_layout2);
		am1CopyButton.setOnClickListener((view) -> {
			this.onAM1CopyPressed();
		});

		// Configure AM2 Copy component
		am2CopyButton = this.findViewById(R.id.am2_constraint_layout2);
		am2CopyButton.setOnClickListener((view) -> {
			this.onAM2CopyPressed();
		});

		// Configure AM3 Copy component
		am3CopyButton = this.findViewById(R.id.am3_constraint_layout2);
		am3CopyButton.setOnClickListener((view) -> {
			this.onAM3CopyPressed();
		});
	}
	
	public void onBackBtnPressed() {
	
		this.startClubProfileActivity();
	}
	public void onAM1Pressed() {
		am1Button.setBackground(getDrawable(R.drawable.amenity_on_foreground));
	}

	public void onAM2Pressed() {
		am2Button.setBackground(getDrawable(R.drawable.amenity_on_foreground));
	}

	public void onAM3Pressed() {
		am3Button.setBackground(getDrawable(R.drawable.amenity_on_foreground));
	}

	public void onAM1CopyPressed() {
		am1CopyButton.setBackground(getDrawable(R.drawable.amenity_on_foreground));
	}

	public void onAM2CopyPressed() {
		am2CopyButton.setBackground(getDrawable(R.drawable.amenity_on_foreground));
	}

	public void onAM3CopyPressed() {
		am3CopyButton.setBackground(getDrawable(R.drawable.amenity_on_foreground));
	}


	private void startClubProfileActivity() {
	
		this.startActivity(TOFSProfileActivity.newIntent(this));
	}
}
