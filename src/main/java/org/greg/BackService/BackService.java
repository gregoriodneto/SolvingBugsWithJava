package org.greg.BackService;

/*
* Um sistema bancário simples para transferências.
O código compila, mas:
Tem bugs
Tem más práticas
Pode quebrar facilmente
*
* O exercício é ajustar este código que recebi.
*/
public class BankService {

    public static void transfer(Account from, Account to, double value) {
        if (from.getBalance() > value) {
            from.setBalance(from.getBalance() - value);
            to.setBalance(to.getBalance() + value);
            System.out.println("Transfer successful");
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

class Account {
    public double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
