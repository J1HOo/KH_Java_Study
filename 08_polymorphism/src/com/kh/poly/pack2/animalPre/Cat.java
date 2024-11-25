package com.kh.poly.pack2.animalPre;

public class Cat extends Animal {
    private String color;
    private int punch;

    public Cat() {}

    public Cat(String name, int age, String color, int punch) {
        super(name, age);
        this.color = color;
        this.punch = punch;
    }

    public String setColor() {
        return color;
    }
    public int getPunch() {
        return punch;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setPunch(int punch) {
        this.punch = punch;
    }

    @Override
    public String toString() {
        return super.toString() + '\'' + " [color=" + color + ", punch=" + punch + "]";
    }
}
