package org.greg.NotificationManager.Entities;

import org.greg.NotificationManager.Contracts.NotificationContract;

public class SMSNotification implements NotificationContract {

    @Override
    public void send(User user, String message) {
        System.out.println("Sending SMS to " + user.phone());
        System.out.println("Message: " + message);
    }

}
