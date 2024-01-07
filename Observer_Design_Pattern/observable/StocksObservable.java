package observable;

import observer.NotificationAlertObserver;

public interface StocksObservable {
	
	public void add(NotificationAlertObserver obj) ;
	
	public void remove(NotificationAlertObserver obj) ;
	
	public void notifySubscriber();
	
	public void setStockCount(int newStockAdded);
	
	public int getStockCount();

}
