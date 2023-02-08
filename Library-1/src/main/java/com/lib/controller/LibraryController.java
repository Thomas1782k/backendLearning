package com.lib.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.lib.modal.Library;
import com.lib.service.Service;


@RestController
@RequestMapping("/api/library")
public class LibraryController {

	@Autowired
	Service er;

	@PostMapping
	public ResponseEntity<Library> save(@RequestBody Library emp)
	{
		System.out.println(emp);
		er.save(emp);
		return new ResponseEntity<Library>(emp, HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Library> getAll()
	{
		return er.getAll();
	}
	
	@GetMapping("/{id}")
	public Library getById(@PathVariable("id") long id)
	{
		return er.getById(id);
	}
	
	
	
	@PutMapping("/{id}")
	public ResponseEntity<Library> update(@PathVariable("id") long id, @RequestBody Library emp)
	{
		return new ResponseEntity<Library>(er.update(emp, id), HttpStatus.OK); 
	}
	
	@DeleteMapping("/{id}")	
	public ResponseEntity<String> delete(@PathVariable("id") long id)
	{
		er.delete(id);
		return new ResponseEntity<String>("Sucessfully Deleted", HttpStatus.GONE);
	}
}
