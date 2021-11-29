package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {

//    @Query("SELECT s FROM Student s WHERE s.email = email supplied")
    Optional<Student> findStudentByEmail(String email);
}
