package com.kh.collectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class User기능 {

    private ArrayList<User> userList = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    public void addUser() {
        System.out.println("\n==== 사용자 추가 ====");
        System.out.print("사용자 이름: ");
        String username = sc.nextLine();

        System.out.print("비밀번호: ");
        String password = sc.nextLine();

        System.out.print("이메일: ");
        String email = sc.nextLine();

        User user = new User(username, password, email);
        userList.add(user);
        System.out.println("사용자가 추가되었습니다.");
    }

    public void allUsers() {
        System.out.println("\n==== 추가된 사용자 목록 ====");

        if (userList.isEmpty()) {
            System.out.println("등록된 사용자가 없습니다.");
        } else {
            for (User user : userList) {
                System.out.println(user);
            }
        }
    }
}
