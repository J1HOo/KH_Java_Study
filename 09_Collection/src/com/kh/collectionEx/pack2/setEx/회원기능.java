package com.kh.collectionEx.pack2.setEx;

import java.util.HashSet;

public class 회원기능 {
    private HashSet<회원> userList = new HashSet<>();

    // 회원 추가 기능
    public void addUser(회원 user) {
        if (userList.add(user)) {
            System.out.println("유저가 추가되었습니다: " + user);
        } else {
            System.out.println("이미 존재하는 유저입니다: " + user);
        }
    }

    // 회원 모두 조회 기능
    public void allUser() {
        if (userList.isEmpty()) {
            System.out.println("등록된 유저가 없습니다.");
        } else {
            System.out.println("모든 유저 목록 : ");
            for (회원 user : userList) {
                System.out.println(user);
            }
        }
    }

    // 회원 검색 기능
    public void searchUser(int id) {
        for (회원 user : userList) {
            if (user.getId() == id) {
                System.out.println("유저를 찾았습니다: " + user);
                return;
            }
        }
        System.out.println("유저를 찾을 수 없습니다: ID = " + id);
    }

    // 회원 삭제 기능 (단순 아이디로 삭제)
    public void deleteUser(int id) {
        for (회원 user : userList) {
            if (user.getId() == id) {
                userList.remove(user);
                System.out.println("유저가 삭제되었습니다: " + user);
                return;
            }
        }
        System.out.println("삭제할 유저를 찾을 수 없습니다: ID = " + id);
    }
}