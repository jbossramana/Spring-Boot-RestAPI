package demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {


public void getMsg() {
	  System.out.println("In Service : Hello World!");
	
}

public void getInfo() {
	 System.out.println("In Service : Info method");
	
}

}