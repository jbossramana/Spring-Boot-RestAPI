package demo.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import demo.web.AccountController;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		AccountController accController = ctx.getBean(AccountController.class);
		
		System.out.println("saving account interest is :" + accController.getInterest("saving"));
		
		System.out.println("current account interest is :" + accController.getInterest("current"));
		ctx.registerShutdownHook();
	}

}
