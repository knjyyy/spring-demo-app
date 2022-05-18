package com.rk3.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rk3.spring.mvc.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}

	@RequestMapping("showForm")	
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
		System.out.println(result);
		System.out.println("Customer: |" + customer.getFirstName() + " " + customer.getLastName() + "|");
				
		if(result.hasErrors())
			return "customer-form";
		else
			return "customer-confirmation";
	}
}
