package com.kh.oopArrayPre;

import java.util.ArrayList;

public class StudentService {

    public static void main(String[] args) {
        // 배열로 학생0, 학생1 생성
        Student[] students = new Student[2];
        students[0] = new Student();
        students[1] = new Student("홍길동",10);

        // 기본 생성자를 이용해 이름, 나이, idCard 추가
        Student student2 = new Student();

        // 이름이 6글자 이상이면 저장되지 않게
        String inPutName = "김철수";
        if (inPutName != null && inPutName.length() <= 6) {
            student2.setName(inPutName);
            System.out.println("이름이 성공적으로 저장되었습니다." + inPutName);
        } else {
            System.out.println("이름은 6글자 이하 이어야 하고, 빈 공간일 수 없습니다 : " + inPutName + "저장 불가" );
        }

        int inPutAge = 18;
        if (inPutAge != 0 && inPutAge >= 12 && inPutAge <= 19) {
            student2.setAge(inPutAge);
            System.out.println("나이가 성공적으로 저장되었습니다." + inPutAge);
        } else {
            System.out.println("나이는 12세 이상 19세 이하만 작성할 수 있습니다. \n 어린이, 성인 입학 불가");
        }

        String inputIdCard = "idCard";
        if (inputIdCard != null && inputIdCard.length() <= 10) {
            student2.setIdCard(inputIdCard);
            System.out.println("이름이 성공적으로 저장되었습니다." + inputIdCard);
        } else {
        System.out.println("10저 이하의 기능만 추가 기입이 가능합니다.");
        }

        // 매게변수 생성자를 이용해서 학생 3번은 이름, 나이를 필수로 받되, idCard 선택적으로 set 이용
        Student student3 = new Student("강말숙",15);
        System.out.println("버스카드 기능 추가 (선택사항 / 금액 10,000 원)");
        String plusIdCard = "버스카드";
        if (plusIdCard != null && plusIdCard.length() <= 10) {
            student3.setIdCard(plusIdCard);
        } else {
            System.out.println("버스카드 기능 없이 학생증을 발급하겠습니다.");
        }

        // ArrayList 이용해서 학생 0 1 2 3의 목록 관리
        ArrayList<Student> studentsArrayList = new ArrayList<Student>();
        studentsArrayList.add(students[0]);
        studentsArrayList.add(students[1]);
        studentsArrayList.add(student2);
        studentsArrayList.add(student3);

        System.out.println("학생증 발급이 완료되었습니다.");
        System.out.println("=== 학생증 발급 ===");
        // for문
        for (int i = 0; i < studentsArrayList.size(); i++) {
            System.out.println(studentsArrayList.get(i).toString());
        }

        // 향상된 for문
        for (Student student : studentsArrayList) {
            System.out.println(student);
        }
    }
}
