package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {

   public void addStocks(NotificationAlertObserver observer);
   public void remove(NotificationAlertObserver observer);
   public void notifyObserver();
   public void setCount(int stocksAdded);
   public int getStockCount();

}
