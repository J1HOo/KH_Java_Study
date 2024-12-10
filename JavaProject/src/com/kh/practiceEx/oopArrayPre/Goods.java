package com.kh.practiceEx.oopArrayPre;

public class Goods {
    private int id;
    private String name;
    private int price;
    private int quantity;

    public Goods() {}

    public Goods(int id, String name, int price, int quantity) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "상품번호 = " + id + "상품 이름 = " + name + "상품 가격 = " + price + "상품 = " + quantity;
    }

}
