package observer;

import observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
	
	String email;
	StocksObservable observable;
	
	public EmailAlertObserver(String email, StocksObservable observable){
		this.email = email;
		this.observable = observable;
	}

	@Override
	public void update() {
		sendMail(email , "Hurry up , the product is available");
	}
	
	public void sendMail(String email, String message) {
		System.out.println("email sent to: " + email );
	}

}
