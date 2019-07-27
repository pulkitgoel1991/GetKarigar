package com.getconmedia.getkarigar.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.getconmedia.getkarigar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GSTINFrg_NavigationDrwr extends Fragment
{
    EditText et_gstNo,et_PanNo,et_TanNo,et_AadharNo;
    Button btnUpdate;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_gstinfrg__navigation_drwr, container, false);

        et_gstNo=view.findViewById(R.id.edit_gstinNumber_gstinfrg);
        et_PanNo=view.findViewById(R.id.edit_panNumber_gstinfrg);
        et_TanNo=view.findViewById(R.id.edit_tanNumber_gstinfrg);
        et_AadharNo=view.findViewById(R.id.edit_aadharNumberr_gstinfrg);

        btnUpdate=view.findViewById(R.id.btnUpdate_gstinfrg);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String gstNo=et_gstNo.getText().toString();
                String panNo=et_PanNo.getText().toString();
                String tanNo=et_TanNo.getText().toString();
                String aadharNo=et_AadharNo.getText().toString();
            }
        });


        return view;
    }

}
