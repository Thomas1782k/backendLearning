package com.lib.service;

import java.util.List;

import com.lib.modal.Library;

public interface Service {

	Library save(Library lib);
	List<Library> getAll();
	Library getById(long id);
	Library update(Library lib,long id);
	void delete(long id);
}
