package crudopemployeesystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import crudopemployeesystem.entity.Employee;
import crudopemployeesystem.service.EmployeeService;

@Controller
public class EmployeeController 
{
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService)
	{
		super();
		this.employeeService = employeeService;
	}
	
	// handler method to handle list of students and return model and view
	
	@GetMapping("/employees")
	public String listemployees(Model model)
	{
		model.addAttribute("employees", employeeService.getAllEmployees());
		
		return "employees";
		
	}
	
	//handler method to add employee
	
	@GetMapping("/employees/new")
	public String createEmployeeForm(Model model)
	{
		Employee employee = new Employee();
		
		model.addAttribute("employee", employee);
		return "create_employee";
		 
	}
     
	@PostMapping("/employees")
	public String saveEmployee(@ModelAttribute("employee") Employee employee)
	{
		
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}
	
	
	@GetMapping("/employees/edit/{id}")
	public String editEmployeeForm(@PathVariable Long id, Model model) 
	{
		model.addAttribute("employee", employeeService.getEmployeeByID(id));
		return "edit_employee";		
	}
	
	@PostMapping("/employees/{id}")
	public String updateEmployee(@PathVariable Long id, @ModelAttribute("employee") Employee employee, Model model) {
	   Employee existingEmployee = employeeService.getEmployeeByID(id);
	   existingEmployee.setId(id);
	   existingEmployee.setFname(employee.getFname());
	   existingEmployee.setLname(employee.getLname());
	   existingEmployee.setEmail(employee.getEmail());
	   existingEmployee.setEmp_dept_name(employee.getEmp_dept_name());
	   
	   
	   //save updated employee object
	   employeeService.updateEmployee(existingEmployee);
	   return "redirect:/employees";
	}
	
	@GetMapping("/employees/{id}/delete")
	public String deleteEmployee(@PathVariable Long id) {
	    employeeService.deleteEmployeeById(id);
	    return "redirect:/employees";
	}
	
	
	  @PostMapping("/get_employee") 
	  public String getEmployeeInformation(@RequestParam("dept_no") int departmentId, @RequestParam("id") int employeeId, Model model) { Employee
	  employee = employeeService.getEmployeeByIds(departmentId, employeeId);
	  model.addAttribute("employee", employee); return "employee_information"; }
	 
}
  
