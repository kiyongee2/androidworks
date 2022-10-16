package com.example.hiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

    private TextView text1;
    private ToggleButton toggleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        //객체 생성
        text1 = findViewById(R.id.text1);
        toggleBtn = findViewById(R.id.toggleBtn);

        toggleBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String toastMsg;
                if(b){
                    text1.setText("안녕하세요");
                    toastMsg = "Toggle On!";
                }else{
                    text1.setText("Hello");
                    toastMsg = "Toggle Off!";
                }
                Toast.makeText(ToggleButtonActivity.this, toastMsg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}