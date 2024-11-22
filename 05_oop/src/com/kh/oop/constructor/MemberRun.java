package com.kh.oop.constructor;

public class MemberRun {
    public static void main(String[] args) {
        Member m1 = new Member();
        m1.setName("홍길동");
        m1.setAge(40);
        m1.setGender("여성");

        Member m2 = new Member("홍길동", 40, "여성");

        System.out.println("=== m1의 정보 ===");
        System.out.println(m1.getName());
        System.out.println(m1.getAge());
        System.out.println(m1.getGender());

        System.out.println("=== m2의 정보 ===");
        System.out.println(m2.getName());
        System.out.println(m2.getAge());
        System.out.println(m2.getGender());

        System.out.println("toString() 메서드 기능 재사용");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }
}
