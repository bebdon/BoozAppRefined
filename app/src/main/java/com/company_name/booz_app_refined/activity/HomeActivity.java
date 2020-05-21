/*
 *  HomeActivity.java
 *  BoozAppRefined
 *
 *  Created by [Author].
 *  Copyright © 2018 [Company]. All rights reserved.
 */

package com.company_name.booz_app_refined.activity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.company_name.booz_app_refined.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class HomeActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    public static Intent newIntent(Context context) {

        // Fill the created intent with the data you want to be passed to this Activity when it's opened.
        return new Intent(context, HomeActivity.class);
    }

    private ImageButton notificationsButton;
    private ImageButton friendsButton;
    private ImageButton eventsButton;
    private ImageButton getHomeSafeButton;
    private ImageButton profileButton;
    private MapView mMapView;
    public static final String MAPVIEW_BUNDLE_KEY = "MapViewBundleKey";
    private String ClubID;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.home_activity);
        this.init();

        mMapView = this.findViewById(R.id.map_view_map_view);
        initGoogleMap(savedInstanceState);
    }

    private void init() {

        // Configure Notifications component
        notificationsButton = this.findViewById(R.id.notifications_button);
        notificationsButton.setOnClickListener((view) -> {
            this.onNotificationsPressed();
        });

        // Configure Friends component
        friendsButton = this.findViewById(R.id.friends_button);
        friendsButton.setOnClickListener((view) -> {
            this.onFriendsPressed();
        });

        // Configure Events component
        eventsButton = this.findViewById(R.id.events_button);
        eventsButton.setOnClickListener((view) -> {
            this.onEventsPressed();
        });

        // Configure Get home safe component
        getHomeSafeButton = this.findViewById(R.id.get_home_safe_button);
        getHomeSafeButton.setOnClickListener((view) -> {
            this.onGetHomeSafePressed();
        });

        // Configure Profile component
        profileButton = this.findViewById(R.id.profile_button);
        profileButton.setOnClickListener((view) -> {
            this.onProfilePressed();
        });
    }

    private void initGoogleMap(Bundle savedInstanceState) {
        // *** IMPORTANT ***
        // MapView requires that the Bundle you pass contain _ONLY_ MapView SDK
        // objects or sub-Bundles.
        Bundle mapViewBundle = null;
        if (savedInstanceState != null) {
            mapViewBundle = savedInstanceState.getBundle(MAPVIEW_BUNDLE_KEY);
        }
        mMapView.onCreate(mapViewBundle);


        mMapView.getMapAsync(this);
    }


    public void onNotificationsPressed() {

        this.startNotificationsActivity();
    }

    public void onFriendsPressed() {

        this.startFriendsActivity();
    }

    public void onEventsPressed() {

        this.startMyEventsActivity();
    }

    public void onGetHomeSafePressed() {

        this.startGetHomeSafeActivity();
    }

    public void onProfilePressed() {

        this.startProfileActivity();
    }

    private void startMyEventsActivity() {

        this.startActivity(MyEventsActivity.newIntent(this));
    }

    private void startProfileActivity() {

        this.startActivity(ProfileActivity.newIntent(this));
    }

    private void startFriendsActivity() {

        this.startActivity(FriendsActivity.newIntent(this));
    }

    private void startNotificationsActivity() {

        this.startActivity(NotificationsActivity.newIntent(this));
    }

    private void startGetHomeSafeActivity() {

        this.startActivity(GetHomeSafeActivity.newIntent(this));
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Bundle mapViewBundle = outState.getBundle(MAPVIEW_BUNDLE_KEY);
        if (mapViewBundle == null) {
            mapViewBundle = new Bundle();
            outState.putBundle(MAPVIEW_BUNDLE_KEY, mapViewBundle);
        }

        mMapView.onSaveInstanceState(mapViewBundle);
    }

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onStart() {
        super.onStart();
        mMapView.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
        mMapView.onStop();
    }

    @Override
    public void onMapReady(GoogleMap map) {
        map.setOnMarkerClickListener(this);

        LatLng bournemouth = new LatLng(50.720511, -1.878589);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(bournemouth, 15.0f));

        LatLng cameo = new LatLng(50.721994, -1.873847);
        map.addMarker(new MarkerOptions().position(cameo)
                .title("Cameo"));

        LatLng halo = new LatLng(50.719470, -1.880159);
        map.addMarker(new MarkerOptions().position(halo)
                .title("Halo"));

        LatLng theOldFireStation = new LatLng(50.723347, -1.864829);
        map.addMarker(new MarkerOptions().position(theOldFireStation)
                .title("The Old Fire Station"));

        LatLng revolution = new LatLng(50.722206, -1.870196);
        map.addMarker(new MarkerOptions().position(revolution)
                .title("Revolution"));

        LatLng camel = new LatLng(50.722124, -1.872103);
        map.addMarker(new MarkerOptions().position(camel)
                .title("Camel"));

        LatLng aruba = new LatLng(50.716325, -1.875609);
        map.addMarker(new MarkerOptions().position(aruba)
                .title("Aruba"));

        LatLng alt = new LatLng(50.726924, -1.861203);
        map.addMarker(new MarkerOptions().position(alt)
                .title("Alt"));

        LatLng walkabout = new LatLng(50.722298, -1.872750);
        map.addMarker(new MarkerOptions().position(walkabout)
                .title("Walkabout"));

        LatLng truth = new LatLng(50.718105, -1.880445);
        map.addMarker(new MarkerOptions().position(truth)
                .title("Truth"));

    }

    @Override
    public boolean onMarkerClick(final Marker marker) {
        // TODO Auto-generated method stub

		if (marker.getTitle().equals("Cameo")){
            this.startActivity(CameoProfileActivity.newIntent(this));

		}


		if (marker.getTitle().equals("Halo")){
            this.startActivity(HaloProfileActivity.newIntent(this));

		}

		if (marker.getTitle().equals("The Old Fire Station")){
            this.startActivity(TOFSProfileActivity.newIntent(this));
		}

        if (marker.getTitle().equals("Revolution")){
            this.startActivity(RevolutionProfileActivity.newIntent(this));
        }

        if (marker.getTitle().equals("Camel")){
            this.startActivity(CamelProfileActivity.newIntent(this));
        }

        if (marker.getTitle().equals("Aruba")){
            this.startActivity(ArubaProfileActivity.newIntent(this));
        }

        if (marker.getTitle().equals("Alt")){
            this.startActivity(AltProfileActivity.newIntent(this));
        }

        if (marker.getTitle().equals("Walkabout")){
            this.startActivity(WalkaboutProfileActivity.newIntent(this));
        }

        if (marker.getTitle().equals("Truth")){
            this.startActivity(TruthProfileActivity.newIntent(this));
        }



        return false;
    }

    @Override
    public void onPause() {
        mMapView.onPause();
        super.onPause();
    }

    @Override
    public void onDestroy() {
        mMapView.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }
}
