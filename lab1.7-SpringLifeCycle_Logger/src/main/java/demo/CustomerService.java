package demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements Loggable {

    private Logger logger;


    
    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void getCustomer() {
      //  logger = LoggerFactory.getLogger(CustomerService.class);
        logger.info("Customer details...");
    }
}
