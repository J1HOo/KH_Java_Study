package com.kh.oopArrayPre;

import java.util.Scanner;

public class PersonService {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print(i + " 번째 이름을 입력하세요: ");
            String name = sc.nextLine();

            System.out.print(i + " 번째 나이를 입력하세요: ");
            int age = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            people[i] = new Person(name, age);
        }

        System.out.println("\n 모든 사람이 등록되었습니다.");
        for (int i = 0; i < 4; i++) {
            System.out.println(people[i]);
        }
        sc.close();
    }

//        people[0] = new Person("홍길동", 20);
//        people[1] = new Person("박길자", 30);
//        people[2] = new Person("오성순", 40);
//        people[3] = new Person("강하석", 50);

    // 1. 일반 for문
//        for (int i = 0; i < people.length; i++) {
//            System.out.println(people[i]);
//        }
//
//        // 2. 향상된 for문
//        for (Person p : people) {
//            System.out.println(p);
//         }
}
