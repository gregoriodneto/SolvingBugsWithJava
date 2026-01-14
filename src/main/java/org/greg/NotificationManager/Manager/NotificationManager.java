package org.greg.NotificationManager.Manager;

import org.greg.NotificationManager.Contracts.NotificationContract;
import org.greg.NotificationManager.Entities.User;

import java.util.EnumSet;

public class NotificationManager {

    public static void notify(User user, String message, NotificationContract notificationContract) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }

        if (notificationContract == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }

        notificationContract.send(user, message);
    }
}