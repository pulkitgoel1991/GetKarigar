package com.getconmedia.getkarigar.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.getconmedia.getkarigar.R;
import com.getconmedia.getkarigar.adapter.MyAdapterProfileFrg;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFrgmt_BtmNvg extends Fragment
{
    TextView tv_Login;
    RecyclerView recyclerView;

    String Profile[]={"Download App","About Us","Share App","Download App","About Us","Share App"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_profile_frgmt__btm_nvg, container, false);
        tv_Login=view.findViewById(R.id.textview_LoginPofileFgmt);
        recyclerView=view.findViewById(R.id.recyclerview_loginrofieFgmt);

        MyAdapterProfileFrg adapter=new MyAdapterProfileFrg(getActivity(),Profile);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        tv_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                getFragmentManager().beginTransaction().
                        replace(R.id.replace_activity,new LoginFgmt_ProfileFgmt()).addToBackStack("").commit();
            }
        });

        return view;
    }

}
