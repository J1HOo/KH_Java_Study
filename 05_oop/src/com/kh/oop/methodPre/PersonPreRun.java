package com.kh.oop.methodPre;

import java.util.Scanner;

public class PersonPreRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonPre person = new PersonPre();


        System.out.print("이름을 입력해주세요.");
        String name = sc.nextLine();

        if (name == " " || name == null) {
            System.out.print("빈칸은 이름으로 들어갈 수 없습니다.");
        } else {
            person.setName(name);
        }

        System.out.print("나이를 입력해주세요.");
        int age = sc.nextInt();

        if (age <= 0) {
            System.out.println("나이는 음수 일 수 없습니다.");
        } else {
        person.setAge(age);
        }

        System.out.println("이름 : " + person.getName());
        System.out.println("나이 : " + person.getAge());
    }
}
