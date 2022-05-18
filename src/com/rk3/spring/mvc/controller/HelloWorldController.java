package com.rk3.spring.mvc.controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		List<String> students = List.of("John", "jane", "jen", "June", "Jim");
		//students.stream().filter(s -> Character.isUpperCase(s.charAt(0))).forEach(fs -> System.out.println(fs));
		students.stream()
				.map(s -> s.toUpperCase())
				.filter(s -> s.length() > 3)
				.map(s -> s.toLowerCase())
//				.sorted(Comparator.naturalOrder())
//				.peek(student -> System.out.println(student))
				.sorted((x,y) -> x.compareTo(y))
				.peek(student -> System.out.println(student))
				.collect(Collectors.toList());
		
		long[] ids = {1,6,7,9,3,2};
		List<Long> idsStream = Arrays.stream(ids).boxed().collect(Collectors.toList());
		
		idsStream.stream()
			.filter(id -> id % 2 == 0)
			.sorted(Comparator.reverseOrder())
			.forEach(id -> System.out.println(id));
		
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model m) {
		String username = request.getParameter("username").toUpperCase();
		
		m.addAttribute("username", username);
		return "helloworld";
	}
}
