package com.example.bai03;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class DrawActivity extends Activity implements View.OnClickListener {

    private DrawerView myDrawView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myDrawView = (DrawerView) findViewById(R.id.draw);
        View btnGreen = (ImageView) findViewById(R.id.green);
        View btnBlue = (ImageView)findViewById(R.id.blue);
        View btnOrange = (ImageView)findViewById(R.id.orange);
        View btnRed = (ImageView)findViewById(R.id.red);
        View btnBlack = (ImageView)findViewById(R.id.black);
        View btnClear = (Button)findViewById(R.id.clear);


        btnGreen.setOnClickListener(this);
        btnBlack.setOnClickListener(this);
        btnRed.setOnClickListener(this);
        btnBlue.setOnClickListener(this);
        btnOrange.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.red:

                myDrawView.setPathColor(Color.RED);
                break;

            case R.id.blue:
                myDrawView.setPathColor(Color.BLUE);
                break;

            case R.id.green:
                myDrawView.setPathColor(Color.GREEN);
                break;

            case R.id.black:
                myDrawView.setPathColor(Color.BLACK);
                break;

            case R.id.orange:
                myDrawView.setPathColor(Color.rgb(255, 153, 0));
                break;

            case R.id.clear:
                myDrawView.clear();
                Toast.makeText(this, "Screen cleared!", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }
}