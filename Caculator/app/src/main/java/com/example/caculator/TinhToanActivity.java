package com.example.caculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class TinhToanActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, enter, add, sub, mul, div, clear, sq, sqrt, answer;
    Button dec;
    TextView txt1, txt2;
    Double var1;
    Double var2;
    Double ans;
    Boolean addition = false, subtract = false, multiply = false, divide = false;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tinhtoan);
            b1 = findViewById(R.id.btn_1);
            b2 = findViewById(R.id.btn_2);
            b3 = findViewById(R.id.btn_3);
            b4 = findViewById(R.id.btn_4);
            b5 = findViewById(R.id.btn_5);
            b6 = findViewById(R.id.btn_6);
            b7 = findViewById(R.id.btn_7);
            b8 = findViewById(R.id.btn_8);
            b9 = findViewById(R.id.btn_9);
            b0 = findViewById(R.id.btn_0);
            answer = findViewById(R.id.btnAns);
            add = findViewById(R.id.btnPlus);
            sub = findViewById(R.id.btnMinus);
            mul = findViewById(R.id.btnMultiply);
            div = findViewById(R.id.btnDivide);
            sq = findViewById(R.id.btnPower);
            sqrt = findViewById(R.id.btnRoot);
            dec = findViewById(R.id.btnDecimal);
            enter = findViewById(R.id.btnEquals);
            clear = findViewById(R.id.btnClear);
            txt1 = findViewById(R.id.txtresult);
            txt2 = findViewById(R.id.txtformula);

             DisableButton();

answer.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        txt1.setText(txt2.getText()); EnableButton();
        sq.setBackgroundColor(getResources().getColor(R.color.purple_200));
        sqrt.setBackgroundColor(getResources().getColor(R.color.purple_200));
        add.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mul.setBackgroundColor(getResources().getColor(R.color.purple_200));
        sub.setBackgroundColor(getResources().getColor(R.color.purple_200));
        div.setBackgroundColor(getResources().getColor(R.color.purple_200));
    }
});
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txt1.setText(txt1.getText()+"1");
                    EnableButton();
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txt1.setText(txt1.getText()+"2");
                    EnableButton();
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txt1.setText(txt1.getText()+"3");EnableButton();
                }
            });b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txt1.setText(txt1.getText()+"4");EnableButton();
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txt1.setText(txt1.getText()+"5");EnableButton();
                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txt1.setText(txt1.getText()+"6");EnableButton();
                }
            });
            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txt1.setText(txt1.getText()+"7");EnableButton();
                }
            });
            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txt1.setText(txt1.getText()+"8");EnableButton();
                }
            });
            b9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txt1.setText(txt1.getText()+"9");EnableButton();
                }
            });
            b0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txt1.setText(txt1.getText()+"0");EnableButton();
                }
            });

            dec.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txt1.setText(txt1.getText()+".");
                }
            });

            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    setVar1();
                    colorChange(add);
                    buttonFalse();
                    addition = true;DisableButton();
                }
            });

            sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    setVar1();
                    colorChange(sub);
                    buttonFalse();
                    subtract = true;DisableButton();
                }
            });

            mul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    setVar1();
                    colorChange(mul);
                    buttonFalse();
                    multiply = true;DisableButton();
                }
            });

            div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    setVar1();
                    colorChange(div);
                    buttonFalse();
                    divide = true;DisableButton();
                }
            });

            sq.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    setVar1();
                    colorChange(sq);
                    ans = var1 * var1;
                    txt2.setText(ans.toString());
                    enter.setEnabled(false);
                    buttonFalse();
                    sqrt.setEnabled(false);
                }
            });

            sqrt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    setVar1();
                    colorChange(sqrt);
                    ans = Math.sqrt(var1);
                    txt2.setText(ans.toString());
                    enter.setEnabled(false);
                    buttonFalse();
                    sq.setEnabled(false);
                }
            });

            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    allReset();
                }
            });

            enter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    var2 = Double.parseDouble(txt1.getText().toString());
                    if(addition){
                        ans = var1 + var2;
                    } else if (subtract){
                        ans = var1 - var2;
                    } else if (multiply){
                        ans = var1 * var2;
                    } else if (divide){
                        if (var2==0){
                            Toast.makeText(getApplicationContext(),"Số chia phải khác 0",Toast.LENGTH_LONG).show();
                            ans = var1;
                        }
                        else ans = var1 / var2;
                    } else {
                        ans = ans + 0;
                    }
                    txt2.setText(ans.toString());
                    addition = false;
                    subtract = false;
                    multiply = false;
                    divide = false;
                    var1 = ans;
                    sq.setBackgroundColor(getResources().getColor(R.color.purple_200));
                    sqrt.setBackgroundColor(getResources().getColor(R.color.purple_200));

                    enter.setEnabled(false);
                    add.setEnabled(false);
                    sub.setEnabled(false);
                    div.setEnabled(false);
                    mul.setEnabled(false);
                    answer.setEnabled(true);
                }
            });
        }


        public void DisableButton(){
            add.setEnabled(false);
            sub.setEnabled(false);
            div.setEnabled(false);
            mul.setEnabled(false);
            sq.setEnabled(false);
            sqrt.setEnabled(false);
            enter.setEnabled(false);
            answer.setEnabled(false);
    }
    public void EnableButton(){
        add.setEnabled(true);
        sub.setEnabled(true);
        div.setEnabled(true);
        mul.setEnabled(true);
        sq.setEnabled(true);
        sqrt.setEnabled(true);
        enter.setEnabled(true);
    }
        public void buttonFalse(){
            sub.setEnabled(false);
            mul.setEnabled(false);
            div.setEnabled(false);
            add.setEnabled(false);
            txt1.setText("");

        }

        public void setVar1(){
            var1 = Double.parseDouble(txt1.getText().toString());
        }

        public void allReset(){
            sq.setBackgroundColor(getResources().getColor(R.color.purple_200));
            sqrt.setBackgroundColor(getResources().getColor(R.color.purple_200));
            add.setBackgroundColor(getResources().getColor(R.color.purple_200));
            mul.setBackgroundColor(getResources().getColor(R.color.purple_200));
            sub.setBackgroundColor(getResources().getColor(R.color.purple_200));
            div.setBackgroundColor(getResources().getColor(R.color.purple_200));


            enter.setEnabled(true);
            sub.setEnabled(true);
            mul.setEnabled(true);
            div.setEnabled(true);
            add.setEnabled(true);
            txt1.setText("");
            txt2.setText("");

            DisableButton();

        }

        public void colorChange(Button b){
            b.setBackgroundColor(getResources().getColor(R.color.purple_700));
        }
    }