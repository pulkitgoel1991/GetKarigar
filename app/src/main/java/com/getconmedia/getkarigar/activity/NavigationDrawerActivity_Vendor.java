package com.getconmedia.getkarigar.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import com.getconmedia.getkarigar.R;
import com.getconmedia.getkarigar.fragment.AdditionalDetails_Profile;
import com.getconmedia.getkarigar.fragment.BusinessDetails_Profile;
import com.getconmedia.getkarigar.fragment.ByContactsFrg_NavigationDrawer;
import com.getconmedia.getkarigar.fragment.ByEmailFrg_NavigationDrawer;
import com.getconmedia.getkarigar.fragment.ChangePassword_NavgtDrwr;
import com.getconmedia.getkarigar.fragment.CompanyImagesFrg_NavigationDrwr;
import com.getconmedia.getkarigar.fragment.DashboardFrg_navigationDrawer;
import com.getconmedia.getkarigar.fragment.FeedbackFrg_NavigationDrawer;
import com.getconmedia.getkarigar.fragment.GSTINFrg_NavigationDrwr;
import com.getconmedia.getkarigar.fragment.PersonalDetailsFrg_NavigationDrawer;
import com.getconmedia.getkarigar.fragment.Service_NavigationDrawer;
import com.getconmedia.getkarigar.fragment.TodayEnquiryFrg_NavgthDrawer;

public class NavigationDrawerActivity_Vendor extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer__vendor);



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.replace_navheaderActivity,new DashboardFrg_navigationDrawer()).commit();
        //FloatingActionButton fab = findViewById(R.id.fab);
       /* fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_drawer_activity__vendor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_dashboard) {

            getSupportFragmentManager().beginTransaction().replace(R.id.replace_navheaderActivity,
                    new DashboardFrg_navigationDrawer()).commit();

        } else if (id == R.id.nav_business_details) {
            getSupportFragmentManager().beginTransaction().
                    replace(R.id.replace_navheaderActivity,new BusinessDetails_Profile()).commit();

        } else if (id == R.id.nav_additional_details) {

            getSupportFragmentManager().beginTransaction().
                    replace(R.id.replace_navheaderActivity,new AdditionalDetails_Profile()).commit();

        } else if (id == R.id.nav_personal_profile) {
            getSupportFragmentManager().beginTransaction().
                    replace(R.id.replace_navheaderActivity,new PersonalDetailsFrg_NavigationDrawer()).commit();

        } else if (id == R.id.nav_gstin_details) {
            getSupportFragmentManager().beginTransaction().
                    replace(R.id.replace_navheaderActivity,new GSTINFrg_NavigationDrwr()).commit();

        } else if (id == R.id.nav_company_images) {
            getSupportFragmentManager().beginTransaction().
                    replace(R.id.replace_navheaderActivity,new CompanyImagesFrg_NavigationDrwr()).commit();

        }else if (id == R.id.changepassword) {
            getSupportFragmentManager().beginTransaction().
                    replace(R.id.replace_navheaderActivity,new ChangePassword_NavgtDrwr()).commit();

        } else if (id == R.id.bycontacts) {
            getSupportFragmentManager().beginTransaction().
                    replace(R.id.replace_navheaderActivity,new ByContactsFrg_NavigationDrawer()).commit();

        } else if (id == R.id.byemails) {
            getSupportFragmentManager().beginTransaction().
                    replace(R.id.replace_navheaderActivity,new ByEmailFrg_NavigationDrawer()).commit();


        } else if (id == R.id.nav_service) {

            getSupportFragmentManager().beginTransaction().
                    replace(R.id.replace_navheaderActivity,new Service_NavigationDrawer()).commit();

        }else if(id== R.id.nav_feedback)
        {
            getSupportFragmentManager().beginTransaction().
                   replace(R.id.replace_navheaderActivity,new FeedbackFrg_NavigationDrawer()).commit();

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
