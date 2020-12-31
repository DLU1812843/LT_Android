package com.example.lab2_bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
    }
    private  void Init()
    {
        final ListView listView = findViewById(R.id.lvView);
        final Spinner spnGo = findViewById(R.id.spnGo);
        final TextView textView = findViewById(R.id.txtView);
        final GridView gridView = findViewById(R.id.grvView);
        final List<String> list = new ArrayList<>();
        list.add("Android");
        list.add("IOS");
        list.add("WindowsPhone");
        list.add("bOS");
        list.add("BlackBerry");
        list.add("Symbian");

        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spnGo.setAdapter(adapter);

        spnGo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               TextView go = (TextView)spnGo.getSelectedView();
               String result = go.getText().toString();
               textView.setText(result);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

            ArrayAdapter adapterListView = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_2,android.R.id.text1,list);
            listView.setAdapter(adapterListView);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                   TextView item = (TextView) listView.getSelectedItem();
                   String result = item.getText().toString();
                   textView.setText(result);
                }

            });

    }
}