package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student s1 = new Student("Gina","g@gmail.com", LocalDate.of(2010, Month.MAY,7) );
            Student s2=  new Student("Gii","gii@gmail.com", LocalDate.of(2015, Month.MAY,8));
            Student s3 = new Student("Gyna","gyna@gmail.com", LocalDate.of(2011, Month.MAY,5));

            repository.saveAll(List.of(s1,s2,s3));
        };
    }
}
