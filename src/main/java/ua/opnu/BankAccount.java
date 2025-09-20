package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee = 1.0;

    BankAccount() {
        this("Вадим Рибалка", 0.0);
    }

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = Math.max(balance, 0.0); // Якщо баланс від'ємний, встановлюємо 0
    }

    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount + transactionFee) {
            balance -= amount + transactionFee;
            return true;
        }
        return false;
    }

    boolean transfer(BankAccount receiver, double amount) {
        if (receiver != null && amount > 0 && withdraw(amount)) {
            receiver.deposit(amount);
            return true;
        }
        return false;
    }

    double getBalance() {
        return balance;
    }

    String getName() {
        return name;
    }
}