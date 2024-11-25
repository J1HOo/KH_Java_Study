package com.kh.oop.OopEx;

public class Bread {
    // 필드 인스턴스 변수 속성 전역변수
    private String breadName; // 이름
    private int breadPrice; // 가격
    private  int quantity; // 수량

    // 메서드(기능, 함수) 기본 매개변수 Setter Getter ToString

    // 1. Setter
    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }
    public void setBreadPrice(int breadPrice) {
        this.breadPrice = breadPrice;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // 2. Getter
    public String getBreadName() {
        return breadName;
    }
    public int getBreadPrice() {
        return breadPrice;
    }
    public int getQuantity() {
        return quantity;
    }

    // 3. 기본 생성자
    public Bread() {
    }

    // 4. 필수 생성자
    public Bread(String breadName, int breadPrice, int quantity) {
        this.breadName = breadName;
        this.breadPrice = breadPrice;
        this.quantity = quantity;
    }

    // 5. toString
    @Override
    public String toString() {
        return "Bread [breadName=" + breadName + ", breadPrice=" + breadPrice + ", quantity=" + quantity + "]";
    }
}
