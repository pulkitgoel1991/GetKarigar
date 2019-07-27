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
public class ChangePassword_NavgtDrwr extends Fragment
{
    EditText et_OldPswrd,et_NewPswd;
    Button btn_Update_CahngePswdFrg;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_change_password__navgt_drwr, container, false);

        et_OldPswrd=view.findViewById(R.id.edit_oldPswrd_personalDetails);
        et_NewPswd=view.findViewById(R.id.edit_newpswrd_personalDetails);
        btn_Update_CahngePswdFrg=view.findViewById(R.id.btnUpdate_changepassword);

        btn_Update_CahngePswdFrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String oldPassword=et_OldPswrd.getText().toString();
                String newPassword=et_NewPswd.getText().toString();

            }
        });


        return view;
    }

}
