package com.kh.practice.todolist;

import java.io.File;
import java.util.Scanner;

public class TodoListManagerRun {
    private static String PATH = System.getProperty("user.home") + "/Desktop/";
    private static String FILE_NAME = "todolist"; // 기본 파일 이름
    private static String EXT_NAME = ".txt"; // 기본 확장자명

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TodoListManager manager = new TodoListManager();

        System.out.println("==== To-Do 리스트 관리 ====");
        System.out.println("1. 기존 파일 불러오기");
        System.out.println("2. 새로운 파일로 시작하기");
        System.out.print("옵션을 선택하세요 : ");
        String listChoice = sc.nextLine();

        switch (listChoice) {
            case "1":
                System.out.print("불러올 To-Do 리스트 파일 이름을 입력하세요(확장자 제외): ");
                FILE_NAME = sc.nextLine() + EXT_NAME;
                File file = new File(PATH, FILE_NAME);
                if (!file.exists()) {
                    System.out.println("파일을 찾을 수 없습니다: " + FILE_NAME + " 새로운 파일을 생성하거나 확인하세요.");
                    return;
                }
                break;

            case "2":
                System.out.print("새로운 To-Do 리스트 이름을 입력하세요(확장자 제외) : ");
                FILE_NAME = sc.nextLine() + EXT_NAME;
                manager.createTodo(PATH, FILE_NAME);
                break;
            default:
                System.out.println("잘못된 선택입니다. 기본 파일로 시작합니다 : " + FILE_NAME);
        }

        boolean isTrue = true;
        while (isTrue) {
            System.out.println("\n==== To-Do 리스트 ====");
            System.out.println("1. 할 일 목록 보기");
            System.out.println("2. 할 일 추가");
            System.out.println("3. 종료");
            System.out.print("옵션을 선택하세요 : ");
            String managerChoice = sc.nextLine();

            switch (managerChoice) {
                case "1":
                    manager.showTodo(PATH, FILE_NAME);
                    break;
                case "2":
                    System.out.print("새로운 할 일을 입력하세요 : ");
                    String line = sc.nextLine();
                    manager.addTodo(PATH, FILE_NAME, line);
                    break;
                case "3":
                    System.out.println("프로그램을 종료합니다.");
                    isTrue = false;
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }

        sc.close();
    }
}
