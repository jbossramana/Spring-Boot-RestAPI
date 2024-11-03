package demo.boot.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
 
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private long customerId;
 
 private String customerName;
 private String country;
 


public long getCustomerId() {
	return customerId;
}

public void setCustomerId(long customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}


 
 
}