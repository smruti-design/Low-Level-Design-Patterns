package observer;

import observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
	
	String mobileNumber;
	StocksObservable observable;
	
	public MobileAlertObserver(String mobile, StocksObservable observable){
		this.mobileNumber = mobile;
		this.observable = observable;
	}

	@Override
	public void update() {
		sendSMS(mobileNumber, "Hurry up , stock is available");
	
	}
	
	public void sendSMS(String mobile, String message) {
		System.out.println("SMS sent to : " + mobile);
	}

}
