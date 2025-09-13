package demo.dao;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "Account")
public class AccountEntity implements Serializable
{
   private static final long serialVersionUID = 1L;

   @Id
   @Column(name = "ID", unique = true, nullable = false)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer   accountId;

   @Column(name = "ACC_NO", unique = false, nullable = false, length = 100)
   private String   accountNumber;

   @OneToOne (mappedBy = "account")
   EmployeeEntity    employee;

public Integer getAccountId() {
	return accountId;
}

public void setAccountId(Integer accountId) {
	this.accountId = accountId;
}

public String getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

public EmployeeEntity getEmployee() {
	return employee;
}

public void setEmployee(EmployeeEntity employee) {
	this.employee = employee;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}


}