package com.example.FoodWeb.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.FoodWeb.Modal.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
}
