package org.greg.OrderService;

public class PaymentService {
    public static void process(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null");
        }

        System.out.println("Payment processed for customer: " + order.getNameCustomer());
    }
}
