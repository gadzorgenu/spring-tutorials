package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired //a bean would be injected into this method
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return  studentRepository.findAll();
    }

    public void addNewStudent(Student student){
        Optional<Student> studentEmail = studentRepository.findStudentByEmail(student.getEmail());
        if (studentEmail.isPresent()) {
            throw new IllegalStateException("Email already exists");
        }

         studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
//        studentRepository.findById(studentId);
        boolean studentExist = studentRepository.existsById(studentId);
        if (!studentExist) {
            throw new IllegalStateException("student with id " + studentId + " does not exist");
        }
//
        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Long studentId, String name, String email, LocalDate dob) {
        Student student = studentRepository.findById(studentId).orElseThrow(
                    () -> {
                        throw new IllegalStateException("student with id " + studentId + " does not exist");
                    }
                );

        if(name != null && name.length() > 0 &&
                !Objects.equals(student.getName(),name)
        ){
            student.setName(name);
        }

        if(email != null && email.length() > 0 && !Objects.equals(student.getEmail(), email)){
            //check if email exists
            Optional<Student> optionalStudent = studentRepository.findStudentByEmail(email);
            if(optionalStudent.isPresent()){
                throw new IllegalStateException("email already exist");
            }
            student.setEmail(email);
        }
    }
}
