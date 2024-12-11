package com.kh.StringEx;

public class StringEx {
    /*
String에 적혀있는 대표적인 기능들
String str = "안녕하세요";
str.length()                                 = 문자열의 길이를 반환
str.charAt(int index)                        = 특정 숫자 위치의 문자를 반환
str.indexOf(String str)                      = 특정 문자열의 첫번째 위치를 반환 ( 못찾으면 -1 )
str.lastIndexOf(String str)                  = 특정 문자열의 마지막 위치를 반환
str.contains(String str)                     = 문자열의 특정 값이 포함되어 있는지 true false로 확인
str.equals(String str)                       = 문자열이 같은지 비교(대소문자구분)
str.equalsIgnoreCase(String str)             = 문자열이 같은지 비교(대소문자구분 x)
str.toUpperCase()                            = 문자열을 모두 대문자로 변환
str.toLowerCase()                            = 문자열을 모두 소문자로 변환
str.trim()                                   = 문자열의 앞뒤 공백 제거
str.subString(int beginIndex)                = 특정 위치부터 끝까지 자르기
str.subString(int beginIndex,int endIndex)   = 특정 범위를 잘라내기
str.replace(target,replaceMent)              = 특정(target)문자를 다른 문자로 대체
str.replaceAll(String regex,replacement)     = 정규식을 이용해서 치환
str.split(String regex)                      = 문자열을 정규식 기준으로 나누기
str.concat(String str)                       = 문자열을 결합
str.join(구분자,결합1,결합2,결합3,....)          = 구분자를 이용해 문자열 결합
str.isEmpty()                                = 문자열이 비어있는지 확인 true false
str.isBlank()                                = 공백만 포함하거나 비어있는지 확인 true false
 */

    public static void main(String[] args) {

        StringEx stringEx = new StringEx();
        stringEx.methodString();

        StringEx method1 = new StringEx();
        method1.method1();

        StringEx method2 = new StringEx();
        method2.method2();

    }

    public void methodString() {
            String str1 = "Hello";
            String str2 = "Hello World!";

            // str1 문자열의 길이 반환
            System.out.println("str1 문자열 길이 : " + str1.length());

            // str2 1번 위치의 문자가 무엇인지 확인
            System.out.println("str2 1번 위치의 문자열 : " + str2.charAt(1)); // 수정: str1 -> str2

            // str2에서 첫 번째 l의 위치 반환
            System.out.println("str2에서 첫 번째 l의 위치 : " + str2.indexOf('l'));

            // str2에서 마지막 l의 위치 반환
            System.out.println("str2에서 마지막 l의 위치 : " + str2.lastIndexOf('l'));

            // str1이 "World"를 포함하고 있는지 확인
            System.out.println("str1에 'World' 포함 여부 : " + str1.contains("World"));

            // 문자열 비교 대소문자 구분 str1과 str2 비교
            System.out.println("str1과 str2의 대소문자 구분 비교 : " + str1.equals(str2));

            // 문자열 비교 대소문자 구분 X "hello world!" 와 비교
            System.out.println("str2와 'hello world!' 대소문자 구분 없이 비교 : " + str2.equalsIgnoreCase("hello world!"));

            // str1 문자열을 모두 대문자로 변환
            System.out.println("str1을 대문자로 변환 : " + str1.toUpperCase());

            // str2 문자열을 모두 소문자로 변환
            System.out.println("str2를 소문자로 변환 : " + str2.toLowerCase());

            // str1 앞뒤 공백 제거
            System.out.println("str1의 앞뒤 공백 제거 : " + str1.trim());

            // subString 이용해서 str3 6번째부터 끝까지 자르기
            String str3 = "Hello Java World";
            System.out.println("str3 6번째 부터 문자 제거 : " + str3.substring(6));

            // subString str3 3 ~ 7 까지만 자르기
            System.out.println("str3 3번째 부터 7번째 까지 문자 제거 : " + str3.substring(3, 7));

            // replace Java를 HTML로 글자 수정
            System.out.println("str3의 JAVA 워딩 HTML로 수정 : " + str3.replace("Java", "HTML"));

            // concat str4를 str3와 결합
            String str4 = " Let`s learn!";
            System.out.println("str3와 str4 결합 : " + str3.concat(str4));

            // split 문자열을 공백(" ")을 기준으로 나누고 for-each 이용해서 출력
            String[] texts = str3.split(" ");
             for (String text : texts) {
                 System.out.println("str3의 공백을 기준으로 글씨 나누기 : " + texts);
             }


        }


    ////    /**
//     * StringEx StringBuilderEx StringBufferEx 기능들 실행하는 공간
//     *
//     * @param args
//     */
//    public static void main(String[] args) {
//        StringEx se = new StringEx();
//        se.method1();
//        se.method2();
//    }

        public void method1() {
        String str = "안녕하세요, 반갑습니다.";
        System.out.println(str);

        str = "식사 맛있게 하셨나요?";
        System.out.println(str);
        }

    public void method2() {
        String str = "Hello";
        str += "World";
        System.out.println(str);
        }
    }
