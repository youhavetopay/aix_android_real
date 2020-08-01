package com.example.book;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EducationActivity extends AppCompatActivity {

    private TextView edu_oval1, edu_oval2, edu_oval3, edu_oval4, edu_oval5, edu_oval6, edu_oval7, edu_oval8, edu_oval9, edu_oval10;
    private TextView edu_oval11, edu_oval12, edu_oval13, edu_oval14, edu_oval15, edu_oval16, edu_oval17, edu_oval18, edu_oval19, edu_oval20;

    private TextView education_name_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("교육");
        setContentView(R.layout.activity_education);


        Intent intent = getIntent();
        String user_name = intent.getExtras().getString("user_name");

        education_name_title = findViewById(R.id.education_name_title);
        education_name_title.setText(user_name+"의 교육 Stamp");

        edu_oval1 = findViewById(R.id.edu_oval1);
        edu_oval2 = findViewById(R.id.edu_oval2);
        edu_oval3 = findViewById(R.id.edu_oval3);
        edu_oval4 = findViewById(R.id.edu_oval4);
        edu_oval5 = findViewById(R.id.edu_oval5);
        edu_oval6 = findViewById(R.id.edu_oval6);
        edu_oval7 = findViewById(R.id.edu_oval7);
        edu_oval8 = findViewById(R.id.edu_oval8);
        edu_oval9 = findViewById(R.id.edu_oval9);
        edu_oval10 = findViewById(R.id.edu_oval10);
        edu_oval11 = findViewById(R.id.edu_oval11);
        edu_oval12 = findViewById(R.id.edu_oval12);
        edu_oval13 = findViewById(R.id.edu_oval13);
        edu_oval14 = findViewById(R.id.edu_oval14);
        edu_oval15 = findViewById(R.id.edu_oval15);
        edu_oval16 = findViewById(R.id.edu_oval16);
        edu_oval17 = findViewById(R.id.edu_oval17);
        edu_oval18 = findViewById(R.id.edu_oval18);
        edu_oval19 = findViewById(R.id.edu_oval19);
        edu_oval20 = findViewById(R.id.edu_oval20);
    }
}