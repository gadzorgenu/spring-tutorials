package com.example.demo.Student;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(1L,"Georgina","g@gmail.com", LocalDate.of(2010, Month.FEBRUARY,10), 11),
                new Student(1L,"Gina","gina@gmail.com", LocalDate.of(2010, Month.FEBRUARY,10), 11),
                new Student(1L,"Geee","gee@gmail.com", LocalDate.of(2010, Month.FEBRUARY,10), 11)
        );

    }
}
