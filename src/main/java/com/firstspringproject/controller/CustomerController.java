package com.firstspringproject.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firstspringproject.customer.Customer;
import com.firstspringproject.customer.CustomerDao;
import com.firstspringproject.customer.DataAccess;
import com.firstspringproject.entity.Student;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@GetMapping("/index")
	public String index() {
		return "/customer/index";
	}
	
	@PostMapping("/save")
	public String save(HttpServletRequest req){
		CustomerDao cd = new CustomerDao();//obj/dpendency for this cls/ instanse
		Customer cm =new Customer();
		cm.setId(Long.parseLong(req.getParameter("id")));
		cm.setName(req.getParameter("name"));
		cm.setAddress(req.getParameter("address"));
		
		cd.save(cm);
		return "customer/save";
		
	}
//	@PostMapping("/save")
//	public String save(HttpServletRequest req){
//		DataAccess acd = new CustomerDao();
//		Customer cs = new Customer();
//		String id = req.getParameter("id");
//		long uid = Long.parseLong(id);
//		String name = req.getParameter("name");
//		String address = req.getParameter("address");
//		cs.setId(uid);
//		cs.setName(name);
//		cs.setAddress(address);
//		acd.save(cs);
//		 return "show";
//	}
}
