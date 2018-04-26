package com.example.hoadang.sinhvien;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityLogin extends AppCompatActivity {

    private EditText edit_user;
    private EditText edit_password;
    private Button btn_login;
    private Button btn_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edit_user = (EditText)findViewById(R.id.edit_user);
        edit_password = (EditText)findViewById(R.id.edit_password);
        btn_login = (Button)findViewById(R.id.btn_login);
        btn_signin = (Button)findViewById(R.id.btn_signin);

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLogin.this, ActivitySignin.class);
                startActivity(intent);
            }
        });
    }
}
