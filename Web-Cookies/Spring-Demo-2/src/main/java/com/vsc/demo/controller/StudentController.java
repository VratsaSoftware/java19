package com.vsc.demo.controller;

import com.vsc.demo.dto.NewStudentDTO;
import com.vsc.demo.entity.Student;
import com.vsc.demo.service.contract.StudentService;
import com.vsc.demo.service.implementation.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController extends BaseController {

    private final StudentServiceImpl studentService;

    @Autowired
    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/test")
    public String test() {
        studentService.test();
        return "index.html";
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/students/create")
    public ModelAndView createStudent() {
        return send("new-student");
    }

    @PreAuthorize("isAuthenticated()")
    @PostMapping("/students/create")
    public ModelAndView createStudent(@Validated @ModelAttribute NewStudentDTO studentDTO, BindingResult result) {
        if (result.hasErrors()) {
            return send("new-student");
        }

        studentService.registerNewStudent(studentDTO);
        return redirect("/students/all");
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/students/all")
    public ModelAndView listStudenets() {
        List<Student> object = studentService.listStudents();
        return send("all-students", "students", object);
    }
}
