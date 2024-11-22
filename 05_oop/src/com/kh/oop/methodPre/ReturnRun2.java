package com.kh.oop.methodPre;

public class ReturnRun2 {
    // Main 메서드 최종으로 실행하고자 하는 객체와 기능을 작성하는 기능
    public static void main(String[] args) {
        ReturnPre2 pre = new ReturnPre2();
        pre.method1("홍길동", 40);
        System.out.println("method1 출력확인 : " + pre.method1("홍길동",40));

        pre.method2(123, 456);
        System.out.println("method2 출력확인 : " + pre.method2(40, 40));

        pre.method3(85);
        System.out.println("method3 출력확인 : " + pre.method3(85));

        pre.method4(10000,20);
        System.out.println("method4 출력확인 : " + pre.method4(10000,20));

//        pre.method5();
//        System.out.println("method5 출력확인 : " + pre.method5());

        pre.method6(17);
        System.out.println("method6 출력확인 : " + pre.method6(17));

        pre.method7("Hello", "World!");
        System.out.println("method7 출력확인 : " + pre.method7("Hello", "World!"));

        String arr[] = {"apple", "banana", "cherry"};
        pre.method8(arr, "banana");
        System.out.println("method8 번 출력확인 : " +  pre.method8(arr, "banana"));


        pre.method9(7);
        System.out.println("method9 번 출력확인 : " +  pre.method9(7));
    }
}
