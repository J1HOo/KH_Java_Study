package com.kh.collectionEx.pack2.setEx;

public class 회원기능실행 {
    public static void main(String[] args) {
        // 회원 더미데이터
        회원 u1 = new 회원(1, "홍길동", "hong@gmail.com", "산타기");
        회원 u2 = new 회원(2, "강길자", "gil@gmail.com", "강 구경");
        회원 u3 = new 회원(3, "박창실", "shil@gmail.com", "십자수");

        회원기능 service = new 회원기능();

        // 회원 저장
        service.addUser(u1);
        service.addUser(u2);
        service.addUser(u3);

        // 모든 회원 조회
        service.allUser();

        // 회원 검색 기능
        System.out.println("=== 회원 검색 ===");
        service.searchUser(1); // true
        service.searchUser(4); // false

        // 회원 삭제 기능
        System.out.println("=== 회원 삭제 ===");
        service.deleteUser(1); // true
        service.deleteUser(1); // false

        service.allUser();
    }
}