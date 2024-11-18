package com.variable.practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요.");
        float 국어 = sc.nextFloat();

        System.out.print("영어 점수를 입력하세요.");
        float 영어 = sc.nextFloat();


        System.out.print("수학 점수를 입력하세요.");
        float 수학 = sc.nextFloat();

        int 총점 = (int) ((int)국어 + 영어 + 수학);
        int 평균 = (int) (((int)국어 + 영어 + 수학)/3);


        System.out.println("총점 : " + 총점);
        System.out.println("평균 : " + 평균);
    }
}
