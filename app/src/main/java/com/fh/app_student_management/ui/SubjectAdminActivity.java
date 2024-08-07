package com.fh.app_student_management.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.fh.app_student_management.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class SubjectAdminActivity extends AppCompatActivity {
    private AppCompatButton btnAddSubject;
    private AppCompatButton btnEditSubject = findViewById(R.id.btnEditSubject);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_admin);

        btnAddSubject = findViewById(R.id.btnAddSubject);
        btnAddSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(SubjectAdminActivity.this);
                View view1 = LayoutInflater.from(SubjectAdminActivity.this).inflate(R.layout.bottom_sheet_dialog_add_subject,null);
                bottomSheetDialog.setContentView(view1);
                bottomSheetDialog.show();
            }
        });

        btnEditSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(SubjectAdminActivity.this);
                View view1 = LayoutInflater.from(SubjectAdminActivity.this).inflate(R.layout.bottom_sheet_dialog_edit_subject,null);
                bottomSheetDialog.setContentView(view1);
                bottomSheetDialog.show();
            }
        });
    }
}