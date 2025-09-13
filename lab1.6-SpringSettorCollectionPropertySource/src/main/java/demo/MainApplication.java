package demo;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollectionConfig.class);
		CollectionsBean collectionsBean = context.getBean(
		  CollectionsBean.class);
		collectionsBean.printNameList();   
		
		}

}
