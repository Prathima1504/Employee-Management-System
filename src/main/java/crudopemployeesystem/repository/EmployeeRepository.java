package crudopemployeesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import crudopemployeesystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{

	//Employee findByDepartmentIdAndEmployeeId(int departmentId, int employeeId);

	
	

}
