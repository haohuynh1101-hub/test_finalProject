package com.example.recycle_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView completeTextView;
    ArrayAdapter<String> arrAdapter;
    String[] provinces={"Ho Chi Minh","Ha Noi","Cao Bang","Ca Mau","Lang Son","Quang Nam"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
//        loadData();
    }

    private void loadData() {
        arrAdapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1);
        ((ArrayAdapter) arrAdapter).addAll(getResources().getStringArray(R.array.arr_province));

        completeTextView.setAdapter(arrAdapter);
    }

    private void addControls() {
        completeTextView=findViewById(R.id.autoComplete);
    }


}