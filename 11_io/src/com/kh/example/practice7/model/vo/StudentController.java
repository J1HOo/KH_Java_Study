package com.kh.example.practice7.model.vo;

import java.util.ArrayList;

public class StudentController {
    private ArrayList<Student> students;

    public StudentController() {
        students = new ArrayList<>();
        students.add(new Student("김길동", "자바", 100));
        students.add(new Student("박길동", "디비", 50));
        students.add(new Student("이길동", "화면", 85));
        students.add(new Student("정길동", "서버", 60));
        students.add(new Student("홍길동", "자바", 20));
    }

    public ArrayList<Student> printStudent() {
        return students;
    }

    public int sumScore() {
        int sum = 0;
        for (Student student : students) {
            sum += student.getScore();
        }
        return sum;
    }

    public double[] avgScore() {
        double[] result = new double[2];
        int sum = sumScore();
        result[0] = sum;
        result[1] = sum / (double) students.size();
        return result;
    }

    public void printResult() {
        int CUT_LINE = 60;
        for (Student student : students) {
            if (student.getScore() < CUT_LINE) {
                System.out.println(student.getName() + "학생은 재시험 대상입니다.");
            } else {
                System.out.println(student.getName() + "학생은 통과입니다.");
            }
        }
    }
}

