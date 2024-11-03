package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
	
	@Autowired
	MyServiceDao dao;
	
    public long getCurrentTimeInMilliseconds() {
    	System.out.println("Service is called...");
    	  return dao.getData();
    }
 
}