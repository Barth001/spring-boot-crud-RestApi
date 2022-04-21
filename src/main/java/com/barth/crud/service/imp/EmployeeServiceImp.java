package com.barth.crud.service.imp;

import org.springframework.stereotype.Service;

import com.barth.crud.model.Employee;
import com.barth.crud.repository.EmployeeRepository;
import com.barth.crud.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	

	public EmployeeServiceImp(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

}
