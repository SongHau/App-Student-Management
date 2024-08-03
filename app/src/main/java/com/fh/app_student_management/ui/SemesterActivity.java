package com.fh.app_student_management.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.fh.app_student_management.R;

public class SemesterActivity extends AppCompatActivity {
    private ImageView btnBack;
    private LinearLayout btnToSubject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnToSubject = findViewById(R.id.btnToSubject);
        btnToSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SemesterActivity.this, SubjectActivity.class);
                startActivity(intent);
            }
        });
    }
}