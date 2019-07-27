package com.getconmedia.getkarigar.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.getconmedia.getkarigar.R;
import com.getconmedia.getkarigar.adapter.LvAdapterTodayEnquiry;
import com.getconmedia.getkarigar.adapter.ModelListTodayEnquiry;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TodayEnquiryFrg_NavgthDrawer extends Fragment
{

    ListView listView;
    LvAdapterTodayEnquiry adapter;
    private ArrayList<ModelListTodayEnquiry> todayEnquirieslist;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_today_enquiry_frg__navgth_drawer, container, false);

        todayEnquirieslist=new ArrayList<ModelListTodayEnquiry>();

        todayEnquirieslist=new ArrayList<ModelListTodayEnquiry>();
        listView=view.findViewById(R.id.listview_todayenquiry);

        adapter=new LvAdapterTodayEnquiry(getActivity(),todayEnquirieslist);

        populateList();

        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        return view;
    }

    ///------end of onCreate()

    private void populateList() {

        ModelListTodayEnquiry item1, item2, item3, item4, item5;

        item1 = new ModelListTodayEnquiry("01/2/2019", "Housing", "Mohan",
                "9999999999","abc@gmail.com","Hello How are you");
        todayEnquirieslist.add(item1);

        item2 = new ModelListTodayEnquiry("02/02/2019","Housing","Mohan",
                "9999999999","cde@gmail.com","Welcme to android");
        todayEnquirieslist.add(item2);

        item3 = new ModelListTodayEnquiry("03/02/2019", "Housing", "Mohan",
                "9999999999","fgh@gmail.com","No Response");
        todayEnquirieslist.add(item3);

        item4 = new ModelListTodayEnquiry("04/02/2019", "Housing", "Mohan",
                "9999999999","ijk@gmail.com","No response");
        todayEnquirieslist.add(item4);

        item5 = new ModelListTodayEnquiry("05/02/2019", "Housing", "Mohan",
                "9999999999","lmn@gmail.com","-----");
        todayEnquirieslist.add(item5);
    }

}
