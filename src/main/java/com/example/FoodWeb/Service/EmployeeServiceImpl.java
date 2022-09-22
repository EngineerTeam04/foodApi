package com.example.FoodWeb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FoodWeb.Dao.EmployeeDao;
import com.example.FoodWeb.Modal.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao dao;
	@Override
	public List<Employee> getEmployeeList() {
		List<Employee> list=dao.findAll();
		return list;
	}
	
	@Override
	public String insertStudent(Employee emp) {
		// TODO Auto-generated method stub
		try {
			Employee value=dao.save(emp);
			/* System.out.println(value); */
		}catch(Exception ex) {
			
		}
		
		
		return "Employee Registered Sucessfully";
	}
	
	
	
}
