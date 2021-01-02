package com.example.caculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HePhuongTrinhActivity extends AppCompatActivity {

    Button btnGiai;
    TextView txtX, txtY, txtKQ;
    EditText a,b,c,d,e,f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hephuongtrinh);
        Init();
    }
    public void Init(){
btnGiai = findViewById(R.id.btnGiaiHePT);
txtX = findViewById(R.id.txtkqX);
txtY = findViewById(R.id.txtkqY);
txtKQ = findViewById(R.id.txtkqThongBao);
a = findViewById(R.id.txtA);
b = findViewById(R.id.txtB);
c = findViewById(R.id.txtC);
d = findViewById(R.id.txtD);
e = findViewById(R.id.txtE);
f = findViewById(R.id.txtF);

double dx, dy, d;
 /*
 *  d = a*e - d*b
    dx = e*c - f*b
    dy = a*f - d*c */


    }
}
