package com.example.hoadang.sinhvien;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_std;
    private Button btn_tea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_std = (Button)findViewById(R.id.btn_std);
        btn_tea = (Button)findViewById(R.id.btn_tea);

        btn_std.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this,ActivityLoginSV.class);
                startActivity(intent);

            }
        });

        btn_tea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TeaActivity.class);
                startActivity(intent);
            }
        });

     }
}
