package com.secondpro.demo.employees;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable Integer id){
		return employeeService.getEmployee(id);
	}
	
	@PostMapping("/addEmployee")
	public void addEmployee(@Valid @RequestBody Employee employee){
		employeeService.addEmployee(employee);
	}
	
	
}
