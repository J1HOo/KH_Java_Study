package com.kh.testEx.test1pre;

import java.util.Scanner;

public class MemberRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Member member = new Member();

        System.out.println("아이디를 입력하세요.");
        member.setId(scanner.nextLine());

        System.out.println("이름을 입력하세요.");
        member.setName(scanner.nextLine());

        System.out.println("비밀번호를 입력하세요.");
        member.setPassword(scanner.nextLine());

        System.out.println(" === 로그인 ===");
        System.out.println("아이디를 입력하세요.");
        String id = scanner.nextLine();
        System.out.println("비밀번호를 입력하세요.");
        String password = scanner.nextLine();

       if(member.login(id, password) == true) {
           System.out.println(member.getName() + " 님 만나서 반갑습니다!");
       } else {
           System.out.println("아이디 또는 패스워드가 일치하지 않습니다.");
       }
    }
}
