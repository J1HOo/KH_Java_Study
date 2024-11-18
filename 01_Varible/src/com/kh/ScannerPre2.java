package com.kh;

import java.util.Scanner;

public class ScannerPre2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력 : ");
        String name = sc.next();

        System.out.print("나이를 입력 : ");
        int age = sc.nextInt();

        System.out.print("취미를 입력 : ");
        String hobby = sc.next();


        System.out.println();


        System.out.println("==== 자기 소개 ====");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("취미 : " + hobby);

    }
}
