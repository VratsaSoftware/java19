package com.vsc.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "student_classes")
public class StudentClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "class_number", nullable = false, unique = true)
    private String classNumber;

    @OneToMany(targetEntity = Student.class, mappedBy = "studentClass", fetch = FetchType.LAZY)
    private Set<Student> students;

    public StudentClass() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
