package com.spring.mvc.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	@RequestMapping("/showform")
	public String index() {
		return "employee-form";
	}

	@RequestMapping("/processform")
	public String process() {
		return "welcome";
	}
}
