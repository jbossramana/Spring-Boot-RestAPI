package com.rest.example;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(value = {"message1","message2"})
public class SimpleBean {

	
	private String message1;
	
	private String message2;
	
  @JsonIgnore
	private String message3;
	
	public SimpleBean(String msg1, String msg2, String msg3)
	{
		message1 = msg1;
		message2 = msg2;
		message3 = msg3;
	}

	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public String getMessage3() {
		return message3;
	}

	public void setMessage3(String message3) {
		this.message3 = message3;
	}

	
		
}
