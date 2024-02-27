package com.sdw.payments;

public class PayToFriend extends PaymentFlow{

	@Override
	public void validateRequest() {
		System.out.println("validate request of pay to friend");		
	}

	@Override
	public void calculateFees() {
		System.out.println("0% fees charged");		
	}

	@Override
	public void debitAmount() {
		System.out.println("debited amount logic for pay to friend");
		
	}

	@Override
	public void creditAmount() {
		System.out.println("credit full amount logic for pay to friend");
		
	}

}
