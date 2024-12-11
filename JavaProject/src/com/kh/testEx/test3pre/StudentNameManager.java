package com.kh.testEx.test3pre;

import java.util.HashSet;
import java.util.Scanner;

public class StudentNameManager {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashSet<String> studentSet = new HashSet<>();

        while (true) {
            System.out.println("학생 관리 프로그램");
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 삭제");
            System.out.println("3. 학생 목록 출력");
            System.out.println("4. 특정 학생 존재 여부 확인");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택 : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: // 학생 추가
                    System.out.print("추가할 학생 이름 : ");
                    String addName = scanner.nextLine();
                    if (studentSet.add(addName)) {
                        System.out.println(addName + " 학생이 추가되었습니다.");
                    } else {
                        System.out.println(addName + " 학생은 이미 존재합니다.");
                    }
                    break;

                case 2: // 학생 삭제
                    System.out.print("삭제할 학생 이름 : ");
                    String removeName = scanner.nextLine();
                    if (studentSet.remove(removeName)) {
                        System.out.println(removeName + " 학생이 삭제되었습니다.");
                    } else {
                        System.out.println(removeName + " 학생을 찾을 수 없습니다.");
                    }
                    break;

                case 3: // 학생 목록 출력
                    System.out.println("학생 목록 : ");
                    if (studentSet.isEmpty()) {
                        System.out.println("학생이 존재하지 않습니다.");
                    } else {
                        for (String student : studentSet) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 4: // 특정 학생 존재 여부 확인
                    System.out.print("학생 이름 : ");
                    String checkName = scanner.nextLine();
                    if (studentSet.contains(checkName)) {
                        System.out.println(checkName + " 학생이 존재합니다.");
                    } else {
                        System.out.println(checkName + " 학생을 찾을 수 없습니다.");
                    }
                    break;

                case 5: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}
