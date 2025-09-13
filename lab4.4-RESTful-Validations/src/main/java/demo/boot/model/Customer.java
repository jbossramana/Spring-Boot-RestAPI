package demo.boot.model;

import jakarta.validation.constraints.Size;

public class Customer {

	@Size(min = 3, message="name should have atleast 3 characters")
	String name;
	String location;
	public Customer(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", location=" + location + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
