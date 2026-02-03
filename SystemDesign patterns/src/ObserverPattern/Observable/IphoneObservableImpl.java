package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {
    List<NotificationAlertObserver> observerList=new ArrayList<>();
    public int stockCount=0;
    @Override
    public void addStocks(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
       for(NotificationAlertObserver observer:observerList){
           observer.update();
       }
    }

    @Override
    public void setCount(int stocksAdded) {
        if(stockCount==0){
            notifyObserver();
        }
        stockCount=stockCount+stocksAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
