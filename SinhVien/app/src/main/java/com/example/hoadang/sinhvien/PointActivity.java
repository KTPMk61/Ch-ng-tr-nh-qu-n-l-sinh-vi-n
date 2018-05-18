package com.example.hoadang.sinhvien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class PointActivity extends AppCompatActivity {

    private ListView listPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point);

        listPoint = (ListView) findViewById(R.id.listPoint);
        PAdapter adapter = new PAdapter(PointActivity.this);

        listPoint.setAdapter(adapter);

    }
}
