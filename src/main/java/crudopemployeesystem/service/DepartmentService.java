package crudopemployeesystem.service;

import java.util.List;

import crudopemployeesystem.entity.Department;
import crudopemployeesystem.entity.Employee;

public interface DepartmentService {

	

	List<Department> getAllDepartments();
    
	Department saveDepartment(Department department);

	void deleteDepartmentById(Long dept_no);

	Department getDepartmentByID(Long dept_no);

	Department updateDepartment(Department department);
}
 