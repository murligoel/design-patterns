package com.practice.observer;

import com.practice.observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    String emailId;
    StocksObservable observable;

    public EmailAlertObserver(StocksObservable observable, String emailId) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail(emailId, "product is in stock hurry up");
    }

    public void sendEmail(String emailId, String message) {
        System.out.println("Sending email to " + emailId);
    }
}
