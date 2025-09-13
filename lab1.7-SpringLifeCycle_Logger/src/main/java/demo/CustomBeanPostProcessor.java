package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

	

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Loggable) {
            Logger logger = LoggerFactory.getLogger(bean.getClass());
            ((Loggable) bean).setLogger(logger);
        }
        return bean;
    }
    

	
	
	
}
