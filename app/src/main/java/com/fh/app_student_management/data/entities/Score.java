package com.fh.app_student_management.data.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.util.Objects;

@Entity(tableName = "scores", foreignKeys = {
        @ForeignKey(
                entity = Student.class,
                parentColumns = "id",
                childColumns = "student_id"
        ),
        @ForeignKey(
                entity = Subject.class,
                parentColumns = "id",
                childColumns = "subject_id"
        )
})
public class Score {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private String type;
    private float point;
    @ColumnInfo(name = "student_id")
    private long studentId;
    @ColumnInfo(name = "subject_id")
    private long subjectId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }

    @NonNull
    @Override
    public String toString() {
        return this.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score = (Score) o;
        return id == score.id && Objects.equals(type, score.type);
    }
}