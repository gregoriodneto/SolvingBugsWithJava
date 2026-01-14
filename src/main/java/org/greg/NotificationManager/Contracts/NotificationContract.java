package org.greg.NotificationManager.Contracts;

import org.greg.NotificationManager.Entities.User;

public interface NotificationContract {
    void send(User user, String message);
}
