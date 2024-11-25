package com.kh.poly.pack2.animalPre;

public class AnimalStart {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setName("바둑이");
        dog1.setAge(3);
        dog1.setBreed("진돗개");
        dog1.setWalk(2);

        System.out.println(dog1.toString());

        Cat cat1 = new Cat();
        cat1.setName("나비");
        cat1.setAge(2);
        cat1.setColor("white");
        cat1.setPunch(8);

        System.out.println(cat1.toString());
    }
}
