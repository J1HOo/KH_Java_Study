package com.kh.oop.methodPre;

import java.util.Scanner;

public class PersonPreRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonPre person = new PersonPre();


        System.out.print("이름을 입력해주세요.");
        String name = sc.nextLine();

        System.out.print("나이를 입력해주세요.");
        int age = sc.nextInt();

        // trim() : 좌우 공백 제거 -> name의 공백을 제거하고(trim) 그 길이가(length) <= 0 일 때
        // isEmpty : 값이 빈 문자열인지 확인 -> name.trim().isEmpty() 이름의 공백을 제거 -> 이름의 값이 빈 문자열인지 확인
        if (name.trim().length() <= 0 || name == null) {
            System.out.println("빈칸은 이름으로 들어갈 수 없습니다.");
        } else {
            person.setName(name);
        }

        if (age <= 0) {
            System.out.println("나이는 음수 일 수 없습니다.");
        } else {
        person.setAge(age);
        }

        if (person.getName() != null && person.getAge() > 0) {

        System.out.println("이름 : " + person.getName());
        System.out.println("나이 : " + person.getAge());
        }
    }
}
