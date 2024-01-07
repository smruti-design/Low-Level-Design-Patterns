import observable.IphoneObservable;
import observable.StocksObservable;
import observer.EmailAlertObserver;
import observer.MobileAlertObserver;
import observer.NotificationAlertObserver;

public class Main {

	public static void main(String[] args) {
		
		StocksObservable observable = new IphoneObservable();
		
		NotificationAlertObserver user1 = new EmailAlertObserver("smruti@gmail.com", observable);
		NotificationAlertObserver user2 = new MobileAlertObserver("9999999990", observable);
		NotificationAlertObserver user3 = new MobileAlertObserver("1234567890", observable);
		
		observable.add(user1);
		observable.add(user2);
		observable.add(user3);
		
		observable.setStockCount(100);

	}

}
