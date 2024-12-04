package com.kh.test;

import java.util.Scanner;

public class Division {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("첫 번째 정수를 입력하세요: ");
            int a = sc.nextInt();

            System.out.print("두 번째 정수를 입력하세요: ");
            int b = sc.nextInt();

            try {
                int result = a / b;
                System.out.println("결과: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }
        }
    }
