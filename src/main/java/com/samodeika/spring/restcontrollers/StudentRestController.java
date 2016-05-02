package com.samodeika.spring.restcontrollers;

import com.samodeika.spring.entities.Student;
import com.samodeika.spring.services.StudentServiceImpl;
import com.samodeika.spring.utils.GsonHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentApi")
public class StudentRestController {

    private StudentServiceImpl studentService;
    private GsonHelper<Student> jsonHelper = new GsonHelper<>();

    @Autowired
    public StudentRestController(StudentServiceImpl studentService, GsonHelper<Student> jsonHelper){
        this.studentService = studentService;
        this.jsonHelper = jsonHelper;
    }

    @RequestMapping(value = "/getStudents", method = RequestMethod.GET)
    public @ResponseBody List<Student> getStudents(){
        List<Student> result = studentService.getAll();
        return result;
    }

    @RequestMapping(value = "/getStudent", method = RequestMethod.GET)
    public @ResponseBody Student getStudent(@RequestParam("studentId") long studentId){
        Student result = studentService.getById(studentId);
        return result;
    }

    @RequestMapping(value = "/createStudent", method = RequestMethod.POST, consumes="application/json")
    public @ResponseBody Student createStudent(@RequestBody Student student){
        System.out.println(student.toString());
        if(student != null) {
            studentService.save(student);
        }
        return student;
    }
}
