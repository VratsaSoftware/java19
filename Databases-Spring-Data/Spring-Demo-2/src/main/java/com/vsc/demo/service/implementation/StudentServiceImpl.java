package com.vsc.demo.service.implementation;

import com.vsc.demo.entity.GradesBook;
import com.vsc.demo.entity.Student;
import com.vsc.demo.repository.GradesBookRepository;
import com.vsc.demo.repository.StudentRepository;
import com.vsc.demo.service.contract.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final GradesBookRepository gradesBookRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository, GradesBookRepository gradesBookRepository) {
        this.studentRepository = studentRepository;
        this.gradesBookRepository = gradesBookRepository;
    }

    @Override
    public void test() {
//        Student student = new Student();
//        student.setFirstName("asdasdasd");
//        student.setLastName("riosvs8hrvu8sh");
//
//        GradesBook gradesBook = new GradesBook();
//        GradesBook savedGradesBook = gradesBookRepository.save(gradesBook);
//
//        student.setGradesBook(savedGradesBook);
//
//        studentRepository.save(student);

        Optional<Student> byId = studentRepository.findById(2L);

        String debug = "";
    }
}
