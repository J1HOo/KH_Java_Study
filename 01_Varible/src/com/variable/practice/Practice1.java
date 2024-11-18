package com.variable.practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자를 입력하세요.");
        char text = sc.next().charAt(0);
        int changeNum = (int)text;
        System.out.println("1번 text 변수 값 확인하기 :" + text);
        System.out.println("2번 changeNum 변수 값 확인하기 :" + changeNum);
    }
}
