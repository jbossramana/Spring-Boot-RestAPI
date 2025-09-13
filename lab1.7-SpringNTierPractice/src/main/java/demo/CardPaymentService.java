package demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("card")
//@Primary
public class CardPaymentService implements IPaymentService {

	@Override
	public String getPaymentStatus() {
		// TODO Auto-generated method stub
		return "Card Payment Successful";
	}

}
