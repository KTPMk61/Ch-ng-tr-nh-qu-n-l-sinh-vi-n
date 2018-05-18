package com.example.hoadang.sinhvien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class AddClassActivity extends AppCompatActivity {

    private ListView listsv;
    private Button btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_class);

        listsv = (ListView) findViewById(R.id.listsv);
        btn_save = (Button) findViewById(R.id.btn_save);

        ClassAdapter adapter = new ClassAdapter(AddClassActivity.this);
        listsv.setAdapter(adapter);

    }
}
