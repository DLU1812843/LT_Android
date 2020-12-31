package com.example.lab03_bai04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Locale mLocale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitControl();
    }
    public void setLocale(String lang) {

        mLocale = new Locale(lang);
        Resources resources = getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = mLocale;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        startActivity( new Intent(this, MainActivity.class));
    }
    private void InitControl()
    {

        TextView tvHello, tvVietNam, tvEnglish, tvFrance, tvSignUP;
        Button btnLogIn;
        EditText txtUser, txtPassword;
                tvHello = findViewById(R.id.tvHello);
        tvVietNam = findViewById(R.id.tvVietnam);
        tvEnglish = findViewById(R.id.tvEnglish);
        tvFrance = findViewById(R.id.tvFrance);
        tvSignUP = findViewById(R.id.tvSignUp);
        txtUser  = findViewById(R.id.txtUser);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogIn  = findViewById( R.id.btnLogIn);

        tvVietNam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("vi");
            }
        });
        tvEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("en");
            }
        });
        tvFrance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("fr");
            }
        });
    }
}