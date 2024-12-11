package com.kh.practiceEx.StringEx;

public class StringBuilderPre {

    public static void main(String[] args) {
        String str = "Welcome";

        // 1. 작성된 객체를 StringBuilder sb로 변환해서 사용
        StringBuilder sb = new StringBuilder(str);

        // 2. to Java 이어서 작성
        sb.append(" to Java");

        // 3. 8번째 자리에 the world of 글자 추가
        sb.insert(8, " the world of");

        // 4. 4 ~ 11 come to 변경
        sb.replace(4, 11, "come to");

        // 5. 20 25 문자 삭제
            sb.deleteCharAt(20);
            sb.deleteCharAt(25);


        // 6. sb 뒤집기
        sb.reverse();

        System.out.println(sb);
    }
}