package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args){
        StocksObservable iphoneObservable=new IphoneObservableImpl();

        NotificationAlertObserver ob1=new EmailAlertObserverImpl("abc@gmail.com",iphoneObservable);
        NotificationAlertObserver ob2=new EmailAlertObserverImpl("xys@gmail.com",iphoneObservable);
        NotificationAlertObserver ob3=new MobileAlertObserverImpl("862886600",iphoneObservable);
        iphoneObservable.addStocks(ob1);
        iphoneObservable.addStocks(ob2);
        iphoneObservable.addStocks(ob3);
        iphoneObservable.setCount(0);
    }
}
