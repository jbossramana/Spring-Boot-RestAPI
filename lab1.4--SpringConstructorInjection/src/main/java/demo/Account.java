package demo;


import org.springframework.beans.factory.annotation.Value;


public class Account {
	   

	float amount;

   
	public  Account(float amount) {
		this.amount = amount;
	}
  
	
	public float getAmount()
	{
		return amount;
	}
	}