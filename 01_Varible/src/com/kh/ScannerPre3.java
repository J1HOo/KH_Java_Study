package com.kh;

import java.util.Scanner;

public class ScannerPre3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자를 입력하세요.");
        // String text = sc.nextLine(); -> 여러 문자들을 가져오는 방법
        char text = sc.next().charAt(0); // 몇번째 단어를 가져올건지 ex) charAt(0); : 첫 번째 단어, 만약 존재 하지 않는 위치에 값을 불러오면 에러 발생
        int changeNum = (int)text; // 단어(char) -> 숫자(int) 강제 형변환
        System.out.println("1번 text 변수 값 확인하기 :" + text);
        System.out.println("2번 changeNum 변수 값 확인하기 :" + changeNum);

        System.out.print("숫자 1번 : ");
        int num1 = sc.nextInt();

        System.out.print("숫자 2번 : ");
        int num2 = sc.nextInt();

        System.out.println("숫자 합 : " + num1 + num2);

    }
}
