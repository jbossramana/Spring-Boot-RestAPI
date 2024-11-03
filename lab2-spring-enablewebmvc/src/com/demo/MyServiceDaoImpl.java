package com.demo;

import org.springframework.stereotype.Repository;

@Repository("dao1")
public class MyServiceDaoImpl implements MyServiceDao {


	public long getData()
	{
		System.out.println("DAO is called...");
		
		return System.currentTimeMillis();
	}
	
}
