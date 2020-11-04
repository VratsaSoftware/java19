package com.vsc.myapplication.data.local.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.vsc.myapplication.data.local.database.models.Student;

import java.util.List;

@Dao
public interface StudentDao {

    @Query("SELECT * FROM students")
    List<Student> getAll();

    @Query("SELECT * FROM students WHERE average_grade < 5.5")
    List<Student> getAllNonGradeA();

    @Insert
    void insertAll(Student... users);

    @Delete
    void delete(Student user);

}
