package com.barth.crud.service;

import java.util.List;

import com.barth.crud.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee updatEmployee(Employee employee, long id);
	void deleteEmployee(long id);

}
