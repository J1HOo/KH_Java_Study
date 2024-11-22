package com.kh.oop.constructorPre;

public class Cafe {
    private String name;
    private int price;
    private int quantity;

    // 1. 기본 생성자
    public Cafe() {
        name = "";
        price = 0;
        quantity = 0;
    }

    // 2. 필수 생성자
    public Cafe(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // 3. Setter
    public void setMenu(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // 4. Getter
    public String getMenu() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    // 5. 주문 총액 계산 price * quantity
    public int TotalPrice() {
        return price * quantity;
    }

    // 6. 주문 출력 toString
    @Override
    public String toString() {
        return "Cafe [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }

}
