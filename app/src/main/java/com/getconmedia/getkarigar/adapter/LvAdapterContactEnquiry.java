package com.getconmedia.getkarigar.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.getconmedia.getkarigar.R;

import java.util.ArrayList;

public class LvAdapterContactEnquiry extends BaseAdapter
{
    public ArrayList<ModelListContactEnquiry> contactEnquirieslist;
    Activity activity;

    public LvAdapterContactEnquiry(Activity activity,ArrayList<ModelListContactEnquiry> contactEnquirieslist)
    {
        super();
        this.activity=activity;
        this.contactEnquirieslist=contactEnquirieslist;
    }

    @Override
    public int getCount() {
        return contactEnquirieslist.size();
    }

    @Override
    public Object getItem(int position) {
        return contactEnquirieslist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder {
        TextView txt_Date;
        TextView txt_CategoryName;
        TextView txt_Name;
        TextView txt_MobileNumber;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder holder;
            LayoutInflater inflater=activity.getLayoutInflater();

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.listview_row_contactenquiry, null);
            holder=new ViewHolder();
            holder.txt_Date =convertView.findViewById(R.id.custom_date_contactEnquiry);
            holder.txt_CategoryName =convertView.findViewById(R.id.custom_categoryname_contactEnq);
            holder.txt_Name =  convertView
                    .findViewById(R.id.custom_name_contactEnq);
            holder.txt_MobileNumber =convertView.findViewById(R.id.custom_mobileNo_contactEnq);

            convertView.setTag(holder);
        } else {

            holder= (ViewHolder) convertView.getTag();
        }


        ModelListContactEnquiry item=contactEnquirieslist.get(position);
        holder.txt_Date.setText(item.getDate().toString());
        holder.txt_CategoryName.setText(item.getCategory_name().toString());
        holder.txt_Name.setText(item.getName().toString());
        holder.txt_MobileNumber.setText(item.getMobileNumber().toString());



        return convertView;
    }
}
