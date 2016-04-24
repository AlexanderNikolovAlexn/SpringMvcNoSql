package com.samodeika.spring.restcontrollers;

import com.samodeika.spring.services.StudentServiceImpl;
import org.elasticsearch.common.inject.Inject;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private StudentServiceImpl studentService;

    @Inject
    public StudentController(StudentServiceImpl studentService){
    }

}
