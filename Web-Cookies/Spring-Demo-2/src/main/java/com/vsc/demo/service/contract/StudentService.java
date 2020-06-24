package com.vsc.demo.service.contract;

import com.vsc.demo.dto.NewStudentDTO;
import com.vsc.demo.entity.Student;

import java.util.List;

public interface StudentService {

    void test();
    Student registerNewStudent(NewStudentDTO studentDTO);
    List<Student> listStudents();
}
