package com.samodeika.spring.controllers;

import com.samodeika.spring.constants.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = UrlConstants.C_LOGIN, method = RequestMethod.GET)
	public String loginPage(ModelMap model) {
		model.addAttribute("loginUrl", UrlConstants.C_LOGIN_POST);
		return "login";
	}

	@RequestMapping(value = UrlConstants.C_LOGIN_POST, method = RequestMethod.POST)
	public String login() {
		return "redirect:" + UrlConstants.C_HOME;
	}
}