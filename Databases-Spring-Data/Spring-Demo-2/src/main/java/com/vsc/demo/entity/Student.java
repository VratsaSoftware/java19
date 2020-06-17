package com.vsc.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @OneToOne(targetEntity = GradesBook.class, optional = false)
    private GradesBook gradesBook;

    // From the side of Student
//    @ManyToOne()
//    private Dnevnik dnevnik;








    // From the side of Dnevnik
    @OneToMany(mappedBy = "dnevnik")
    private List<Student> students;





    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public GradesBook getGradesBook() {
        return gradesBook;
    }

    public void setGradesBook(GradesBook gradesBook) {
        this.gradesBook = gradesBook;
    }
}
