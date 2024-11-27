package com.kh.collectionEx.listPre;

public class Drink {
    String name;
    int price;

    public Drink() {}

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "음료 이름 : " + name + " 가격 : " + price;
    }
}
