package com.kh.collectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class 학생기능실행 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        학생기능 학생기능 = new 학생기능();

        while (true) {
            System.out.println("\n --- 학생 관리 프로그램 ---");
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 제거");
            System.out.println("3. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    학생기능.addStudent();
                    break;

                case 2:
                    System.out.print("삭제할 학생 이름 입력 : ");
                    String removeName = sc.nextLine();

                    if (학생기능.removeStudent(removeName)) {
                        System.out.println("학생을 삭제했습니다.");
                    } else {
                        System.out.println("일치하는 이름의 학생이 없습니다.");
                    }
                    break;

                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    break;
            }
        }
    }
}