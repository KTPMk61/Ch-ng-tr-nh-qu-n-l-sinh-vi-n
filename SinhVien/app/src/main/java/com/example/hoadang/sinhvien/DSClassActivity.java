package com.example.hoadang.sinhvien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class DSClassActivity extends AppCompatActivity {

    private TextView class_name;
    private ListView listSV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsclass);

        class_name =(TextView) findViewById(R.id.class_name);
        listSV = (ListView) findViewById(R.id.listSV);

        aDapter adapter = new aDapter(DSClassActivity.this);
        listSV.setAdapter(adapter);

    }
}
