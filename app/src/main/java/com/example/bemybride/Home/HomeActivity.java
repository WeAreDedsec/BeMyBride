package com.example.bemybride.Home;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.bemybride.R;
import com.example.bemybride.Util.NavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "HomeActivity";
    private static final int activity_num=0;
    private Context mContext=HomeActivity.this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: starting.");

        setUpNavigationView();
    }

    private void setUpNavigationView() {
        Log.d(TAG, "setUpNavigationView: setting up navigation view.");
        BottomNavigationViewEx navigationViewEx = (BottomNavigationViewEx) findViewById(R.id.NavViewBar);
        NavigationViewHelper.setupNavigationView(navigationViewEx);
        NavigationViewHelper.enableNavigation(mContext, navigationViewEx);
        Menu menu=navigationViewEx.getMenu();
        MenuItem menuItem=menu.getItem(activity_num);
        menuItem.setChecked(true);
    }


}
