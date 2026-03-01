package designPatterns.observerPattern.notifyMeButtonImplementation;

import designPatterns.observerPattern.notifyMeButtonImplementation.observable.ProductStockObservable;
import designPatterns.observerPattern.notifyMeButtonImplementation.observable.ProductStockObservableImpl;
import designPatterns.observerPattern.notifyMeButtonImplementation.observer.EmailNotificationSender;
import designPatterns.observerPattern.notifyMeButtonImplementation.observer.SMSNotificationSender;

public class NotifyMeMain {

    public static void main(String[] args) {
        ProductStockObservable productStockObservable = new ProductStockObservableImpl();
        EmailNotificationSender emailNotificationSender = new EmailNotificationSender(productStockObservable);
        SMSNotificationSender smsNotificationSender = new SMSNotificationSender(productStockObservable);

        productStockObservable.addObserver(emailNotificationSender);
        productStockObservable.addObserver(smsNotificationSender);

        productStockObservable.setStockQuantity(10);
        productStockObservable.setStockQuantity(20);
    }
}
