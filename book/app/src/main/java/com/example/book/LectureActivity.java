package com.example.book;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LectureActivity extends AppCompatActivity {

    private TextView lec_oval1, lec_oval2, lec_oval3, lec_oval4, lec_oval5, lec_oval6, lec_oval7, lec_oval8, lec_oval9, lec_oval10;
    private TextView lec_oval11, lec_oval12, lec_oval13, lec_oval14, lec_oval15, lec_oval16, lec_oval17, lec_oval18, lec_oval19, lec_oval20;

    private TextView lecture_name_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("특강");
        setContentView(R.layout.activity_lecture);

        Intent intent = getIntent();
        String user_name = intent.getExtras().getString("user_name");

        lecture_name_title = findViewById(R.id.lecture_name_title);
        lecture_name_title.setText(user_name+ "의 특강 Stamp");

        lec_oval1 = findViewById(R.id.lec_oval1);
        lec_oval2 = findViewById(R.id.lec_oval2);
        lec_oval3 = findViewById(R.id.lec_oval3);
        lec_oval4 = findViewById(R.id.lec_oval4);
        lec_oval5 = findViewById(R.id.lec_oval5);
        lec_oval6 = findViewById(R.id.lec_oval6);
        lec_oval7 = findViewById(R.id.lec_oval7);
        lec_oval8 = findViewById(R.id.lec_oval8);
        lec_oval9 = findViewById(R.id.lec_oval9);
        lec_oval10 = findViewById(R.id.lec_oval10);
        lec_oval11 = findViewById(R.id.lec_oval11);
        lec_oval12 = findViewById(R.id.lec_oval12);
        lec_oval13 = findViewById(R.id.lec_oval13);
        lec_oval14 = findViewById(R.id.lec_oval14);
        lec_oval15 = findViewById(R.id.lec_oval15);
        lec_oval16 = findViewById(R.id.lec_oval16);
        lec_oval17 = findViewById(R.id.lec_oval17);
        lec_oval18 = findViewById(R.id.lec_oval18);
        lec_oval19 = findViewById(R.id.lec_oval19);
        lec_oval20 = findViewById(R.id.lec_oval20);
    }
}