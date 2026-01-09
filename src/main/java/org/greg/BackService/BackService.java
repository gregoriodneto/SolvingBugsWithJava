package org.greg.BackService;

import java.math.BigDecimal;

class BankService {

    public static void transfer(Account from, Account to, BigDecimal value) {
        from.debit(value);
        to.credit(value);
        System.out.println("Transfer successful");
    }
}