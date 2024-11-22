package com.kh.oop.constructor;


public class Member {

    private String name;
    private int age;
    private String gender;

    public Member() {
        this.name = "";
        this.age = 0;
        this.gender = "";
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;


    }
    public Member(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
