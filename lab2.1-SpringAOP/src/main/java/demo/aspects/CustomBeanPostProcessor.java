package demo.aspects;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;



@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("Lifecycle 4 ... postProcessBeforeInitialization : " + beanName);
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	
		System.out.println("Lifecycle 8  ... postProcessAfterInitialization " + beanName);
		return bean;
	}
	
	
	
	
}
