package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class Account {
	   

	@Autowired
	private Environment env;

	public void someMethod() {
	    String prop = env.getProperty("java_home");
	   System.out.println("java home: "+ prop);
	}
	
	private String accType;

	float bal;
		
		
	public Account(float bal) {
		super();
		this.bal = bal;
	}

	public float getBal() {
		return bal;
	}

	public void setBal(float bal) {
		this.bal = bal;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	}