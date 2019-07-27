package com.getconmedia.getkarigar.activity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.getconmedia.getkarigar.R;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    EditText edit_MobileNumber;
    Button btn_GETOTP, btn_Skip;

    /*RequestQueue queue;
    String url;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_MobileNumber = findViewById(R.id.login_phoneNumber);
        btn_GETOTP = findViewById(R.id.btn_Submit_LoginPage);
        btn_Skip = findViewById(R.id.btn_Skip);


        /*queue = Volley.newRequestQueue(MainActivity.this);
        url = "https://www.google.com";*/

        btn_GETOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = edit_MobileNumber.getText().toString();

                //validations for mobile number
                if (phone.equals("")) {
                    edit_MobileNumber.setError("Please enter mobile number to proceed");
                } else if (phone.length() < 10) {
                    edit_MobileNumber.setError("Please enter a valid 10 digit mobile number");
                } else {
                    Intent intent = new Intent(MainActivity.this, OTPActivity.class);
                    startActivity(intent);
                }

            }
        });

        btn_Skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent=new Intent(MainActivity.this,
                                            NavigationDrawerActivity_Vendor.class);
                startActivity(intent);*/

               /* Intent intent=new Intent(MainActivity.this,ConnectivityReceiver.class);
                startActivity(intent);*/

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

                boolean status = cm.getActiveNetworkInfo() != null;

                if (status == true)
                {
                    Toast.makeText(MainActivity.this, ""+ status, Toast.LENGTH_SHORT).show();
                    /*JsonObjectRequest request= new JsonObjectRequest(Request.Method.GET,
                            url, null, new Response.Listener<JSONObject>()
                    {
                        @Override
                        public void onResponse(JSONObject response)
                        {

                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error)
                        {
                            Toast.makeText(MainActivity.this, ""+error, Toast.LENGTH_SHORT).show();

                        }
                    });

                    queue.add(request);*/
                }

                else
                    {

                     }

            }

        });

    }
}
