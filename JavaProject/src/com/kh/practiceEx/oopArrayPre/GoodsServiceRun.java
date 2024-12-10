package com.kh.practiceEx.oopArrayPre;

import java.util.Scanner;

public class GoodsServiceRun {
    public static void main(String[] args) {
        GoodsService goodsService = new GoodsService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n === 상품 설정 시스템 ===");
            System.out.println("1. 상품 추가하기");
            System.out.println("2. 모든 상품보기");
            System.out.println("3. 원하는 상품보기(상품번호로 조회)");
            System.out.println("4. 상품제거하기(상품번호로 제거)");
            System.out.println("5. 종료하기");
            System.out.print("번호를 선택하세요 : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("상품 번호를 입력하세요 : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("상품 이름을 입력하세요 : ");
                    String name = sc.nextLine();

                    System.out.print("상품 가격을 입력하세요 : ");
                    int price = sc.nextInt();

                    System.out.print("상품 수량을 입력하세요 : ");
                    int quantity = sc.nextInt();
                    sc.nextLine();

                    goodsService.addGoods(new Goods(id, name, price, quantity));
                    break;

                case 2:
                    goodsService.displayAllGoods();
                    break;

                case 3:
                    System.out.print("조회할 상품 번호를 입력하세요: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();

                    Goods goods = goodsService.getGoodsById(searchId);
                        System.out.println("조회된 상품 정보: " + goods);
                        break;

                case 4:
                    System.out.print("삭제할 상품 번호를 입력하세요 : ");
                    int removeId = sc.nextInt();
                    sc.nextLine();
                    goodsService.removeGoods(removeId);
                    break;

                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("올바른 번호를 선택해주세요.");
            }
        }
    }
}