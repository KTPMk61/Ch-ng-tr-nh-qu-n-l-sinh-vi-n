package com.example.hoadang.sinhvien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ActivitySignin extends AppCompatActivity {

    private EditText edit_name;
    private EditText edit_mail;
    private EditText edit_vien;
    private EditText edit_password;
    private EditText edit_password2;
    private EditText edit_date;
    private EditText edit_month;
    private EditText edit_year;
    private Button btn_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        edit_name = (EditText)findViewById(R.id.edit_name);
        edit_mail = (EditText) findViewById(R.id.edit_mail);
        edit_vien = (EditText)findViewById(R.id.edit_vien);
        edit_password = (EditText)findViewById(R.id.edit_password);
        edit_password2 = (EditText)findViewById(R.id.edit_password2);
        edit_date = (EditText)findViewById(R.id.edit_date);
        edit_month = (EditText)findViewById(R.id.edit_month);
        edit_year = (EditText)findViewById(R.id.edit_year);
        btn_signin= (Button) findViewById(R.id.btn_signin);

    }
}
