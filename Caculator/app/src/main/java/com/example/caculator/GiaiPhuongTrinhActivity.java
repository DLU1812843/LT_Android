package com.example.caculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GiaiPhuongTrinhActivity extends AppCompatActivity {
    EditText txtInputA, txtInputB, txtInputC;
    Button btnOK;
    TextView txtThongBao, txtX1, txtX2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giaiphuongtrinh);
        Init();
    }

    public void Init()
    {
        txtInputA = findViewById(R.id.txtInputA);
        txtInputB = findViewById(R.id.txtInputB);
        txtInputC = findViewById(R.id.txtInputC);
        txtThongBao = findViewById(R.id.txtGo);
        txtX1 = findViewById(R.id.txtX1);
        txtX2 = findViewById(R.id.txtX2);
        btnOK = findViewById(R.id.btnChange);

              btnOK.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      if (txtInputA.getText().toString().isEmpty())
                          txtInputA.setError("Chưa nhập A");
                      if (txtInputB.getText().toString().isEmpty())
                          txtInputB.setError("Chưa nhập B");
                      if (txtInputC.getText().toString().isEmpty())
                          txtInputC.setError("Chưa nhập C");
                      else {

                          double delta;
                          int a,b,c;
                          a = Integer.parseInt(txtInputA.getText().toString());
                          b = Integer.parseInt(txtInputB.getText().toString());
                          c = Integer.parseInt(txtInputC.getText().toString());
                          delta = b*b - 4*a*c;
                          if (delta < 0) {
                              txtThongBao.setText("Phương trình vô nghiệm");
                              txtX1.setText("X1: vô nghiệm");
                              txtX2.setText("X2: vô nghiệm");
                          } else if (delta == 0) {
                              txtThongBao.setText("Phương trình có nghiệm kép");
                              txtX1.setText("X1 = " + (-b / (2 * a)));
                              txtX2.setText("X2 = " + (-b / (2 * a)));
                          } else {
                              txtThongBao.setText("Phương trình có 2 nghiệm phân biệt");
                              txtX1.setText("X1 = " + (-b + Math.sqrt(delta)) / (2 * a));
                              txtX2.setText("X2 = " + (-b - Math.sqrt(delta)) / (2 * a));
                          }
                      }
                  }
              });
    }
}
