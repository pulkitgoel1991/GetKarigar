package com.getconmedia.getkarigar.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.getconmedia.getkarigar.R;
import com.getconmedia.getkarigar.adapter.LvAdapterEmailEnquiry;
import com.getconmedia.getkarigar.adapter.ModelListEmailEnquiry;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ByEmailFrg_NavigationDrawer extends Fragment
{
    ListView listView;
    LvAdapterEmailEnquiry adapter;
    private ArrayList<ModelListEmailEnquiry> emailEnquirieslist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       /* View view=inflater.inflate(R.layout.fragment_by_email_frg__navigation_drawer, container,
                false);*/

       View view=inflater.inflate(R.layout.fragment_by_email_frg__navigation_drawer,container,false);

        emailEnquirieslist=new ArrayList<ModelListEmailEnquiry>();
        listView=view.findViewById(R.id.listview_emailenquiry);

        adapter=new LvAdapterEmailEnquiry(getActivity(),emailEnquirieslist);

        populateList();
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        return view;
    }

    ///----eOf onCreate()

    private void populateList() {

        ModelListEmailEnquiry item1, item2, item3, item4, item5;

        item1 = new ModelListEmailEnquiry("01/2/2019", "Housing", "Mohan",
                "9999999999","abc@gmail.com","Hello How are you");
        emailEnquirieslist.add(item1);

        item2 = new ModelListEmailEnquiry("02/02/2019","Housing","Mohan",
                "9999999999","cde@gmail.com","Welcme to android");
        emailEnquirieslist.add(item2);

        item3 = new ModelListEmailEnquiry("03/02/2019", "Housing", "Mohan",
                "9999999999","fgh@gmail.com","No Response");
        emailEnquirieslist.add(item3);

        item4 = new ModelListEmailEnquiry("04/02/2019", "Housing", "Mohan",
                "9999999999","ijk@gmail.com","No response");
        emailEnquirieslist.add(item4);

        item5 = new ModelListEmailEnquiry("05/02/2019", "Housing", "Mohan",
                "9999999999","lmn@gmail.com","-----");
        emailEnquirieslist.add(item5);
    }

}
