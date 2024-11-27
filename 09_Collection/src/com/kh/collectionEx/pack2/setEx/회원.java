package com.kh.collectionEx.pack2.setEx;

import java.util.Objects;

public class 회원 {

    private  int id;
    private  String name;
    private  String email;
    private  String hobby;

    public 회원() {}

    public 회원 (int id, String name, String email, String hobby) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.hobby = hobby;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getHobby() {
        return hobby;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "회원 [id=" + id + ", name=" + name + ", price=" + email + ", hobby=" + hobby + "]";
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof 회원 user)) return false;

        return id == user.id && Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(hobby, user.hobby);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, hobby);
    }
}
