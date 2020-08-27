package com.learning.postgres.controller;

import com.learning.postgres.model.Describe;
import com.learning.postgres.model.Student;
import com.learning.postgres.repository.StudentRepo;
import com.learning.postgres.service.StudentService;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
public class StudentController {

    Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    StudentService studentService;

    @GetMapping("health")
    public String healthCheck() {
        logger.info("health check :: status OK");
        return "OK";
    }

    @GetMapping("student")
    public List<Student> getStudentList() {
        return studentRepo.findAll();
    }

    @GetMapping("student/{id}")
    public Student getStudentByID(@PathVariable("id") Integer id) {
        return studentRepo.findById(id).get();
    }

    @GetMapping("student/age/{age}")
    public List<Student> getStudentByAge(@PathVariable("age") int age) {
        return studentRepo.getStudentByAge(age);
    }

    @GetMapping("student/info/{name}")
    public Describe getStudentInfo(@PathVariable("name") String name) {
        Student student = studentRepo.getStudentByName(name);
        System.out.println(student);
        if(null !=student)
            return studentService.getStudentInfo(student);
        else
            return new Describe();
    }
}
