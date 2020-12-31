package com.example.caculator;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChuyenDoiActivity extends AppCompatActivity {

    private String[] length = {
            "km", "hm", "dam", "m", "dm", "cm", "mm", "nm", "um"
    };

    private double[][] ratio = {
            {1,	10,	100,	1000,	10000,	100000	,100000,	1E+12,	1000000000},
            {0.1	,1,	10	,100	,1000	,10000	,100000	,1E+11	,100000000},
            {0.01,	0.1,	1,	10,	100,	1000,	10000,	1E+10,	10000000},
            {0.001,	0.01,	0.1,	1,	10,	100,	1000,	1000000000,	1000000},
            {0.0001,	0.001,	0.01,	0.1,	1,	10,	100,	100000000,	100000},
            {0.00001,	0.0001,	0.001,	0.01,	0.1,	1,	10,	10000000,	10000},
            {0.000001,	0.00001,	0.0001,	0.001,	0.01,	0.1	,1,	1000000,	1000},
            {1.00E-12,	1E-13,	1E-14,	1E-15,	1E-16,	1E-17,	1E-18,	1	,0,001},
            {1.00E-09,	1E-10,	1E-11,	1E-12,	1E-13,	1E-14,	1E-15,	1000,	1}
    };

    private EditText txtNumber;
    private Spinner spnUnits;
    private TextView[] lblResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyendoi);

        initControl();
    }

    private void initControl() {
        txtNumber = this.<EditText>findViewById(R.id.txtNumber);
        spnUnits = this.<Spinner>findViewById(R.id.spnUnit);
        lblResults = new TextView[] {
                findViewById(R.id.lblkm),
                findViewById(R.id.lblhm),
                findViewById(R.id.lbldam),
                findViewById(R.id.lblm),
                findViewById(R.id.lbldm),
                findViewById(R.id.lblcm),
                findViewById(R.id.lblmm),
                findViewById(R.id.lblnm),
                findViewById(R.id.lblum),
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                ChuyenDoiActivity.this, R.layout.support_simple_spinner_dropdown_item, length
        );

        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        spnUnits.setAdapter(adapter);

        spnUnits.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                changeLengthUnit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });

        txtNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                changeLengthUnit();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    private void changeLengthUnit() {
        int rowIdx = spnUnits.getSelectedItemPosition();

        if (rowIdx < 0) rowIdx = 0;

        String input = txtNumber.getText().toString();

        if (input.isEmpty()) input="0";

        double number = Double.valueOf(input);

        for (int i = 0; i < lblResults.length; i++) {
            double temp = number * ratio[rowIdx][i];

            lblResults[i].setText(String.valueOf(temp));
        }
    }
}
