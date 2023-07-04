package crudopemployeesystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crudopemployeesystem.entity.Department;


    @Repository
	public interface DepartmentRepository extends JpaRepository<Department, Long>
    
    {
   
    	Department findByEmail(String email);
    	}
		



