package com.example.caculator;

import android.os.Bundle;
import android.view.View;
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
        btnGiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a.getText().toString().isEmpty())
                    a.setError("Chưa nhập A");
                if (b.getText().toString().isEmpty())
                    b.setError("Chưa nhập B");
                if (c.getText().toString().isEmpty())
                    c.setError("Chưa nhập C");
                if (d.getText().toString().isEmpty())
                    d.setError("Chưa nhập A");
                if (e.getText().toString().isEmpty())
                    e.setError("Chưa nhập B");
                if (f.getText().toString().isEmpty())
                    f.setError("Chưa nhập C");
                else {
                    double dx, dy, dd;
 /*
 *  d = a*e - d*b
    dx = e*c - f*b
    dy = a*f - d*c */
                    dd = Integer.parseInt(a.getText().toString())*Integer.parseInt(e.getText().toString())
                            - Integer.parseInt(d.getText().toString())*Integer.parseInt(b.getText().toString());
                    dx = Integer.parseInt(e.getText().toString())*Integer.parseInt(c.getText().toString())
                            - Integer.parseInt(f.getText().toString())*Integer.parseInt(b.getText().toString());
                    dy = Integer.parseInt(a.getText().toString())*Integer.parseInt(f.getText().toString())
                            - Integer.parseInt(d.getText().toString())*Integer.parseInt(c.getText().toString());
                    if (dd==0) {
                        if (dx+dy==0)
                            txtKQ.setText("Hệ phương trình có vô số nghiệm!");
                        else
                            txtKQ.setText("Hệ phương trình vô nghiệm!");

                    }
                    else
                    {
                        txtKQ.setText("Hệ phương trình có nghiệm:");
                        txtX.setText(txtX.getText().toString() + dx/dd);
                        txtY.setText(txtY.getText().toString() + dy/dd);

                    }
                }
            }
        });

    }
}
