package com.example.bemybride.PotoCollection;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.bemybride.R;
import com.example.bemybride.Util.NavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by Akila on 3/9/2018.
 */

public class PhotoCollection extends AppCompatActivity{
    private static final String TAG="PhotoCollection";
    private Context mContext=PhotoCollection.this;
    private static final int activity_num=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: started.");

        setUpNavigationView();
    }

    private void setUpNavigationView(){
        Log.d(TAG, "setUpNavigationView: setting up navigation view.");
        BottomNavigationViewEx navigationViewEx = (BottomNavigationViewEx) findViewById(R.id.NavViewBar);
        NavigationViewHelper.setupNavigationView(navigationViewEx);
        NavigationViewHelper.enableNavigation(mContext, navigationViewEx);
        Menu menu=navigationViewEx.getMenu();
        MenuItem menuItem=menu.getItem(activity_num);
        menuItem.setChecked(true);
    }
}
