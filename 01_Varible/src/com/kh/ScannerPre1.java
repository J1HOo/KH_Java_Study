package com.kh;

import java.util.Scanner;
// import : 외부 폴더나 내부 폴더에서 특정 파일을 가져오기
// import 폴더명1.폴더명2.파일명;
// 다른 파일에서 특정 파일을 가져오 사용할 때는 파일명 맨 앞글자가 영어로 대문자인지 확인하기
// 파일 이름을 소문자로 모두 작성한 경우 외부에서 파일 가져오기 X
// 자바 자체에서 만든 파일 이름과 똑같은 이름의 파일 만들기 절대 금지 XXX

public class ScannerPre1 {
    public static void main(String[] args) {
        // 외부에서 가져온 파일명 작성
        // 자료형 변수명 - 새로운 스캐너 시작(프로그램 내에서 작성한 값 읽기모드);
        Scanner  sc =    new Scanner (System.in);
        // 매번 new Scanner(System.in)을 선언하기 번거롭기 때문에 변수에 담아 한 번만 선언하고 사용

        System.out.print("Enter your number1: ");
        int num1 = sc.nextInt(); // 정수 1번 입력

        System.out.print("Enter your number2: ");
        int number2 = sc.nextInt();

        System.out.print("Enter your number3(실수): ");
        float num3 = sc.nextFloat();

        // String의 경우 몇 byte인지 측정 불가능해서 sc.next로 사용(nextString XX)
        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.println("number1 : " + num1 + "number2 : " + number2 + "number3 :  " + num3+"name : " + name);


    }
}
