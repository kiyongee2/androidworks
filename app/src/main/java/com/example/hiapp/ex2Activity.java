package com.example.hiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ex2Activity extends AppCompatActivity {

    private EditText editText;
    private Button btnSubmit;
    private TextView tvStr;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2);

        //객체 생성
        editText = findViewById(R.id.editText);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvStr = findViewById(R.id.tvStr);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = editText.getText().toString();
                tvStr.setText(str);
            }
        });
    }
}