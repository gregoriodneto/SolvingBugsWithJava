package org.greg.NotificationManager.Entities;

import org.greg.NotificationManager.Contracts.NotificationContract;

public class PushNotification implements NotificationContract {
    @Override
    public void send(User user, String message) {
        System.out.println("Sending PUSH to " + user.deviceId());
        System.out.println("Message: " + message);
    }
}
