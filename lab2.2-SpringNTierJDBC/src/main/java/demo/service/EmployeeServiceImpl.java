package demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import demo.dao.EmployeeDao;

@Service("service1")
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	@Qualifier("dao1")
	private EmployeeDao employeeDao;

	public String hire(String name) {
		
		String message = null;
		
		try {
		message = employeeDao.getMessage("Hire");
		}
		catch (OptimisticLockingFailureException ex) {
			
		}
		catch (DataAccessException ex) {
		//	throw MyAppException;
		}
		
		return name + ", " + message;
	}

	public String fire(String name) {
		String message = employeeDao.getMessage("Fire");
		return name + ", " + message;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
}
