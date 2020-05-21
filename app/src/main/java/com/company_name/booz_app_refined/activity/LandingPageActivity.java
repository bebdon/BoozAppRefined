/*
*  LandingPageActivity.java
*  BoozAppRefined
*
*  Created by [Author].
*  Copyright © 2018 [Company]. All rights reserved.
*/

package com.company_name.booz_app_refined.activity;

import android.animation.*;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import com.company_name.booz_app_refined.R;
import io.supernova.uitoolkit.animation.ViewBackgroundProperties;


public class LandingPageActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, LandingPageActivity.class);
	}
	
	private Button signInButton;
	private Button signUpBtnButton;
	private Switch rectangleSwitch;
	private TextView confirmYouAre18OtextView;
	private TextView boozTextView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.landing_page_activity);
		this.init();
		
		this.startAnimationOne();
	}
	
	private void init() {
	
		// Configure Sign in component
		signInButton = this.findViewById(R.id.sign_in_button);
		signInButton.setOnClickListener((view) -> {
	this.onSignInPressed();
});
		
		// Configure sign up btn component
		signUpBtnButton = this.findViewById(R.id.sign_up_btn_button);
		signUpBtnButton.setOnClickListener((view) -> {
	this.onSignUpBtnPressed();
});
		
		// Configure Rectangle component
		rectangleSwitch = this.findViewById(R.id.rectangle_switch);
		rectangleSwitch.setOnClickListener((view) -> {
	this.onRectangleValueChanged();
});
		
		// Configure Confirm you are 18 o component
		confirmYouAre18OtextView = this.findViewById(R.id.confirm_you_are18_otext_view);
		SpannableString confirmYouAre18OtextViewText = new SpannableString(this.getString(R.string.landing_page_activity_confirm_you_are18_otext_view_text));
		confirmYouAre18OtextViewText.setSpan(new ForegroundColorSpan(Color.parseColor("#F3A701")), 16, 18, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		confirmYouAre18OtextViewText.setSpan(new ForegroundColorSpan(Color.parseColor("#F3A701")), 19, 28, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		confirmYouAre18OtextView.setText(confirmYouAre18OtextViewText);
		
		// Configure Booz component
		boozTextView = this.findViewById(R.id.booz_text_view);
	}
	
	public void onSignInPressed() {
	
		this.startLoginActivity();
	}
	
	public void onSignUpBtnPressed() {
	
		this.startSignUpActivity();
	}
	
	public void onRectangleValueChanged() {
	
	}
	
	private void startSignUpActivity() {
	
		this.startActivity(SignUpActivity.newIntent(this));
	}
	
	private void startLoginActivity() {
	
		this.startActivity(LoginActivity.newIntent(this));
	}
	
	public void startAnimationOne() {
	
		ObjectAnimator animator1 = ObjectAnimator.ofPropertyValuesHolder(boozTextView, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, -400f, 0f));
		animator1.setDuration(300);
		animator1.setInterpolator(PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f));
		
		ObjectAnimator animator2 = ObjectAnimator.ofPropertyValuesHolder(boozTextView, PropertyValuesHolder.ofFloat(View.ALPHA, 0f, 1f));
		animator2.setDuration(300);
		animator2.setInterpolator(PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f));
		
		AnimatorSet animatorSet1 = new AnimatorSet();
		animatorSet1.playTogether(animator1, animator2);
		animatorSet1.setTarget(boozTextView);
		
		AnimatorSet animatorSet2 = new AnimatorSet();
		animatorSet2.playTogether(animatorSet1);
		animatorSet2.start();
	}
}
