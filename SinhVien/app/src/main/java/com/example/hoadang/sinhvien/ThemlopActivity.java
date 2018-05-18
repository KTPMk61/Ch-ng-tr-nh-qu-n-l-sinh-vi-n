package com.example.hoadang.sinhvien;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThemlopActivity extends AppCompatActivity {
    private EditText edit_hp;
    private EditText edit_class;
    private EditText edit_code;
    private Button btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themlop);

        edit_class = (EditText) findViewById(R.id.edit_class);
        edit_code = (EditText) findViewById(R.id.edit_code);
        edit_hp = (EditText) findViewById(R.id.edit_hp);
        btn_add = (Button) findViewById(R.id.btn_add);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThemlopActivity.this, AddClassActivity.class);
                startActivity(intent);
            }
        });
    }
}
