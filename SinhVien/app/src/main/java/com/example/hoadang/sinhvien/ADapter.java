package com.example.hoadang.sinhvien;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ADapter extends BaseAdapter {

    private Context context;

    public ADapter( Context context){
        this.context = context;
    }


    @Override
    public int getCount() {
        return 9;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        final Holder holder;
        View view = convertView;
        if(convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_view,null);
            holder = new Holder();
            holder.mssv = (TextView) view.findViewById(R.id.mssv);
            holder.date = (TextView) view.findViewById(R.id.date);
            holder.name = (TextView) view.findViewById(R.id.name);
            view.setTag(holder);
        }else {
            holder = (Holder) view.getTag();
        }
        return view;
    }
    private class Holder{
        TextView mssv;
        TextView name;
        TextView date;
    }
}
