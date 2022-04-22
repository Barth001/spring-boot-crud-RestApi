package com.barth.crud.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.barth.crud.exception.ResourcenotFoundException;
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


	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}


	@Override
	public Employee getEmployeeById(long id) {
		
		return employeeRepository.findById(id).orElseThrow(() -> new ResourcenotFoundException("Employee", "id", id));
	}


	@Override
	public Employee updatEmployee(Employee employee, long id) {
		Employee myEmployee = employeeRepository.findById(id).orElseThrow(() -> new ResourcenotFoundException("Employee", "id", id));
		myEmployee.setFirstName(employee.getFirstName());
		myEmployee.setLastName(employee.getLastName());
		myEmployee.setEmail(employee.getEmail());
		employeeRepository.save(myEmployee);
		return myEmployee;
	}


	@Override
	public void deleteEmployee(long id) {
		employeeRepository.findById(id).orElseThrow(() -> new ResourcenotFoundException("Employee", "id", id));
		employeeRepository.deleteById(id);
	}

}
