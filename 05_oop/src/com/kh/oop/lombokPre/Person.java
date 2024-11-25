package com.kh.oop.lombokPre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor // 기본 생성자 어노테이션
@AllArgsConstructor // 필수 생성자 어노테이션
@Setter // Setter 어노테이션
@Getter // Getter 어노테이션
public class Person {

    private String name;
    private int age;

    /*
    @NoArgsConstructor
    public Person() {

    }
    기본생성자 : 넣어야하는 매개변수가 없기 때문에 NoArgsConstructor
    () -> 필수 값이 없기 때문에 매개변수명이 존재 X


    @AllArgsConstructor
    public void Name(String name, int age) {
    this.name = name;
    this.age = age;
    }
    파라미터 생성자


    @Setter
    public void setName(String name, int age) {
    this.name = name;
    this.age = age;
    }

     */

}
