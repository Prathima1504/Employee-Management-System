package crudopemployeesystem.entity;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity(name="departments")
@Table(name="departments")

public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long dept_no;
	
	@NotBlank(message = "Name is mandatory")
	@Size(min = 5, message = "user name should have at least 5 characters")
	private String dept_name;
	
	@NotEmpty(message = "Name is mandatory")
	@Email
	private String email;
	
	
	@JoinTable( name = "Department_managers", 
			    joinColumns = @JoinColumn( name = "department_ID", referencedColumnName = "dept_no" ),
			    inverseJoinColumns = @JoinColumn( name = "employee_ID", referencedColumnName = "id" ) )
	
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Collection <Employee> employees;
	

	public Department() {
		//super();
		// TODO Auto-generated constructor stub
	}


	public Department( String dept_name,String email) {
		super();
	
		this.dept_name = dept_name;
		this.email = email;
		//this.employees=employees ;
	}



	public Long getDept_no()
	{
		return dept_no;
	}



	public void setId(Long dept_no) 
	{
		this.dept_no= dept_no;
	}



	public String getDept_name() {
		return dept_name;
	}


	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	/*
	 * public Collection<Employee> employees() { return employees;
	 * 
	 * }
	 * 
	 * 
	 * public void setEmployees(Collection<Employee> employees) { this.employees =
	 * employees; }
	 */
	
	  
}