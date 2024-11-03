package demo.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.IAccountDao;

@Service
public class AccounService implements IAccountService {

	@Autowired
	IAccountDao accountDao;
	
	@PostConstruct
	public void init()
	{
		System.out.println("service init() method is called");
	}
	
	
	public float getAccType(String acctype) {
		// TODO Auto-generated method stub
		
		if(acctype=="saving")
			return accountDao.getSavingInterest();
		else
			return accountDao.getCurrentInterest();
			
		
	}

}
