package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String PhoneNumber;
    StocksObservable observable;

    public MobileAlertObserverImpl(String PhoneNumber, StocksObservable observable){
        this.PhoneNumber=PhoneNumber;
        this.observable=observable;
    }

    @Override
    public void update() {
     sendMessage(PhoneNumber,"Product is in stock");
    }

    private void sendMessage(String PhoneNumber,String msg){
        System.out.println("Mail sent to"+PhoneNumber);
    }
}
