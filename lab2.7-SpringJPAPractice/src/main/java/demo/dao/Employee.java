package demo.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
