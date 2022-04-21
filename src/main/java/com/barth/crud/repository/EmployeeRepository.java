package com.barth.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barth.crud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
