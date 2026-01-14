package org.greg.InventoryService;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {

    private final Map<String, Stock> stock = new HashMap<>();

    public void addProduct(String productId, int quantity) {
        if (stock.containsKey(productId)) {
            throw new IllegalStateException("Product already exists");
        }
        stock.put(productId, new Stock(quantity, new Product(productId)));
    }

    public void reserve(String productId, int quantity) {
        Stock available = stock.get(productId);

        if (available == null) {
            throw new IllegalStateException("Not available");
        }

        if (available.getQuantity() < quantity) {
            throw new IllegalStateException("Quantity less than the stock level");
        }

        available.reserve(quantity);
        stock.put(productId, available);
    }

    public int getStock(String productId) {
        Stock stockItem = stock.get(productId);
        return stockItem != null ? stockItem.getQuantity() : 0;
    }
}