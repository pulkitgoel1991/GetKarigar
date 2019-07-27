package com.getconmedia.getkarigar.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.getconmedia.getkarigar.R;

import java.util.ArrayList;

public class MyAdapterViewPager extends PagerAdapter
{
    ArrayList<Integer> images;
    LayoutInflater inflater;

    public MyAdapterViewPager(Context context, ArrayList<Integer> images)
    {
        this.images=images;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object)
    {
        container.removeView((View) object);

    }

    @Override
    public int getCount() {
        return images.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position)
    {
        View view=inflater.inflate(R.layout.custom_viewpage_homefrgt_btmnvg,container,false);
        ImageView imageView=view.findViewById(R.id.imageview_viewpager);
        imageView.setImageResource(images.get(position));
        container.addView(view,0);
        return view;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }
}

