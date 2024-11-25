package com.kh.poly.pack2.maver;

public class 메이버실행 {
    public static void main(String[] args) {
        메이버블로그 blog1 = new 메이버블로그("이영희","010-8765-4321", "부산 해운대구","40", "momo", "여행 블로그");
        System.out.println(blog1.toString());



        메이버카페 cafe1 = new 메이버카페();

        cafe1.set유저이름("박철수");
        cafe1.set유저번호("010-1234-5678");
        cafe1.set유저주소("서울시 종로구");
        cafe1.set유저나이("30");
        cafe1.set카페권한("유저");
        cafe1.set카페가입명("요리 카페");

        System.out.println(cafe1.toString());

        메이버쇼핑 shopping1 = new 메이버쇼핑("한상섭","010-4567-8901","강원도 강릉","30","VIP",1000, 999999);
        System.out.println(shopping1.toString());

    }
}
