package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTinhToan;
    Button btnLuongGiac;
    Button btnChuyenDoi;
    Button btnChuyenDoiHeSo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
    }
    void Init(){
        btnTinhToan = findViewById(R.id.btnTinhToan);
        btnLuongGiac = findViewById(R.id.btnLuongGiac);
        btnChuyenDoi = findViewById(R.id.btnChuyenDoi);
        btnChuyenDoiHeSo = findViewById(R.id.btnChuyenDoiHeSo);

        btnTinhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TinhToanActivity.class);
                startActivity(intent);
            }
        });
        btnLuongGiac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GiaiPhuongTrinhActivity.class);
                startActivity(intent);
            }
        });
        btnChuyenDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChuyenDoiActivity.class);
                startActivity(intent);
            }
        });
    }
}