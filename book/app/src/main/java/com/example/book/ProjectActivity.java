package com.example.book;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProjectActivity extends AppCompatActivity {

    private TextView pro_oval1, pro_oval2, pro_oval3, pro_oval4, pro_oval5, pro_oval6, pro_oval7, pro_oval8, pro_oval9, pro_oval10;
    private TextView pro_oval11, pro_oval12, pro_oval13, pro_oval14, pro_oval15, pro_oval16, pro_oval17, pro_oval18, pro_oval19, pro_oval20;

    private TextView project_name_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("프로젝트 및 봉사");
        setContentView(R.layout.activity_project);

        Intent intent = getIntent();
        String user_name = intent.getExtras().getString("user_name");

        project_name_title = findViewById(R.id.project_name_title);
        project_name_title.setText(user_name+"의 프로젝트 및 봉사 Stamp");

        pro_oval1 = findViewById(R.id.pro_oval1);
        pro_oval2 = findViewById(R.id.pro_oval2);
        pro_oval3 = findViewById(R.id.pro_oval3);
        pro_oval4 = findViewById(R.id.pro_oval4);
        pro_oval5 = findViewById(R.id.pro_oval5);
        pro_oval6 = findViewById(R.id.pro_oval6);
        pro_oval7 = findViewById(R.id.pro_oval7);
        pro_oval8 = findViewById(R.id.pro_oval8);
        pro_oval9 = findViewById(R.id.pro_oval9);
        pro_oval10 = findViewById(R.id.pro_oval10);
        pro_oval11 = findViewById(R.id.pro_oval11);
        pro_oval12 = findViewById(R.id.pro_oval12);
        pro_oval13 = findViewById(R.id.pro_oval13);
        pro_oval14 = findViewById(R.id.pro_oval14);
        pro_oval15 = findViewById(R.id.pro_oval15);
        pro_oval16 = findViewById(R.id.pro_oval16);
        pro_oval17 = findViewById(R.id.pro_oval17);
        pro_oval18 = findViewById(R.id.pro_oval18);
        pro_oval19 = findViewById(R.id.pro_oval19);
        pro_oval20 = findViewById(R.id.pro_oval20);
    }
}