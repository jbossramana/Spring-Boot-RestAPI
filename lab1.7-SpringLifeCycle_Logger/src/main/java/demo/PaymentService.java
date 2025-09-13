package demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements Loggable {

    private Logger logger;

    
    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void processPayment() {
    	//  logger = LoggerFactory.getLogger(PaymentService.class);
        logger.info("Processing payment...");
    }
}
