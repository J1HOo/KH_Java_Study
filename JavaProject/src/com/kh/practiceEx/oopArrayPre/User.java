package com.kh.practiceEx.oopArrayPre;

public class User {
    String userName;
    String email;
    int age;

    public User() {}

    public User(String userName, String email, int age) {
        this.userName = userName;
        this.email = email;
        this.age = age;
    }
    public String getUserName() {
        return userName;
    }
    public String getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [userName=" + userName + ", email=" + email + ", age=" + age + "]";
    }
}
