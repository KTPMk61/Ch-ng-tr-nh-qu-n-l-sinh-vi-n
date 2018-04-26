package com.example.hoadang.sinhvien;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeaActivity extends AppCompatActivity {

    private Button btn_dangnhap;
    private Button btn_dangki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tea);

        btn_dangki = (Button) findViewById(R.id.btn_dangki);
        btn_dangnhap = (Button) findViewById(R.id.btn_dangnhap);

        btn_dangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeaActivity.this, ActivitySignin.class);
                startActivity(intent);
            }
        });

        btn_dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeaActivity.this, ActivityLogin.class);
                startActivity(intent);

            }
        });

    }
}
