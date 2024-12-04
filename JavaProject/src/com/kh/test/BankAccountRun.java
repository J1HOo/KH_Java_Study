package com.kh.test;

public class BankAccountRun {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123-456", 1000.0);

        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0);
    }

}
