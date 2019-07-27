package com.getconmedia.getkarigar.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.getconmedia.getkarigar.R;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter
{
    public ArrayList<ModelListCustom> latestenquirylist;
    Activity activity;

    public ListViewAdapter(Activity activity,ArrayList<ModelListCustom> latestenquirylist)
    {
        super();
        this.activity=activity;
        this.latestenquirylist=latestenquirylist;
    }


    @Override
    public int getCount() {
        return latestenquirylist.size();
    }

    @Override
    public Object getItem(int position) {
        return latestenquirylist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder {
        TextView txt_Date;
        TextView txt_CntctPerson;
        TextView txt_Mobile;
        TextView txt_Message;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder holder;
        LayoutInflater inflater = activity.getLayoutInflater();

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.listvie_row, null);
            holder = new ViewHolder();
            holder.txt_Date = (TextView) convertView.findViewById(R.id.custom_date);
            holder.txt_CntctPerson = (TextView) convertView.findViewById(R.id.custom_contactPerson);
            holder.txt_Mobile = (TextView) convertView
                    .findViewById(R.id.custom_mobile);
            holder.txt_Message = (TextView) convertView.findViewById(R.id.custom_message);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        ModelListCustom item = latestenquirylist.get(position);
        holder.txt_Date.setText(item.getDate().toString());
        holder.txt_CntctPerson.setText(item.getContact_person().toString());
        holder.txt_Mobile.setText(item.getMobile().toString());
        holder.txt_Message.setText(item.getMessage().toString());


        return convertView;
    }
}
