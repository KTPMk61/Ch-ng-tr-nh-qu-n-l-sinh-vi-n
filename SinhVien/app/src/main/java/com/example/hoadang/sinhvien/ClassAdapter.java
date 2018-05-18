package com.example.hoadang.sinhvien;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

public class ClassAdapter extends BaseAdapter {

    private Context context;
    public ClassAdapter(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return 50;
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
            view = LayoutInflater.from(context).inflate(R.layout.item_class,null);
            holder = new Holder();
            holder.edit_mssv = (EditText) view.findViewById(R.id.edit_mssv);
            holder.edit_name = (EditText) view.findViewById(R.id.edit_name);
            holder.edit_gk = (EditText) view.findViewById(R.id.edit_gk);
            holder.edit_ck = (EditText) view.findViewById(R.id.edit_ck);
            holder.edit_tk = (EditText) view.findViewById(R.id.edit_tk);

        }
        else holder = (Holder) view.getTag();
        return view;
    }

    private class Holder{
        EditText edit_mssv;
        EditText edit_name;
        EditText edit_gk;
        EditText edit_ck;
        EditText edit_tk;
    }
}
