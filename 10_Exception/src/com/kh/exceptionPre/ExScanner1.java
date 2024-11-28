package com.kh.exceptionPre;

import java.util.Scanner;

public class ExScanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();

            int sum = num1 / num2;
            System.out.println("나누기 결과 : " + sum);

        } catch (ArithmeticException e) {
            System.out.println("예외 발생 : " + e);
            System.out.println("0으로 숫자를 나눌 수 없습니다.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("예기치 못한 오류가 발생 하였습니다.");
        }
    }

}
