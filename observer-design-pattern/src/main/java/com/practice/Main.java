package com.practice;

import com.practice.observable.IphoneObservableImpl;
import com.practice.observable.StocksObservable;
import com.practice.observer.EmailAlertObserver;
import com.practice.observer.NotificationAlertObserver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserver(iphoneStockObservable, "xyz@gmail.com");


        NotificationAlertObserver observer2 = new EmailAlertObserver(iphoneStockObservable, "xyz_new@gmail.com");

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);

        iphoneStockObservable.setStockCount(10);
    }
}