package com.example.book;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CertificateActivity extends AppCompatActivity {

    private TextView cer_oval1, cer_oval2, cer_oval3, cer_oval4, cer_oval5, cer_oval6, cer_oval7, cer_oval8, cer_oval9, cer_oval10;
    private TextView cer_oval11, cer_oval12, cer_oval13, cer_oval14, cer_oval15, cer_oval16, cer_oval17, cer_oval18, cer_oval19, cer_oval20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("자격증");
        setContentView(R.layout.activity_certificate);

        cer_oval1 = findViewById(R.id.cer_oval1);
        cer_oval2 = findViewById(R.id.cer_oval2);
        cer_oval3 = findViewById(R.id.cer_oval3);
        cer_oval4 = findViewById(R.id.cer_oval4);
        cer_oval5 = findViewById(R.id.cer_oval5);
        cer_oval6 = findViewById(R.id.cer_oval6);
        cer_oval7 = findViewById(R.id.cer_oval7);
        cer_oval8 = findViewById(R.id.cer_oval8);
        cer_oval9 = findViewById(R.id.cer_oval9);
        cer_oval10 = findViewById(R.id.cer_oval10);
        cer_oval11 = findViewById(R.id.cer_oval11);
        cer_oval12 = findViewById(R.id.cer_oval12);
        cer_oval13 = findViewById(R.id.cer_oval13);
        cer_oval14 = findViewById(R.id.cer_oval14);
        cer_oval15 = findViewById(R.id.cer_oval15);
        cer_oval16 = findViewById(R.id.cer_oval16);
        cer_oval17 = findViewById(R.id.cer_oval17);
        cer_oval18 = findViewById(R.id.cer_oval18);
        cer_oval19 = findViewById(R.id.cer_oval19);
        cer_oval20 = findViewById(R.id.cer_oval20);
    }
}