package com.firstspringproject.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firstspringproject.entity.Student;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping("")
	public String home(ModelMap model) {
		List<Student> slist = new ArrayList<Student>();
		Student student= new Student(1, "sahed");
		Student student1= new Student(2, "habib");
		slist.add(student);
		model.addAttribute("stlist", slist);
		return "index";
	}
	@PostMapping("save")
	public String save(HttpServletRequest req, ModelMap model) {
		String id = req.getParameter("id");
		long uid = Long.parseLong(id);
		String uname = req.getParameter("name");
		Student st =new Student(uid,uname);
		model.addAttribute("student", st);
		return "show";
	}
}
