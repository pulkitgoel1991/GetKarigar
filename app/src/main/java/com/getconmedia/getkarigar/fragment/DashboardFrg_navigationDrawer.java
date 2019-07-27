package com.getconmedia.getkarigar.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.getconmedia.getkarigar.R;
import com.getconmedia.getkarigar.adapter.ListViewAdapter;
import com.getconmedia.getkarigar.adapter.ModelListCustom;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFrg_navigationDrawer extends Fragment
{

    TextView tv_Count_ContactEnquiry,tv_Count_EmailEnquiry,tv_phone_AssigndMngr,
            tv_email_AssigndMngr,tv_count_TodayEnquiry;
    LinearLayout linearLayout_TodayEnq;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_dashboard_frg_navigation_drawer, container, false);

        tv_Count_ContactEnquiry=view.findViewById(R.id.textview_count_contactenquiry);
        tv_Count_EmailEnquiry=view.findViewById(R.id.textview_count_emailEnquiry);
        tv_phone_AssigndMngr=view.findViewById(R.id.textview_phone_assignedmngr);
        tv_email_AssigndMngr=view.findViewById(R.id.textview_email_assignedmngr);
        tv_count_TodayEnquiry=view.findViewById(R.id.count_todayenquiry);
        linearLayout_TodayEnq=view.findViewById(R.id.linearlayout_todayEnq);


        linearLayout_TodayEnq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                getFragmentManager().beginTransaction().replace(R.id.replace_navheaderActivity,
                        new TodayEnquiryFrg_NavgthDrawer()).addToBackStack("Dashboard Fragent").commit();

            }
        });

            return view;
    }

}
