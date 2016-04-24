package com.samodeika.spring.entities;

public class Student {

    private long facultyNum;
    private String firstName;
    private String lastName;
    private String email;
    private String speciality;

    public Student(long facultyNum, String firstName, String lastName, String email, String speciality) {
        this.facultyNum = facultyNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.speciality = speciality;
    }

    public long getFacultyNum() {
        return facultyNum;
    }

    public void setFacultyNum(long facultyNum) {
        this.facultyNum = facultyNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
