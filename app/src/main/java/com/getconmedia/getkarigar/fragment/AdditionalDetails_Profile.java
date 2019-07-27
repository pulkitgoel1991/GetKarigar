package com.getconmedia.getkarigar.fragment;


import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.getconmedia.getkarigar.R;


import static android.app.Activity.RESULT_OK;

/**
 * A simple {@link Fragment} subclass.
 */
public class AdditionalDetails_Profile extends Fragment
{
    ImageView ImgVw_AddtnlDtls;
    EditText et_AboutUs;
    Spinner spinner_DayFrom,spinner_DayTo,spinner_TimeFrom,spinner_TimeTo,spinner_teamSize,spinner_experience;
    Button btnUpdate_AdditionalDetails,btnUploadImage;
    Bitmap bmp;

    String[] dayFrom={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    String[] dayTo={"Sunday","Saturday","Friday","Thursday","Wednesday","Tuesday","Monday"};
    String[] timeFrom={"9 AM","10 AM","11 AM","12 Noon","1 PM","2 PM","3 PM","4 PM","5 PM","6 PM","7 PM","8 PM",
            "9 PM","10 PM","11 PM","12 Midnight","1 AM","2 AM","3 AM","4 AM","5 AM","6 AM","7 AM","8 AM"};
    String[] teamSize={"0-5 Member","5-20 Member","20+ Member"};
    String[] experience={"0-1 Year","1-5 Year","5+ Year Above"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_additional_details__profile, container, false);
        ImgVw_AddtnlDtls=view.findViewById(R.id.imageview_additionaldetails);
        et_AboutUs=view.findViewById(R.id.edit_aboutus_additionaldetails);
        spinner_DayFrom=view.findViewById(R.id.spinnerDayFrom_additionaldetails);
        spinner_DayTo=view.findViewById(R.id.spinnerDayto_additionaldetails);
        spinner_TimeFrom=view.findViewById(R.id.spinnerTimeFrom_additionaldetails);
        spinner_TimeTo=view.findViewById(R.id.spinnerTimeto_additionaldetails);
        spinner_teamSize=view.findViewById(R.id.spinnerteamsize_additionaldetails);
        spinner_experience=view.findViewById(R.id.spinnerexperience_additionaldetails);
        btnUpdate_AdditionalDetails=view.findViewById(R.id.btnupdate_additionaldetails);
        btnUploadImage=view.findViewById(R.id.btn_UploadImage);

        ArrayAdapter<String> dayFromAdapter=new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1,dayFrom);
        spinner_DayFrom.setAdapter(dayFromAdapter);
        dayFromAdapter.notifyDataSetChanged();


        ArrayAdapter<String> dayToAdapter=new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1,dayTo);
        spinner_DayTo.setAdapter(dayToAdapter);
        dayToAdapter.notifyDataSetChanged();


        ArrayAdapter<String> timeFromAdapter=new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1,timeFrom);
        spinner_TimeFrom.setAdapter(timeFromAdapter);
        timeFromAdapter.notifyDataSetChanged();

        ArrayAdapter<String> timeToAdapter=new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1,timeFrom);
        spinner_TimeTo.setAdapter(timeToAdapter);
        timeToAdapter.notifyDataSetChanged();


        ArrayAdapter<String> experienceAdapter=new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1,experience);
        spinner_experience.setAdapter(experienceAdapter);
        experienceAdapter.notifyDataSetChanged();

        ArrayAdapter<String> teamSizeAdapter=new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1,teamSize);
        spinner_teamSize.setAdapter(teamSizeAdapter);
        teamSizeAdapter.notifyDataSetChanged();


        btnUpdate_AdditionalDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String Company_Aboutus=et_AboutUs.getText().toString();
                String WrkngDay_From=spinner_DayFrom.getSelectedItem().toString();
                String wrkngDay_To=spinner_DayTo.getSelectedItem().toString();
                String wrkngTime_From=spinner_TimeFrom.getSelectedItem().toString();
                String wrkngTime_To=spinner_TimeTo.getSelectedItem().toString();
                String experience=spinner_experience.getSelectedItem().toString();
                String teamSize=spinner_teamSize.getSelectedItem().toString();

/*
                btnUploadImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        Intent photoPickerIntent = new Intent(Intent.ACTION_GET_CONTENT);
                        photoPickerIntent.setType("image/*");
                        startActivityForResult(photoPickerIntent, 1);

                    }
                });*/

            }
        });


        return view;
    }
    ///-------end Of onCreate()

/*
   *//* @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);


        if (requestCode == 1)
        {
            if (intent != null && resultCode == RESULT_OK)
            {

                Uri selectedImage = intent.getData();

                String[] filePathColumn = {MediaStore.Images.Media.DATA};
                Cursor cursor = getActivity().getContentResolver().query(selectedImage, filePathColumn, null, null, null);
                cursor.moveToFirst();
                int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
                String filePath = cursor.getString(columnIndex);
                cursor.close();

                if(bmp != null && !bmp.isRecycled())
                {
                    bmp = null;
                }

                bmp = BitmapFactory.decodeFile(filePath);
               // ImgVw_AddtnlDtls.setBackgroundResource(0);
                ImgVw_AddtnlDtls.setImageBitmap(bmp);
            }
            else
            {
                Toast.makeText(getActivity(), "Photo pick Cancelled", Toast.LENGTH_SHORT).show();
            }
        }*//*

    }*/
}
