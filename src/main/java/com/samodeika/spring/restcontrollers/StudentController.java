package com.samodeika.spring.restcontrollers;

import com.google.gson.Gson;
import com.samodeika.spring.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studentApi")
public class StudentController {

    private StudentServiceImpl studentService;

    @Autowired
    public StudentController(StudentServiceImpl studentService){
        this.studentService = studentService;
    }

    @RequestMapping("/getStudents")
    public String getStudents(){
        return new Gson().toJson(studentService.getAll());
    }

}
