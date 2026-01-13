package org.greg.OrderService;

import java.lang.reflect.InaccessibleObjectException;
import java.math.BigDecimal;
import java.util.List;

public class Order {
    private final List<Item> items;
    private final Customer customer;

    private BigDecimal total;

    public Order(List<Item> items, Customer customer) {
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("Items cannot be null");
        }
        if (!customer.isActive()) {
            throw new IllegalStateException("Customer is inative");
        }

        this.items = items;
        this.customer = customer;
        this.total = calcTotalItems();
    }

    public BigDecimal calcTotalItems() {
        total = items.stream()
                .map(Item::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        if (total.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalStateException("Total it cannot be zero");
        }
        return total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public String getNameCustomer() {
        return customer.getName();
    }
}
