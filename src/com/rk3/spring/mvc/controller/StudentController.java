package com.rk3.spring.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rk3.spring.mvc.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	

	//@Value("#countryOptions")
	//Map<String, String> countryOptions;
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	@RequestMapping("showForm")
	public String showForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		//model.addAttribute("countryOptions", student.getCountryOptions());
		//System.out.println(student.getCountryOptions());
		

	    // add the country options to the model 
	    model.addAttribute("countryOptions", countryOptions); 
		
		return "student-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		System.out.println("Student: " + student.getFirstName() + " " + student.getLastName() + " " + student.getCountry());
		return "student-confirmation";
	}
}
