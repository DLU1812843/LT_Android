package com.example.caculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChuyenDoiHeSoActivity extends AppCompatActivity {
    RadioButton rd2to10, rd2to16, rd10to2, rd10to16, rd16to2, rd16to10;
    Button btnChuyenDoi;
    TextView lblOutput;
    EditText txtInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyendoiheso);
        Init();
    }
    public  void Init() {
        rd2to10 = findViewById(R.id.rdBinToDec);
        rd2to16 = findViewById(R.id.rdBinToHex);
        rd10to2 = findViewById(R.id.rdDecToBin);
        rd10to16 = findViewById(R.id.rdDecToHex);
        rd16to2 = findViewById(R.id.rdHexToBin);
        rd16to10 = findViewById(R.id.rdHexToDec);
        btnChuyenDoi = findViewById(R.id.btnChuyenDoi);
        txtInput = findViewById(R.id.txtNhapInput);
        lblOutput = findViewById(R.id.lblOutput);

        btnChuyenDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rd2to10.isChecked())
                {
                    String binaryString = txtInput.getText().toString();

                    lblOutput.setText(Integer.parseInt(binaryString,2));
                }
                if (rd10to2.isChecked())
                {
                    int x = Integer.parseInt(txtInput.getText().toString());
                    lblOutput.setText(Integer.toBinaryString(x));
                }
                if (rd10to16.isChecked())
                {
                    int x = Integer.parseInt(txtInput.getText().toString());
                    lblOutput.setText(Integer.toHexString(x));
                }


            }
        });

    }
}
