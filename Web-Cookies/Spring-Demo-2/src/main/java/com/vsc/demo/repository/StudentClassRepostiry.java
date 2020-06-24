package com.vsc.demo.repository;

import com.vsc.demo.entity.StudentClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentClassRepostiry extends JpaRepository<StudentClass, Long> {

    StudentClass findFirstByClassNumber(String classNumber);
}
