package com.example.ramdomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
    }
    private void Init()
    {
        Button btnRandom = findViewById(R.id.btnRandom);
        final TextView txtShow = findViewById(R.id.txtShow);
        final EditText txtNum1 = findViewById(R.id.txtnum1);
        final EditText txtNum2 = findViewById(R.id.txtnum2);

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Random random = new Random();


                if (txtNum1.getText().toString().isEmpty())
                    txtNum1.setError("Chưa nhập MIN");
                if (txtNum2.length()==0)
                    txtNum2.setError("Chưa nhập MAX");
                else {
                    // kiểm tra empty 2 cái min MIN MAX trước rồi mới Parse
                    int number1 = Integer.parseInt(txtNum1.getText().toString());
                    int number2 = Integer.parseInt(txtNum2.getText().toString());
                    if (number1 >= number2)
                        Toast.makeText(MainActivity.this, "MIN phải nhỏ hơn MAX!!!", Toast.LENGTH_SHORT).show();
                    else if (number1 < number2) {
                        int result = random.nextInt(number2 + 1 - number1) + number1;
                        txtShow.setText("Random Number: " + String.valueOf(result));
                    }
                }
            }
        });
    }
}