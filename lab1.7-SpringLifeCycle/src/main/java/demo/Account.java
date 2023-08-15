package demo;


import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;


public class Account {
	   

	float amount;

	public Account()
	{
		System.out.println("Lifecycle 1..Instatiate");
	}
	
	public float getAmount() {
		return amount;
	}

	@Value("1000")
	public void setAmount(float amount) {
		System.out.println("Lifecycle 2... Setter Injection");
		this.amount = amount;
	}
  
	@PostConstruct
	public void init()
	{
		// initializing the data or getting remote connection
		System.out.println("Lifecycle 5... init() method is called");
	}
	}