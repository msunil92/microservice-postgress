package com.learning.postgres.repository;

import com.learning.postgres.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    //Student - class name
    @Query("select a from Student a where a.age >= ?1")
    public List<Student> getStudentByAge(int age);

    @Query("select a from Student a where a.firstName = ?1")
    public Student getStudentByName(String name);
}
