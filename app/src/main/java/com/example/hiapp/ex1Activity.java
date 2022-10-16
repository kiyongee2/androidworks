package com.example.hiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ex1Activity extends AppCompatActivity {

    private TextView text1;
    private Button btn1;
    private boolean state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);

        text1 = findViewById(R.id.text1);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("안녕하세요.");
                /*if(state){
                    text1.setText("안녕하세요");
                    state = true;
                }else{
                    text1.setText("Hello");
                    state = false;
                }*/
            }
        });
    }
}