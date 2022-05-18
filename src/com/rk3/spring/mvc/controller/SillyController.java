package com.rk3.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/silly")
public class SillyController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "silly";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "";
	}
}
