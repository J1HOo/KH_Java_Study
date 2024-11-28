package com.kh.exceptionPre;

public class ExceptionService {
    public void method1() {
        String name1 = "감길자";
        int health1 = 50; // 체력 100점 만점 50점

        String name2 = "홍길동";
        int health2 = 80;

        // 평균 체력 계산
        System.out.println(name1 + " 와 " + name2 + " 의 평균 체력을 계산합니다.");
        try {
        int avgHealth = (health1 + health2) / 0;
        System.out.println("평균 체력 : " + avgHealth);
        } catch (ArithmeticException e) {
            System.out.println("0으로 평균 체력을 나눠서 생기는 문제" + e);
        } catch (Exception e) { // 어떤 에외 상황인지 예상할 수 없을 때 작성하는 exception 으로 가장 마지막 catch 에 사용
            System.out.println(e.getMessage()); // 발생한 문제가 무엇인지 출력문으로 확인하되 프로그램이 강제종료 되지 않고 진행됨
            System.out.println("어떤 문제인지 확실히 알 순 없지만 문제가 발생했습니다.");
        }
    }
}
