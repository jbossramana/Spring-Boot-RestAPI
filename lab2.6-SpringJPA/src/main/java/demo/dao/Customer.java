package demo.dao;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


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