package com.kh.oop.lombokPre;

public class PersonRun {
    public static void main(String[] args) {
        // Setter 이용해서 부분적으로 값 넣고 출력
        Person person1 = new Person();
        person1.setName("John");

        // Getter 이용해서 저장되어 있는 값 출력하기
        System.out.println(person1.getName());

        // AllArgsConstructor 이용해서 모든 값 한 번에 넣고 출력
        Person person2 = new Person();


    }
}
