package com.kh.collectionEx.pack1.listEx;

import java.util.Scanner;

public class User기능실행 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User기능 userStore = new User기능();

        while (true) {
            System.out.println("\n ----사용자 관리 프로그램 ---");
            System.out.println("1. 사용자 추가");
            System.out.println("2. 추가된 유저 목록 모두 조회");
            System.out.println("3. 프로그램 종료");
            System.out.print("메뉴 선택: ");
            int choice = sc.nextInt();
            sc.nextLine(); // int 입력 후 남아있는 잔여 줄바꿈 제거

            switch (choice) {
                case 1:
                    userStore.addUser();
                    break;
                case 2:
                    userStore.allUsers();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
            }
        }
    }
}
