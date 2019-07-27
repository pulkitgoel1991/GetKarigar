package com.getconmedia.getkarigar.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.getconmedia.getkarigar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BusinessDetails_Profile extends Fragment
{
    EditText et_CompanyName,et_CompanyAddress,et_CompanyCity,
            et_CompanyLocality,et_PostalZipCode,et_YearOfEstablishment;

    Spinner spinner_ownership;
    Button btnUpdate_BusinesssDetails;

    String[] ownership={"Limited Liability Partnership (LLP)","Public Limited Company","Private Limited Company",
                        "Partnership","Proprietorship","Professional Associations",
            "Others"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_business_details__profile, container, false);
        et_CompanyName=view.findViewById(R.id.edit_name_businessdetails);
        et_CompanyAddress=view.findViewById(R.id.edit_address_businessdetails);
        et_CompanyCity=view.findViewById(R.id.edit_city_businessdetails);
        et_CompanyLocality=view.findViewById(R.id.edit_locality_businessdetails);
        et_PostalZipCode=view.findViewById(R.id.edit_postalcode_businessdetails);
        et_YearOfEstablishment=view.findViewById(R.id.edit_yearofestablishmnt_businessdetails);

        spinner_ownership=view.findViewById(R.id.Spinner_businessdetails);
        btnUpdate_BusinesssDetails=view.findViewById(R.id.btnUpdate_businessdetails);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,ownership);
        spinner_ownership.setAdapter(adapter);
        adapter.notifyDataSetChanged();


        btnUpdate_BusinesssDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String companyName=et_CompanyName.getText().toString();
                String companyAddress=et_CompanyAddress.getText().toString();
                String  companyCity=et_CompanyCity.getText().toString();
                String companyLocality=et_CompanyLocality.getText().toString();
                String companyPostal=et_PostalZipCode.getText().toString();
                String companyYearEst=et_YearOfEstablishment.getText().toString();
                String companyOwnership=spinner_ownership.getSelectedItem().toString();

            }
        });

        return view;
    }

}
