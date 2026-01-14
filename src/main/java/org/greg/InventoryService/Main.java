package org.greg.InventoryService;

public class Main {
    public static void main(String[] args) {
        InventoryService inventory = new InventoryService();

        // Adicionando produtos ao estoque
        inventory.addProduct("P1", 10);
        inventory.addProduct("P2", 5);

        // Consultando estoque inicial
        System.out.println("Estoque inicial P1: " + inventory.getStock("P1"));
        System.out.println("Estoque inicial P2: " + inventory.getStock("P2"));

        // Tentando reservar quantidades válidas
        boolean reservedP1 = inventory.reserve("P1", 4);
        System.out.println("Reserva P1 (4 unidades): " + reservedP1);
        System.out.println("Estoque P1 após reserva: " + inventory.getStock("P1"));

        // Tentando reservar mais do que existe
        boolean reservedP2 = inventory.reserve("P2", 10);
        System.out.println("Reserva P2 (10 unidades): " + reservedP2);
        System.out.println("Estoque P2 após tentativa: " + inventory.getStock("P2"));

        // Tentando reservar produto inexistente
        boolean reservedP3 = inventory.reserve("P3", 1);
        System.out.println("Reserva P3 (produto inexistente): " + reservedP3);
    }
}
