package com.samodeika.spring.controllers;

import com.samodeika.spring.constants.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

    @RequestMapping(value = UrlConstants.C_CREATE_STUDENT, method = RequestMethod.GET)
    public String createStudent(Model model) {
        model.addAttribute("urlRestStudent", "/studentApi/createStudent");
        return "createStudent";
    }

}
