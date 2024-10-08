package com.fh.app_student_management.data.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.fh.app_student_management.utilities.Constants;

import java.util.Date;

@Entity(tableName = "users",
        indices = {@Index(value = {"email"}, unique = true)},
        foreignKeys = {
                @ForeignKey(
                        entity = Faculty.class,
                        parentColumns = "id",
                        childColumns = "faculty_id",
                        onDelete = ForeignKey.SET_NULL
                )
        })
public class User {

    @PrimaryKey(autoGenerate = true)
    private long id;
    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    private byte[] avatar;
    @ColumnInfo(name = "full_name")
    private String fullName;
    private boolean gender;
    @ColumnInfo(name = "date_of_birth")
    private Date dob;
    private String address;
    private String email;
    private String password;
    private Constants.Role role;
    @ColumnInfo(name = "faculty_id")
    private Long facultyId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getAvatar() {
        return this.avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public Constants.Role getRole() {
        return this.role;
    }

    public void setRole(Constants.Role role) {
        this.role = role;
    }

    public Long getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(Long facultyId) {
        this.facultyId = facultyId;
    }
}