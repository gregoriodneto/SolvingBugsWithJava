package org.greg.NotificationManager;

public class NotificationManager {

    public void notify(User user, String message, String type) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }

        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }

        if ("EMAIL".equals(type)) {
            System.out.println("Sending EMAIL to " + user.getEmail());
            System.out.println("Message: " + message);

            if (!user.isActive()) {
                throw new IllegalStateException("Inactive user");
            }

        } else if ("SMS".equals(type)) {
            System.out.println("Sending SMS to " + user.getPhone());
            System.out.println("Message: " + message);

        } else if ("PUSH".equals(type)) {
            System.out.println("Sending PUSH to " + user.getDeviceId());
            System.out.println("Message: " + message);

        } else {
            throw new IllegalArgumentException("Unsupported notification type");
        }
    }
}

class User {
    private String email;
    private String phone;
    private String deviceId;
    private boolean active;

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public boolean isActive() {
        return active;
    }
}