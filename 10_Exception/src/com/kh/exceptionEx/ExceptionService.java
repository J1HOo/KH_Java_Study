package com.kh.exceptionEx;
/*
Exception (예외) : 코드로 처리 가능한 에러
Exception Handling (예외처리) :
 */
public class ExceptionService {
    // method1 문제를 발생시킬 것
    public  void method1() {
        // index = 0 1 2 3 4
        int[] arr = {1, 2, 3, 4, 5}; // 마지막 인덱스 == 4
        System.out.println(arr.length);

        // arr.length = 5
        // for 문으로 출력
        for (int i = 0; i < arr.length; i++) { // i = 0 부터 5까지 출력
            System.out.println(arr[i]);
        }
        /*
        Exception in thread "main"
        java.lang.ArrayIndexOutOfBoundsException : 1
        index 5 out of bounds for length 5

        예외 발생 구문을 try-catch 로 처리 (예외 처리)

        - try {} 예외가 발생할 수 있을 것 같은 코드들을 시도하는 구문

        - catch (예외) {} :
                    try 안에 작성한 코드들을 실행하던 도중 문제가 발생했고,
                    발생한 문제가 예상했던 문제와 같으면 catch(잡아서)
                    중괄호 안에 작성된 구문을 수행
                    -> 발생된 예외를 다른 방식으로 처리했기 때문에 프로그램이 멈추지 않고 진행

         문제가 발생하는데 어떤 문제인지 예상이 안될 경우
         catch(Exception e) {} : 모든 에러를 catch 해서 중괄호 안의 구문 수행
         */
    }
    // method2 발생한 문제를 유연하게 처리할 것 try-catch
    public void method2() {
        int[] arr = {1, 2, 3, 4, 5};
        try { // 문제가 생길 수 있지만 실행을 하도록
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) { // 발생된 문제를 저장하고 있는 변수명
            System.out.println("값에 문제가 발생했습니다 : " + e);
            // 문제가 생겼을 때 유연하게 처리함과 동시에 왜 문제가 발생했는지 피드백 할 수 있음

        }
    }
}
