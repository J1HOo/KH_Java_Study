package kh.com.ex;

public class 비교 {

    /*
    *   .equals()
    *    String 으로 비교한 문자열의 내용(값)이 같은지 비교하는 기능
    *    문자열의 값이 동일하면 true 반환
    *
    *   ==
    *    두 객체가 같은 메모리 주소를 참조하고 있는지 비교
    *    두 문자열 객체가 같은 메모리에 저장되어 있지 않다면
    *    값이 같더라도 false 를 반환 할 수 있음
    *
    *
    *   값(value) : 문자열의 실제 내용
    *
    *    메모리 주소(Memory Address) : 객체의 위치, 우리가 값을 변수에 저장하면 컴퓨터는 그 값을 메모리에 저장 후 주소를 기억
    *
    *   == 과 .equals() 의 차이
    *    ==는 메모리 주소를 비교, 두 변수가 가르키고 있는 메모리 주소가 같으면 true
    *    .equals()는 두 변수의 실제 값(value)이 같다면 true
    *
    *   equalsIgnoreCase()
    *     대소문자를 구분하지 않고 문자열을 비교하는 메서드
    *     ex)
    *     String a = "Hello"
    *     String b = "HELLO"
    *
    *     a.(equalsIgnoreCase(b) // true
    *     b.(equalsIgnoreCase("hi") // false
    *
    *    .equalIgnoreCase() : 문자열 내용이 같으면 대소문자는 구분 X
    *                        -> 응답을 받을 때 대소문자를 거르지 않기 위해
    *    .equals() : 문자열이 대소문자도 차이나면 안됨

    * */
}
