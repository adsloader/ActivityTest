package com.example.park.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Intent i = getIntent();

        // 값이 없으면 리턴
        if (i == null) return;

        String sMessage = i.getStringExtra("message");
        setTitle(sMessage);
    }
}
