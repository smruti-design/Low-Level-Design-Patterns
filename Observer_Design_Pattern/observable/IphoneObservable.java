package observable;

import java.util.ArrayList;
import java.util.List;

import observer.NotificationAlertObserver;

public class IphoneObservable implements StocksObservable {
	
	public List<NotificationAlertObserver> observerList = new ArrayList<>();
	int stockCount = 0;

	@Override
	public void add(NotificationAlertObserver obj) {
		observerList.add(obj);
	}


	@Override
	public void remove(NotificationAlertObserver obj) {
		observerList.remove(obj);
	}

	@Override
	public void notifySubscriber() {
		for(NotificationAlertObserver user : observerList) {
			user.update();
		}
	}

	@Override
	public void setStockCount(int newStockAdded) {
		if(stockCount == 0) notifySubscriber();
		stockCount += newStockAdded;
	}

	@Override
	public int getStockCount() {
		return stockCount;
	}
	
	

}
