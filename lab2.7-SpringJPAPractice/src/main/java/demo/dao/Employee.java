package demo.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="id")
	long id;
	
	@Column(name="EmpName")
	String name;
	
	@Column(name="EmpSalary")
	float sal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	public float getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
