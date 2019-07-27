package com.getconmedia.getkarigar.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.getconmedia.getkarigar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CompanyImagesFrg_NavigationDrwr extends Fragment
{
    ImageView imageView;
    TextView tv_Remove;
    Button btn_update_CompanyImages;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_company_images_frg__navigation_drwr, container, false);

        imageView=view.findViewById(R.id.imagebutton_CompanyImages);
        tv_Remove=view.findViewById(R.id.textview_delete_companyImages);
        btn_update_CompanyImages=view.findViewById(R.id.btnUpdate_companyimages);

        btn_update_CompanyImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });



        return view;
    }

}
