package com.practice.observable;

import com.practice.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {

    public List<NotificationAlertObserver> observerList = new ArrayList<>();

    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        observerList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        observerList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver o : observerList) {
            o.update();
        }
    }

    @Override
    public void setStockCount(int stockCount) {
        if (stockCount > 0) {
            notifySubscribers();
        }
        this.stockCount = this.stockCount + stockCount;
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
