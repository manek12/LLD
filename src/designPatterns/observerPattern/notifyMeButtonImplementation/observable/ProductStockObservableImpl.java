package designPatterns.observerPattern.notifyMeButtonImplementation.observable;

import designPatterns.observerPattern.notifyMeButtonImplementation.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class ProductStockObservableImpl implements ProductStockObservable {

    int stockQuantity;
    List<NotificationObserver> notificationObservers = new ArrayList<>();

    @Override
    public void addObserver(NotificationObserver observer) {
        notificationObservers.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        notificationObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        notificationObservers.forEach(NotificationObserver::sendNotification);
    }

    @Override
    public void setStockQuantity(int stockQuantity) {
        if(this.stockQuantity == 0){
            this.stockQuantity = stockQuantity;
            notifyObservers();
        }
        else {
            this.stockQuantity = stockQuantity;
        }
    }

    @Override
    public int getStockQuantity() {
        return stockQuantity;
    }
}
