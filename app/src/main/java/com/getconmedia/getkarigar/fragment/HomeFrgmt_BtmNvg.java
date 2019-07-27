package com.getconmedia.getkarigar.fragment;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import com.getconmedia.getkarigar.R;
import com.getconmedia.getkarigar.activity.ExpandableHeightGridView;
import com.getconmedia.getkarigar.adapter.CustomAdapterGridView;
import com.getconmedia.getkarigar.adapter.MyAdapterRecyclerHomeNvgBtm;
import com.getconmedia.getkarigar.adapter.MyAdapterViewPager;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFrgmt_BtmNvg extends Fragment
{
    EditText edit_Location;
    SearchView searchView;
    ViewPager mPager;
    int currentPage=0;

    ExpandableHeightGridView gridView;
    //array for recyclerView
    RecyclerView recyclerView;
    Integer pics_recyclerview[]={R.drawable.getcon10,R.drawable.getcon11,R.drawable.getcon12};
    String text_recyclerview[]={"Karigar","Contractor","Supplier"};

    //array for viewPager
    Integer pic_viewpager[]={R.drawable.image4,R.drawable.image4,R.drawable.karigar3,
            R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,
            R.drawable.image5,R.drawable.image6,R.drawable.image7,R.drawable.image8,R.drawable.image9};

    // array for GridView
    Integer pics_gridview[]={R.drawable.getcon1,R.drawable.getcon2,R.drawable.getcon3,R.drawable.getcon4,
            R.drawable.getcon5,R.drawable.getcon6,R.drawable.getcon15,R.drawable.getcon16,
            R.drawable.getcon9,
            R.drawable.getcon1,R.drawable.getcon2,R.drawable.getcon3,R.drawable.getcon4,
            R.drawable.getcon5,R.drawable.getcon6,R.drawable.getcon15,R.drawable.getcon16,
            R.drawable.getcon9};
    String text_gridview[]={"Fabrication-M.S.","Elevation Works","Fabrication-S.S.","False ceiling","Electrical Fitting",
            "Rolling Shutters","Doors & windows","Rolling Shutters","Fabrication-S.s",
            "Fabrication-M.S.","Elevation Works","Fabrication-S.S.","False ceiling","Electrical Fitting",
            "Rolling Shutters","Doors & windows","Rolling Shutters","Fabrication-S.s"};


    ArrayList<Integer> picArray=new ArrayList<Integer>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home_frgmt__btm_nvg, container, false);

        edit_Location=view.findViewById(R.id.edit_location);
        searchView=view.findViewById(R.id.searchview_btmfrg);
        gridView=view.findViewById(R.id.gridVew_HomeNvg);
        gridView.setExpanded(true);

        //------code for recycler view---------
        recyclerView=view.findViewById(R.id.recyclerview_homefgmt_nvg);
        MyAdapterRecyclerHomeNvgBtm adapter=new MyAdapterRecyclerHomeNvgBtm(getActivity(),
                pics_recyclerview,text_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);


        //--------------------------------------------------------------------------------------------
        //code for view pager code------------------------------------
        for(int i =0; i<pic_viewpager.length; i++)
            picArray.add(pic_viewpager[i]);

        mPager=view. findViewById(R.id.viewpager);

        mPager.setAdapter(new MyAdapterViewPager(getActivity(),picArray));

        final Handler handler=new Handler();

        final Runnable update=new Runnable()
        {
            @Override
            public void run()
            {
                if(currentPage==pic_viewpager.length)
                {
                    currentPage=0;
                }
                mPager.setCurrentItem(currentPage++,true);
            }
        };

        Timer swipeTimer=new Timer();

        swipeTimer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                handler.post(update);

            }
        },3000,3000);

        //-------------------------------------view pager code------------------

        //-----code for grid view-------------------------------------
        CustomAdapterGridView customAdapter=new CustomAdapterGridView(getContext(),pics_gridview,text_gridview,inflater);
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if(position==0)
                {
                    Toast.makeText(getActivity(), "Position 0", Toast.LENGTH_SHORT).show();
                }
                else if(position==1)
                {
                    Toast.makeText(getActivity(), "Position 1", Toast.LENGTH_SHORT).show();
                }
                else if(position==2)
                {
                    Toast.makeText(getActivity(), "Position 2", Toast.LENGTH_SHORT).show();
                }
                else if(position==3)
                {
                    Toast.makeText(getActivity(), "Position 3", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getActivity(), "OnClickListener is working", Toast.LENGTH_SHORT).show();
                }

            }
        });

        //-------------------------gridView-------------------------------------------------------------
        return view;
    }
}
