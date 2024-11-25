package com.kh.poly.pack2.animalPre;

public class Dog extends Animal {
    private String breed;
    private int walk;

    public Dog() {}

    public Dog(String name, int age, String breed, int walk) {
        super(name, age);
        this.breed = breed;
        this.walk = walk;
    }

    public String getBreed() {
        return breed;
    }
    public int getWalk() {
        return walk;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setWalk(int walk) {
        this.walk = walk;
    }

    @Override
    public String toString() {
        return super.toString() + '\'' + "[breed=" + breed + ", walk=" + walk + "]";
    }
}
