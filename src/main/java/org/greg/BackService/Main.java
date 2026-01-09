package org.greg.BackService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account from = new Account(BigDecimal.valueOf(100));
        Account to = new Account(BigDecimal.valueOf(10));

        BankService.transfer(from, to, BigDecimal.valueOf(50));
    }
}
