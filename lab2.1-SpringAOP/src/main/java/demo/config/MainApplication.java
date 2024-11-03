package demo.config;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.service.HelloService;
import demo.service.IAccountService;
import demo.service.IHelloService;


public class MainApplication {

	public static void main(String[] args) {
		 //  ApplicationContext ctx = new AnnotationConfigApplicationContext(AccountConfig.class);
		   
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		   
		 IHelloService  hellowService = ctx.getBean(IHelloService.class);
		 hellowService.getMsg();
		
		 
		 IAccountService accountService = ctx.getBean(IAccountService.class);
		 accountService.getAccInfo();
		}

}
