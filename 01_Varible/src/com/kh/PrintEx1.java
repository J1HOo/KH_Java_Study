package com.kh;

public class PrintEx1 {
    public static void main(String[] args) {
        /*
        * System.out == console 창
        *
        * System.out.print();
        * - () 내의 값을  출력 (줄바꿈 X)
        *
        * System.out.println();
        * - () 내의 값을  출력 (줄바꿈 O)
        *
        * System.out.printf("", 변수|값);
        * - 정해진 형식(패턴)에 맞게 문자열을 출력하는 구문
        *
        * - 첫 번째 매개 변수 ""
        *
        * -- 패턴이 적용된 문자열 작성
        *
        * 패턴 종류
        *
        * %d : 정수(byte, short, int)
        * %c : 문자(char)
        * %s : 문자열(String)
        * %b : 논리형(boolean)
        * %f : 실수형(float/double)
        *
        * 양수 : 오른쪽 정렬
        * 음수 : 왼쪽 정렬
        *
        * %숫자d : 정수가 출력된 칸을 숫자 만큼 확보
        *  예 ) %-6d : oooooo
        *
        * %.숫자f : 소수점 아래 몇 번째 자리 까지 표시할지 지정
        * (지정된 자리 아래에서 반올림)

        * - 두 번째 매개 변수
        * - 첫 번째 매개 변수 문자열 중 패턴에 들어갈 변수 | 값을 순서대로 작성
         */

        System.out.print("이름 : ");
        System.out.print("KHT");
        System.out.println(" 입니다.");
        System.out.println("오늘도 재미 있는 자바 공부 파이팅!");

        String name = "홍길동";
        int age = 18;
        double height = 173.37;
        char gender = '남';
        boolean study = true ;

        System.out.printf("%s %d세 %c성으로 키는 %.1fcm이고, 공부 여부 : %b", name, age, gender, height, study);

    }
}
