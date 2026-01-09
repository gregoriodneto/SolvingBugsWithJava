package org.greg.BackService;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance;

    public Account(BigDecimal balance) {
        this.balance = balance;
    }

    public void debit(BigDecimal value) {
        if (!canDebit(value)) {
            throw new IllegalStateException("Insufficient funds");
        }
        balance = balance.subtract(value);
    }

    public void credit(BigDecimal value) {
        if (value.signum() <= 0) {
            throw new IllegalArgumentException("Invalid value");
        }
        balance = balance.add(value);
    }

    private boolean canDebit(BigDecimal value) {
        return value.compareTo(BigDecimal.ZERO) > 0
                && value.compareTo(balance) <= 0;
    }
}
