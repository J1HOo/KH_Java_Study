package com.kh.collectionEx.pack1.listEx;

import java.util.Scanner;

public class Snack기능실행 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Snack기능 snacks = new Snack기능();

        while (true) {
            System.out.println("\n --- 스낵 관리 프로그램 ---");
            System.out.println("1. 스낵 추가");
            System.out.println("2. 스낵 제거");
            System.out.println("3. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    snacks.addSnack(); // Snack기능 클래스 안에 작성된 addSnack 함수 불러오기
                    break;

                case 2:
                    System.out.print("삭제할 스낵 이름 입력 : ");
                    String removeName = sc.nextLine();

                    if (snacks.removeSnack(removeName)) {
                        System.out.println("스낵을 삭제 했습니다.");

                    } else {
                        System.out.println("일치하는 이름의 스낵이 없습니다.");
                    }
                    break;

                  case 3:
                      System.out.println("프로그램을 종료합니다.");
                      sc.close();
                      return;
            }

        }

    }
}
