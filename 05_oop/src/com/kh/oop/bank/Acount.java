package com.kh.oop.bank;

// 계좌 클래스
public class Acount {
   private String name;
   private String accountNumber;
   private String password;
   private double balance;

   // setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // getter
    public String getName() {
        return name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getPassword() {
        return password;
    }
    public double getBalance() {
        return balance;
    }

    // 기능설정 = method 설정
    // 전달받은 금액을 balance 에 누적한 후 현재 잔액을 출력
    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " 의 현재 잔액 : " + balance);
    }

    public void withdraw(double amount) {
        if(balance < amount) {
            System.out.println("잔액이 부족합니다.");
            System.out.println(name + " 의 현재 잔액 : " + balance);

        } else if (amount <= 0) {
            System.out.println("잘못된 출금 금액 입니다.");
        } else {
            balance -= amount;
            System.out.println(name + " 의 현재 잔액 : " + balance);
        }
    }
}
