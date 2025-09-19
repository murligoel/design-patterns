package com.practice.observable;

import com.practice.observer.NotificationAlertObserver;

public interface StocksObservable {

    void add(NotificationAlertObserver notificationAlertObserver);

    void remove(NotificationAlertObserver notificationAlertObserver);

    void notifySubscribers();

    void setStockCount(int stockCount);

    int getStockCount();
}
