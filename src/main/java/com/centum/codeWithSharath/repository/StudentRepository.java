package com.centum.codeWithSharath.repository;

import com.centum.codeWithSharath.entity.Course;
import com.centum.codeWithSharath.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {

    List<Student> findByName(String name);
}
