package crudopemployeesystem.service;

import java.util.List;

import crudopemployeesystem.entity.Department;

public interface DepartmentService {

	

	List<Department> getAllDepartments();
    
	Department saveDepartment(Department department);

	void deleteDepartmentById(Long dept_no);
}
 