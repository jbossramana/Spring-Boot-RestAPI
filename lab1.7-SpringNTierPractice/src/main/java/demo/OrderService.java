package demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {

	@Autowired
	@Qualifier("cash")
	IPaymentService paymentService;
	
	
	//@Autowired
	IFeedbackService feedbackService;
	
	@PostConstruct
	public void init()
	{
		feedbackService = new FeedbackService();
	}
	
	@Override
	public String getOrderInfo() {
		// TODO Auto-generated method stub
		System.out.println(feedbackService.getFeedback());
		return "Order created.." + paymentService.getPaymentStatus();
	}
	
	

}
