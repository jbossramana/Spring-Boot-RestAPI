package demo;

public class Customer {

	String name="Ramana";

	public Customer()
	{
		System.out.println("In customer - Lifecycle 1 ");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
