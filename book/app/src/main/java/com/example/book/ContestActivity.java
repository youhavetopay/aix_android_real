package com.example.book;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import static com.example.book.R.drawable;
import static com.example.book.R.id;
import static com.example.book.R.layout;

public class ContestActivity extends AppCompatActivity {

    private TextView con_oval1, con_oval2, con_oval3, con_oval4, con_oval5, con_oval6, con_oval7, con_oval8, con_oval9, con_oval10;
    private TextView con_oval11, con_oval12, con_oval13, con_oval14, con_oval15, con_oval16, con_oval17, con_oval18, con_oval19, con_oval20;
    private Button btn_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("경진대회");
        setContentView(layout.activity_contest);


        btn_test = findViewById(id.btn_test);
        con_oval1 = findViewById(id.con_oval1);
        con_oval2 = findViewById(id.con_oval2);
        con_oval3 = findViewById(id.con_oval3);
        con_oval4 = findViewById(id.con_oval4);
        con_oval5 = findViewById(id.con_oval5);
        con_oval6 = findViewById(id.con_oval6);
        con_oval7 = findViewById(id.con_oval7);
        con_oval8 = findViewById(id.con_oval8);
        con_oval9 = findViewById(id.con_oval9);
        con_oval10 = findViewById(id.con_oval10);
        con_oval11 = findViewById(id.con_oval11);
        con_oval12 = findViewById(id.con_oval12);
        con_oval13 = findViewById(id.con_oval13);
        con_oval14 = findViewById(id.con_oval14);
        con_oval15 = findViewById(id.con_oval15);
        con_oval16 = findViewById(id.con_oval16);
        con_oval17 = findViewById(id.con_oval17);
        con_oval18 = findViewById(id.con_oval18);
        con_oval19 = findViewById(id.con_oval19);
        con_oval20 = findViewById(id.con_oval20);



        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                con_oval1.setBackgroundDrawable(getResources().getDrawable(drawable.stamp));
                con_oval5.setBackgroundDrawable(getResources().getDrawable(drawable.stamp));
                con_oval9.setBackgroundDrawable(getResources().getDrawable(drawable.stamp));
                con_oval13.setBackgroundDrawable(getResources().getDrawable(drawable.stamp));
                con_oval17.setBackgroundDrawable(getResources().getDrawable(drawable.stamp));
            }
        });
    }
}