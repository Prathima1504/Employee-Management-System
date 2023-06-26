package crudopemployeesystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="departments")

public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dept_no;
	private String dept_name;
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Department(Integer dept_no, String dept_name) {
		super();
		this.dept_no = dept_no;
		this.dept_name = dept_name;
	}
	
	public Integer getDept_no() {
		return dept_no;
	}
	public void setDept_no(Integer dept_no) {
		this.dept_no = dept_no;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	

}
