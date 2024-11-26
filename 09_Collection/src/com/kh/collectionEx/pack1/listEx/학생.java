package com.kh.collectionEx.pack1.listEx;

public class 학생 {
    private String name;
    private int grade;
    private String hobby;

    public 학생(String name, int grade, String hobby) {
        this.name = name;
        this.grade = grade;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "이름 : " + name + " 학년 : " + grade + " 취미 : " + hobby;
    }
}
