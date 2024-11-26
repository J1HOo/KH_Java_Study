package com.kh.collectionEx.pack1.listEx;

import java.util.Scanner;

public class ClothingStoreRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClothingStore cs = new ClothingStore();

        while (true) {
            System.out.println("\n --- 쇼핑몰 옷 관리 프로그램 ---");
            System.out.println("1. 옷 추가");
            System.out.println("2. 옷 제거");
            System.out.println("3. 옷 목록 보기");
            System.out.println("4. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("옷 이름 입력 : ");
                    String name = sc.nextLine();

                    System.out.print("카테고리 입력 (상의, 하의, 외투 등) : ");
                    String category = sc.nextLine();

                    System.out.print("가격 입력 : ");
                    int price = sc.nextInt();
                    sc.nextLine();

                    Clothing clothing = new Clothing(name, category, price);
                    cs.addClothing(clothing);
                    break;

                case 2:
                    System.out.print("삭제할 옷 이름 입력 : ");
                    String removeName = sc.nextLine();

                    if (cs.removeClothing(removeName)) {
                        System.out.println("옷을 삭제 했습니다.");

                    } else {
                        System.out.println("일치하는 이름의 옷이 없습니다.");
                    }
                    break;

                case 3:
                    cs.allClothing();
                    break;

                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }
}