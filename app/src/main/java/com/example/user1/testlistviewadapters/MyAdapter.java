package com.example.user1.testlistviewadapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by Tolyan on 11.10.2016.
 */

public class MyAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<MyObject> data;
    private LayoutInflater inflater;

    MyAdapter(Context context, ArrayList<MyObject> data) {
        this.context = context;
        this.data = data;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        MyObject object = (MyObject) getItem(i);

        if (view == null) {
            view = inflater.inflate(R.layout.my_list_item, viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.textName1.setText(object.name1);
        viewHolder.textName2.setText(object.name2);
        viewHolder.checkBox1.setChecked(object.check1);
        viewHolder.checkBox1.setText(object.check1.toString());

        return view;
    }

    private class ViewHolder {
        TextView textName1;
        TextView textName2;
        CheckBox checkBox1;

        ViewHolder(View view) {
            textName1 = (TextView) view.findViewById(R.id.textName1);
            textName2 = (TextView) view.findViewById(R.id.textName2);
            checkBox1 = (CheckBox) view.findViewById(R.id.checkBox1);
        }
    }
}
