package com.example.hoadang.sinhvien;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ClassActivity extends AppCompatActivity {

    private ListView listClass;
    private Button btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);

        String array[] = {"hoa", "nam", "dong"};

        listClass = (ListView) findViewById(R.id.listClass);
        btn_add = (Button) findViewById(R.id.btn_class);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array);

        listClass.setAdapter(adapter);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClassActivity.this, ThemlopActivity.class);
                startActivity(intent);
            }
        });
    }
}
