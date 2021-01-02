package com.example.caculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChuyenDoiHeSoActivity extends AppCompatActivity {
    EditText txtInput;
    Button btnChange;
    TextView lblOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyendoiheso);
        Init();
    }
    public  void Init()
    {
      //  txtInput = findViewById(R.id.txtInput);
      //  lblOutput = findViewById(R.id.lblOutput);
        btnChange = findViewById(R.id.btnChange);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int decimal = Integer.parseInt(txtInput.getText().toString()) ;
                lblOutput.setText(Integer.toBinaryString(decimal));
            }
        });

    }
}
