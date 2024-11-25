package com.kh.poly.pack2.maver;

public class 메이버쇼핑 extends 메이버회원 {
    private String 등급;
    private int 결제횟수;
    private  int point;

    //기본생성자
//    public 메이버쇼핑(){
//        super(); //메이버회원의 정보는 기본으로 가지고옴
//    }

    public 메이버쇼핑(String 유저이름, String 유저번호, String 유저주소, String 유저나이,String 등급, int 결제횟수, int point ) {
        super(유저이름, 유저번호, 유저주소, 유저나이);
        this.등급 = 등급;
        this.결제횟수 = 결제횟수;
        this.point = point;
    }

    // Getter


    // Setter


    // toString
    @Override
    public String toString() {
        return super.toString() + '\'' + " 등급 : " +  등급 + " 결제횟수 : " + 결제횟수 + " 포인트 : " + point;
    }
}
