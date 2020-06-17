package com.vsc.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "grade_books")
public class GradesBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "average_grade")
    private Double averageGrade;

    public GradesBook() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(Double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
