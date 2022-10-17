package com.example.hiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class visibleActivity2 extends AppCompatActivity
    implements View.OnClickListener{

    Button btnTrue;
    Button btnFalse;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visible2);

        //객체 생성
        btnTrue = findViewById(R.id.btn_vis_true);
        btnFalse = findViewById(R.id.btn_vis_false);
        textView = findViewById(R.id.text1);

        //이벤트 등록
        btnTrue.setOnClickListener(this);
        btnFalse.setOnClickListener(this);
    }

    //버튼 이벤트 콜백 함수
    @Override
    public void onClick(View view) {
        if (view == btnTrue) {
            textView.setVisibility(View.VISIBLE);
        } else if (view == btnFalse) {
            textView.setVisibility(View.INVISIBLE);
        }
    }
}