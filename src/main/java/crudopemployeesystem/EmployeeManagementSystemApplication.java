package crudopemployeesystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import crudopemployeesystem.entity.Department;
import crudopemployeesystem.entity.Employee;
import crudopemployeesystem.repository.DepartmentRepository;
import crudopemployeesystem.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public void run(String... args) throws Exception{
		
		
		
		
	/*	 Employee employee1 = new Employee( "Prathima", "prathimab15@gmail.com");
		 employeeRepository.save(employee1);
		 
		 Employee employee2 = new Employee( "Sreelekha", "sreelekha@gmail.com");
	     employeeRepository.save(employee2);
		 
		 Employee employee3 = new Employee("Geethika", "geethika@gmail.com" );
		 employeeRepository.save(employee3);
    */
		 Department department1 = new Department(101, "HR");
		    departmentRepository.save(department1);

		    Department department2 = new Department(102,"IT");
		    departmentRepository.save(department2);
		
	}
	

}
