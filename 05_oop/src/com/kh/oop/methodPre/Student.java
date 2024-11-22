package com.kh.oop.methodPre;

public class Student {
    // 필드 = 속성 = 멤버변수 = 전역변수(클래스 내에서 어디서든 불러 쓸 수 있는 변수)

    private String name; // 이름
    private int age; // 나이
    private String gender; // 성별
    private String major; // 전공

    //생성자
//    public class Student2(String name, int age, String gender, String major) {
//        // 필드 = 속성 = 멤버변수 = 전역변수(클래스 내에서 어디서든 불러 쓸 수 있는 변수)
//    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    // getter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    public String getMajor() {
        return major;
    }
}
