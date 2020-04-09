package com.secondpro.demo.employees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class EmployeeService {
	
	List<Employee>  employees = new ArrayList(Arrays.asList( 
			new Employee(1, "sachin", "A"),
			new Employee(2, "alok", "B")
			));
	
	public List<Employee> getAllEmployees(){
		return employees;
	}
	
	
	public Employee getEmployee(Integer id){
		return employees.stream().
			filter(employee -> new Integer(employee.getId()).equals(id)).findFirst().get();
	}
	
	public void addEmployee(Employee employee){
		employees.add(employee);
	}

}
