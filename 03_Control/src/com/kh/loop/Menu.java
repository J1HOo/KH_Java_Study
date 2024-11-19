package com.kh.loop;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void order() {
        int price = 0;
        int choice = 0;
        boolean is = true;

        String[] menuItems = {"아메리카노", "라떼", "카푸치노"};
        int[] prices = {3000, 4000, 4500};

        System.out.println("=== 메뉴판 ===");
        System.out.println("1. 아메리카노 - 3000원");
        System.out.println("2. 라떼 - 4000원");
        System.out.println("3. 카푸치노 - 4500원");
        System.out.println("4. 주문 종료");

        while (is) {
            System.out.print("메뉴를 선택하세요 : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.println(menuItems[choice - 1] + "를 선택하셨습니다.");
                    price += prices[choice - 1];
                    break;
                case 4:
                    System.out.println("주문을 종료합니다.");
                    System.out.println("총 주문 금액: " + price + "원");
                    is = false;
                    break;

                default:
                    System.out.println("잘못된 번호 입니다. 다시 선택하세요.");
            }
        }
    }
}