package com.kh.oop.OopEx;

public class People {
    private String name;
    private int phone;
    private int jumin;
    private String hobby;
    private String species;

    public People() {
    }

    public People(String name, int phone, int jumin) {
        this.name = name;
        this.phone = phone;
        this.jumin = jumin;
    }

    // Setter
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    // Getter
    public String getHobby() {
        return hobby;
    }
    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "People [name=" + name + ", phone=" + phone + ", jumin=" + jumin + ", hobby=" + hobby + ", species=" + species + "]";
    }
}
