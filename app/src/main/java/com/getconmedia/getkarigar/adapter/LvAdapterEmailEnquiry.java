package com.getconmedia.getkarigar.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.getconmedia.getkarigar.R;

import java.util.ArrayList;

public class LvAdapterEmailEnquiry extends BaseAdapter
{
    public ArrayList<ModelListEmailEnquiry> emailEnquirieslist;
    Activity activity;

    public LvAdapterEmailEnquiry(Activity activity, ArrayList<ModelListEmailEnquiry> emailEnquirieslist )
    {
        super();
        this.activity = activity;
        this.emailEnquirieslist = emailEnquirieslist;

    }

    @Override
    public int getCount() {
        return emailEnquirieslist.size();
    }

    @Override
    public Object getItem(int position) {
        return emailEnquirieslist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder{
        TextView txt_Date_EmailEnquiry;
        TextView txt_CategoryName_EmailEnquiry;
        TextView txt_Name_EmailEnquiry;
        TextView txt_MobileNumber_EmailEnquiry;
        TextView txt_Email_EmailEnquiry;
        TextView txt_Message_EmailEnquiry;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder holder;
        LayoutInflater inflater=activity.getLayoutInflater();

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.listview_row_emailenquiry, null);
            holder=new ViewHolder();
            holder.txt_Date_EmailEnquiry = convertView.findViewById(R.id.custom_date_emailEnquiry);
            holder.txt_CategoryName_EmailEnquiry =convertView.findViewById(R.id.custom_categoryname_emailEnq);
            holder.txt_Name_EmailEnquiry = convertView.findViewById(R.id.custom_name_emailEnq);
            holder.txt_MobileNumber_EmailEnquiry =convertView.findViewById(R.id.custom_mobileNo_emailEnq);
            holder.txt_Email_EmailEnquiry=convertView.findViewById(R.id.custom_email_emailEnq);
            holder.txt_Message_EmailEnquiry=convertView.findViewById(R.id.custom_message_emailEnq);

            convertView.setTag(holder);
        } else {

            holder= (ViewHolder) convertView.getTag();
        }


        ModelListEmailEnquiry item=emailEnquirieslist.get(position);
        holder.txt_Date_EmailEnquiry.setText(item.getDate().toString());
        holder.txt_CategoryName_EmailEnquiry.setText(item.getCategory_name().toString());
        holder.txt_Name_EmailEnquiry.setText(item.getName().toString());
        holder.txt_MobileNumber_EmailEnquiry.setText(item.getMobileNumber().toString());
        holder.txt_Email_EmailEnquiry.setText(item.getEmail().toString());
        holder.txt_Message_EmailEnquiry.setText(item.getMessage().toString());

        return convertView;
    }
}
