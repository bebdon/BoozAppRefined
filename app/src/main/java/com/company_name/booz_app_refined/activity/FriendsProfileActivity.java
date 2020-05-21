/*
*  FriendsProfileActivity.java
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


public class FriendsProfileActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, FriendsProfileActivity.class);
	}
	
	private ImageButton backBtnButton;
	private ImageButton removeFriendButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.friends_profile_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure Back btn component
		backBtnButton = this.findViewById(R.id.back_btn_button);
		backBtnButton.setOnClickListener((view) -> {
	this.onBackBtnPressed();
});
		
		// Configure remove friend component
		removeFriendButton = this.findViewById(R.id.remove_friend_button);
		removeFriendButton.setOnClickListener((view) -> {
	this.onRemoveFriendPressed();
});
	}
	
	public void onBackBtnPressed() {
	
		this.startFriendsActivity();
	}
	
	public void onRemoveFriendPressed() {
	
	}
	
	private void startFriendsActivity() {
	
		this.startActivity(FriendsActivity.newIntent(this));
	}
}
