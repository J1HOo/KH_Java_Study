package com.kh.collectionEx.pack1.listEx;

public class User {
    private String username;
    private String password;
    private String email;

    public User() {}

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }

     public String getUsername() {
        return username;
     }
     public String getPassword() {
        return password;
     }
    public String getEmail() {
        return email;
    }




    // toString 메서드 오버라이딩
    @Override
    public String toString() {
        return username + "   " + password + "  " + email;
    }
}
