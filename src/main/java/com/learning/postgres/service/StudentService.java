package com.learning.postgres.service;

import com.learning.postgres.model.Describe;
import com.learning.postgres.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public Describe getStudentInfo(Student student){
        Describe describe = new Describe();
        describe.setStudent(student);
        if(student.getAge() <= 18)
            describe.setDescribe("School student");
        else
            describe.setDescribe("College student");

        return describe;
    }
}
