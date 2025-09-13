package demo;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApplication {

	public static void main(String[] args) {
		 //  ApplicationContext ctx = new AnnotationConfigApplicationContext(AccountConfig.class);
		   
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		 
		 
		 IOrderService orderService = ctx.getBean(OrderService.class);
		 
		 String msg = orderService.getOrderInfo();
	
		 System.out.println(msg);
	}

}
