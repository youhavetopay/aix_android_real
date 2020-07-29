package com.example.book;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MajorActivity extends AppCompatActivity {

    private TextView maj_oval1, maj_oval2, maj_oval3, maj_oval4, maj_oval5, maj_oval6, maj_oval7, maj_oval8, maj_oval9, maj_oval10;
    private TextView maj_oval11, maj_oval12, maj_oval13, maj_oval14, maj_oval15, maj_oval16, maj_oval17, maj_oval18, maj_oval19, maj_oval20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("융합연계전공 및 연구활동");
        setContentView(R.layout.activity_major);

        maj_oval1 = findViewById(R.id.maj_oval1);
        maj_oval2 = findViewById(R.id.maj_oval2);
        maj_oval3 = findViewById(R.id.maj_oval3);
        maj_oval4 = findViewById(R.id.maj_oval4);
        maj_oval5 = findViewById(R.id.maj_oval5);
        maj_oval6 = findViewById(R.id.maj_oval6);
        maj_oval7 = findViewById(R.id.maj_oval7);
        maj_oval8 = findViewById(R.id.maj_oval8);
        maj_oval9 = findViewById(R.id.maj_oval9);
        maj_oval10 = findViewById(R.id.maj_oval10);
        maj_oval11 = findViewById(R.id.maj_oval11);
        maj_oval12 = findViewById(R.id.maj_oval12);
        maj_oval13 = findViewById(R.id.maj_oval13);
        maj_oval14 = findViewById(R.id.maj_oval14);
        maj_oval15 = findViewById(R.id.maj_oval15);
        maj_oval16 = findViewById(R.id.maj_oval16);
        maj_oval17 = findViewById(R.id.maj_oval17);
        maj_oval18 = findViewById(R.id.maj_oval18);
        maj_oval19 = findViewById(R.id.maj_oval19);
        maj_oval20 = findViewById(R.id.maj_oval20);
    }
}