package org.greg.InventoryService;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {

    private final Map<String, Integer> stock = new HashMap<>();

    public void addProduct(String productId, int quantity) {
        stock.put(productId, quantity);
    }

    public boolean reserve(String productId, int quantity) {
        Integer available = stock.get(productId);

        if (available == null || available < quantity) {
            return false;
        }

        stock.put(productId, available - quantity);
        return true;
    }

    public int getStock(String productId) {
        return stock.getOrDefault(productId, 0);
    }
}