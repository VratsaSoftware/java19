package com.vsc.demo.repository;

import com.vsc.demo.entity.GradesBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradesBookRepository extends JpaRepository<GradesBook, Long> {
}
