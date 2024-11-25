package com.kh.dto;

// 과자를 저장하고 저장된 정보를 전달하는 역할
public class 과자 {
    private String name; // 과자 이름
    private int price; // 과자 가격
    private String flavor; // 과자 맛

    // 생성자
    public  과자() {

    }

    // 필수 생성자
    public 과자 (String name, int price, String flavor) {
        this.name = name;
        this.price = price;
        this.flavor = flavor;
    }

    // Getter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }

    // Setter
    public void setPrice(int price) {
        this.price = price;
    }
    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    // toString
    @Override
    public String toString() {
        return "과자 [name=" + name + ", price=" + price + ", flavor=" + flavor + "]";
    }
}
