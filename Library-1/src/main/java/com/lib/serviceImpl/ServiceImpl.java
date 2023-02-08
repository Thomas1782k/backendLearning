package com.lib.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lib.modal.Library;
import com.lib.repository.LibraryRepository;
import com.lib.service.Service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

	@Autowired
	LibraryRepository lr;
	
	@Override
	public Library save(Library lib) {
		return lr.save(lib);
	}

	@Override
	public List<Library> getAll() {
		return lr.findAll();
	}

	@Override
	public Library getById(long id) {
		Library op=lr.findById(id).orElseThrow();
		return op;
	}

	@Override
	public Library update(Library lib, long id) {
		Library op=lr.findById(id).orElseThrow();
		op.setId(lib.getId());
		op.setName(lib.getName());
		op.setAddress(lib.getAddress());
		op.setNumber(lib.getNumber());
		return lr.save(op);
	}

	@Override
	public void delete(long id) {
		Library op=lr.findById(id).orElseThrow();
		lr.deleteById(id);	
	}

}
