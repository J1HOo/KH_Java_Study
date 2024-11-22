package com.kh.oop.constructor;

public class StudentRun {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("홍길동");
        student1.setAge(21);
        student1.setGender("남성");
        student1.setMajor("컴퓨터공학");
        student1.setGpa(3.8);
        student1.setPhoneNumber("010-2345-6789");
        student1.setEmail("hong123@gmail.com");
        student1.setAddress("서울");

        Student student2 = new Student("김영희", 22, "여성","자바공학", 3.9, "010-8765-4321", "kim_young@gmail.com", "경기도");

        // toString 출력
        System.out.println("== toString 출력 ==");
        System.out.println(student1);
        System.out.println(student2);

        // Getter로 값 확인
        System.out.println("Student1 전공: " + student1.getMajor()); // 학생1 전공
        System.out.println("Student2 학점: " + student2.getGpa()); // 학생2 학점

    }
}
