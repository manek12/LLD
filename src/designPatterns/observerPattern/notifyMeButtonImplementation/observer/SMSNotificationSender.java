package designPatterns.observerPattern.notifyMeButtonImplementation.observer;

import designPatterns.observerPattern.notifyMeButtonImplementation.observable.ProductStockObservable;

public class SMSNotificationSender implements NotificationObserver{

    ProductStockObservable productStockObservable;

    public SMSNotificationSender(ProductStockObservable productStockObservable) {
        this.productStockObservable = productStockObservable;
    }

    @Override
    public void sendNotification() {
        System.out.println("Hey!, SMS Notification for the product you wanted is back in stock with quantity " + productStockObservable.getStockQuantity());
    }
}
