package com.firstspringproject.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentController {
	@PostMapping ("/dave")
	public void save(HttpServletRequest req){
	Idataaccess da = new StudentDao();
	da.save();
	}
		
}
