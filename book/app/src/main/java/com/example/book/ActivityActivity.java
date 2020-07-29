package com.example.book;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityActivity extends AppCompatActivity {

    private TextView act_oval1, act_oval2, act_oval3, act_oval4, act_oval5, act_oval6, act_oval7, act_oval8, act_oval9, act_oval10;
    private TextView act_oval11, act_oval12, act_oval13, act_oval14, act_oval15, act_oval16, act_oval17, act_oval18, act_oval19, act_oval20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("활동");
        setContentView(R.layout.activity_activity);


        act_oval1 = findViewById(R.id.act_oval1);
        act_oval2 = findViewById(R.id.act_oval2);
        act_oval3 = findViewById(R.id.act_oval3);
        act_oval4 = findViewById(R.id.act_oval4);
        act_oval5 = findViewById(R.id.act_oval5);
        act_oval6 = findViewById(R.id.act_oval6);
        act_oval7 = findViewById(R.id.act_oval7);
        act_oval8 = findViewById(R.id.act_oval8);
        act_oval9 = findViewById(R.id.act_oval9);
        act_oval10 = findViewById(R.id.act_oval10);
        act_oval11 = findViewById(R.id.act_oval11);
        act_oval12 = findViewById(R.id.act_oval12);
        act_oval13 = findViewById(R.id.act_oval13);
        act_oval14 = findViewById(R.id.act_oval14);
        act_oval15 = findViewById(R.id.act_oval15);
        act_oval16 = findViewById(R.id.act_oval16);
        act_oval17 = findViewById(R.id.act_oval17);
        act_oval18 = findViewById(R.id.act_oval18);
        act_oval19 = findViewById(R.id.act_oval19);
        act_oval20 = findViewById(R.id.act_oval20);


    }
}