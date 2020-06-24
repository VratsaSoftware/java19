package com.vsc.demo.service.implementation;

import com.vsc.demo.entity.StudentClass;
import com.vsc.demo.repository.StudentClassRepostiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class StudentClassService {

    private final StudentClassRepostiry studentClassRepostiry;

    @Autowired
    public StudentClassService(StudentClassRepostiry studentClassRepostiry) {
        this.studentClassRepostiry = studentClassRepostiry;
    }

    public StudentClass getStudentClass(String className) {
        StudentClass studentClass = studentClassRepostiry.findFirstByClassNumber(className);
        if (studentClass == null) {
            throw new IllegalArgumentException("Student class not found: " + className);
        }

        return studentClass;
    }

    public List<StudentClass> listAll() {
        List<StudentClass> all = studentClassRepostiry.findAll();
        all.forEach(StudentClass::getStudents);
        return all;
    }

    @PostConstruct
    private void generateClasses() {
        String class2a = "2a";
        StudentClass studentClass2a = studentClassRepostiry.findFirstByClassNumber(class2a);
        if (studentClass2a == null) {
            studentClass2a = new StudentClass();
            studentClass2a.setClassNumber(class2a);
            studentClassRepostiry.save(studentClass2a);
        }
    }
}
