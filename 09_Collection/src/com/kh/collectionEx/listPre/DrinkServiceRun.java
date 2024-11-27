package com.kh.collectionEx.listPre;

import java.util.Scanner;

public class DrinkServiceRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DrinkService drinkService = new DrinkService();

        while (true) {
            System.out.println("\n========= 메뉴 =========");
            System.out.println("1. 음료 추가하기");
            System.out.println("2. 모든 음료 리스트 확인하기");
            System.out.println("3. 음료 검색 (이름으로 검색)");
            System.out.println("4. 음료 검색 (가격으로 검색)");
            System.out.println("5. 음료 제거하기");
            System.out.println("6. 종료");
            System.out.print("번호를 입력하세요 : ");

            int choice = sc.nextInt();
            sc.nextLine();  // 입력 버퍼 정리

            switch (choice) {
                case 1:
                    System.out.print("음료 이름을 입력하세요 : ");
                    String drinkName = sc.nextLine();
                    System.out.print("음료 가격을 입력하세요 : ");
                    int drinkPrice = sc.nextInt();
                    sc.nextLine();

                    drinkService.addDrink(drinkName, drinkPrice);
                    break;

                case 2:
                    drinkService.allDrink();
                    break;

                case 3:
                    System.out.print("검색할 음료 이름을 입력하세요 : ");
                    String searchName = sc.nextLine();
                    drinkService.searchDrink(searchName);
                    break;

                case 4:
                    System.out.print("검색할 음료 가격을 입력하세요 : ");
                    int searchPrice = sc.nextInt();
                    sc.nextLine();

                    drinkService.searchDrink(searchPrice);
                    break;

                case 5:
                    System.out.print("제거할 음료 이름을 입력하세요 : ");
                    String removeName = sc.nextLine();
                    drinkService.removeDrink(removeName);
                    break;

                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 번호를 다시 확인 해주세요.");
            }
        }
    }
}