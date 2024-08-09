package com.fh.app_student_management.ui.admin;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.fh.app_student_management.R;

public class StatisticalSubjectActivity extends AppCompatActivity {

    private ImageView btnBack;
    private EditText inputSemester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_activity_statistical_subject);

        initStatisticalSubjectView();
        handleEventListener();
    }

    private void initStatisticalSubjectView() {
        btnBack = findViewById(R.id.btnBack);
        inputSemester = findViewById(R.id.inputSemester);

        inputSemester.setText("Học kì 1");
    }

    private void handleEventListener() {
        btnBack.setOnClickListener(v -> finish());

        inputSemester.setOnClickListener(v -> showSemesterDialog());
    }

    private void showSemesterDialog() {
        String[] semesters = {"Học kì 1", "Học kì 2", "Học kì 3"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Chọn học kì");
        builder.setItems(semesters, (dialog, which) -> inputSemester.setText(semesters[which]));

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}