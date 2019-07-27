package com.getconmedia.getkarigar.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.getconmedia.getkarigar.R;

public class OTPActivity extends AppCompatActivity
{

    EditText eText_SendOtp;
    Button btn_Submit,btn_Resend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        eText_SendOtp=findViewById(R.id.et_otp_otpactivity);

        btn_Submit=findViewById(R.id.btn_Submit_Otp);
        btn_Resend=findViewById(R.id.btn_Resend_Otp);


        btn_Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               /* Intent intent=new Intent(OTPActivity.this, Home_BottomNavigationActivity.class);
                startActivity(intent);*/

               Intent intent=new Intent(OTPActivity.this, NavigationDrawerActivity_Vendor.class);
               startActivity(intent);
            }
        });

         btn_Resend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

            }
        });

    }


}
