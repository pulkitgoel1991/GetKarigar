package com.getconmedia.getkarigar.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.getconmedia.getkarigar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PersonalDetailsFrg_NavigationDrawer extends Fragment
{
    EditText et_ContactPerson,et_MobileNumber,et_EmailId,et_AltEmailId,et_AltMobileNO,et_TelephoneNo,et_FaxNo;
    ImageView imageView_personalDtls;
    Button btnUpdate_PersonalDetails,btnUpload_PrsnDtls;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_personal_details_frg__navigation_drawer, container, false);

        et_ContactPerson=view.findViewById(R.id.edit_contactperson_personalDetails);
        et_MobileNumber=view.findViewById(R.id.edit_mobileNumber_personalDetails);
        et_EmailId=view.findViewById(R.id.edit_emailId_personalDetails);
        et_AltEmailId=view.findViewById(R.id.edit_AlternatemailId_personalDetails);
        et_AltMobileNO=view.findViewById(R.id.edit_AlternateMobileNo_personalDetails);
        et_TelephoneNo=view.findViewById(R.id.edit_telephone_personalDetails);
        et_FaxNo=view.findViewById(R.id.edit_faxnumber_personalDetails);
        imageView_personalDtls=view.findViewById(R.id.imageview_personaldetails);

        btnUpdate_PersonalDetails=view.findViewById(R.id.btnUpdate_personaldetails);
        btnUpload_PrsnDtls=view.findViewById(R.id.btn_UploadImage_PersnalDetails);

        btnUpdate_PersonalDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String contactPerson=et_ContactPerson.getText().toString();
                String mobileNumber=et_MobileNumber.getText().toString();
                String emailId=et_EmailId.getText().toString();
                String AltemailId=et_AltEmailId.getText().toString();
                String AltMobileNo=et_AltMobileNO.getText().toString();
                String TelephoneNo=et_TelephoneNo.getText().toString();
                String FaxNo=et_FaxNo.getText().toString();




            }
        });


        return view;
    }

}
