package com.vsc.myapplication.data.local.staticdb;

import com.vsc.myapplication.data.local.database.models.Student;

import java.util.ArrayList;
import java.util.List;

public final class StaticDb {

    public static final double GRADE_A_MIN = 5.5F;

    private static StaticDb instance;

    private final List<Student> students;

    private StaticDb() {
        students = new ArrayList<>();
        students.add(new Student("Pesho", 9, 2.8F));
        students.add(new Student("Gosho", 10, 4.2F));
        students.add(new Student("Maria", 8, 5.7F));
        students.add(new Student("Anna", 11, 3.2F));
        students.add(new Student("Ivan", 9, 6F));
        students.add(new Student("Pesho 2", 9, 5.2F));
    }

    public static StaticDb getInstance() {
        if (instance == null) {
            instance = new StaticDb();
        }
        return instance;
    }

    public List<Student> getAllStudents() {
        return students;
    }

//    public List<Student> getAllGradeAStudents() {
//        return students.stream()
//            .filter(s -> s.averageGrade >= GRADE_A_MIN)
//            .collect(Collectors.toList());
//    }

//    public List<Student> getAllNonGradeAStudents() {
//        return students.stream()
//            .filter(s -> s.averageGrade < GRADE_A_MIN)
//            .collect(Collectors.toList());
//    }
}
