package com.fis.employee.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.employee.bean.Employee;



@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@GetMapping("/{number}")
	public Employee getAccount(@PathVariable long number) {
		return new Employee(987987973432l, "savings", 23434);
	}

}
