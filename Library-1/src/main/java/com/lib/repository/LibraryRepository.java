package com.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lib.modal.Library;

public interface LibraryRepository extends JpaRepository<Library, Long> {

}
