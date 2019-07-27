package com.getconmedia.getkarigar.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.getconmedia.getkarigar.R;
import com.getconmedia.getkarigar.adapter.LvAdapterContactEnquiry;
import com.getconmedia.getkarigar.adapter.ModelListContactEnquiry;


import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ByContactsFrg_NavigationDrawer extends Fragment
{
    ListView listView;
    LvAdapterContactEnquiry adapter;
    private ArrayList<ModelListContactEnquiry> contactEnquirieslist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_by_contacts_frg__navigation_drawer, container,
                false);

        // Inflate the layout for this fragment

        contactEnquirieslist=new ArrayList<ModelListContactEnquiry>();

        listView=view.findViewById(R.id.listview_contactenquiry);
        adapter=new LvAdapterContactEnquiry(getActivity(),contactEnquirieslist);

        populateList();
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return view;
    }
        //populating the list


    private void populateList() {

        ModelListContactEnquiry item1, item2, item3, item4, item5;

        item1 = new ModelListContactEnquiry("01/2/2019", "Housing", "Mohan", "9999999999");
        contactEnquirieslist.add(item1);

        item2 = new ModelListContactEnquiry("02/02/2019","Housing","Mohan","9999999999");
        contactEnquirieslist.add(item2);

        item3 = new ModelListContactEnquiry("03/02/2019", "Housing", "Mohan", "9999999999");
        contactEnquirieslist.add(item3);

        item4 = new ModelListContactEnquiry("04/02/2019", "Housing", "Mohan", "9999999999");
        contactEnquirieslist.add(item4);

        item5 = new ModelListContactEnquiry("05/02/2019", "Housing", "Mohan", "9999999999");
        contactEnquirieslist.add(item5);
    }
}
