package com.backend.employee.Service;

import java.util.List;

import com.backend.employee.modal.Employee;

public interface EmployeeService  {
	
	Employee saveEmployee(Employee employee);
	List<Employee> getAll();
	Employee getById(long id);
	Employee update(Employee emp,long id);
	void delete(long id);
}
