package com.samodeika.spring;

import com.samodeika.spring.constants.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
@RequestMapping(UrlConstants.C_HOME)
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.ENGLISH);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate );
		return "hello";
	}
}