package com.example.book;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class JournalActivity extends AppCompatActivity {

    private TextView jou_oval1, jou_oval2, jou_oval3, jou_oval4, jou_oval5, jou_oval6, jou_oval7, jou_oval8, jou_oval9, jou_oval10;
    private TextView jou_oval11, jou_oval12, jou_oval13, jou_oval14, jou_oval15, jou_oval16, jou_oval17, jou_oval18, jou_oval19, jou_oval20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("논문 및 홍보, 모집");
        setContentView(R.layout.activity_journal);

        jou_oval1 = findViewById(R.id.jou_oval1);
        jou_oval2 = findViewById(R.id.jou_oval2);
        jou_oval3 = findViewById(R.id.jou_oval3);
        jou_oval4 = findViewById(R.id.jou_oval4);
        jou_oval5 = findViewById(R.id.jou_oval5);
        jou_oval6 = findViewById(R.id.jou_oval6);
        jou_oval7 = findViewById(R.id.jou_oval7);
        jou_oval8 = findViewById(R.id.jou_oval8);
        jou_oval9 = findViewById(R.id.jou_oval9);
        jou_oval10 = findViewById(R.id.jou_oval10);
        jou_oval11 = findViewById(R.id.jou_oval11);
        jou_oval12 = findViewById(R.id.jou_oval12);
        jou_oval13 = findViewById(R.id.jou_oval13);
        jou_oval14 = findViewById(R.id.jou_oval14);
        jou_oval15 = findViewById(R.id.jou_oval15);
        jou_oval16 = findViewById(R.id.jou_oval16);
        jou_oval17 = findViewById(R.id.jou_oval17);
        jou_oval18 = findViewById(R.id.jou_oval18);
        jou_oval19 = findViewById(R.id.jou_oval19);
        jou_oval20 = findViewById(R.id.jou_oval20);
    }
}