package com.samodeika.spring.restcontrollers;

import com.samodeika.spring.entities.Student;
import com.samodeika.spring.services.StudentServiceImpl;
import com.samodeika.spring.utils.GsonHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studentApi")
public class StudentController {

    private StudentServiceImpl studentService;
    private GsonHelper<Student> jsonHelper = new GsonHelper<>();

    @Autowired
    public StudentController(StudentServiceImpl studentService, GsonHelper<Student> jsonHelper){
        this.studentService = studentService;
        this.jsonHelper = jsonHelper;
    }

    @RequestMapping("/getStudents")
    public String getStudents(){
        String result = jsonHelper.produceJson(studentService.getAll());
        return result;
    }

    @RequestMapping("/getStudent")
    public String getStudent(@RequestParam("studentId") long studentId){
        String result = jsonHelper.produceJson(studentService.getById(studentId));
        return result;
    }
}
