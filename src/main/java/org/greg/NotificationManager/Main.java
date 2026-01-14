package org.greg.NotificationManager;

import org.greg.NotificationManager.Contracts.NotificationContract;
import org.greg.NotificationManager.Entities.EmailNotification;
import org.greg.NotificationManager.Entities.User;
import org.greg.NotificationManager.Manager.NotificationManager;

public class Main {
    static void main(String[] args) {
        User user = new User("user@teste.com", "11 95555-4444", "+teste", true);
        NotificationContract notification = new EmailNotification();

        NotificationManager.notify(user, "Hello, World!", notification);
    }
}
