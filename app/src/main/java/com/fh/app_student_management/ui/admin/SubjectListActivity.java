package com.fh.app_student_management.ui.admin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.fh.app_student_management.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class SubjectListActivity extends AppCompatActivity {

    private AppCompatButton btnAddSubject;
    private AppCompatButton btnEditSubject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_activity_list_subject);

        initSubjectListView();
        handleEventListener();
    }

    private void initSubjectListView() {
        btnAddSubject = findViewById(R.id.btnAddSubject);
        btnEditSubject = findViewById(R.id.btnEditSubject);
    }

    private void handleEventListener() {
        btnAddSubject.setOnClickListener(v -> {
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(SubjectListActivity.this);
            View view1 = LayoutInflater.from(SubjectListActivity.this).inflate(R.layout.admin_bottom_sheet_add_subject, null);
            bottomSheetDialog.setContentView(view1);
            bottomSheetDialog.show();
        });

        btnEditSubject.setOnClickListener(v -> {
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(SubjectListActivity.this);
            View view1 = LayoutInflater.from(SubjectListActivity.this).inflate(R.layout.admin_bottom_sheet_edit_subject, null);
            bottomSheetDialog.setContentView(view1);
            bottomSheetDialog.show();
        });
    }
}