package com.backend.employee.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.employee.Exception.ResourceNotFoundException;
import com.backend.employee.Repository.EmployeeRepo;
import com.backend.employee.Service.EmployeeService;
import com.backend.employee.modal.Employee;

@Service
public class ServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo er;
	
//
//	public ServiceImpl(EmployeeRepo er) {
//		super();
//		this.er = er;
//	}

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return er.save(employee);
	}

	@Override
	public List<Employee> getAll() {
		
		return er.findAll();
	}

	@Override
	public Employee getById(long id) {
			
		return er.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id) );	
	}

	@Override
	public Employee update(Employee em,long id) {
		
		Employee emp=er.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id) );
		emp.setName(em.getName());
		emp.setEmail(em.getEmail());
		emp.setLocation(em.getLocation());
		emp.setId(em.getId());
		
		er.save(emp);
		return em;
	
	}

	@Override
	public void delete(long id) {
		er.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id) );
		er.deleteById(id);
	}

	
}
