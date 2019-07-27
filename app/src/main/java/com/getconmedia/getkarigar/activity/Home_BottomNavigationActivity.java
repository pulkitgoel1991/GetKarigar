package com.getconmedia.getkarigar.activity;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;


import com.getconmedia.getkarigar.R;
import com.getconmedia.getkarigar.fragment.HelpCenterFrgmt_BtmNvg;
import com.getconmedia.getkarigar.fragment.HomeFrgmt_BtmNvg;
import com.getconmedia.getkarigar.fragment.ProfileFrgmt_BtmNvg;

public class Home_BottomNavigationActivity extends AppCompatActivity
{
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    getSupportFragmentManager().beginTransaction().
                            replace(R.id.replace_activity,new HomeFrgmt_BtmNvg()).commit();
                    return true;
                case R.id.navigation_helpCenter:
                    getSupportFragmentManager().beginTransaction().
                            replace(R.id.replace_activity,new HelpCenterFrgmt_BtmNvg()).commit();
                    return true;
                case R.id.navigation_profile:
                    getSupportFragmentManager().beginTransaction().
                            replace(R.id.replace_activity,new ProfileFrgmt_BtmNvg()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__bottom_navigation);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        getSupportFragmentManager().beginTransaction().
                add(R.id.replace_activity,new HomeFrgmt_BtmNvg()).commit();
    }

}
