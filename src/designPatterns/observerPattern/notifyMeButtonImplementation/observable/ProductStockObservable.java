package designPatterns.observerPattern.notifyMeButtonImplementation.observable;

import designPatterns.observerPattern.notifyMeButtonImplementation.observer.NotificationObserver;

public interface ProductStockObservable {
    void addObserver(NotificationObserver observer);
    void removeObserver(NotificationObserver observer);
    void notifyObservers();
    void setStockQuantity(int quantity);
    int getStockQuantity();
}
