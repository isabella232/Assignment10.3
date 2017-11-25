package com.niketgoel.assignment103;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by niketgoel on 25/11/17.
 */


public class CustomArrayAdapter extends ArrayAdapter<CustomList> {
    Context context;
    int layoutResourceId;
    CustomList data[] = null;

    public CustomArrayAdapter(Context context, int layoutResourceId, CustomList[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ArrayHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new ArrayHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
            holder.txtTitleDescription = (TextView)row.findViewById(R.id.txtTitleDescription);

            row.setTag(holder);
        }
        else
        {
            holder = (ArrayHolder)row.getTag();
        }

        CustomList androidVersion = data[position];
        holder.txtTitle.setText(androidVersion.title);
        holder.imgIcon.setImageResource(androidVersion.icon);
        holder.txtTitleDescription.setText(androidVersion.titleDescription);


        return row;
    }

    static class ArrayHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
        public TextView txtTitleDescription;
    }
}
