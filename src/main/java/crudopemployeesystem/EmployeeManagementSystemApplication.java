
// Entry point of this project

package crudopemployeesystem;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import crudopemployeesystem.entity.Department;

//import crudopemployeesystem.entity.Employee;
//import crudopemployeesystem.repository.DepartmentRepository;
//import crudopemployeesystem.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}
  // 	@Autowired
	//private EmployeeRepository employeeRepository;
	//@Autowired
	//private DepartmentRepository departmentRepository;
	 

	@Override
	public void run(String... args) throws Exception
	{
		
		
	    // Employee employee1 = new Employee( "Ms", "Prathima","Boddepalli", "prathimab15@gmail.com");
		// employeeRepository.save(employee1);
		 
		// Department department = new Department("IT", null);
	    // departmentRepository.save(department);
		    
		
	}
	

}
