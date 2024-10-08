package com.fh.app_student_management.data.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "subjects",
        foreignKeys = {
                @ForeignKey(
                        entity = Major.class,
                        parentColumns = "id",
                        childColumns = "major_id",
                        onDelete = ForeignKey.CASCADE
                ),
                @ForeignKey(
                        entity = Class.class,
                        parentColumns = "id",
                        childColumns = "class_id",
                        onDelete = ForeignKey.CASCADE
                )
        })
public class Subject {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private String name;
    private int credits;
    @ColumnInfo(name = "major_id")
    private long majorId;
    @ColumnInfo(name = "class_id")
    private long classId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public long getMajorId() {
        return majorId;
    }

    public void setMajorId(long majorId) {
        this.majorId = majorId;
    }

    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
    }
}
