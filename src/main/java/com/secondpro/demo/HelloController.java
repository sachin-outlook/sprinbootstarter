package com.secondpro.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secondpro.demo.employees.Employee;
import com.secondpro.demo.employees.EmployeeService;


public class HelloController {
	
	
	
	public HelloController(){ 
		System.out.println("home controller");
	}
	
	
	
//	@GetMapping("/")
//	public String sayHello(){
//		return "hello";
//	}
}
