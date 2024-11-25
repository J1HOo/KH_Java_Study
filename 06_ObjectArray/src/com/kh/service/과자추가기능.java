package com.kh.service;

import com.kh.dto.과자;

public class 과자추가기능 {
    private 과자[] snacks; // 과자 배열
    // name, price, flavor 를 합쳐 하나의 과자로 배열에 저장
    private int count; // 현재 저장된 과자 수

    public 과자추가기능(int maxSnacks) {
        this.snacks = new 과자[maxSnacks]; // 과자 최대 갯수를 저장
        this.count = maxSnacks; // 현재 저장된 과자가 없으므로 현재 상태는 0
    }

    // 과자 추가 기능 설정
    public boolean addSnacks(String name, int price, String flavor) {
        if (count < snacks.length) { // 만약에 과자를 성공적으로 추가했다면
            snacks[count++] = new 과자(name, price, flavor); // 배열에 이름 맛 가격 붙여서 하나의 과자로 추가
            return true; // 성공적으로 추가 완료
        } return false;
    }

    // 과자 배열 반환
    public 과자[] getSnacks() {
        return snacks;
    }

    // 저장된 과자 개수 반환
    public int getCount() {
        return count;
    }

}
