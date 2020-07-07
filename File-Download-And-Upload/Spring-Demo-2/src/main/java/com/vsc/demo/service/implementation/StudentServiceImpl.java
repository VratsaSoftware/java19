package com.vsc.demo.service.implementation;

import com.vsc.demo.dto.NewStudentDTO;
import com.vsc.demo.entity.GradesBook;
import com.vsc.demo.entity.Student;
import com.vsc.demo.entity.StudentClass;
import com.vsc.demo.repository.GradesBookRepository;
import com.vsc.demo.repository.StudentRepository;
import com.vsc.demo.service.contract.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final GradesBookRepository gradesBookRepository;
    private final StudentClassService studentClassService;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository, GradesBookRepository gradesBookRepository, StudentClassService studentClassService) {
        this.studentRepository = studentRepository;
        this.gradesBookRepository = gradesBookRepository;
        this.studentClassService = studentClassService;
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

    public Student registerNewStudent(NewStudentDTO studentDTO) {
        Student newStudent = new Student();
        newStudent.setFirstName(studentDTO.getFirstName());
        newStudent.setLastName(studentDTO.getLastName());
        newStudent.setAge(studentDTO.getAge());

        GradesBook gradesBook = new GradesBook();
        GradesBook savedGradesBook = gradesBookRepository.save(gradesBook);
        newStudent.setGradesBook(gradesBook);

        StudentClass studentClass = studentClassService.getStudentClass(studentDTO.getClassName());
        newStudent.setStudentClass(studentClass);

        return studentRepository.save(newStudent);
    }

    public List<Student> listStudents() {
        studentClassService.listAll();
        return studentRepository.findAll();
    }
}
