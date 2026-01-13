package org.greg.OrderService;

public class OrderService {
    public static void placeOrder(Order order) {
        PaymentService.process(order);
        System.out.println("Order placed successfully");
    }
}