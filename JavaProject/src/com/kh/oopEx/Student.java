package com.kh.oopEx;

public class Student {
    // 필드 전역변수 접근제한자 사용가능 static 생략 가능
    private String name;
    private int age;

    // 메서드 (매개변수) 지역변수 접근제한자 사용 불가능
    // 기본 생성자 파라미터 생성자 Setter Getter toString void return main()
    public Student() {} // 기본 생성자

    public Student(String name, int age) {} // 파라미터 생성자

    public String getName() { // Getter
        return name;
    }
    public int getAge() { // Getter
        return age;
    }

    public void setName(String name) { // Setter
        this.name = name;
    }
    public void setAge(int age) { // Setter
        this.age = age;
    }

    @Override
    public String toString() { // toString
        return "Student [name=" + name + ", age=" + age + "]";
    }
}
