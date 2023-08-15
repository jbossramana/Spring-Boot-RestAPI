package demo.dao;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class EmployeeEntity implements Serializable
{
   private static final long serialVersionUID = -1798070786993154676L;
   @Id
   @Column(name = "ID", unique = true, nullable = false)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer    employeeId;
   
   @Column(name = "FIRST_NAME", unique = false, nullable = false, length = 100)
   private String  firstName;
   
   @Column(name = "LAST_NAME", unique = false, nullable = false, length = 100)
   private String lastName;

   @OneToOne(cascade = CascadeType.ALL)
   AccountEntity   account;

public Integer getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(Integer employeeId) {
	this.employeeId = employeeId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public AccountEntity getAccount() {
	return account;
}

public void setAccount(AccountEntity account) {
	this.account = account;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

 
}