package com.kh.run;

import com.kh.service.과자추가기능;
import com.kh.view.과자정보출력;

public class 과자기능실행 {
    public static void main(String[] args) {
        // 회사명 추가
        String companyName = "맛나 과자";

        // 과자 최대 추가 갯수 5개로 지정
        int maxSnacks = 5;

        // 과자 추가 기능, 과자정보출력 가져오기
        과자추가기능 service = new 과자추가기능(maxSnacks);

        과자정보출력 view = new 과자정보출력();
        view.과자리스트출력(companyName,service.getSnacks(), service.getCount());

        // 과자 추가를 무사히 했는지 추가 결과 넣기
        view.추가결과(service.addSnacks("초코칩 쿠키", 1500, "달콜함 초코맛)"));
        view.추가결과(service.addSnacks("허니버터칩", 2000, "달콜함 버터맛"));
        view.추가결과(service.addSnacks("새우깡", 1200, "짭짤한 새우맛"));
        view.추가결과(service.addSnacks("고구마칩", 1800, "달콜함 고구마맛"));
        view.추가결과(service.addSnacks("감자칩", 1500, "고소한 감자맛"));
        view.추가결과(service.addSnacks("치즈볼", 1900, "고소한 치즈맛"));



    }
}
