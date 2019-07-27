package com.getconmedia.getkarigar.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.getconmedia.getkarigar.R;

public class MyAdapterProfileFrg extends RecyclerView.Adapter<MyAdapterProfileFrg.MyViewHolder>
{
    Activity activity;
    String Profile[];

    public MyAdapterProfileFrg(Activity activity, String[] profile)
    {
        this.activity = activity;
        Profile = profile;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View view=activity.getLayoutInflater().inflate(R.layout.custom_profilefrgmt,viewGroup,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i)
    {
        myViewHolder.textView.setText(Profile[i]);

    }

    @Override
    public int getItemCount() {
        return Profile.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView;
        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            textView=itemView.findViewById(R.id.textview_profileFrgmnt);
        }
    }
}
