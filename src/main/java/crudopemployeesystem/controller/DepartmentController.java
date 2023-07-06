package crudopemployeesystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import crudopemployeesystem.entity.Department;
import crudopemployeesystem.service.DepartmentService;
import jakarta.validation.Valid;


@Controller
public class DepartmentController {
	
	private   DepartmentService departmentService;
	public DepartmentController(DepartmentService departmentService)
	{
		super();
		this.departmentService = departmentService;
	}
	
	// handler method to handle list of departments and return model and view
	
		@GetMapping("/departments")
		public String listDepartments(Model model)
		{
			model.addAttribute("departments", departmentService.getAllDepartments());
			
			return "departments";
			
		}
	
	//handler method to add department

	@GetMapping("/departments/new")
	public String createDepartment(Model model)
	{
	   Department department = new Department();
		
		model.addAttribute(  "department", department);
		return "create_department";
		
	}
     
	@PostMapping("/departments")
	public String saveDepartment(@Valid @RequestBody  @ModelAttribute("department") Department department )
	{
		
		departmentService.saveDepartment(department);
		return "redirect:/departments";
	}
	
	@GetMapping("/departments/{dept_no}/delete")
	public String deleteDepartment(@PathVariable Long dept_no) {
	    departmentService.deleteDepartmentById(dept_no);
	    return "redirect:/departments";
	}

}
