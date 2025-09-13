package demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("cash")
//@Primary
public class CashPaymentService implements IPaymentService {

	@Override
	public String getPaymentStatus() {
		// TODO Auto-generated method stub
		return "Cash Payment Successful";
	}

}
