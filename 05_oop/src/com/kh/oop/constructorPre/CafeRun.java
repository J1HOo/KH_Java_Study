package com.kh.oop.constructorPre;

import java.util.Scanner;

public class CafeRun {
    // 1. main 메서드 생성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2. Scanner 이용해서 주문 받기
        System.out.print("주문할 메뉴 입력 : ");
        String menuName = sc.nextLine();

        System.out.print("가격 입력 : ");
        int menuPrice = sc.nextInt();

        System.out.print("수량 입력 : ");
        int menuQuantity = sc.nextInt();

        // 3. 필수 생성자를 이용해 객체 생성
        Cafe  c = new Cafe(menuName, menuPrice, menuQuantity);

        // 4. 주문 출력
        System.out.println("주문이 완료되었습니다!");
        System.out.println( c.toString());

        // 5. 총 주문 금액
        System.out.println("총 주문 금액: " +  c.TotalPrice());
    }
}