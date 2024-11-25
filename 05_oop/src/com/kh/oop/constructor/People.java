package com.kh.oop.constructor;

// 필드
public class People {
    private String name;
    private int age;

    // 메서드
    // 1. 기본 생성자
    public People() {
        name = "";
        age = 0;
    }

    // 2. 파라미터 생성자
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 2. 원하는 것만 선언
    public People(String name) {
        this.name = name;
    }

    // 3. 값이 잘 들어가 있는지 확인하기 위해 사용
    @Override
    public String toString() {
        return "People [name=" + name + ", age=" + age + "]";
    }
}
