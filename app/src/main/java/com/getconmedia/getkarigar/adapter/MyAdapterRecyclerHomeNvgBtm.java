package com.getconmedia.getkarigar.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.getconmedia.getkarigar.R;

public class MyAdapterRecyclerHomeNvgBtm extends RecyclerView.Adapter<MyAdapterRecyclerHomeNvgBtm.MyViewHolder>
{
    Activity activity;
    Integer pics[];
    String text[];

    public MyAdapterRecyclerHomeNvgBtm(Activity activity, Integer[] pics, String[] text)
    {
        this.activity = activity;
        this.pics = pics;
        this.text = text;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View view=activity.getLayoutInflater().inflate(R.layout.custom_recycler_btmnvg,viewGroup,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i)
    {
        myViewHolder.imageView.setImageResource(pics[i]);
        myViewHolder.textView.setText(text[i]);

    }

    @Override
    public int getItemCount()
    {
        return pics.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            textView=itemView.findViewById(R.id.textview);
            imageView=itemView.findViewById(R.id.imageview);
        }
    }
}
