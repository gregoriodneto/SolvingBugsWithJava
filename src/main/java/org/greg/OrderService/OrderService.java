package org.greg.OrderService;

public class OrderService {

    public boolean placeOrder(Order order) {
        if (order == null) {
            return false;
        }

        if (order.getItems() == null || order.getItems().isEmpty()) {
            return false;
        }

        if (order.getTotal() <= 0) {
            return false;
        }

        if (!order.getCustomer().isActive()) {
            return false;
        }

        if (!PaymentService.process(order)) {
            return false;
        }

        return true;
    }
}

class Order {
    private List<String> items;
    private double total;
    private Customer customer;

    public List<String> getItems() {
        return items;
    }

    public double getTotal() {
        return total;
    }

    public Customer getCustomer() {
        return customer;
    }
}

class Customer {
    private boolean active;

    public boolean isActive() {
        return active;
    }
}

class PaymentService {
    public static boolean process(Order order) {
        return true;
    }
}
