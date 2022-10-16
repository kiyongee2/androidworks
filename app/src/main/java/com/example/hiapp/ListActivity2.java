package com.example.hiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity2 extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);

        list = findViewById(R.id.list);

        List<String> data = new ArrayList<>();

        //adapter 생성
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, data);

        list.setAdapter(adapter);
        data.add("봄");
        data.add("여름");
        data.add("가을");
        data.add("겨울");
        adapter.notifyDataSetChanged();  //data 저장 완료
    }
}