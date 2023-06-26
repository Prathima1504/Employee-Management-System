 package crudopemployeesystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import crudopemployeesystem.entity.Department;

import crudopemployeesystem.repository.DepartmentRepository;
import crudopemployeesystem.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	
	private DepartmentRepository departmentRepository;
	
	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}
	
	@Override
	public List<Department> getAllDepartments() {
		
		return departmentRepository.findAll();
	}
	
	
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

}
