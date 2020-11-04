package com.vsc.myapplication.data.local.database.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "students")
public class Student {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "class_number")
    public int classNumber;

    @ColumnInfo(name = "average_grade")
    public float averageGrade;

    public Student() {
    }

    public Student(String name, int classNumber, float averageGrade) {
        this.name = name;
        this.classNumber = classNumber;
        this.averageGrade = averageGrade;
    }
}
