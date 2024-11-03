package demo;


import org.springframework.beans.factory.annotation.Value;


public class Account {
	   

	float amount;

	public float getAmount() {
		return amount;
	}

	//@Value("1000")
	@Value("${amount}")
	public void setAmount(float amount) {
		this.amount = amount;
	}
  
	}