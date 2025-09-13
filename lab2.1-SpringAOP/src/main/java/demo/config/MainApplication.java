package demo.config;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.lookup.IAccountService;
import demo.service.HelloService;
import demo.service.IHelloService;


public class MainApplication {

	public static void main(String[] args) {
		 //  ApplicationContext ctx = new AnnotationConfigApplicationContext(AccountConfig.class);
		   
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		   
		 IHelloService  hellowService = ctx.getBean(IHelloService.class);
		 hellowService.getMsg();
		 hellowService.getInfo();
		 
		 IAccountService accountService = ctx.getBean(IAccountService.class);
		 accountService.getAccInfo();
		}

}
