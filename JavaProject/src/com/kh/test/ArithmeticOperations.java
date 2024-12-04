package com.kh.test;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int b = sc.nextInt();

        System.out.println("합: " + (a + b));
        System.out.println("차: " + (a - b));
        System.out.println("곱: " + (a * b));
        System.out.println("몫: " + (a / b));
        System.out.println("나머지: " + (a % b));
    }
}
