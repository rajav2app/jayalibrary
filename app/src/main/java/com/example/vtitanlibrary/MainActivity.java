package com.example.vtitanlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mylibrary.DateTimeFunctions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvTime=findViewById(R.id.tvTime);

        String date= DateTimeFunctions.secondsToDateTime(System.currentTimeMillis());
        tvTime.setText(date);
    }
}