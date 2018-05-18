package com.example.hoadang.sinhvien;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SVActivity extends AppCompatActivity {

    private Button btn_class;
    private Button btn_point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sv);

        btn_class = (Button) findViewById(R.id.btn_class);
        btn_point = (Button) findViewById(R.id.btn_point);

        btn_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SVActivity.this,DSClassActivity.class );
                startActivity(intent);
            }
        });
    }
}
