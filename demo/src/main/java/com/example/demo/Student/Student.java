package com.example.demo.Student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private Integer age;
    private LocalDate dob;
    private String name, email;

    private Student(){

    }

    public Student( Long id,String name, String email,LocalDate dob, Integer age) {
        this.id = id;
        this.dob = dob;
        this.age = age;
        this.name = name;
        this.email = email;
    }


    public Student(String name, String email,Integer age, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", dob=" + dob +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
