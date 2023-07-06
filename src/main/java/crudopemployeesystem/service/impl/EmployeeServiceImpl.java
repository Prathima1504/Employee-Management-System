package crudopemployeesystem.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import crudopemployeesystem.entity.Employee;
import crudopemployeesystem.repository.EmployeeRepository;
import crudopemployeesystem.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeByID(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}
	
	/*
	 * @Override public Employee getEmployeeByIds(int departmentId, int employeeId)
	 * { // Implement your logic to retrieve the employee information from the
	 * database // using the provided departmentId and employeeId
	 * 
	 * // For example, you can call a method on the employeeRepository (a data
	 * access object) to fetch the employee Employee employee =
	 * employeeRepository.findByDepartmentIdAndEmployeeId(departmentId, employeeId);
	 * 
	 * // Return the retrieved employee return employee; }
	 */
}