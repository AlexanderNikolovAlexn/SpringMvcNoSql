package com.samodeika.spring.restcontrollers;

import com.samodeika.spring.entities.Student;
import com.samodeika.spring.services.StudentServiceImpl;
import com.samodeika.spring.utils.GsonHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public String getStudents(){
        String result = jsonHelper.produceJson(studentService.getAll());
        return result;
    }

    @RequestMapping(value = "/getStudent", method = RequestMethod.GET)
    public String getStudent(@RequestParam("studentId") long studentId){
        String result = jsonHelper.produceJson(studentService.getById(studentId));
        return result;
    }

    @RequestMapping(value = "/createStudent", method = RequestMethod.POST, consumes="application/json")
    public @ResponseBody String createStudent(@RequestBody String student){
        System.out.println(student.toString());
//        if(student != null) {
//            studentService.save(student);
//        }
        return "login";
    }
}
