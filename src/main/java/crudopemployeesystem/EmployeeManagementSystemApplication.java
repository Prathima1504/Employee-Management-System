package crudopemployeesystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import crudopemployeesystem.entity.Employee;
import crudopemployeesystem.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception{
		
		
		
		
	/*	 Employee employee1 = new Employee( "Prathima", "prathimab15@gmail.com");
		 employeeRepository.save(employee1);
		 
		 Employee employee2 = new Employee( "Sreelekha", "sreelekha@gmail.com");
	     employeeRepository.save(employee2);
		 
		 Employee employee3 = new Employee("Geethika", "geethika@gmail.com" );
		 employeeRepository.save(employee3);
    */
		
	}

}
