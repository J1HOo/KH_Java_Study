package com.kh.oop.constructor;

public class Snack {
    String name;
    int price;
    String tasty;

    public Snack() {
        this.name = "";
        this.price = 0;
        this.tasty = "";
    }
    public Snack(String name, int price, String tasty) {
        this.name = name;
        this.price = price;
        this.tasty = tasty;
    }

    @Override
    public String toString() {
        return "Snack [name=" + name + ", price=" + price + ", tasty=" + tasty + "]";
    }
}
