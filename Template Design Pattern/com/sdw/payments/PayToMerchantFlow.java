package com.sdw.payments;

public class PayToMerchantFlow extends PaymentFlow{

	@Override
	public void validateRequest() {
		System.out.println("validate request of pay to merchant");		
	}

	@Override
	public void calculateFees() {
		System.out.println("2% fees charged");		
	}

	@Override
	public void debitAmount() {
		System.out.println("debited amount logic for pay to merchant");
		
	}

	@Override
	public void creditAmount() {
		System.out.println("credit full amount logic for pay to merchant");
		
	}


}
