package org.greg.OrderService;

public class Customer {
    private final String name;
    private final boolean active;

    public Customer(String name,boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }
}
