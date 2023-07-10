
package crudopemployeesystem;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import crudopemployeesystem.entity.Department;

//import crudopemployeesystem.entity.Employee;
//import crudopemployeesystem.repository.DepartmentRepository;
//import crudopemployeesystem.repository.EmployeeRepository;


//enables various Spring Boot features. 
@SpringBootApplication


/*
 * CommandLineRunner interface is used  to run code when the application starts.
 * class must provide an implementation for the "run" method
 */
public class EmployeeManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args)
	{
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}
    //@Autowired
	//private EmployeeRepository employeeRepository;
	//@Autowired
	//private DepartmentRepository departmentRepository;
	 

	@Override
	//The "run" method is where you would place the code that needs to be executed when the application starts.
	public void run(String... args) throws Exception
	{
		
		
		/*
		 * Employee employee = new Employee("Mrs", "Hemamohan","Boddepalli",
		 * "hema@gmail.com","Mechanical"); employeeRepository.save(employee);
		 */
		// Department department = new Department("IT", null);
	    // departmentRepository.save(department);
		    
		  
	}
	

}
