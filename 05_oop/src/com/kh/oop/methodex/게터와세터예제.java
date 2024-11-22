package com.kh.oop.methodex;

public class 게터와세터예제 {

    // private 멤버 변수
    private int age; // 나이를 받는 변수명

    // 세터 = 값 저장 = @Setter
    public void setAge (int age) {

        // setter에 값을 저장 할 때 밑과 같은 유효성 검사를 하지 않음
//        if(age <= 0) {
//            System.out.println("나이는 음수가 들어갈 수 없음");
//        }
        this.age = age;
    }

    // 게터 = 저장된 값 전달해서 사용 = @Getter
    public int getAge() {
        return age;
    }
}
