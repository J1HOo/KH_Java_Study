package com.kh;

public class VariableEx2 {
    public static void main(String[] args) {
       /* 컴퓨터 값 처리 원칙
       * - 같은 자료형 끼리 연산, 결과도 같은 자료형
       *
       * ** 형변환 **
       * - 다른 자료형 끼리 연산하는 경우 자료형을 맞게 변환
       *
       *  ** 자동 형변환 **
       * - 연산 시 값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 변환
       * */

        // 자동 형변환 확인1
        int num1 = 9;
        long num2 = 10_000_000_000L; // 100억

        // num1과  num2를 합쳐서 담는 경우
        long result1 = num1 + num2;
        System.out.println(result1);

        // long보다 작은 int 안에 int + long을 담으려해서 에러 발생
       // int result2 = num1 + num2
    }
}