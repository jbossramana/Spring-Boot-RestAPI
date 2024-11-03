package demo;

import org.springframework.beans.factory.annotation.Value;

public class Payment {

	
	
	@Value("${payment.mode}")
	String paymentMode;

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	
}
