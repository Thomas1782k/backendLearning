package com.backend.employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.employee.modal.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	
}
