package com.fh.app_student_management.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.fh.app_student_management.data.entities.Subject;
import com.fh.app_student_management.data.relations.SubjectWithRelations;

import java.util.List;

@Dao
public interface SubjectDAO {

    @Query("SELECT * FROM subjects")
    List<Subject> getAll();

    @Query("SELECT * FROM subjects")
    List<SubjectWithRelations> getAllWithRelations();

    @Query("SELECT * FROM subjects WHERE id = :id")
    Subject getById(Long id);

    @Query("SELECT s.* FROM subjects s " +
            "JOIN lecturer_subject_cross_ref lsr ON s.id = lsr.subject_id " +
            "JOIN subject_semester_cross_ref ssr ON s.id = ssr.subject_id " +
            "JOIN lecturers l ON lsr.lecturer_id = l.id " +
            "JOIN users u ON l.user_id = u.id " +
            "WHERE ssr.semester_id = :semesterId AND u.id = :userId")
    List<SubjectWithRelations> getByLecturerAndSemester(long userId, long semesterId);

    @Insert
    void insert(Subject... subject);

    @Insert
    void insertAll(Subject... subjects);

    @Update
    void update(Subject subject);

    @Delete
    void delete(Subject subject);
}
