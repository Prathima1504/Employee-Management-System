package crudopemployeesystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity(name="employees")
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String title;
    @NotBlank
	@Size(min = 2, message = "user name should have at least 2 characters")
	private String fname;
    @NotEmpty
	@Size(min = 2, message = "user name should have at least 2 characters")
	private String lname;
    @NotEmpty
	@Email
	private String email;
    
    private String emp_dept_name;


	  @ManyToOne
	  
	  @JoinColumn(name = "department_id")
	  private Department department;
	
	//whenever we create parameterized constructor we must make sure we will also create default constructor in JPA entity
	public Employee() {
		//super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String title, String fname, String lname, String email,String emp_dept_name) {
		super();

		this.title = title;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.emp_dept_name = emp_dept_name;
	}
    

	/*
	 * public Long getDepartmentId() { if (department != null) { return
	 * department.getDept_no(); } return null; }
	 */
    public void setDepartment(Department department) {
        this.department = department;
    }

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEmp_dept_name() {
		return emp_dept_name;
	}


	public void setEmp_dept_name(String emp_dept_name) {
		this.emp_dept_name = emp_dept_name;
	}
    
	
}
	
	
	