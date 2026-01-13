package org.greg.OrderService;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Macbook", new BigDecimal("12000.00"));
        Item item2 = new Item("Tv", new BigDecimal("2000.00"));
        Item item3 = new Item("Car", new BigDecimal("40000.00"));

        List<Item> items = List.of(item1, item2, item3);

        Customer customer = new Customer("Zé", true);

        Order order1 = new Order(items, customer);

        PaymentService.process(order1);
    }
}
