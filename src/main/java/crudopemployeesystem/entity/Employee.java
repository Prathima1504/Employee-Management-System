package crudopemployeesystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="FullName" , nullable = false)
	private String name;
	private String email;

	
	//whenever we create parameterized constructor we must make sure we will also create default constructor in JPA entity
	public Employee() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee( String name, String email)
	{
		super();
		//this.id=id;
		this.name=name;
		this.email=email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * @Override public String toString() { return "Employee [id=" + id + ", name="
	 * + name + ", email=" + email + "]"; }
	 */
}
	
	
	