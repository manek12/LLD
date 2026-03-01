package designPatterns.observerPattern.notifyMeButtonImplementation.observer;

import designPatterns.observerPattern.notifyMeButtonImplementation.observable.ProductStockObservable;

public class EmailNotificationSender implements NotificationObserver{

    ProductStockObservable productStockObservable;

    public EmailNotificationSender(ProductStockObservable productStockObservable) {
        this.productStockObservable = productStockObservable;
    }

    @Override
    public void sendNotification() {
        System.out.println("Hey!, Email Notification for the product you wanted is back in stock with quantity " + productStockObservable.getStockQuantity());
    }
}
