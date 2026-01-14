package org.greg.InventoryService;

public class Stock {
    private final Product product;
    private int quantity;

    public Stock(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductId() {
        return this.product.getId();
    }

    public void reserve(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }
        if (value > quantity) {
            throw new IllegalStateException("Insufficient stock");
        }
        quantity -= value;
    }
}
