package com.kh.practice.list.library.model.dto;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int price;

    public Book() {}

    public Book(String title, String author, String genre, int price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "도서명: " + title + ", 저자명: " + author + ", 장르: " + genre + ", 가격: " + price;
    }
}
