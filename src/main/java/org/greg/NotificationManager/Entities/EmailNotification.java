package org.greg.NotificationManager.Entities;

import org.greg.NotificationManager.Contracts.NotificationContract;

public class EmailNotification implements NotificationContract {

    @Override
    public void send(User user, String message) {
        System.out.println("Sending EMAIL to " + user.email());
        System.out.println("Message: " + message);

        if (!user.active()) {
            throw new IllegalStateException("Inactive user");
        }
    }
}
