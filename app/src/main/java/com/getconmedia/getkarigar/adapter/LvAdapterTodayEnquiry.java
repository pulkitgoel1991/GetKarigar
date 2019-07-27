package com.getconmedia.getkarigar.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.getconmedia.getkarigar.R;

import java.util.ArrayList;

public class LvAdapterTodayEnquiry extends BaseAdapter
{
    public ArrayList<ModelListTodayEnquiry> todayEnquirieslist;
    Activity activity;

    public LvAdapterTodayEnquiry( Activity activity, ArrayList<ModelListTodayEnquiry> todayEnquirieslist) {
        super();
        this.todayEnquirieslist = todayEnquirieslist;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return todayEnquirieslist.size();
    }

    @Override
    public Object getItem(int position) {
        return todayEnquirieslist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder{
        TextView txt_Date_todayEnquiry;
        TextView txt_CategoryName_todayEnquiry;
        TextView txt_Name_todayEnquiry;
        TextView txt_MobileNumber_todayEnquiry;
        TextView txt_Email_todayEnquiry;
        TextView txt_Message_todayEnquiry;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder holder;
        LayoutInflater inflater=activity.getLayoutInflater();

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.listview_row_todayenquiry, null);
            holder=new ViewHolder();
            holder.txt_Date_todayEnquiry = convertView.findViewById(R.id.date_todayenquiry);
            holder.txt_CategoryName_todayEnquiry =convertView.findViewById(R.id.categoryname_todayEnq);
            holder.txt_Name_todayEnquiry = convertView.findViewById(R.id.name_todayEnq);
            holder.txt_MobileNumber_todayEnquiry =convertView.findViewById(R.id.mobileNo_todayEnq);
            holder.txt_Email_todayEnquiry=convertView.findViewById(R.id.email_todayEnq);
            holder.txt_Message_todayEnquiry=convertView.findViewById(R.id.message_todayEnq);

            convertView.setTag(holder);
        } else {

            holder= (ViewHolder) convertView.getTag();
        }

        ModelListTodayEnquiry item=todayEnquirieslist.get(position);
        holder.txt_Date_todayEnquiry.setText(item.getDate().toString());
        holder.txt_CategoryName_todayEnquiry.setText(item.getCategory_name().toString());
        holder.txt_Name_todayEnquiry.setText(item.getName().toString());
        holder.txt_MobileNumber_todayEnquiry.setText(item.getMobileNumber().toString());
        holder.txt_Email_todayEnquiry.setText(item.getEmail().toString());
        holder.txt_Message_todayEnquiry.setText(item.getMessage().toString());


        return convertView;
    }
}
