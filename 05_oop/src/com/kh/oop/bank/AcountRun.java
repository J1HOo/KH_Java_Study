package com.kh.oop.bank;

public class AcountRun {
    public static void main(String[] args) {
        Acount acc = new Acount();

        // set 사용해서 간접 접근
        acc.setName("동그라미"); // 예금주
        acc.setAccountNumber("1234-56-789"); // 계좌번호
        acc.setPassword("123456"); // 비밀번호
        acc.setBalance(500); // 잔액

        System.out.println(acc.getName());
        System.out.println(acc.getAccountNumber());
        System.out.println(acc.getPassword());
        System.out.println(acc.getBalance());

        System.out.println("=== 계좌에 입금을 시작합니다. ===");
        acc.deposit(100000);

        System.out.println("=== 계좌에 출금을 시작합니다. ===");
        acc.withdraw(10);

    }
}
