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
public class LoginFgmt_ProfileFgmt extends Fragment
{
    EditText edit_MobileNumber;
    Button button_GetOtp;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_login_fgmt__profile_fgmt, container, false);
        edit_MobileNumber=view.findViewById(R.id.edittext_mobilenumber);
        button_GetOtp=view.findViewById(R.id.btn_GETOTP_ProfileFgmt);

        button_GetOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String mobileNumber=edit_MobileNumber.getText().toString();

                if(mobileNumber.equals(""))
                {
                    edit_MobileNumber.setError("Enter Mobile Number to continue");
                }
                else if(mobileNumber.length()<10)
                {
                    edit_MobileNumber.setError("Enter valid mobile number");
                }
            }
        });


        return view;
    }

}
