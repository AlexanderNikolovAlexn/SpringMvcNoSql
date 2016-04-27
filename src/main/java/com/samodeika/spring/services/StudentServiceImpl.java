package com.samodeika.spring.services;

import com.samodeika.spring.entities.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class StudentServiceImpl implements CrudOperations<Student> {

    private List<Student> stundentList;
    private String[] specialities = {"Mathematics", "Physics", "Informatics", "Chemistry"};

    public StudentServiceImpl() {
        stundentList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            Student student = new Student(i, "FirstName" + i, "LastName" + i, "email" + i + "@abv.bg", specialities[rand.nextInt(specialities.length)]);
            stundentList.add(student);
        }
    }

    @Override
    public List<Student> getAll() {
        return this.stundentList;
    }

    @Override
    public Student getById(long id) {
        Student student = new Student();
        for (Student st : stundentList) {
            if(st.getFacultyNum() == id) {
                student = st;
                return student;
            }
        }
        return student;
    }

    @Override
    public void save(Student entity) {

    }
}
