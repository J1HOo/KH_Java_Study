package com.kh.oop.methodPre;

public class StudentRun {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("홍길동");
        s.setAge(18);
        s.setGender("남성");
        s.setMajor("컴퓨터공학");

        System.out.println("이름 :" + s.getName() + "\n 나이 :" + s.getAge() + "\n 성별 :" + s.getGender() + "\n 전공 :" + s.getMajor());


    }
}
