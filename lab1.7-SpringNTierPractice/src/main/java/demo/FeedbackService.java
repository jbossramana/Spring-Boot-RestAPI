package demo;

import org.springframework.stereotype.Service;

//@Service
public class FeedbackService implements IFeedbackService {

	@Override
	public String getFeedback() {
		// TODO Auto-generated method stub
		return "Order details are sent through email";
	}

}
