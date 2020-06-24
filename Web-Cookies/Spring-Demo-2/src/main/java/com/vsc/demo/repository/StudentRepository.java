package com.vsc.demo.repository;

import com.vsc.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM students AS u WHERE u.first_name = ?1")
    List<Student> getByName(String name);

    @Query("SELECT u FROM Student AS u WHERE u.firstName = :name")
    List<Student> getByName2(@Param("name") String name);

    Student findFirstByFirstNameIs(String firstName);
}
