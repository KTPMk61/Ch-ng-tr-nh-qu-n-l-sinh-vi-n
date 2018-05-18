package com.example.hoadang.sinhvien;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.concurrent.TimeoutException;

public class PAdapter extends BaseAdapter {

    private Context context;

    public PAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return 15;
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
            view = LayoutInflater.from(context).inflate(R.layout.item_point,null);
            holder = new Holder();
            holder.maLop = (TextView)view.findViewById(R.id.maLop);
            holder.tenLop = (TextView) view.findViewById(R.id.tenlop);
            holder.gk = (TextView) view.findViewById(R.id.gk);
            holder.ck = (TextView) view.findViewById(R.id.ck);
            holder.tk = (TextView) view.findViewById(R.id.tk);
        }
        else holder = (Holder) view.getTag();
        return view;
    }

    private class Holder{
        TextView maLop;
        TextView tenLop;
        TextView gk,ck,tk;
    }
}
