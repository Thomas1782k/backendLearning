package com.backend.employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.employee.Service.EmployeeService;
import com.backend.employee.modal.Employee;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	EmployeeService er;

	@PostMapping
	public ResponseEntity<Employee> save(@RequestBody Employee emp)
	{
		System.out.println(emp);
		er.saveEmployee(emp);
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Employee> getAll()
	{
		return er.getAll();
	}
	
	@GetMapping("/{id}")
	public Employee getById(@PathVariable("id") long id)
	{
		return er.getById(id);
	}
	
	
	
	@PutMapping("/{id}")
	public ResponseEntity<Employee> update(@PathVariable("id") long id, @RequestBody Employee emp)
	{
		return new ResponseEntity<Employee>(er.update(emp, id), HttpStatus.OK); 
	}
	
	@DeleteMapping("/{id}")	
	public ResponseEntity<String> delete(@PathVariable("id") long id)
	{
		er.delete(id);
		return new ResponseEntity<String>("Sucessfully Deleted", HttpStatus.GONE);
	}
	
	
	
	
	
	
	
}
