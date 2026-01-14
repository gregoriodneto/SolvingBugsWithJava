package org.greg.InventoryService;

public class Product {
    private final String id;

    public Product(String id) {
        this.id = id;
    }

    protected String getId() {
        return id;
    }
}
