package com.noluthando.myviewlistapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;



public class ListViewAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String [] proNames;
    private final int[] proImages;


    public ListViewAdapter(Activity context, String[] proNames, int[] proImages) {
        super(context,R.layout.activity_image_list, proNames);
        this.context = context;
        this.proNames = proNames;
        this.proImages = proImages;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.activity_image_list, null, true);
        TextView textView = (TextView) rowView.findViewById(R.id. textView2);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1);
        textView.setText(proNames[position]);
        imageView.setImageResource(proImages[position]);
        return rowView;
    };

}


