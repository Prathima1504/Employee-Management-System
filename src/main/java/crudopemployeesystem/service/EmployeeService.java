package crudopemployeesystem.service;

import java.util.List;
import crudopemployeesystem.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeByID(Long id);
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(Long id);

	Employee getEmployeeByIds(int departmentId, int employeeId);
	 

}
