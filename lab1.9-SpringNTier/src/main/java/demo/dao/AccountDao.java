package demo.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("accountdao")
//@Scope("prototype")
public class AccountDao implements IAccountDao {

	Account account;
	
	public float getSavingInterest() {
		// TODO Auto-generated method stub
		return 4;
	}

	
	@PostConstruct
	public void init()
	{
		account = new Account();
		account.setAccType("saving");
		System.out.println("Inside AccountDao,init method "+ account.getAccType());
		// restful service call, and get data, initialize it
	}
	
	@PreDestroy
	public void destroy()
	{
		account = null;
		System.out.println("Inside AccountDao, destroy method is called");
	}
	
	
	public float getCurrentInterest() {
		// TODO Auto-generated method stub
		return 3;
	}
	

	

}
