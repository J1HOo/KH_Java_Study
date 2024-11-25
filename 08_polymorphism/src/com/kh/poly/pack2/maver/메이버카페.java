package com.kh.poly.pack2.maver;

public class 메이버카페 extends 메이버회원 {
    private String 카페권한;
    private  String 카페가입명;

    //기본생성자
    public 메이버카페(){
        super(); //메이버회원의 정보는 기본으로 가지고옴
    }

    public 메이버카페(String 유저이름, String 유저번호, String 유저주소, String 유저나이,String 카페권한, String 카페가입명 ) {
        super(유저이름, 유저번호, 유저주소, 유저나이);
        this.카페권한 = 카페권한;
        this.카페가입명 = 카페가입명;
    }

    // Getter
    public String get카페권한() {
        return 카페권한;
    }
    public String get카페가입명() {
        return 카페가입명;
    }

    // Setter
    public void set카페권한(String 카페권한) {
        this.카페권한 = 카페권한;
    }
    public void set카페가입명(String 카페가입명) {
        this.카페가입명 = 카페가입명;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + '\'' + " 카페 권한 : " +  카페권한 + " 카페 가입명 : " + 카페가입명;
    }
}
