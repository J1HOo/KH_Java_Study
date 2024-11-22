package com.kh.oop.methodPre;

public class PersonRun {
    public static void main(String[] args) {
    Person p = new Person();

        int inputAge = -40;

        // 유효성 검사
        if (inputAge <= 0) {
            System.out.println("나이는 음수 일 수 없습니다.");
        } else {
            p.setAge(inputAge); // Person 클래스에서 age 라는 변수에 intAge 라는 변수의 값을 넣는 것
        }

         // 40이라는 숫자가 잘 들어갔는지 확인
         p.getAge();

         //출력하라는 명령이 없으므로 println
         System.out.println(p.getAge());
    }
}
