package com.kh.collectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class 학생기능 {
    public void addStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("학생의 학년을 입력하세요 : ");
        int grade = sc.nextInt();

        System.out.print("학생의 취미를 입력하세요 : ");
        String hobby = sc.nextLine();

        학생 s1 = new 학생(name, grade, hobby); // 학생 하나의 정보를 등록
        학생 s2 = new 학생("홍길동", 10, "공부하기");
        학생 s3 = new 학생("박철수", 20, "친구만나기");
        ArrayList<학생> std1 = new ArrayList<학생>(); // 등록한 학생들의 순서대로 정보 리스트를 생성
        std1.add(s1);
        std1.add(s2); // 더미데이터
        std1.add(s3); // 더미데이터

        for (학생 student : std1 ) {
            System.out.println(student);
        }

    }
}
