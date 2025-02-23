package com.flm.dao;

import java.util.List;

import com.flm.model.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee emp);
	void UpdateEmployee(Employee emp);
	void deleteEmployee(Employee emp);
    void deleteEmployee(Long id);
	Employee getEmployee(Long id);
	List<Employee> getAllEmployees();
	void updateEmployee(Employee emp);
	List<Employee> getAllEmployees(String name);
}
