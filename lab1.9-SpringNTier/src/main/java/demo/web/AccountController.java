package demo.web;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demo.service.IAccountService;

@Component
public class AccountController {

	@Autowired
	IAccountService accountService;
	
	@PostConstruct
	public void init()
	{
		System.out.println("Controller init() method is called");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Controller destory() method is called");
	}
	
	public float getInterest(String acctype)
	
	{
		return accountService.getAccType(acctype);
		
	}
}
