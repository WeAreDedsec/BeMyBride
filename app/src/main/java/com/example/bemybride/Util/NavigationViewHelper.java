package com.example.bemybride.Util;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.bemybride.ARCollection.ARCollection;
import com.example.bemybride.Home.HomeActivity;
import com.example.bemybride.PotoCollection.PhotoCollection;
import com.example.bemybride.Users.ProfileActivity;
import com.example.bemybride.R;
import com.example.bemybride.VRCollection.VRBallRoomCollection;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by Akila on 3/9/2018.
 */

public class NavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";

    public static void setupNavigationView(BottomNavigationViewEx navigationViewEx) {
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        navigationViewEx.enableAnimation(false);
        navigationViewEx.enableItemShiftingMode(false);
        navigationViewEx.enableShiftingMode(false);
        navigationViewEx.setTextVisibility(false);
    }
    public static void enableNavigation(final Context context, BottomNavigationViewEx view) {
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.ic_house:
                        Intent intent1 = new Intent(context, HomeActivity.class);//ACTIVITY_NUM = 0
                        context.startActivity(intent1);
                        //callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;

                    case R.id.ic_360_view:
                        Intent intent2  = new Intent(context, PhotoCollection.class);//ACTIVITY_NUM = 1
                        context.startActivity(intent2);
                        //callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;

                    case R.id.ic_vrbox:
                        Intent intent3 = new Intent(context, VRBallRoomCollection.class);//ACTIVITY_NUM = 2
                        context.startActivity(intent3);
//                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;

                    case R.id.ic_ar_icon:
                        Intent intent4 = new Intent(context, ARCollection.class);//ACTIVITY_NUM = 3
                        context.startActivity(intent4);
//                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;

                    case R.id.ic_user:
                        Intent intent5 = new Intent(context, ProfileActivity.class);//ACTIVITY_NUM = 4
                        context.startActivity(intent5);
//                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;
                }


                return false;
            }
        });
    }
}
