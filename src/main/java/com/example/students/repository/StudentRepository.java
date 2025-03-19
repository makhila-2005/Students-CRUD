package com.example.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.students.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
