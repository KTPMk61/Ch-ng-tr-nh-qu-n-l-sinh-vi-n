package com.example.hoadang.sinhvien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ActivityLoginSV extends AppCompatActivity {

    private EditText edit_mssv;
    private EditText edit_pass;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sv);

        edit_mssv = (EditText)findViewById(R.id.edit_mssv);
        edit_pass = (EditText)findViewById(R.id.edit_pass);
        btn_login = (Button)findViewById(R.id.btn_login);

    }
}
