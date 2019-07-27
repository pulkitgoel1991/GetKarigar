package com.getconmedia.getkarigar.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.getconmedia.getkarigar.R;
import com.getconmedia.getkarigar.activity.ChildInfo;
import com.getconmedia.getkarigar.activity.GroupInfo;
import com.getconmedia.getkarigar.adapter.CustomAdapterHelpCenter;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class HelpCenterFrgmt_BtmNvg extends Fragment
{
    private LinkedHashMap<String, GroupInfo> subjects = new LinkedHashMap<String, GroupInfo>();
    private ArrayList<GroupInfo> deptList = new ArrayList<GroupInfo>();

    private CustomAdapterHelpCenter listAdapter;
    private ExpandableListView simpleExpandableListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_help_center_frgmt__btm_nvg, container, false);

        // add data for displaying in expandable list view
        loadData();
        //get reference of the ExpandableListView
        simpleExpandableListView =view.findViewById(R.id.simpleExpandableListView);
        // create the adapter by passing your ArrayList data
        listAdapter = new CustomAdapterHelpCenter(getActivity(), deptList);
        // attach the adapter to the expandable list view
        simpleExpandableListView.setAdapter(listAdapter);

        //expand all the Groups
        //expandAll();
        //collapse all the groups
        collapseAll();

        simpleExpandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                //get the group header
                GroupInfo headerInfo = deptList.get(groupPosition);
                //get the child info
                ChildInfo detailInfo =  headerInfo.getProductList().get(childPosition);

                //display it or do something with it
               /* Toast.makeText(getBaseContext(), " Clicked on :: " + headerInfo.getName()
                        + "/" + detailInfo.getName(), Toast.LENGTH_LONG).show();*/
                return false;
            }
        });


        simpleExpandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                //get the group header
                GroupInfo headerInfo = deptList.get(groupPosition);
                //display it or do something with it
                /*Toast.makeText(getBaseContext(), " Header is :: " + headerInfo.getName(),
                        Toast.LENGTH_LONG).show();*/

                return false;
            }
        });

        return view;
    }


    //method to expand all groups
    private void expandAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++){
            simpleExpandableListView.expandGroup(i);
        }
    }


    //method to collapse all groups
    private void collapseAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++){
            simpleExpandableListView.collapseGroup(i);
        }
    }

    //load some initial data into our list
    private void loadData()
    {
        addProduct("How to book a service?",
                "You can follow the steps to book a service, " +
                        "1. Search for the category you need, " +
                        "2. Open the category you need and follow the instructions as you go forward, " +
                        "3. Once you have placed the booking wait for the professional to be assigned. " +
                        "4. The assigned professional will reach the address you provided and deliver the service. ");

        addProduct("How to cancel a service?",
                "If you want the service but can't avail at the time you booked the service for, " +
                        "you can follow the steps, " +
                        "1. Search the booking you want to cancel, " +
                        "2.Click on cancel, " +
                        "3.Select the reason to cancel and submit.");


        addProduct("How to pay for the services?",
                "You can pay for the service either before or after service delivery. To pay after the service" +
                        "delivery,please ask the professional to send you the reciept and the online payment link." +
                        "You can pay using these methods, "+
                        "1. Debit(ATM) cards or credit cards, " +
                        "2. Net banking of all popular banks, " +
                        "3. Through Cheque");


        addProduct("How to know if my request is confirmed?",
                "Once you place a booking,you will receive a conformation via SMS or email or Whatsapp" +
                        "informing you that the booking has been accepted. A verified professional will be assigned " +
                        "for your booking 1 hour before the service time.");

        addProduct("How can i contact the professional?",
                "Contact details of the professionals are shared with you in the project section " +
                        "of your app. Open your project,select the professional you want to speak to and call the " +
                        "professional.");

    }


    //here we maintain our products in various departments
    private int addProduct(String department, String product){

        int groupPosition = 0;

        //check the hash map if the group already exists
        GroupInfo headerInfo = subjects.get(department);
        //add the group if doesn't exists
        if(headerInfo == null){
            headerInfo = new GroupInfo();
            headerInfo.setName(department);
            subjects.put(department, headerInfo);
            deptList.add(headerInfo);
        }

        //get the children for the group
        ArrayList<ChildInfo> productList = headerInfo.getProductList();
        //size of the children list
        int listSize = productList.size();
        //add to the counter
        listSize++;

        //create a new child and add that to the group
        ChildInfo detailInfo = new ChildInfo();
        detailInfo.setSequence(String.valueOf(listSize));
        detailInfo.setName(product);
        productList.add(detailInfo);
        headerInfo.setProductList(productList);

        //find the group position inside the list
        groupPosition = deptList.indexOf(headerInfo);
        return groupPosition;
    }




}
