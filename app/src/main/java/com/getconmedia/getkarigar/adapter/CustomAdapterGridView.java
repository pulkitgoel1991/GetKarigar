package com.getconmedia.getkarigar.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.getconmedia.getkarigar.R;

public class CustomAdapterGridView extends BaseAdapter
{

    Context context;
    Integer pics_gridview[];
    String text_gridview[];
    LayoutInflater inflater;

    public CustomAdapterGridView(Context context, Integer[] pics_gridview,
                                 String[] text_gridview, LayoutInflater inflater)
    {
        this.context = context;
        this.pics_gridview = pics_gridview;
        this.text_gridview = text_gridview;
        this.inflater = inflater;
    }

    @Override
    public int getCount()
    {
        return pics_gridview.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        //inflating the layout
        View view=inflater.inflate(R.layout.custom_grid_btmnvghmfrg,parent,false);
        //getting the referece of imageview
        ImageView imageView=view.findViewById(R.id.image_grid_HmFrg_BtmNvg);
        //getting the referenve of textview
        TextView textView=view.findViewById(R.id.textview_gridHmFrg_BtmNvg);

            imageView.setImageResource(pics_gridview[position]);
            textView.setText(text_gridview[position]);
        return view;
    }
}
