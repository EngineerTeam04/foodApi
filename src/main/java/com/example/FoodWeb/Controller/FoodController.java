package com.example.FoodWeb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodWeb.Modal.Employee;
import com.example.FoodWeb.Service.EmployeeService;

@RestController
public class FoodController {
	@Autowired
	EmployeeService empserv;
	
	@PostMapping("/FoodManagment/RegisterEmployee")
	public String registerEmployee(@RequestBody Employee emp) {
		String value="0";
		value=empserv.insertStudent(emp);
		return value;
	}
	
	@GetMapping("/FoodManagment/EmployeeList")
	public List<Employee> getEmployeeList() {
		List<Employee> list =empserv.getEmployeeList();
		return list;
	}
	
}
